package arrays_and_strings.one_d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//        int N = Integer.parseInt(br.readLine().trim());
//        int start = Integer.parseInt(br.readLine().trim());
//        int finish = Integer.parseInt(br.readLine().trim());
//        String[] arr_Ticket_cost = br.readLine().split(" ");
//        int[] Ticket_cost = new int[N];
//        for (int i_Ticket_cost = 0; i_Ticket_cost < arr_Ticket_cost.length; i_Ticket_cost++) {
//            Ticket_cost[i_Ticket_cost] = Integer.parseInt(arr_Ticket_cost[i_Ticket_cost]);
//        }
        int[] i_Ticket_cost={1,2,2,4};//Ticket_cost[i_Ticket_cost]

        long out_ = solve(4, 1, 2, i_Ticket_cost);
        System.out.println(out_);
//        wr.close();
//        br.close();
    }

    static long solve(int N, int start, int finish, int[] Ticket_cost) {
        // Write your code here
        long result = 0;
        int path1 = 0;
        int path2 = 0;
        if (start < finish) {
            for (int i = start - 1; i < finish - 1; i++) {
                path1 = path1 + Ticket_cost[i];
            }

            for (int i = start - 1; i != finish - 1; i--) {
                if (i == 0) {
                    i = Ticket_cost.length;
                    path2 = path2 + Ticket_cost[Ticket_cost.length - 1];
                } else {
                    path2 = path2 + Ticket_cost[i - 1];
                }
            }
            return path1 < path2 ? path1 : path2;
        } else {
            for (int i = start - 2; i > finish - 2; i--) {
                path1 = path1 + Ticket_cost[i];
            }
            for (int i = start - 1; i != finish - 1; i++) {
                if (i == Ticket_cost.length - 1) {
                    i = 0;
                    path2 = path2 + Ticket_cost[0];
                } else {
                    path2 = path2 + Ticket_cost[i + 1];
                }
            }
            return path1 < path2 ? path1 : path2;
        }
    }
}
