/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class BookTest {

    public static void main(String[] args) throws FileNotFoundException {
        String inFile = JOptionPane.showInputDialog("Enter Input File");//taking input file name
        String outFile = JOptionPane.showInputDialog("Enter Output File"); //taking output file name
        Scanner sc = new Scanner(new FileReader(inFile)); //reading file
        int size = sc.nextInt(); // getting the size of array list
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String type = sc.next();
            if (type.equals("Book")) {
                books.add(new Book(sc.next(), sc.nextDouble()));
                sc.nextLine(); //leaving the remaining row
            } else if (type.equals("Novel")) {
                Book book = new Novel(sc.next(), sc.nextDouble(), sc.next(), sc.nextInt());
                books.add(book);
                sc.nextLine(); //leaving the remaining row
            } else if (type.equals("TextBook")) {
                Book book = new TextBook(sc.next(), sc.nextDouble(), sc.next(), sc.nextInt());
                books.add(book);
                sc.nextLine(); //leaving the remaining row
            } else if (type.equals("UsedNovel")) {
                Book book = new UsedNovel(sc.next(), sc.nextDouble(), sc.next(), sc.nextInt(), sc.nextInt());
                books.add(book); //leaving the remaining row
                sc.nextLine();
            }
        }
        PrintWriter pw = new PrintWriter(outFile); //getting the writer object
        while (sc.hasNext()) {
            char transaction = sc.next().charAt(0);

            if (transaction == 'E') {
                int index1 = sc.nextInt();
                int index2 = sc.nextInt();
                pw.write(""+books.get(index1).equals(books.get(index2))+"\n");//writing output to the file
                sc.nextLine(); //leaving the remaining row 

            }
            else if(transaction=='M'){
                int index = sc.nextInt();
                int markupPercentage = sc.nextInt();
                ((Novel)books.get(index)).setMarkupPercentage(markupPercentage);
                sc.nextLine(); //leaving the remaining row
            }
            else if(transaction=='D'){
                int index = sc.nextInt();
                int discount = sc.nextInt();
                ((TextBook)books.get(index)).setDiscount(discount);
                sc.nextLine(); //leaving the remaining row
            }
            else if(transaction=='C'){
                int index = sc.nextInt();
                pw.write(""+books.get(index).getPrice()+"\n");
                sc.nextLine();
            }
            else if(transaction=='O') {
                int index = sc.nextInt();
                pw.write(books.get(index).toString()+"\n");
            }
        }
        pw.close();
        sc.close();


    }
}