public class Main {
    public static void main(String[] args) {
        case21();
        case22();


    }
    private static void case21(){
        System.out.println("\n 1. ");

        Calculator calc= new Calculator();

        System.out.println("\nСумма целых чисел 3 и 5 равна:" + calc.summation(3,5));
        System.out.println("Сумма дробных чисел 3.3 и 5.5 равна:" + calc.summation(3.3D,5.5D));
        System.out.println("Сумма целых чисел большой длины 8 223 372 036 854 775 807 и 223 372 036 854 775 807 равна:" + calc.summation(8223372036854775807L,223372036854775807L));

        System.out.println("\nРазница целых чисел 3 и 5 равно:" + calc.subtraction(3,5));
        System.out.println("Разница дробных чисел 3.3 и 5.5 равно:" + calc.subtraction(3.3D,5.5D));
        System.out.println("Разница целых чисел большой длины  8 223 372 036 854 775 807 и 223 372 036 854 775 807 равно:" + calc.subtraction(8223372036854775807L,223372036854775807L));

        System.out.println("\nПроизведение целых чисел 3 и 5 равно:" + calc.multiplication(3,5));
        System.out.println("Произведение дробных чисел 3.3 и 5.5 равно:" + calc.multiplication(3.3D,5.5D));
        System.out.println("Произведение целых чисел большой длины   854 775 807 и  854 775 807 равно:" + calc.multiplication(854775807L,854775807L));

        System.out.println("\nДеление целых чисел 16 и 2 равно:" + calc.division(16,2));
        System.out.println("Деление дробных чисел 3.3 и 5.5 равно:" + calc.division(3.3D,5.5D));
        System.out.println("Деление целых чисел большой длины   8 223 372 036 854 775 807 и  8 223 372 036 854 775 807 равно:" + calc.division(8223372036854775807L,8223372036854775807L));

    }
    private static void case22(){
        System.out.println("\n 2.");
        Chair chair1=new Chair();
        Chair chair2=new Chair("stool", 3,false );
        System.out.println("\nСтул 1 - "+chair1.toString());
        System.out.println("Стул 2 - "+chair2.toString());
        chair1.setBackrestExist( chair2.getIsBackrestExist());
        chair1.setType(chair2.getType());
        chair1.setNumbersOfLegs(chair2.getNumbersOfLegs());
        System.out.println("\nСтул 1 с обновленными параметрами как у стула 2- "+chair1.toString());

    }
}