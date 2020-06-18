public class concatenateNumbers {
    public int concatenateNumbers(int a, int b) {
        String num1 = Integer.toString(a);
        String num2 = Integer.toString(b);

        return Integer.parseInt(num1 + num2);
    }

    public static void main(String[] args) {
        concatenateNumbers cn = new concatenateNumbers();
        System.out.println(cn.concatenateNumbers(23, 45));
    }
}