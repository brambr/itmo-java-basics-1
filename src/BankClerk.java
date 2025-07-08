public class BankClerk extends Human {
    private String bankName;

    public BankClerk(String name, String familyName, String bankName) {
        super(name, familyName);
        this.bankName = bankName;
    }
    @Override
    public void printFullInfo(){
        System.out.println("Bank clerk info:"+
                "\n first name is : "+getFirstName()+
                "\n family name is:"+ getFamilyName()+
                "\n bank's name is:"+bankName);
    }
}