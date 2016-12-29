/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RegimentTester {
public static void main(String[] args) throws IOException
{
DataListArmy kab = new DataListArmy();   
Scanner fileScan = new Scanner(new File("regiments.txt"));
System.out.println("Summary of the Report:\n");
while (fileScan.hasNext())
{   
String line = fileScan.nextLine();
//print line
System.out.println(line);
//scanner object
Scanner lScanZor = new Scanner(line) ;
//current line
int RegNumber = lScanZor.nextInt();
String Name = lScanZor.next();
//creating constructor
Regiment adder = new Regiment(RegNumber, Name);
//add to list
kab.AddToList(adder) ;
}
  
System.out.println(kab.printRegimentList()); // print the list   
//showing jpane   

int i=0;
while(i<20){
JOptionPane.showMessageDialog(null,"Next week report?") ;
System.out.println(kab.RegUpdate());
kab.RemoveFromList(kab.getLargestReg());
i++;
}
}
}