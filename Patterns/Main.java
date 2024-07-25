import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int endc = (int) ((n + 2) / 2);
        for (int row = 1; row <= n + 1; row = row + 1) {
            for (int col = 1; col <= endc; col = col + 1) {
                if (row == 1) {
                    if (col == 1 || col == endc) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else if (row == endc) {
                    System.out.print("*");
                } else {
                    if (col == 1 || col == endc) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}