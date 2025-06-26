import java.util.Scanner;

public class ArraySortingCheck {
    private int [] array;

    public ArraySortingCheck(int[] array) {
        this.array = array;
    }

    public String run() {
        String result;
        int control = 1;
        int temp = array[0];
        for (int i : array) {
            if (i >= temp) control = control * 1;
            else control = control * 0;
            temp = i;
        }
        if (control == 1) result = "Ok";
        else result = "Please, try again";


        return result;
    }

}
