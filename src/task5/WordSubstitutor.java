package task5;

public class WordSubstitutor {
    private String basicString;
    private final String WORD_FOR_UPDATE="бяка";
    private final String WORD_SUBSTITUTE="[вырезанно цензурой]";
    public WordSubstitutor(String basicString) {
        this.basicString = basicString;
    }
    public String run(){

        return textUpdating();
    }

    private String textUpdating() {

     String newString  = basicString.replaceAll( WORD_FOR_UPDATE, WORD_SUBSTITUTE );

      return newString;

    }


}
