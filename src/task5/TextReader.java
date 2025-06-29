package task5;

import java.util.Scanner;

public class TextReader {
    public TextReader() {
    }
    public String getTextFromConsole(){
        return readStringFromConsole();
    }
    private String  readStringFromConsole(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextLine();
    }
}
