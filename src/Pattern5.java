import java.sql.SQLOutput;
import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        int i = 1;

        while (i<=n){
            int j = 1;
            while (j<=i){
                System.out.print(i + " ");
                // here instead of "i" you can also write "*" then it will be another pattern;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
