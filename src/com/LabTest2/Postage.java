package com.LabTest2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by William Stewart on 04/12/2020
 * Program to calculate postage costs
 */
public class Postage {
   static Scanner keyboard = new Scanner(System.in);
   static int quantity = 0;
   static double totalWeight = 0;

   public static String getName(){
      System.out.println("Please enter your name: ");
      return keyboard.nextLine().toUpperCase();
   }

   public static int getNumber(){
      System.out.println("how many parcels have you?; ");
      quantity = keyboard.nextInt();
      return quantity;
   }

   public static double getWeight(){
      double total = 0;
      for(int i = 1; i <= quantity; i++){
         System.out.println("Please enter the weight of parcel" + i);
         total = keyboard.nextDouble();
         totalWeight += total;
      }
      return totalWeight;
   }

   public static void main(String[] args) {
      DecimalFormat df = new DecimalFormat("00.00");
      String name;
      int quantity;
      double totalWeight;
      int cost = 0;

      name = getName();
      quantity = getNumber();
      totalWeight = getWeight();

      if(totalWeight < 5 ){
         cost = 8;
      } else {
         if(totalWeight > 5 && totalWeight < 10){
            cost = 15;
         } else {
            cost = 20;
         }
      }

      System.out.println("Name: \t\t\t" + name);
      System.out.println("Number of parcels: \t\t\t" + quantity);
      System.out.println("Total weight of parcels: \t\t\t" + df.format(totalWeight));
      System.out.println("Cost of postage: \t\t\t" + cost);

   }//main
}//class
