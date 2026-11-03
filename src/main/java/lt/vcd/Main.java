package lt.vcd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] namai = new int[n + 1];
        int viso = 0;
        int kair_viso = 0, kair_kiek = 0;
        int des_viso = 0, des_kiek = 0;
        
        for (int i = 1; i <= n; i++) {
            namai[i] = sc.nextInt();
            viso += namai[i];
            if (i % 2 != 0) {
                kair_viso += namai[i];
                kair_kiek++;
            } else {
                des_viso += namai[i];
                des_kiek++;
            }
        }
        
        System.out.println("Total residents: " + viso);
        System.out.println("Residents on the left: " + kair_viso);
        System.out.println("Residents on the right: " + des_viso);
        
        if (kair_kiek == 0) {
            System.out.println("Average per house on the left: N/A");
        } else {
            double vid = (double) kair_viso / kair_kiek;
            if (vid == (int) vid) {
                System.out.println("Average per house on the left: " + (int) vid);
            } else {
                System.out.println("Average per house on the left: " + vid);
            }
        }
        
        if (des_kiek == 0) {
            System.out.println("Average per house on the right: N/A");
        } else {
            double vid = (double) des_viso / des_kiek;
            if (vid == (int) vid) {
                System.out.println("Average per house on the right: " + (int) vid);
            } else {
                System.out.println("Average per house on the right: " + vid);
            }
        }
    }
}
