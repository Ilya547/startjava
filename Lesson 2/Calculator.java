public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void startCalculation() {
        int result = 1;
        switch(sign) {
            case '+' :
                result = firstNumber + secondNumber;
                break;
            case '-' :
                result = firstNumber - secondNumber;
                break;
            case '*' :
                result = firstNumber * secondNumber;
                break;
            case '/' :
                result = firstNumber / secondNumber;
                break;
            case '%' :
                result = firstNumber % secondNumber;
                break;
            case '^' :
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                break;
            }
            System.out.println(result);
        }
}