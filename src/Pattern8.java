import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        int i = 1;

        while (i<=n){

            int j = 1;
            while (j<=n){
                char ch = (char) (65 + i - 1);
                System.out.print( ch+ " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}