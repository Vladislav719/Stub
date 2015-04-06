package com.github.vladislav719.helper.http.errors;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;

import java.util.List;

/**
 * Created by vladislav on 06.04.2015.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorResource {

    private int code;
    private String message;
    private Object response;
    private List<FieldErrorResource> fieldErrors;

    public ErrorResource(HttpStatus code) {
        this.code = code.value();
    }

    public ErrorResource() {

    }

    public ErrorResource(HttpStatus code, String message) {
        this.code = code.value();
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public ErrorResource setCode(HttpStatus code) {
        this.code = code.value();
        return this;
    }

    public Object getResponse() {
        return response;
    }

    public ErrorResource setResponse(Object response) {
        this.response = response;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ErrorResource setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<FieldErrorResource> getFieldErrors() {
        return fieldErrors;
    }

    public ErrorResource setFieldErrors(List<FieldErrorResource> fieldErrors) {
        this.fieldErrors = fieldErrors;
        return this;
    }
}
