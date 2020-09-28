package com.umctec.code.challenge.generic;

import lombok.Builder;
import org.springframework.http.HttpStatus;

@Builder
public class Response<E> {
    private final E content;
    private final Integer code;
    private final HttpStatus status;
    private final Boolean wasSuccessfully = true;
}
