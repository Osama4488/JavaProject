
package main.project;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author hp
 */
public class Donarlist extends Member {
    Scanner s = new Scanner(System.in);
    Member m = new  Donor();
    workingMethods w = new workingMethods();
    
    
    
    
    
    public  void showDonar() throws FileNotFoundException
    {
        
         try {
    
    BufferedReader bw = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\ooadProjectFiles\\Donor.txt"));
    
    String[] arr = new String[100];
    int i = 0;
             for (i = 0; i < arr.length; i++) {
                 {
                     String s = bw.readLine();
                     if(s != null)
                 arr[i] = s;
                 else
                     break;
             }
             }
             for (int ij = 0; ij < i; ij++) {
                 System.out.println(arr[ij]);
             }
             
             
             
}
    catch(IOException ex)
    {
     System.out.println(ex);   
    }
    }
    
    
    
    
//    public void enteringDetails()
//    {
//        
//           try {
//    
//   
//     System.out.println("Enter Name");
//       name = s.nextLine();
//       bw.write(name);
//       
//       System.out.println("Enter ID");
//       ID = s.nextLine();
//       bw.write(ID);
//       
//       System.out.println("Enter BloodGroup");
//       bloodGroup = s.nextLine();
//       bw.write(bloodGroup);
//        
//        
//       
//       System.out.println("Enter Contact");
//       contact = s.nextLine();
//       bw.write(contact);
//       
//       System.out.println("Enter Address");
//       address = s.nextLine();
//       bw.write(address);
//}  
//    catch(IOException ex)
//    {
//     System.out.println(ex);   
//    }    
//    }

    @Override
    public void addToFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
