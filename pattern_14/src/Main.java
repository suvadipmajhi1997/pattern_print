import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            // Print spaces for indentation
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // Print asterisks
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}