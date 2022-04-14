import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner sc = new Scanner(System.in);
        String reply = "yes";
        while (reply.equals("yes")) {
            System.out.println("Введите первое число:");

            calculatorOne.setFirstNumber(sc.nextInt());

            System.out.println("Введите знак математической операции:");

            calculatorOne.setSign(sc.next().charAt(0));

            System.out.println("Введите второе число:");

            calculatorOne.setSecondNumber(sc.nextInt());

            System.out.println("Результат: ");
            calculatorOne.calculations();
            
            reply = "";
            while ((!reply.equals("yes")) && (!reply.equals("no"))) {
                reply = sc.nextLine();
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
            }
        }
    }
}