package task6;

import java.util.Scanner;

public class NumberReader {
    private int number;

    public NumberReader() {

    }

    public int getNumber() {
        Scanner scanner = new Scanner(System.in);
        this.number=scanner.nextInt();
        return number;
    }
}
