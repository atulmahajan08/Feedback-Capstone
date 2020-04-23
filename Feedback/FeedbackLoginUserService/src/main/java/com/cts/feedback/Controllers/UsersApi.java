package com.cts.feedback.Controllers;

import com.cts.feedback.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-23T15:35:34.885+05:30[Asia/Calcutta]")
@Api(value = "users", description = "API of Users")
@CrossOrigin("http://localhost:3000") //Connection between Springboot and ReactJS
public interface UsersApi {

    Logger log = LoggerFactory.getLogger(UsersApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Add a new user", nickname = "addUser", notes = "", response = User.class, tags={ "User Details", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = User.class),
        @ApiResponse(code = 400, message = "Status Value is invalid"),
        @ApiResponse(code = 404, message = "Page not found") })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        consumes = { "application/json"},
        method = RequestMethod.POST)
    default Mono<ResponseEntity<User>> addUser(@ApiParam(value = "User that needs to be added" ,required=true )  @Valid @RequestBody User body
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return Mono.just(new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"empId\" : \"empId\",\r\n  \"firstname\" : \"firstname\",\r\n  \"password\" : \"password\",\r\n  \"Id\" : 0,\r\n  \"lastname\" : \"lastname\"\r\n}", User.class), HttpStatus.NOT_IMPLEMENTED));
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return Mono.just(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return Mono.just(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));
    }


    @ApiOperation(value = "Get total users on clicking view", nickname = "allUsers", notes = "All the users are listed when clicked on view after login", response = User.class, responseContainer = "List", tags={ "User Details", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 404, message = "Page not found") })
    @RequestMapping(value = "/users",
        produces = {"application/json" }, 
        method = RequestMethod.GET)
    default Flux<ResponseEntity<User>> allUsers() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return Flux.just(new ResponseEntity<>(getObjectMapper().get().readValue("[ {\r\n  \"empId\" : \"empId\",\r\n  \"firstname\" : \"firstname\",\r\n  \"password\" : \"password\",\r\n  \"Id\" : 0,\r\n  \"lastname\" : \"lastname\"\r\n}, {\r\n  \"empId\" : \"empId\",\r\n  \"firstname\" : \"firstname\",\r\n  \"password\" : \"password\",\r\n  \"Id\" : 0,\r\n  \"lastname\" : \"lastname\"\r\n} ]", User.class), HttpStatus.NOT_IMPLEMENTED));
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return Flux.just(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return Flux.just(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));
    }


    @ApiOperation(value = "Get the specific user detail", nickname = "getByUserId", notes = "The user detail listed are depending upon the id selected", response = User.class, tags={ "User Details", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 404, message = "Page not found") })
    @RequestMapping(value = "/users/{userId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default Mono<ResponseEntity<User>> getByUserId(@ApiParam(value = "ID of user to return",required=true) @PathVariable("userId") Long userId
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return Mono.just(new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"empId\" : \"empId\",\r\n  \"firstname\" : \"firstname\",\r\n  \"password\" : \"password\",\r\n  \"Id\" : 0,\r\n  \"lastname\" : \"lastname\"\r\n}", User.class), HttpStatus.NOT_IMPLEMENTED));
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return Mono.just(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UsersApi interface so no example is generated");
        }
        return Mono.just(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));
    }


    @ApiOperation(value = "delete user details", nickname = "removeUser", notes = "delete the details of specificed user", response = User.class, responseContainer = "List", tags={ "User Details", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/users/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default Mono<ResponseEntity<Void>> removeUser(@ApiParam(value = "ID of user to delete",required=true) @PathVariable("userId") String userId
) {
						return Mono.just(new ResponseEntity<Void>(HttpStatus.CREATED));
    }

}
