package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть суму доходу:");
        double income = scanner.nextDouble();
        double tax = calculateTax(income);
        System.out.printf("Сума податку: %.2f%n", tax);
    }

    public static double calculateTax(double income) {
        if (income <= 10000) {
            return income * 0.025;
        } else if (income <= 25000) {
            return 10000 * 0.025 + (income - 10000) * 0.043;
        } else {
            return 10000 * 0.025 + 15000 * 0.043 + (income - 25000) * 0.067;
        }
    }
}
