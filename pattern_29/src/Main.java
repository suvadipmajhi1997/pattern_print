public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            System.out.print(i+" ");
            if (i > 1) {
                for (int j = 1; j <= (i - 1) * 2 - 1; j++) {
                    System.out.print("0 ");
                }
                System.out.print(i);
            }
            System.out.println();
        }

    }
}