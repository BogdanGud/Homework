package hw6.musicshop;


public class notEnoughMoneyException extends Exception {

    notEnoughMoneyException(String message) {
        super(message);
    }

    public String getMessage() {
        return "notEnoughMoneyException: " + super.getMessage();
    }
}

