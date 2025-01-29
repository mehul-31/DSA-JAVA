import java.util.Scanner;
public class CheckCaseOfChar {
    public static void main(String[] args) {
        System.out.println("Enter Your Value to be checked");
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        int ascii = (int)input;

        if (ascii>=65 && ascii<=90 ){
            System.out.println("Upper Case");
        } else if (ascii>=97 && ascii<=122) {
            System.out.println("Lower Case");
        } else if (ascii>=48 && ascii<=57) {
            System.out.println("Numerical");
        }
        else{
            System.out.println("Something Else");
        }


    }
}