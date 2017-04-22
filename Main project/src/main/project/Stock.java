/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.project;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author hp
 */
public class Stock {
    
    public void checkStocks()
    {
         
        try{
            
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\ooadProjectFiles\\Donor.txt"));
//        ArrayList<String> obj = new ArrayList<String>();
//            for (int i = 0; i < obj.size(); i++) {
//                String b = br.readLine();
//                if(b != null)
//                {
//                    
//                }
//                    //a[i] = b;
//            }
//        
        
        
        
        
        
        
        
        
        String[] arr = new String[100];
        //String[] arr1;
            for (int i = 0; i < arr.length ; i++) {
                String s = br.readLine();
                if(s != null)
             arr[i] = s;
                else
                    break;
            }
            
            ArrayList<String> u = new ArrayList<String>();
            int j=2;
            int counter = 0;
            boolean isDistinct = false;
            //String a = arr[j];
            for (int i =j; i < arr.length; i+=5) {
                String a = arr[i];
                //u.add(a);
                if(i == 2)
                {
                u.add(a);
                  
                   
                      for (int l = j; l < arr.length; l+=5) {
                        if(a.equals(arr[l]))
                    {
                        counter++;
                    }
                        
                    }
                        System.out.println("Blood Group" + " " + arr[i] + " " + "Stock " + " " + counter);
                counter = 0;
                       
                }
                else
                {
                    
                    if(u.contains(a))
                      continue;
                
                else
                    {
                      u.add(a);
                        for (int l = j; l < arr.length; l+=5) {
                        if(a.equals(arr[l]))
                    {
                        counter++;
                    }
                        
                    }
                        System.out.println("Blood Group" + " " + arr[i] + " " + "Stock " + " " + counter);
                counter = 0;
                        
                        
                    }
                }
                    
                
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
    }
    
}
