import java.math.BigInteger;
import java.util.Scanner;

public class VeryLongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть перше дуже довге число: ");
        String input1 = scanner.nextLine();
        System.out.print("Введiть друге дуже довге число: ");
        String input2 = scanner.nextLine();

        BigInteger num1 = new BigInteger(input1);
        BigInteger num2 = new BigInteger(input2);

        // Додавання
        BigInteger sum = num1.add(num2);
        System.out.println("Додавання: " + sum);

        // Віднімання
        BigInteger difference = num1.subtract(num2);
        System.out.println("Вiднiмання: " + difference);

        // Множення
        BigInteger product = num1.multiply(num2);
        System.out.println("Множення: " + product);

        // Ділення
        BigInteger quotient = num1.divide(num2);
        System.out.println("Дiлення: " + quotient);

        // Піднесення в степінь
        System.out.print("Введiть степiнь: ");
        int exponent = scanner.nextInt();
        BigInteger power = num1.pow(exponent); // pow використовується для піднесення числа до степеня.
        System.out.println("Пiднесення до степеня: " + power);
    }
}
