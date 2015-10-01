package lab4;

import java.util.Scanner;

public class ScannerTest
{
  public static void main(String[] args)
  {
    // construct a scanner to read from the string
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter 3 words seperated by commas");
    
    // parse the input to get the three items
    String first = in.next();
    String second = in.next();
    String third = in.next();
    
    in.close();
    
    // print them out
    System.out.println(first.charAt(first.length()-2));
    System.out.println(second);
    System.out.println(third);
  }
}