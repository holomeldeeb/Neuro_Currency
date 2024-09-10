import java.util.Scanner;

public class NeuroConverter {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("What is your amount?:");
      double amount = scanner.nextDouble();
      scanner.nextLine();
      converter(amount); }
      public static void converter(double amount) {
        
        int counter = 0,counter2 = 0 ,counter3 = 0 , counter4 = 0 ;
      
      while (amount >= 1){
          ++counter;
          --amount;
      }
      while (amount < 1 && amount >= 0.48999){
          ++counter2;
          amount -= 0.49;
      }
      while (amount < 0.49 && amount >= 0.0899999){
        ++counter3;
        amount -= 0.09;
      }
      while (amount < 0.09 && amount > 0.0001){
        amount -= 0.01;
        ++counter4;
      }
      
      System.out.println(counter);
      System.out.println(counter2);
      System.out.println(counter3);
      System.out.println(counter4);
    
    }
  
  }
      
