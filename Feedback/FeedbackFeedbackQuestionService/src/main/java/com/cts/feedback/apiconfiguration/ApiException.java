package com.cts.feedback.apiconfiguration;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-04-02T10:12:15.768+05:30[Asia/Calcutta]")
public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String message) {
        super(message);
        this.code = code;
    }
}
