import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n = sc.nextInt();
        int i = 1;

        while (i<=n){
            int tp = i;
            int j = 1;
            while (j<=i){
                System.out.print(tp + " ");
                tp++;
                j++;
            }
            i++;
            System.out.println();
        } // another method below(:    }
    }
}
//import java.util.Scanner;
//
//public class Pattern6 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int i = 1;
//        while (i <= n) {
//            int j = i;
//            while (j < i + i) {  // Ensures 'i' numbers are printed
//                System.out.print(j);
//                j++;
//            }
//            System.out.println(); // Move to the next line after printing a row
//            i++;
//        }
//    }
//}
