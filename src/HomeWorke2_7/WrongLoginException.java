package HomeWorke2_7;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
        super();
    }
    public WrongLoginException(String massage) {
        super(massage);
    }
}
