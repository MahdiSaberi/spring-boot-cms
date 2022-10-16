package ir.example.springbootcms.base.exception;

public class EntityNotFoundRuntimeException extends RuntimeException {

    public EntityNotFoundRuntimeException(String message) {
        super(message);
    }
}