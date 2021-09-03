package poellersmethodtry2;

import java.util.Scanner;

public class euler {

    public static void main(String[] Leonhard) {
        int i, num;
        double x, y, step;

        /*
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter length of one step: ");
        step = scn.nextDouble(); // шаг
        System.out.println("");

        System.out.print("Enter length of number of iterations: ");
        num = scn.nextInt(); // количество итераций
        System.out.println("");

        System.out.print("Enter length of starting X: ");
        x = scn.nextDouble(); // x0
        System.out.println("");

        System.out.print("Enter length of starting Y: ");
        y = scn.nextDouble(); // y0
        System.out.println("");
        
        scn.close();
        */

        step = 0.001; // шаг
        num = 10; // количество итераций
        x = 1; // x0
        y = 1; // y0

        for (i = 0; i < num; i++) {
            y += step * func(x, y); // вычисление yi
            x += step;
        }

        System.out.println(x + ", " + y);
    }

    public static double func(double x, double y) {
        return 6 * y + 3 * x * x - 6 * x * x * x; // функция первой производной
    }
}
