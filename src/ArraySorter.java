import java.util.Arrays;

public class ArraySorter {
    private int[] array;
    public ArraySorter() {

    }
    public String printResult(int[] array){
        return Arrays.toString(splitArray(array));
    }

    private int [] splitArray(int[] array){
        this.array=array ;
        if (array==null) return null;
        if (array.length<2) return array;
        int []  arrayA;
        int []  arrayB;
        int startA;
        int endA;
        int startB;
        int endB;

        if (array.length%2==0) {
            arrayA= new int[array.length/2];
            arrayB= new int[array.length/2];
        }
        else {
            arrayA= new int[(array.length+1)/2];
            arrayB= new int[(array.length+1)/2 - 1];
        }

        startA= arrayA.length - arrayA.length;
        endA = arrayA.length;
        startB=endA+1;
        endB = arrayB.length+arrayA.length;

        System.arraycopy(array,startA, arrayA,0,endA-startA);
        System.arraycopy(array,startB-1, arrayB,0,endB-endA);
        arrayA = splitArray(arrayA);
        arrayB = splitArray(arrayB);
        return mergeArrays(arrayA, arrayB);

    }
    public static int[] mergeArrays(int[] arrayA, int[] arrayB) {
        int[] newArray = new int[arrayA.length + arrayB.length];
        int i = 0, i1 = 0, i2 = 0;

        while (i1 < arrayA.length && i2 < arrayB.length) newArray[i++] = arrayA[i1] < arrayB[i2] ? arrayA[i1++] : arrayB[i2++];
        while (i1 < arrayA.length) newArray[i++] = arrayA[i1++];
        while (i2 < arrayB.length) newArray[i++] = arrayB[i2++];
        return newArray;
    }
}
