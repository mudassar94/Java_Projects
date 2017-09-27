/**
 *
 * @author Mudassar
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HumanTest {
    public static void main(String[] args) throws notHumanBeingException, 
            FileNotFoundException, IOException{
      
        ArrayList<HumanBeing> human = new ArrayList<>();
        List<Male> male = new ArrayList<>();
        List<Female> female = new ArrayList<>();
      
        String inputFileName = JOptionPane.showInputDialog(null, 
                "What is the name of the input file?");
        String outputFileName = JOptionPane.showInputDialog(null, 
                "What is the name of the output file?");
      
        try (Scanner scnr = new Scanner(new File(inputFileName))) {
            OUTER:
            while (scnr.hasNext()) {
            try{
                if (scnr.next().equals("M")) {
                  
                    String name;
                    int age,weight,height;
                  
                    name = scnr.next();
                    age = scnr.nextInt();
                    weight = scnr.nextInt();
                    height = scnr.nextInt();
                  
                    human.add(new Male(name, age, weight, height));
                    male.add(new Male(name, age , weight, height));
                }
              
                else {
                  
                    String name;
                    int age;
                    String lastDegree;
                  
                    name = scnr.next();
                    age = scnr.nextInt();
                    lastDegree = scnr.next();
                  
                    human.add(new Female(name, age, lastDegree));
                    female.add(new Female(name, age, lastDegree));
                  
                }
              
            }
            
            catch (notHumanBeingException hx)
                    { System.out.println("Invalid Male");
                 }
          
            
            }
            scnr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Please check file's name.");
            }
              
        int i;
      
        //unsorted human
        try (PrintWriter out = new PrintWriter(new FileWriter(outputFileName)))
        {
            for(i = 0; i < human.size(); i++){
                System.out.println(human.get(i));
                out.println(human.get(i).toString());
            }
        }
      
        Collections.sort(human, new Comparator<HumanBeing>(){
            public int compare(HumanBeing s1, HumanBeing s2){
                return s1.getName().compareTo(s2.getName());
            }
        });
      
        //sorted human
        try (PrintWriter out = new PrintWriter(new FileWriter(outputFileName)))
        {
            for(i = 0; i < human.size(); i++){
                System.out.println(human.get(i));
                out.println(human.get(i).toString());
            }
        }
    
        //unsorted males
        try (PrintWriter out = new PrintWriter(new FileWriter(outputFileName)))
        {
            for(i = 0; i < male.size(); i++){
                System.out.println(male.get(i));
                out.println(male.get(i).toString());
            }
        }
      
        Collections.sort(male, new Comparator<Male>(){
            public int compare(Male h1, Male h2){
                if(h1.getHeight() > h2.getHeight()){
                    return 1;
                }
                else if(h1.getHeight() < h2.getHeight()){
                    return -1;
                }
              
                return 0;
            }
        });
      
      
        //sorted males
         try (PrintWriter out = new PrintWriter(new FileWriter(outputFileName)))
         {
            for(i = 0; i < male.size(); i++){
                System.out.println(male.get(i));
                out.println(male.get(i).toString());
            }
        }
       
         //unsorted females
        try (PrintWriter out = new PrintWriter(new FileWriter(outputFileName)))
         {
            for(i = 0; i < female.size(); i++){
                System.out.println(female.get(i));
                out.println(female.get(i).toString());
            }
        }
       
         Collections.sort(female, new Comparator<Female>(){
            public int compare(Female a1, Female a2){
                if(a1.getAge() > a2.getAge()){
                    return 1;
                }
                else if(a1.getAge() < a2.getAge()){
                    return -1;
                }
              
                return 0;
            }
        });
       
        //sorted females
        try (PrintWriter out = new PrintWriter(new FileWriter(outputFileName)))
         {
            for(i = 0; i < female.size(); i++){
                System.out.println(female.get(i));
                out.println(female.get(i).toString());
            }
        }
       
    }
  
}

