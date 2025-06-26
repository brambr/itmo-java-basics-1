
public class Main {
    public static void main(String[] args) {
        case11();
        case12();
        case13();
        case14();
        case15();
        case16();
    
        case31();
        case32();
        case33();
        case34();

    }


    private static void case31() {
        System.out.println("3.1");
        Study study = new Study("Изучение Java-это просто!");
        System.out.println(study.printCourse());

    }

    private static void case32() {
        System.out.println("3.2");
        Car car1 = new Car(1.2, "Красный");
        Car car2 = new Car("Зеленый");

        car1.setName("Ford Mustang");
        car2.setName("Ford RAM 1500");
        car2.setWeightInTons(2.4);

        System.out.println(" Автомобиль #1 - параметры: \n" + car1.getAllParameters());
        System.out.println(" Автомобиль #2 - параметры: \n"+ car2.getAllParameters());

    }

    private static void case33(){
        System.out.println("3.3");
        Building building1 = new Building();
        Building building2 = new Building();

        building1.setParameters("Лахта Центр",87, 2018, 1,29);
        building2.setParameters("Дом Зингера",7, 1904, 1,1);

        System.out.println("Параметры здания #1:");
        building1.printAllParameters();
        System.out.println(" Зданию "+building1.ageInYears()+" лет.");

        System.out.println("Параметры здания #2:");
        building2.printAllParameters();
        System.out.println(" Зданию "+building2.ageInYears()+" лет.");
    }
    private static void case34() {
        System.out.println("3.4 ");
        Tree tree1=new Tree();
        Tree tree2 = new Tree("Ива", 5.5);
        Tree tree3 =new Tree("Дуб", 250d, true);

        System.out.println(" Дерево #1 - параметры:"+ tree1);
        System.out.println(" Дерево #2 - параметры:"+ tree2);
        System.out.println(" Дерево #3 - параметры:"+ tree3);

    }


       

    public static void case11(){
        System.out.println("1. \n Я\n хорошо \n знаю  \n Java. ");
    }

    public static void case12(){
        System.out.println( "2.");
        double result1=(46+10)*((double) 10 /3);
        System.out.println( " (46+10)*(10/3)="+result1);
        int result2 = 29 * 4 * -15;
        System.out.println(" (29) * (4) * (-15) =" + result2);
    }

    public static void case13(){
        int number= 10500;
        double result = number/10d/10d;
        System.out.println("3. \n (10500/10)/10 = "+result);
    }

    public static void case14(){
        double result = 3.6*4.1*5.9;
        System.out.println("4. \n 3.6*4.1*5.9 =" +result);
    }

    public static void case15(){
        System.out.println("5. \n Пожалуйста введите целые числа, например 42, 100 и 125 по очереди");
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        System.out.println(" Вы ввели следующие цифры:\n "+ a+"\n "+b+"\n "+c);
    }

    public static void case16(){
        System.out.println("6. \n Пожалуйста введите целое числo b:");
        Scanner scan = new Scanner(System.in);
        int b= scan.nextInt();
        if (b%2==0) {
            if (b>100){
                System.out.println(" Число вне диапазона!");
            }
            else {
                System.out.println(" Число b - четное");
            }
        }
        else {
            System.out.println(" Число b - нечетное");}
    }

}
