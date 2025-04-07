package jpabook.jpashop.exception;

public class NotEnoughStockException extends RuntimeException{

    public NotEnoughStockException() {
        super();
    }

    public NotEnoughStockException(String message) {
        super(message); //메시지 넘겨줌
    }

    public NotEnoughStockException(String message, Throwable cause) {
        super(message, cause); //메시지와 함께 근원적 예외를 넣어서 trace가 나오게 함
    }

    public NotEnoughStockException(Throwable cause) {
        super(cause);
    }

}
