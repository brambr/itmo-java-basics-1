public class Main {
    public static void main(String[] args) {
        System.out.println("5.1 Определение самого длинного слова в строке");
        case51("Строка с самым длинннным словом");

        System.out.println("5.2 Проверка является ли слово палиндромом");
        case52("шалаш");

        System.out.println("5.3 Подмена значения слова в встроке");
        case53("Строка содержащая слова бяка","бяка","[вырезано цензурой]");

        System.out.println("5.4 Определение колво вхождений подстроки в строку");
        case54("Исходная строка котороя содержит другую строку ", " строк");

        System.out.println("5.5 Инвертирование слов в строке");
        case55("Исходная строка для конвертации");
    }

    private static void case55(String string) {
        System.out.println("Исходная строка: "+string);
        String[] wordsArray=string.split(" ");
        StringBuilder newWord = new StringBuilder("");
        String newString="";

        for(String str: wordsArray){
            newWord.append(str);
            newString= newString + newWord.reverse()+" ";
            newWord.delete(0,newWord.length());
        }

        System.out.println("Конвертированная строка: "+newString);
    }

    private static void case54(String string, String subString) {
        int counter=0;
        int substringPosition=0;
        int result;
        do{

            result = string.indexOf(subString, substringPosition);
            if (result!=-1) {
                substringPosition = ++result;
                counter++;
            }
        }while (result!=-1);
        System.out.println("Исходная строка: "+string);
        System.out.println("Подстрока: "+subString);
        System.out.println("Начальная строка содержит "+ counter+" включения заданной подстроки.");
    }

    private static void case53(String string, String word, String substitute) {
        System.out.println("Исходная строка: "+string);
        System.out.println("Слово которое следует заменить: "+word);
        System.out.println("Фраза замениетель: "+substitute);
        System.out.println("Итоговая строка: " + string.replaceAll(word, substitute));
    }
        private static void case52(String word) {
        StringBuilder builder= new StringBuilder(word);
        if (builder.reverse().toString().equals(word)) System.out.println("Слово "+word+" является полиндромом");
        else System.out.println("Слово "+word+" не является полиндромом");;
    }

    private static void case51(String string) {
        String result="";
        String[] words = string.split("\\s*(\\s|,|!|\\.)\\s*");
        int counter=0;
        for (int i = 0; i < words.length; i++){
            if(words[i].length()>counter) {
                result= words[i];
                counter= words[i].length();
            }
        }
        System.out.println("Самое длинное слово:"+result);
    }
}