package inf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class ZPlay {
    private static final int MAX_SUM = 107;

    public static void main(String[] args) {
        for (int s = 1; s < 94; s++) {
            if (!calc_state(13, s).isWin() && calc_state(13, s).getSteps() == 4) {
                System.out.println(s);
            }
        }
    }

    public static int f(int a) {
        return a + 1;
    }

    public static int g(int a) {
        return 2 * a;
    }

    private static final Map<List<Integer>, Pair> map = new HashMap<>();

    public static Pair calc_state(int a, int b) {

        if (a + b >= MAX_SUM) {
            return new Pair(0, false);
        }

        if (map.containsKey(List.of(a, b))) {
            return map.get(List.of(a, b));
        }

        int mn = Integer.MAX_VALUE;
        // ищем все состояния, которые приведут противника к поражению
        if (!calc_state(f(a), b).win) mn = min(mn, calc_state(f(a), b).steps);
        if (!calc_state(a, f(b)).win) mn = min(mn, calc_state(a, f(b)).steps);
        if (!calc_state(g(a), b).win) mn = min(mn, calc_state(g(a), b).steps);
        if (!calc_state(a, g(b)).win) mn = min(mn, calc_state(a, g(b)).steps);

        int mx = 0;
        // если таких ситаций нет, то ищем как можно отддалить поражение
        if (calc_state(f(a), b).win) mx = max(mx, calc_state(f(a), b).steps);
        if (calc_state(a, f(b)).win) mx = max(mx, calc_state(a, f(b)).steps);
        if (calc_state(g(a), b).win) mx = max(mx, calc_state(g(a), b).steps);
        if (calc_state(a, g(b)).win) mx = max(mx, calc_state(a, g(b)).steps);

        Pair pair = (mn != Integer.MAX_VALUE ? new Pair(mn + 1, true) : new Pair(mx + 1, false));

        map.put(List.of(a, b), pair);

        return pair;
    }

    public static class Pair {

        private final boolean win;
        private final int steps;

        public Pair(int steps, boolean win) {
            this.steps = steps;
            this.win = win;
        }

        public int getSteps() {
            return steps;
        }

        public boolean isWin() {
            return win;
        }
    }
}
