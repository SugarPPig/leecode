public class IntToRoman {
    public static void main(String[] args) {
        // 整数转罗马数字
        int num = 1994;
        System.out.println(new IntToRoman().intToRoman(num));
    }

    private String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length && num >= 0; i++) {
            while (values[i] <= num) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }
        return roman.toString();
    }
}
