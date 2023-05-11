package org.example.exceptions;

public class MissingPermissionException extends RuntimeException {

    public  MissingPermissionException(){
        super("Session missing required permission for operation");
    }

    public  MissingPermissionException(String message){
        super(message);
    }

}
