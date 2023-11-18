package sofixit.example.service_1.error.exception;

public class BadVariableException extends Exception {

    public BadVariableException() {
        super("Path variable value is incorrect.");
    }
}
