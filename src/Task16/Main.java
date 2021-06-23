package Task16;

public class Main {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 1001; i++) {
            long number = f(i);
            boolean flag = true;

            while (flag && (number > 0)) {
                if (number % 10 == 1) {
                    flag = false;
                } else {
                    number -= number % 10;
                    number /= 10;
                }
            }

            if (flag) {
                count++;
            }

        }

        System.out.println(count);
    }

    public static long f(long a) {

        if (a > 20) {
            return a * a * a + a;
        }

        if (a % 2 == 0) {
            return 3 * f(a + 1) + f(a + 3);
        } else {
            return f(a + 2) + 2 * f(a + 3);
        }

    }

}
