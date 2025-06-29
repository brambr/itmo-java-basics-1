package task6;

import java.util.Scanner;

public class User {
    private String userData;

    public User() {

    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public void askUserData(){
        System.out.println("Please enter age of user: ");
        this.userData= readUserData();
        System.out.println("You have set age of the user: "+userData);
    }

    public String readUserData(){
        Scanner scanner=new Scanner(System.in);
        return scanner.next();
    }
}
