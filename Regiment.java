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

class Regiment {

//regiment name
private final String rname;
//regiment number
private final int rNumber;
//strength
private int regStrength = 1050;

public Regiment(int regNumber, String name) {
this.rname = name;
this.rNumber = regNumber;
}
public String getrname() {
return rname;
}
public int getregNumber() {
return rNumber;
}
public int getregStrength() {
return regStrength;
}
public int AddOne() {
regStrength = regStrength + 100;
return regStrength;
}
public int AddThird() {
regStrength = regStrength + 30;
return regStrength;
}
public int RegDown() {
regStrength = regStrength - 50;
return regStrength;

}
}