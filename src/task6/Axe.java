package task6;

public class Axe extends Tool {


    public Axe( ) {;
     super.setWeightInGrams();
    }

    public void  printAxeWeightInGram(){
        System.out.println("THe weight of axe is : "+super.getWeightInGrams());
    }
}
