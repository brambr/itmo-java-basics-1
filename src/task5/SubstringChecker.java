package task5;

public class SubstringChecker {
    private String text;
    private String subString;

    public SubstringChecker(String text, String subString) {
        this.text = text;
        this.subString = subString;
    }
    public int run(){

        return textChecker();
    }

    private int textChecker() {

        int counter=0;
        int substringPosition=0;
        int result;
        do{

             result = text.indexOf(subString, substringPosition);
            if (result!=-1) {
                substringPosition = ++result;
                counter++;
            }
        }while (result!=-1);

        return counter;
    }
}
