import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            int j = 1;
            int space = 1;
            while (space<=n-i){
                System.out.print(" ");
                space++;
            }
            while (j<=i){
                System.out.print(j);
                j++;
            }
            j = i - 1;
            while (j>=1){
                System.out.print(j);
                j--;
            }
            i++;
            System.out.println();
        }
    }
}
