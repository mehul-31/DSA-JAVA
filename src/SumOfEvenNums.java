import java.util.Scanner;
public class SumOfEvenNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=n){
            if (i%2 == 0)
            {
                sum +=i;

            }
            i++;
        }
        System.out.println(sum);
    }
}
