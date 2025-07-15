package gr.aueb.cf.ch15.custom_exceptions;

public class SssNotValidException extends Exception{

    public SssNotValidException (String message) {
        super(message);
    }
}
