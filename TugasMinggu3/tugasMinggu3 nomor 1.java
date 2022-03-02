package minggu3.latihan.latihan1;

import java.util.Scanner;
public class bangunRuang {
    public static void main(String[] args)
      Scanner sc = new Scanner(System.in) ;
      System.out.print("Masukkan banyak kubus : ");
      int k = sc.nextInt();
      int s;
      kubus[] kbArray = new kubus[k];
      System.out.println("--------------------");
      for (int i = 0; i < kbArray.length; i++) {
          System.out.print("Masukkan sisi ke-"+(i+1)": ");
          s = sc.nextInt();
          kbArray[i] = new kubus(s);
    }
    for(int i = 0; i < 
    
    
