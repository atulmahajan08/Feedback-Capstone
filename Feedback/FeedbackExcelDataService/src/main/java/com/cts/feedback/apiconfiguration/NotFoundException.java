package com.cts.feedback.apiconfiguration;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-15T09:06:38.313+05:30[Asia/Calcutta]")
public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String message) {
        super(code, message);
        this.code = code;
    }
}
