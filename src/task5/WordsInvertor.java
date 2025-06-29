package task5;

public class WordsInvertor {
    private String text;

    public WordsInvertor(String text) {
        this.text = text;
    }
    public String run(){


        return textUpdating();
    }

    private String textUpdating() {
        String[] stringArray = text.split(" ");
        StringBuilder tempString=new StringBuilder();
        StringBuilder newString=new StringBuilder();
        for(String str: stringArray){

            tempString.append(str).reverse();
            tempString.append(' ');
            newString.append(tempString);
            tempString.delete(0,tempString.length());

        }
        return newString.toString();
    }
}
