package task6;

public class Client extends Human{
    private String bankName;

    public Client(String name, String familyName, String bankName) {
        super(name, familyName);
        this.bankName = bankName;
    }

    @Override
    public void printFullInfo() {
        System.out.println("Client info:"+
                "\n name is : "+getName()+
                "\n family name is:"+getFamilyName()+
                "\n bank's name is:"+bankName);
    }
}