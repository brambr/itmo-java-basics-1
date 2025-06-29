package task5;

public class LongestWordFinder {
    private String basicString;

    public LongestWordFinder(String basicString) {
        this.basicString = basicString;
    }
    public String getLongestWord(){
        StringBuilder result=new StringBuilder();
        result.append("Original text is:\n").append(basicString).append("\nThe longest word in the text is:\n").append(findLongestWord());
        return result.toString();

    }

    private String findLongestWord(){
        String result="";
        String[] words = basicString.split("\\s*(\\s|,|!|\\.)\\s*");
        int counter=0;
        for (int i = 1; i < words.length; i++){
            if(words[i].length()>counter) {
                result= words[i];
                counter= words.length;
            }
        }
        return result;
    }

}
