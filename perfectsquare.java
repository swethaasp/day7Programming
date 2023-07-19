
import java.util.Scanner;
public class perfectsquare {
    public static boolean isPerfectSquare(int num) {
        if (num < 0)
            return false;

        long left = 0;
        long right = num;//16

        while (left <= right) {
            long mid = left + (right - left) / 2;//8
            long square = mid * mid;//64 49 36 25 16

            if (square == num)
                return true;
            else if (square < num)
                left = mid + 1;
            else
                right = mid - 1;//15 9
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean result = isPerfectSquare(num);
        System.out.println("Is " + num + " a perfect square? " + result);
    }
}

