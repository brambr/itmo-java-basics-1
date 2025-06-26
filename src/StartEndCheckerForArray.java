import java.util.Arrays;

public class StartEndCheckerForArray {
    private  int[] array;
    private int value;

    public StartEndCheckerForArray(int[] array, int value) {
        this.array = array;
        this.value = value;
    }

    public boolean run(){

        if(array[0]==value||array.length== value) return  true;
        else return  false;
    }
}
