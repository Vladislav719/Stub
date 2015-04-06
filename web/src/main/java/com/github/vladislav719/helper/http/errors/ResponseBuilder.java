package com.github.vladislav719.helper.http.errors;

import org.springframework.http.HttpStatus;

/**
 * Created by vladislav on 06.04.2015.
 */
public final class ResponseBuilder {

    public static ErrorResource standartErrorResource(HttpStatus code, String message) {
        return new ErrorResource(code, message);
    }

    public static ErrorResource standartErrorResource() {
        return new ErrorResource();
    }

    public static ErrorResource success(HttpStatus code, Object o) {
        return new ErrorResource(code)
                .setResponse(o);
    }

}
