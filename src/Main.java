public class Main {
    public static void main(String[] args) {
        System.out.println("6.1 создание абстракного класса Человек и его наследников(Клиент и Клерк)");
        case61();

        System.out.println("6.2 Предложить решение предыдущей задачи при помощи интерфейса");
        case62();

        System.out.println("6.3 Создание дочерненго класса Truck от абстракного класса Car, и переопределение кол-ва его колес");
        case63(20000,"Tatra", 'G',40.0F,4,10000);

        System.out.println("6.4 Создание родительского и дочернего  классов с чтением параметра из консоли");
        case64();

        System.out.println("6.5 Переопределение методов в дочернем классе");
        case65();
    }

    private static void case65() {

        User user=new User();
        user.setUserData();

        UserExt userExt=new UserExt();
        userExt.setUserData();
    }

    private static void case64() {
        HeirClass heirClass=new HeirClass();
        heirClass.printNumber();

    }

    private static void case63( int weight, String model, char color, float speed ,int wheelsQuantity, int maxWeightInKilos ){
        Truck truck=new Truck(weight, model,color, speed, wheelsQuantity,maxWeightInKilos );
        System.out.println(truck.toString());
        truck.newWheels(6);

    }

    private static void case62() {
        System.out.println( " В предыдущем примере, можно реализовать  метод печати данных о клиенте и клерке \n"+
                " путем имплементации  интерфейса Printable и его  абстрактного метода\n"+
                " printFullInfo() в обоих классах. При этом абстракный метод в радительском классе будет неубходимо убрать.");
    }

    private static void case61() {
        Client client=new Client("Ivan","Ivanov","OTP");
        client.printFullInfo();
        BankClerk bankClerk=new BankClerk("Sergey","Sidorov","OTP");
        bankClerk.printFullInfo();
    }
}