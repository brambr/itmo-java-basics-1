import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        case411();
        case412();
        case413();
        case414();
        case415();
        case416();
        case421();
        case422();
        case424();
        case425();
    }



    private static void case411(){
            System.out.println("1.1");
            OddNumbers oddNumbers=new OddNumbers(1,100);
            System.out.println(oddNumbers.getStringWithOddNumbers());
        }
        private static void case412(){
            System.out.println("1.2");
            DividingCheckFor3And5 check= new DividingCheckFor3And5(1,100);
            System.out.println(check.getResultString());
        }

        private static void case413(){
            System.out.println("1.3 ");
            SumChecker checker=new SumChecker();
            System.out.println( checker.run());
        }
        private static void case414(){
            System.out.println("1.4 ");
            NumbersComparator comparator=new NumbersComparator();
            System.out.println( comparator.compare());
        }
          private static void case415() {
              System.out.println("1.5 ");
              int [] array=new int[]{3, -3, 7, 4, 5, 4, 3};
              StartEndCheckerForArray checker=new StartEndCheckerForArray(array, 3 );
              System.out.println("array ="+Arrays.toString(array));
              System.out.println( checker.run());
        }
        private  static  void case416(){
            System.out.println("1.6 ");
            int num1 = 1;
            int num2 = 3;
            int [] array=new int[]{3, -1, 7, 1, 5, 4, 3};
            NumbersIncludingCheckerForArray checker=new NumbersIncludingCheckerForArray(num1,num2,array);
            System.out.println("В заданном массиве присутствуют следующие числа "+ num1+" и "+num2 +" ? ");
            System.out.println("array "+Arrays.toString(array));
            System.out.println( "Ответ: "+checker.run());
        }

        private  static  void case421(){
            System.out.println("2.1 ");
            ArrayReader arrayReader=new ArrayReader();
            ArraySortingCheck arraySortingCheck= new ArraySortingCheck(arrayReader.getArray());
            System.out.println(arraySortingCheck.run());

        }
        private  static  void case422() {
            System.out.println("2.2 ");
            ArrayReader arrayReader=new ArrayReader();
            System.out.println("Result: "+ Arrays.toString( arrayReader.getArray()));
        }
        private  static  void case423() {
            System.out.println("2.3 ");
            ArrayReader arrayReader=new ArrayReader();
            SwitchArrayElements switchArrayElements=new SwitchArrayElements(arrayReader.getArray());
            System.out.println("Array1: "+ Arrays.toString(switchArrayElements.getArray()));
            System.out.println("Array2: "+ Arrays.toString( switchArrayElements.getNewArray()));
        }
         private  static  void case424() {
            System.out.println("2.4 ");
            ArrayReader arrayReader=new ArrayReader();
            FinderOfFirstUniqueNumberInArray finder=new FinderOfFirstUniqueNumberInArray(arrayReader.getArray());
            finder.printFirstUniqueNumber();
        }
        private static void case425(){
        System.out.println("2.5 ");
        ArrayReader arrayReader=new ArrayReader();
        int[] basicArray = arrayReader.getArray();
        ArraySorter sorter=new ArraySorter();
        System.out.println(" Basic array:\n"+Arrays.toString(basicArray));
        System.out.println(" Sorted array: \n"+sorter.printResult(basicArray));
        }
}
