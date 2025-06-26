public class NumbersIncludingCheckerForArray {
    private int firstNumber;
    private int secondNumber;
    private int [] array;

    public NumbersIncludingCheckerForArray(int firstNumber, int secondNumber, int[] array) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.array = array;
    }

    public boolean run(){
        boolean result=false;
        for(int i:array) {
            if (i == this.firstNumber || i == this.secondNumber) result= true;
        }
        return result;
    }
}
