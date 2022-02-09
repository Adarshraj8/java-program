/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adarsh.decimaltobinary;
import java.util.Scanner;

public class Input {
    
    public static void main(String[] args){
    int numberModule,decimalNumber;
    String binaryNumber = "";
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Decimal Number :");
    decimalNumber = input.nextInt();
    while(decimalNumber>0){
        numberModule = decimalNumber%2;
        binaryNumber = numberModule + "" + binaryNumber ;
        decimalNumber = decimalNumber/2;
    }
    System.out.println("Binay Notation : "+binaryNumber);
    }
}