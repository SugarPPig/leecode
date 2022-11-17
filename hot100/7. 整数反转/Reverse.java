public class Reverse {
    public static void main(String[] args) {
        // 整数反转求解
        int x = 120;
        System.out.println(new Reverse().reverse(x));
    }

    private int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int temp = x % 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && temp < -8)) {
                return 0;
            }
            res = res * 10 + temp;
            x /= 10;
        }
        return res;
    }
}
