import java.util.Scanner;

public class ParentClass {
    private int number;

    public ParentClass() {

    }
    public int getNumber(){
        this.number=getIntFromConsole();
        return this.number;
    }
    private int getIntFromConsole(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the number:");
        return scanner.nextInt();
    }
}
