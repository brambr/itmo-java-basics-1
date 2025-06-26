public class DividingCheckFor3And5 {
    private int start;
    private int end;

    public DividingCheckFor3And5(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public String getResultString(){
        StringBuilder result=new StringBuilder();
        for (Integer i:getNumbersArray()){
            if (i%3==0&&i%5==0){
                result.append("Делиться на 3 и на 5-ть:").append(i.toString()).append("\n");
            }
           else {

                if (i % 3 == 0) {
                    result.append("Делиться на 3:").append(i.toString()).append("\n");
                } else {
                    if (i % 5 == 0) {
                        result.append("Делиться на 5:").append(i.toString()).append("\n");
                    }
                }
            }
        }
        return  result.toString();
    }

    private int[] getNumbersArray(){
        int baseLength= end-start;
        int [] result= new int[baseLength];
        int k=0;
        for (int i = start; i < end; i++) {
            result[k]=i;
            k++;
        }
        return result;
    }
}
