//Given an integer (can be negative as well). Find the sum, product, and average of its numbers
import java.util.Scanner;
public class my {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 0) n = -n;  
        int sum = 0;
        int mul = 1;
        int cnt = 0;
        while (n > 0) {
            int x = n % 10;
            sum = sum + x;
            mul = mul * x;
            cnt = cnt + 1;
            n = n / 10;
        }

        double avg = (double) sum / cnt;
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(avg);
    }
}

