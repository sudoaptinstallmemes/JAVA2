/*
Part of the Employee SuperClass
 */
public class Secretary extends Employee{
    public Secretary(int years){
        super(years);
    }

    public void takeDictation(String text){
        System.out.println("Taking dictation of text: "+text);
    }

    public int getBonus(){
        return(0);
    }
}