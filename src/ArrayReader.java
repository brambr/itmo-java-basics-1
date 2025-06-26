import java.util.Scanner;

public class ArrayReader {

    public int[] getArray(){

        return getArrayFromConsole();
    }


    private int[] getArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length:");
        int arrayLength = scanner.nextInt();
        int []array= new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("PLease enter "+i+" array element: ");
            array[i]=0;
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
