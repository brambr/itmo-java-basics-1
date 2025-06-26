import java.util.Scanner;

public class NumberReader {


    public NumberReader() {
    }

    public int getFirstNumber() {
        System.out.println("Введите первое  число:");
        return getNumberFromConsole();
    }
    public int getSecondNumber() {
        System.out.println("Введите второе  число:");
        return getNumberFromConsole();
    }


    public int getThirdNumber() {
        System.out.println("Введите третье число:");
        return getNumberFromConsole();
    }


    private int getNumberFromConsole(){
        Scanner scanner=new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }

}
