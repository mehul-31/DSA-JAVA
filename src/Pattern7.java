import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        int i = 1;

        while (i<=n){
            int tp = i;
            int j = 1;
            while (j<=i){
                System.out.print(tp + " ");
                // here we can remove the tp variable and also use the simple equation of i-j+1
                tp--;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}