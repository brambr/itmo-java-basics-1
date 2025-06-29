package task6;

public class Admin extends User {

    public Admin() {
    }

    @Override
    public void askUserData(){
        System.out.println("Please enter name of user: ");
        super.setUserData(super.readUserData());
        System.out.println("You have set name of the user : "+super.getUserData());
    }
}
