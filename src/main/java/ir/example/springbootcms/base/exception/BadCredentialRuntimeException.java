package ir.example.springbootcms.base.exception;

public class BadCredentialRuntimeException extends RuntimeException {

    public BadCredentialRuntimeException(String message) {
        super(message);
    }
}