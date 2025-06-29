package task6;

public class RunTask6 {
    public RunTask6() {
    }
    public void case61(){
        System.out.println("6.1\n");
        NameReader reader=new NameReader();
        String clientName;
        System.out.println("Please enter client's name:\n");
        clientName=reader.getName();

        String clientFamilyName;
        System.out.println("Please enter client's family name:\n");
        clientFamilyName=reader.getName();

        String clientBankName;
        System.out.println("Please enter name of client's bank:\n");
        clientBankName=reader.getName();

        Client client= new Client(clientName,clientFamilyName,clientBankName);
        client.printFullInfo();

        String bankClerkName;
        System.out.println("Please enter bank clerk's name:\n");
        bankClerkName=reader.getName();

        String bankClerkFamilyName;
        System.out.println("Please enter of bank clerk's family name : \n");
        bankClerkFamilyName=reader.getName();

        String bankClerkBankName;
        System.out.println("Please enter name of bank clerk's bank:\n");
        bankClerkBankName=reader.getName();

        BankClerk bankClerk=new BankClerk(bankClerkName, bankClerkFamilyName, bankClerkBankName);
        bankClerk.printFullInfo();
    }
    public  void case62(){
        System.out.println("6.2\n");
        System.out.println( " В предыдущем примере, можно реализовать  метод печати данных об обьектах \n"+
                            " путем имплементации  интерфейса Printable и его  абстрактного метода\n"+
                            " printFullInfo() в обоих классах.");
    }
    public void case63(){
        System.out.println("6.3\n");
        TruckDataReader reader=new TruckDataReader();
        Truck truck=new Truck(reader.getWeight(), reader.getModel(), reader.getColor(), reader.getSpeed(), reader.getWheelsQuantity(), reader.getMaxWeightInKilos());
        System.out.println( "Please see truck info below: \n"+truck);
    }

    public void case64() {
        System.out.println("6.4\n");
        Axe axe=new Axe();
        axe.printAxeWeightInGram();

    }

    public void case65() {
        System.out.println("6.5\n");
        User user= new User();
        user.askUserData();
        Admin admin= new Admin();
        admin.askUserData();

    }
}

