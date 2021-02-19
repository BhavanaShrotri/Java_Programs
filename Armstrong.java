/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavana
 */

import java.io.*;
import java.util.*;


public class Armstrong {
    
    public static void main(String args[])
    {
        System.out.println("Enter Number : ");
        Scanner sc=new Scanner(System.in);
        
        int value =sc.nextInt();
        
        int sum=0,a,temp;
        
        temp=value;
        
        while(temp>0)
        {
          a=temp%10;
          temp=temp/10;
          sum=sum+(a*a*a);
        }
        
         if(value==sum)  
                 System.out.println("Armstrong number");   
         else  
                 System.out.println("Not Armstrong number");   
        
    }
    
}
