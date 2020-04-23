package com.cts.feedback.event.apiconfiguration;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-21T12:07:42.313+05:30[Asia/Calcutta]")
public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String message) {
        super(message);
        this.code = code;
    }
}
