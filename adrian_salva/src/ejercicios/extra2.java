package ejercicios;

import java.util.Scanner;

public class extra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas trabajas a la semana? ");
        int horasTrabajadas = scanner.nextInt();

        int salarioNormal;
        int salarioExtra = 0;
        int salarioTotal;

        if (horasTrabajadas <= 40) {
            salarioNormal = horasTrabajadas * 16;
        } else {
            salarioNormal = 40 * 16;
            int horasExtra = horasTrabajadas - 40;
            salarioExtra = horasExtra * 20;
        }

        salarioTotal = salarioNormal + salarioExtra;

        System.out.println("Salario total: " + salarioTotal + " €");
        System.out.println("Parte por horas normales (16 €/h): " + salarioNormal + " €");
        System.out.println("Parte por horas extra (20 €/h): " + salarioExtra + " €");

        scanner.close();
    }
}
