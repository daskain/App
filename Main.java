package App;


import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        System.out.print("И как же тебя зовут, дорогой друг? ");
        Scanner namePr = new Scanner(System.in);
        String res = namePr.next();
        System.out.println("Hellow, world, " + res + '!');
        System.out.print("Введите длину стороны а = ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Squer abc = new Squer();
        System.out.printf("Площадь треугольника = %.2f", abc.squer(x));
    }
}

