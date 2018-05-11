/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sampleapplication.output;

import java.util.ArrayList;

/**
 *
 * @author toluo7449
 */
public class SampleApplicationOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> square = new ArrayList();
        for (int i = 0; i < 10; i++)  {
              square.add(i,i*i);
        }
         System.out.println("Squares ArrayList\n**************\n");
         for (int i = 0; i < 10; i++)  {
              System.out.print("Number: "+ i);
              System.out.println(" Square: " + square.get(i));
        }
          
       
        }
    

   }
