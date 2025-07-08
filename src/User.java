import java.util.Scanner;

public class User {

    private Scanner scanner;

    public User() {
    this.scanner=new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setUserData(){
        int userAge;
        System.out.print("Please enter user age:");
        userAge= scanner.nextInt();
        System.out.println("User age is:"+userAge);
    }

}
