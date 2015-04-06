package com.github.vladislav719.helper.http.errors;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by vladislav on 06.04.2015.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldErrorResource {

    private String resource;
    private String field;
    private String code;
    private String message;

    public String getResource() {
        return resource;
    }

    public FieldErrorResource setResource(String resource) {
        this.resource = resource;
        return this;
    }

    public String getField() {
        return field;
    }

    public FieldErrorResource setField(String field) {
        this.field = field;
        return this;
    }

    public String getCode() {
        return code;
    }

    public FieldErrorResource setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public FieldErrorResource setMessage(String message) {
        this.message = message;
        return this;
    }
}
