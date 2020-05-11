import java.util.Scanner;

public class Compile {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("Enter a number");
          int limit = s.nextInt();
          System.out.println("Run how many times?");
          int amount = s.nextInt();
          int avgTime = 0;
          for (int i = 0; i < amount; i++) {
               avgTime+=primeNums(limit);
          }
          System.out.println("Took total of " + avgTime + "ms, averaging " + avgTime/amount + "ms.");
          s.close(); 
    }
    
    public static int primeNums(int limit) {
         long timeStart = System.nanoTime();
          String output = "";
          boolean isPrime;
          for (int i = 2; i < limit; i++) {
               isPrime = true;
               for (int j = 2; j < limit; j++) {
                   if (i % j == 0 && j != i) {
                          isPrime = false;
                   }
               }
               if (isPrime) {
                    output+=i + ", ";
               }
          }
          output = output.substring(0, output.length()-2) + ".";
          System.out.println(output);
          int time = (int) (System.nanoTime() - timeStart) / 1000000;
          System.out.println("Took " + time + " ms to run.");
          return time;
     }
} 
