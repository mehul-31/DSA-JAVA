import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter Your Number:");
        int n = sc.nextInt();
        while (i<=n){
            int j = 1;
            while (j<=n){
                System.out.print(i + " ");
                j++;
            }
            System.out.println();
            i++;

        }

    }
}
