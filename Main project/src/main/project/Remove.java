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
public class Remove {
    Scanner s = new Scanner(System.in);
    protected String filename;
    public void removeMember() throws FileNotFoundException
    {
        String[] arr = workingMethods.getFileData("C:\\Users\\hp\\Desktop\\ooadProjectFiles\\"+filename+ ".txt");
        try {
         BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\hp\\Desktop\\ooadProjectFiles\\"+filename+".txt"));
         //String[] io = new BufferedWriter(new FileWriter("C:\\Users\\hp\\Desktop\\ooadProjectFiles\\"+filename+".txt"));
             System.out.println("Enter id to remove");
             String a = s.nextLine();
             for (int i = 0; i < arr.length; i+=4) {
                if(arr[i].equals(a))
                    continue;
                br.write(arr[i]);
                br.newLine();
                br.write(arr[i+1]);
                br.newLine();
                br.write(arr[i+2]);
                br.newLine();
                br.write(arr[i+3]);
                br.newLine();
            }
         br.close();
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
    }
}
