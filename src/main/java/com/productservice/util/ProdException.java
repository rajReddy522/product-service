package com.productservice.util;


import org.springframework.stereotype.Component;


public class ProdException {
    private String message;
    private String details;

    public ProdException( final String message, final String details) {
        super();
        this.message = message;
        this.details = details;
    }


    public String getMessage() {
        return this.message;
    }

    public String getDetails() {
        return this.details;
    }

}
