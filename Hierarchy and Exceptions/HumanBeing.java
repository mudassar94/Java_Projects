/**
 *
 * @author Mudassar
 */
public class HumanBeing extends Creature {
    private final String name;
    private final int age;
    private int intLevel;
  
    public HumanBeing(String name, int age){
        this.name = name;
        this.age = age;
    }
  
    public String getName(){
        return name;
    }
  
    public int getAge(){
        return age;
    }
  
    public void setIntLevel(int intLevel){
        this.intLevel = intLevel;
    }
  
    @Override
    public int getIntLevel(){
        return intLevel;
    }
    @Override
    public String toString(){
        String output = this.getName() + " " + this.getAge() + " " 
                + this.getIntLevel();
        return output;
    }
      
}