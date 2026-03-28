
public class strongNumber {
    public static int factor(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factor(num - 1);
    }

    public static int strong(int num) {
        if (num == 0) {
            return 0;
        }
        int digits = num % 10;
        return factor(digits) + strong(num / 10);
    }

    public static void main(String[] args) {
        int num = 145;
        int sum = strong(num);
        if (sum == num) {
            System.out.println("is strong number");
        } else {
            System.out.println("is not strong number");
        }
    }
}
