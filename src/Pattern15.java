import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            int space = 1;
            while (space<i){
                System.out.print(" ");
                space++;
            }
            int j =1;
            while (j<=n-i+1){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}