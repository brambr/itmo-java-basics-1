package task6;

public class BankClerk extends Human {
    private String bankName;

    public BankClerk(String name, String familyName, String bankName) {
        super(name, familyName);
        this.bankName = bankName;
    }
    @Override
    public void printFullInfo(){
        System.out.println("Bank clerk info:"+
                "\n name is : "+getName()+
                "\n family name is:"+ getFamilyName()+
                "\n bank's name is:"+bankName);
    }
}

