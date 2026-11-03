package lt.vcd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int[] residents = new int[n + 1];
        int totalResidents = 0;
        int leftTotal = 0, leftCount = 0;
        int rightTotal = 0, rightCount = 0;

        for (int i = 1; i <= n; i++) {
            residents[i] = scanner.nextInt();
            totalResidents += residents[i];


            if (i % 2 != 0) {
                leftTotal += residents[i];
                leftCount++;
            } else {
                rightTotal += residents[i];
                rightCount++;
            }
        }

        System.out.println("Total residents: " + totalResidents);
        System.out.println("Residents on the left: " + leftTotal);
        System.out.println("Residents on the right: " + rightTotal);


        if (leftCount == 0) {
            System.out.println("Average per house on the left: N/A");
        } else {
            double leftAvg = (double) leftTotal / leftCount;

            if (leftAvg == (int) leftAvg) {
                System.out.println("Average per house on the left: " + (int) leftAvg);
            } else {
                System.out.println("Average per house on the left: " + leftAvg);
            }
        }


        if (rightCount == 0) {
            System.out.println("Average per house on the right: N/A");
        } else {
            double rightAvg = (double) rightTotal / rightCount;
            if (rightAvg == (int) rightAvg) {
                System.out.println("Average per house on the right: " + (int) rightAvg);
            } else {
                System.out.println("Average per house on the right: " + rightAvg);
            }
        }

        scanner.close();
    }
}
