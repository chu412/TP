package com.company.exceptions;


public class ItemAlreadyExistsException extends Exception{
    public ItemAlreadyExistsException(String e) {
        super(e);
        this.e = e;
    }
    String e;
}

