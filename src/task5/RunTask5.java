package task5;



public class RunTask5 {

    public RunTask5() {
    }

    public void case51() {
            System.out.println("5.1");
            System.out.println("Please enter any text below:\n");
            TextReader reader=new TextReader();
            LongestWordFinder finder = new LongestWordFinder(reader.getTextFromConsole());
            System.out.println(finder.getLongestWord());

        }
    public void  case52(){
        System.out.println("5.2");
        System.out.println("Please enter word for palindrome check:\n");
        TextReader reader = new TextReader();
        PalindromeChecker checker=new PalindromeChecker(reader.getTextFromConsole());
        if (checker.run()) System.out.println("The word is a palindrome.");
        else System.out.println("The word is not a palindrome.");


    }

    public void case53() {
        System.out.println("5.3");
        System.out.println("Please enter text with word \"бкяка\" :\n");
        TextReader reader = new TextReader();
        WordSubstitutor substitutor=new WordSubstitutor(reader.getTextFromConsole());
        System.out.println("Please see updated text below:\n"+substitutor.run());

    }

    public void case54() {
        System.out.println("5.4");
        System.out.println("Please enter text:\n");
        TextReader reader = new TextReader();
        String text= reader.getTextFromConsole();
        System.out.println("Please enter the substring:\n");
        String subString = reader.getTextFromConsole();
        SubstringChecker checker=new SubstringChecker(text, subString);
        System.out.println("The substring has "+checker.run() +" inclusions in text.");
    }

    public void case55() {
        System.out.println("5.5");
        System.out.println("Please enter text:\n");
        TextReader reader = new TextReader();
        WordsInvertor invertor=new WordsInvertor(reader.getTextFromConsole());
        System.out.println("The new text is:\n"+invertor.run());
    }
}
