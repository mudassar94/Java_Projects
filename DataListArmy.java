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

class DataListArmy {

public ArrayList<Regiment> flist;
public DataListArmy() {
flist = new ArrayList<>();
}
public void AddToList(Regiment current) {
flist.add(current);
}
public void RemoveFromList(Regiment current) {
flist.remove(current);
}
public String printRegimentList()
{
String print = " Regiment No Regiment Name Number Of Troops \n"
+ "------------ ------------- -------------- \n";
for (int i = 0; i < flist.size(); i++) {
Regiment g = flist.get(i);
int regNumber = g.getregNumber();
String Name = g.getrname();
int RegStrength = (g.RegDown() - (i * 50));

print = print+ regNumber+ Name +RegStrength
+ "\n";
}
return print + "\n";
}
public Regiment getLargestReg() {
if (flist.isEmpty()) {
return null;
}
Regiment R = flist.get(0);
for (int i = 1; i < flist.size(); i++) {
Regiment current = flist.get(i); // get next regiment
// is current regiment > largest
if (current.getregStrength() > R.getregStrength()) {
R = current;
}
}
return R;

}
public String RegUpdate() {

String info = "Next Report! \n"
+ " Regiment# Regiment Name Number Of Troops \n"
+ "------------- ------------- ------------ \n";
for (int i = 0; i < flist.size(); i++) {
Regiment g = flist.get(i);
int regNumber = g.getregNumber();
String Name = g.getrname();
int RegStrength = (g.getregStrength() - (i * 50));
String word = "Elephants";
if (Name.equals(word)) {
RegStrength = RegStrength + 30;
} else {
RegStrength = RegStrength + 100;
}
info = info + regNumber + Name +RegStrength + "\n";

}   
return info + "\n";
}
}