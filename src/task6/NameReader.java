
package task6;

import java.util.Scanner;

public class NameReader {
    public NameReader() {
    }

    public String getName(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextLine();
    }
}