

public class OddNumbers {
    private int start;
    private int end;

    public OddNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public String getStringWithOddNumbers (){
        StringBuilder result=new StringBuilder();
        for (Integer i:getOddNumbersArray()){
            result.append(i.toString()).append("\n");
        }
        return  result.toString();
    }

    private int[] getOddNumbersArray(){
        int baseLength= end - start;
        int [] result;

        if (baseLength%2==0){
            result = new int [baseLength/2];
        }
        else {
            result = new int [baseLength/2+1];
        }
        int k=0;
        for (int i = start; i < end; i++) {
            if(i%2!=0){
                result[k]=i;
                k++;
            }
        }
        return result;
    }

}
