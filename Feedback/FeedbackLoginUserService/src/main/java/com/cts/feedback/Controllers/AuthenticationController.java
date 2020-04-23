package com.cts.feedback.Controllers;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.feedback.entity.User;
import com.cts.feedback.repository.UserRepository;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import reactor.core.publisher.Mono;

@CrossOrigin("http://localhost:3000")
@RestController
public class AuthenticationController {
	
	static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);
	
    @Autowired
    private UserRepository userRepository;

    @ApiOperation(value = "", nickname = "loginPost", notes = "get user by id", response = User.class, tags={ "login user", })
    @ApiResponses(value = { 
    			@ApiResponse(code = 200, message = "User logged in successfully", response = User.class),
    			@ApiResponse(code = 404, message = "No DataFound") })
    @RequestMapping(value = "/authenticate",produces = { "application/json" }, method = RequestMethod.GET)
    public Mono<Map<String, String>> loginPost(@ApiParam(value = "" ) @RequestHeader(value="Authorization")String authHeader) {
		
		LOGGER.info("start inside authenticate method");
		LOGGER.debug(authHeader);
		System.err.println(authHeader);
		
		//Map collection is used.
		Map<String, String> jwt = new HashMap<String, String>();
		String username = getUser(authHeader);
		User user = userRepository.findByEmpId(username).block();
		long userId = user.getId();
		String token = generateJwt(username);
		System.out.println("token:" + token);
		jwt.put("token", token);
		String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().toArray()[0].toString();
		jwt.put("role", role);
		jwt.put("username", username);
		jwt.put("userId", String.valueOf(userId));
		LOGGER.info("End of Athentication Method");
		return Mono.just(jwt);
	}

	private String getUser(String authHeader) {
		String encodedCredentials = authHeader.split(" ")[1]; 
		byte[] decodedCredentials = Base64.getDecoder().decode(encodedCredentials);
		String user = new String(decodedCredentials).split(":")[0]; // username:password
		LOGGER.debug(user);
		return user;
	}

	private String generateJwt(String user) {
		JwtBuilder builder = Jwts.builder();
		builder.setSubject(user);
		builder.setIssuedAt(new Date());
		builder.setExpiration(new Date((new Date()).getTime() + 1800000));
		builder.signWith(SignatureAlgorithm.HS256, "secretkey");
		String token = builder.compact();
		return token;
	}
	
}