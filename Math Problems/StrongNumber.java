
package Math Problems;
import java.util.*;

public class StrongNumber {
    public static int factNum(int num) {
        int res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Factorial f = new Factorial();
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            int fact = factNum(digit);
            sum += fact;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("True  ---  Strong Number");
        } else
            System.out.println("False --- Not Strong Number");
    }
}
