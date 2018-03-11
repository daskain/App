package App;
import java.util.*;

public class Squer {

    double a, h, p, s;

    public double squer(double a) {
        p = 0.5 * (a * 3);
        h = Math.sqrt((Math.pow(a, 2) - Math.pow(a/2,2)));/* h = (Math.sqrt(p * (3 * (p - a)))) / a; */
        s = 0.5 * a * h;
        return s;

    }
}


