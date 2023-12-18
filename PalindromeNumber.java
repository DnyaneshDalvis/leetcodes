public class PalindromeNumber {
    public static void main(String[] args) {
        boolean a = pal(12321);
        System.out.println(a);
    }
    public static boolean pal(int x) {
        if(x<0) return false;
        if(x==0) return true;
        long reversed = 0;
        long temp = x;
        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return (reversed == x);
    }
}
