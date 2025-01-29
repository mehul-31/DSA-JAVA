import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        int i = 1;
        int count = 1;
        while (i<=n){
            int j = 1;
            while (j<=n){
                System.out.print(count + " ");
                count++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
