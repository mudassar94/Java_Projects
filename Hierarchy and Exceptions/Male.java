/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class Male extends HumanBeing {
  
    private int height;
    private int weight;
  
    public Male(String name, int age, int weight, int height) 
            throws notHumanBeingException{
        super(name, age);
        if(weight < 400 && height < 100){
            this.weight = weight;
            this.height = height;
        }
        if(weight >= 400 || height >= 100){
            throw new notHumanBeingException("Invalid male.");
        }
      
    }
  
    public int getHeight(){
        return height;
    }
  
    public int getWeight(){
        return weight;
    }
  
    public void setHeight(int height){
        this.height = height;
    }
  
    public void setWeight(int weight){
        this.weight = weight;
    }
  
    @Override
    public int getIntLevel(){
        int intLevel;
        if(super.getAge() > 40){
            intLevel = 5;
        }
        else if(super.getAge() < 5){
            intLevel = 1;
        }
        else if(this.getWeight() >= 150 && this.getHeight() > 70){
            intLevel = 5;
        }
        else if(this.getWeight() >= 120 && this.getWeight() < 149 
                && this.getHeight() > 70){
            intLevel = 4;
        }
        else if(this.getWeight() >= 50 && this.getWeight() < 119){
            intLevel = 3;
        }
        else if(this.getWeight() >= 120 && this.getWeight() < 149 
                && this.getHeight() >= 55 &&
                this.getHeight() <= 69){
            intLevel= 2;
        }
        else{intLevel = 3;}
     
        return intLevel;
    }
    @Override
    public String toString(){
        String output = "Name: " + super.getName() + " Age: " + super.getAge() 
                + " Weight: " + this.getWeight()+ " Height: " +
                this.getHeight() + " Intelligence Level: " + this.getIntLevel();
        return output;
    }
  
}

