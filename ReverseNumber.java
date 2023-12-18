public class ReverseNumber {
    public static int reverse(int x) {
        int reversed = 0;
        int temp = x;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int a = reverse(123);
        System.out.println(a);
    }
}
