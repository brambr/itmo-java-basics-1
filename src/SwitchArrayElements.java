public class SwitchArrayElements {
    private int[] array;

    public SwitchArrayElements(int[] array) {
        this.array = array;
    }
    public int [] getArray(){
        return array;
    }
    public int [] getNewArray(){
        return changeArrayElementsLocation();
    }

    private int[] changeArrayElementsLocation(){
        int [] newArray;
        newArray = array.clone();
        newArray[0]= array[array.length-1];
        newArray[newArray.length-1]= array[0];
        return newArray;

    }

}
