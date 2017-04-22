/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.project;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public abstract  class Member {
    public String name;
    public String ID;
    public String bloodGroup;
    public String contact;
    public String address;
    protected String filename;
        Scanner s = new Scanner(System.in);
        
        
    public void addToFile() throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\hp\\Desktop\\ooadProjectFiles\\" + filename + ".txt",true));
        System.out.println("Enter ID");
        ID = s.nextLine();
       
        
        bw.write(ID);
        bw.newLine();
        

        System.out.println("Enter Name");
        name = s.nextLine();
        bw.write(name);
        bw.newLine();

        System.out.println("Enter BloodGroup");
        
        bloodGroup = s.nextLine().toUpperCase();
        
        bw.write(bloodGroup);
        bw.newLine();

        System.out.println("Enter Contact");
        contact = s.nextLine();
        bw.write(contact);
        bw.newLine();

        System.out.println("Enter Address");
        address = s.nextLine();
        bw.write(address);
        
        bw.newLine();
        bw.close();

    }
    
//    public void removeMember() throws FileNotFoundException
//    {
//          String[] arr = workingMethods.getFileData("C:\\Users\\hp\\Desktop\\ooadProjectFiles\\"+filename+".txt");
//        try {
//         BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\hp\\Desktop\\ooadProjectFiles\\"+filename+".txt"));
//             System.out.println("Enter id to remove");
//             String a = s.nextLine();
//             for (int i = 0; i < arr.length; i+=5) {
//                if(arr[i].equals(a))
//                    continue;
//                br.write(arr[i]);
//                br.newLine();
//                br.write(arr[i+1]);
//                br.newLine();
//                br.write(arr[i+2]);
//                br.newLine();
//                br.write(arr[i+3]);
//                br.newLine();
//            }
//         br.close();
//        }
//        catch(IOException ex)
//        {
//            System.out.println(ex);
//        }
//    }
    
    
}
class Doctor extends Member
{

    @Override
    public void addToFile() throws IOException {
        filename = "Doctor";
        super.addToFile();
    }
    
    
    
}


class Patient extends Member{

    @Override
    public void addToFile() throws IOException {
        filename = "Patient";
        super.addToFile();
    }
    
    
    
}


class Donor extends Member{

    @Override
    public void addToFile() throws IOException {
        filename = "Donor";
        super.addToFile();
    }
    
}

class RemoveDonor extends Remove {
    
    
    public void removeMember() throws FileNotFoundException
    {
        filename = "Donor";
        super.removeMember();
    }
}

class RemovePatient extends Remove {
    
     
    public void removePatient() throws FileNotFoundException
    {
        filename = "Patient";
        super.removeMember();
    }
}

class RemoveDoctor extends Remove {
    
    
    public void removeDoctor() throws FileNotFoundException
    {
        filename = "Doctor";
        super.removeMember();
    }
}
