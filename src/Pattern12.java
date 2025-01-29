import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        int i = 1;

        while (i<=n){
            int j = 1;
            char ch = (char)('A'+n-i);
            while (j<=i){
                System.out.print(ch);
                ch++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}