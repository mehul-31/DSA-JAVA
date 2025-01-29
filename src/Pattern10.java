import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        int i = 1;

        while (i<=n){
            char ch =(char)('A'+i-1);
            int j = 1;
            while (j<=i){
                System.out.print(ch);
                //ch++; if we remove this comment mark from ch++ then it is different patter;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}