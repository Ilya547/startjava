import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner sc = new Scanner(System.in);
        String reply = "yes";
        while (reply.equals("yes")) {
            System.out.println("Введите первое число:");

            int firstNumber = sc.nextInt();
            calculatorOne.setFirstNumber(firstNumber);

            System.out.println("Введите знак математической операции:");

            char sign = sc.next().charAt(0);
            calculatorOne.setSign(sign);

            System.out.println("Введите второе число:");

            int secondNumber = sc.nextInt();
            calculatorOne.setSecondNumber(secondNumber);

            System.out.println("Результат: ");
            calculatorOne.answer();
            
            reply = "";
            while ((!reply.equals("yes")) && (!reply.equals("no"))) {
                reply = sc.nextLine();
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
            }
        }
    }
}