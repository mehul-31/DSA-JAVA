import java.sql.SQLOutput;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        int i = 1;
        int count = n*n;
        while (i<=n){
            int j = 1;
            while (j<=n){
                System.out.print(count + " ");
                count--;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
