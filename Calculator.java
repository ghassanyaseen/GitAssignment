import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    private static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return add(num1, num2);
        }
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

}

