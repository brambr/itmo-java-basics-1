public class SumChecker {
    private int firstNumber;
    private int secondNumber;
    private int sumResult;


    public SumChecker() {
    }

    public boolean run(){
        loadNumbersValue();
        if((firstNumber+secondNumber)==sumResult) return true;
        else return false;
    }

    private void loadNumbersValue(){
        NumberReader reader=new NumberReader();

        this.firstNumber = reader.getFirstNumber();
        this.secondNumber = reader.getSecondNumber();
        this.sumResult = reader.getThirdNumber();
    }


}
