package inf;

public class Main {
    public static void main(String[] args) {

    }

    public static int getM(int a) {
        int i = 2;
        while ((i * i <= a) && (a % i != 0)) {
            i++;
        }

        if (i * i > a) {
            return 0;
        }

        return i + (a / i);
    }

    public static int f (int n) {
        if (n == 1) {
            return 1;
        }

        if (n % 2 == 0) {
            return n + f(n - 1);
        } else {
            return 2 * f(n - 2);
        }

    }
}
