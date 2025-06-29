package task1;

import java.util.Scanner;

public class RunTask1 {

        public RunTask1() {
        }

        public void case11(){
            System.out.println("1.1 \n Я\n хорошо \n знаю  \n Java. ");
        }

        public void case12(){
            System.out.println( "1.2");
            double result1=(46+10)*((double) 10 /3);
            System.out.println( " (46+10)*(10/3)="+result1);
            int result2 = 29 * 4 * -15;
            System.out.println(" (29) * (4) * (-15) =" + result2);
        }

        public void case13(){
            int number= 10500;
            double result = number/10d/10d;
            System.out.println("1.3 \n (10500/10)/10 = "+result);
        }

        public void case14(){
            double result = 3.6*4.1*5.9;
            System.out.println("1.4 \n 3.6*4.1*5.9 =" +result);
        }

        public void case15(){
            System.out.println("1.5 \n Пожалуйста введите целые числа, например 42, 100 и 125 по очереди");
            Scanner scan = new Scanner(System.in);
            int a= scan.nextInt();
            int b= scan.nextInt();
            int c= scan.nextInt();
            System.out.println(" Вы ввели следующие цифры:\n "+ a+"\n "+b+"\n "+c);
        }

        public void case16(){
            System.out.println("1.6 \n Пожалуйста введите целое числo b:");
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

