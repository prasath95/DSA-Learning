package arrays_and_strings.one_d;

import java.util.*;

public class TramStations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int start = scanner.nextInt();
        int finish = scanner.nextInt();

        int[] ticketCost = new int[n];
        for (int i = 0; i < n; i++) {
            ticketCost[i] = scanner.nextInt();
        }

        int minCost = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int cost = 0;
            for (int j = i; j != finish; j = (j + 1) % n) {
                cost += ticketCost[j];
            }
            minCost = Math.min(minCost, cost);
        }

        System.out.println(minCost);
    }
}