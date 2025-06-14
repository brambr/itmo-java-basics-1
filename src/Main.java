import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        case1();
        case2();
        case3();
        case4();
        case5();
        case6();
    }

    public static void case1(){
        System.out.println("1. \n Я\n хорошо \n знаю  \n Java. ");
    }

    public static void case2(){
        System.out.println( "2.");
        double result1=(46+10)*((double) 10 /3);
        System.out.println( " (46+10)*(10/3)="+result1);
        int result2 = 29 * 4 * -15;
        System.out.println(" (29) * (4) * (-15) =" + result2);
    }

    public static void case3(){
        int number= 10500;
        int result = number/10/10;
        System.out.println("3. \n (10500/10)/10 = "+result);
    }

    public static void case4(){
        double result = 3.6*4.1*5.9;
        System.out.println("4. \n 3.6*4.1*5.9 =" +result);
    }

    public static void case5(){
        System.out.println("5. \n Пожалуйста введите целые числа, например 42, 100 и 125 по очереди");
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        System.out.println(" Вы ввели следующие цифры:\n "+ a+"\n "+b+"\n "+c);
    }

    public static void case6(){
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