
package adarsh.binarytooctal;
  import java.util.Scanner;


public class input {
    

  public static void main(String[] args) {
    System.out.println("Enter the binary number ");
    Scanner s = new Scanner(System.in);
   int binary = s.nextInt();
    int octal = convertBinarytoOctal(binary);
    System.out.println(binary + " in binary = " + octal + " in octal");
  }

  public static int convertBinarytoOctal(long binaryNumber) {
    int octalNumber = 0, decimalNumber = 0, i = 0;

    while (binaryNumber != 0) {
      decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
      ++i;
      binaryNumber /= 10;
    }

    i = 1;

    while (decimalNumber != 0) {
      octalNumber += (decimalNumber % 8) * i;
      decimalNumber /= 8;
      i *= 10;
    }

    return octalNumber;
  }
}