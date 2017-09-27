/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class Female extends HumanBeing {
  
    private String lastDegree;
  
    public Female(String name, int age, String lastDegree) 
            throws notHumanBeingException {
        
        super(name, age);
      
        this.lastDegree = lastDegree;
      
        if(super.getAge() >= 110){
            throw new notHumanBeingException("Invalid female.");
        }
    }
  
    public String getLastDegree(){
        return lastDegree;
    }
  
    public void setLastDegree(String lastDegree){
        this.lastDegree = lastDegree;
    }
   
    @Override
    public int getIntLevel(){
        int intLevel;
      
        if(this.getLastDegree().equals("Ph.D.")){
            intLevel = 5;
        }
        else if(this.getLastDegree().equals("MS")){
            intLevel = 4;
        }
        else if(this.getLastDegree().equals("BA")){
        intLevel = 3;
        }
        else if(this.getLastDegree().equals("AA")){
            intLevel = 2;
        }
        else{ intLevel = 1;}
      
        return intLevel;
    }
  
    @Override
    public String toString(){
        String output = "Name: " + super.getName() + " Age: " + super.getAge() 
                + " Last Degree: " + this.getLastDegree()
                + " Intelligence Level: " + this.getIntLevel();
        return output;
    }
  
}
