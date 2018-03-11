package App;

import java.io.PrintStream;
import java.util.*;
import java.lang.*;

import App.Name;
import App.Squer;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hellow, world" + '!');
        System.out.print("Введите длину стороны а = ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Squer abc = new Squer();
        System.out.printf("Площадь треугольника = %.2f", abc.squer(x));
    }
}

