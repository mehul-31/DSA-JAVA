import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        int i = 1;
        char ch = 'A';
        while (i<=n){
            int j = 1;
            while (j<=n){
                System.out.print( ch+ " ");
                ch++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}