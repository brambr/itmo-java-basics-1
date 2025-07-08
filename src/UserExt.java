public class UserExt extends User {
    public UserExt() {
    }
    @Override
    public void setUserData(){
            String  userName;
            System.out.print("Please enter user name:");
            userName= super.getScanner().next();
            System.out.println("User name is:"+userName);
    }

}
