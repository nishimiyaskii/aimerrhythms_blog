package com.aimerrhythms.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author aimerrhythms
 * @data 2020/7/26 17:49
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class BlogNotFoundException extends RuntimeException{
    public BlogNotFoundException() {
    }

    public BlogNotFoundException(String message) {
        super(message);
    }

    public BlogNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

