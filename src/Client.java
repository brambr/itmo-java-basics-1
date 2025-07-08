public class Client extends Human  {
    private String bankName;

    public Client (String firstName, String familyName, String bankName) {
        super(firstName,familyName);
        this.bankName = bankName;
    }

    @Override
    public void printFullInfo() {
        System.out.println("Client info:"+
                "\n first name is : "+getFirstName()+
                "\n family name is:"+getFamilyName()+
                "\n bank's name is:"+bankName);
    }
}
