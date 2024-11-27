package main.java.com.part1backend.exceptions;

class MoreThanOneDigitException extends Exception {
    public MoreThanOneDigitException(String msg) {
        super(msg);
    }
}
public class MoreDigitException {
    public static void main(String[] args) {
        int num=25;

        try {
            if(Math.abs(num)>=10) {
                throw new MoreThanOneDigitException("The number has more than one digit: "+num);
            }
            System.out.println("Number has one digit"+num);
        } catch(MoreThanOneDigitException e) {
            System.out.println(e.getMessage());
        }
    }
}
