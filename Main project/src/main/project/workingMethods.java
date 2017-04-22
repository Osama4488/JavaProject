/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.project;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;
import java.io.Serializable;
/**
 *
 * @author hp
 */

//    public static void writeStringToFile(String filepath, String content) throws IOException
//    {
//        FileWriter w = new FileWriter(filepath);
//        w.write(content);
//        w.close();
//    }
//    public static void writeArrayToFile(String filepath, String[] content) throws IOException
//    {
//        FileWriter w = new FileWriter(filepath);
//        
//        for (int i = 0; i < content.length; i++) {
//         w.write(content[i]);
//        }
//        w.close();
//    }
//    
//}
public class workingMethods  {
    Scanner s = new Scanner(System.in);
    
    
    public static String[] getFileData(String filepath) throws FileNotFoundException
    {
        ArrayList<String> xyz = new ArrayList<String>();
        Scanner bo = new Scanner(new FileReader(filepath));
        while(bo.hasNext()){
            xyz.add(bo.nextLine());
        }
        return xyz.toArray(new String[xyz.size()]);   
    }
    
    public void StartingWindow()
    {
        //System.out.println("=================================================");
        System.out.println("============== Welcome To Blood Donation System ==============\n");
        
        System.out.println("Press 1 ======= Login Window\n");
        //System.out.println("Press 2 ======= New User? Register Here ");
        System.out.println("Press 2 ======= Exit");
        
        String a = s.nextLine();
        
        switch(a)
        {
            case "1":
                    Login();
                break;
                
            case "2":
                   
                break;
        }
    }
    
    
    
    public void Login()
    {
    
    try {
//  BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\hp\\Desktop\\osama.txt"));
//  bw.write("osama");
//  bw.close();
        BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\hp\\\\Desktop\\\\ooadProjectFiles\\\\osama.txt"));
        String[] arr = new String[5];
        
        for (int i = 0; i < arr.length; i++) {
        arr[i]= br.readLine();    
        }
        System.out.println("Enter UserName");
                String b = s.nextLine();
                System.out.println("Enter Password");



                String p = s.nextLine();
        
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(b) && arr[i+1].equals(p))
            {
                details();
            }
            else
            {
                System.out.println("Wrong password");
                i+=1;
                Login();
            }
        }
        
}
    catch(IOException ex)
    {
        
        System.out.println(ex);
    }
    }
  // BufferedReader br = new   BufferedReader(new FileReader("C:\\")); 
    
    public void details() throws FileNotFoundException, IOException
    {
    Donarlist d = new Donarlist();    
         System.out.println("Press 1 ===== Logs");
         System.out.println("Press 2 ===== Show Donor List");
          System.out.println("Press 3 ===== Add Donor");
           System.out.println("Press 4 ===== Remove Donor");
            System.out.println("Press 5 ===== Add Customer");
            System.out.println("Press  6 ===== Remove Customer");
             System.out.println("Press 7 ===== Add Doctor");
             System.out.println("Press 8 ===== Remove Doctor");
             System.out.println("Press 9 ===== Check Stocks");
             System.out.println("Press 10 ===== Logout");
              Member x;
             
             String p = s.nextLine();
            Remove l = new Remove();
             Stock t;
            switch(p)
             {
                 case "1":
                     DateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                     Date date = new Date();
                     System.out.println(dateformat.format(date));
                     details();
                     break;
                 case "2":
                     d.showDonar();
                     break;
                     
                     case "3":
                     x = new Donor();
                     x.addToFile();
                 
                     break;
                     
                     case "4":
                    l.filename = "Donor";
                    l.removeMember();
                     break;
                     
                     case "5":
                     x = new Patient();
                     x.addToFile();
                  
                     break;
                      case "6":
                    l.filename = "Patient";
                     l.removeMember();

                     break;
                      case "7":
                     x = new Doctor();
                     x.addToFile();
                    
                     break;
                      case "8":
                     l.filename = "Doctor";
                     l.removeMember();
                     
                     break;
                     case "9":
                     t = new Stock();
                     t.checkStocks();
                     break;
                     case "10":
                     StartingWindow();
                     break;
             }
             details();
    }
}


