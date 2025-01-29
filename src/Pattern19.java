import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            int j = 1;
            //part 1 numbers
            while (j<= n - i + 1){
                System.out.print(j);
                j++;
            }
            //part 2 stars
            j = 1;
            while (j<=(i-1)*2){
                System.out.print("*");
                j++;
            }
            //part 3 again numbers
            j = n - i + 1;
            while (j >= 1){
                System.out.print(j);
                j--;
            }
            i++;
            System.out.println();
        }
    }
}
