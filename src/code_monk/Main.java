package code_monk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //to start 1
        System.out.println(" starting");
        String start = br.readLine();

        while (Integer.valueOf(start) == 1) {

            System.out.println(" enter k and n");
            String value = br.readLine();
            String[] kn = value.split("");

            int k = Integer.valueOf(kn[0]);
            int n = Integer.valueOf(kn[1]);
            System.out.println("k is " + k);
            System.out.println("n is " + n);

            System.out.println("array's value");
            String str = br.readLine();

            String[] array = str.split("");

            for (int i = 0; i < array.length; i++) {
                System.out.println(" " + array[i]);
            }

            System.out.println(" ");

            int index = n - k % n;

            for (int i = index; i < n; i++) {
                System.out.print(" " + array[i]);
            }



            for (int i = 0; i < index; i++) {
                System.out.print(" " + array[i]);
            }

            System.out.println("");
            System.out.println("quit 9 ");
            String end = br.readLine();
            if(end=="9")
                return;
        }
    }
}
