package basics;

import java.util.Scanner;

public class Main {  
      public static void main(String[] args) {
        int i=0;
        System.out.println("Hello world");
        System.out.println("Give me the last no of the loop :");
        try (Scanner in = new Scanner(System.in)) {
          int n = in.nextInt();
          while (i < n) {
            System.out.println(i);
            i++;
          }
        }
    }
}
