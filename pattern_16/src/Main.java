import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=0;i<n;i++){
            for (int j=0;j<n-i+1;j++){
                System.out.print("  ");
            }
            for (int k=0;k<n-i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n-i+1;j++){
                System.out.print("  ");
            }
            for (int k=0;k<=n-i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}