package task5;

public class PalindromeChecker {
    private String basicWord;

    public PalindromeChecker(String basicWorld) {
        this.basicWord = basicWorld;
    }

    public boolean run(){

        return palindromeChecking();
    }

    private boolean palindromeChecking(){
        StringBuilder builder= new StringBuilder(basicWord);
         if (builder.reverse().toString().equals(basicWord)) return true;
         else return false;
    }
}
