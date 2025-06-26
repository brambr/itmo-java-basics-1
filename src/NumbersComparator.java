public class NumbersComparator {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;


    public NumbersComparator() {
    }

    public boolean compare(){
        loadNumbersValue();
        if(this.secondNumber>this.firstNumber&&this.thirdNumber>this.secondNumber) return true;
        else return false;
    }

    private void loadNumbersValue(){
        NumberReader reader=new NumberReader();

        this.firstNumber = reader.getFirstNumber();
        this.secondNumber = reader.getSecondNumber();
        this.thirdNumber = reader.getThirdNumber();
    }

}
