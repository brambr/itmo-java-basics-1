public class FinderOfFirstUniqueNumberInArray {
    private int[] array;

    public FinderOfFirstUniqueNumberInArray(int[] array) {
        this.array = array;
    }

    public void printFirstUniqueNumber() {
        if (findFirstUniqueNum()[0]!=1) System.out.println("Array does not have unique number!");
        else System.out.println("First unique number of array is:  "+ findFirstUniqueNum()[1]);

    }

    private int[] findFirstUniqueNum(){
        int []result = new int[] {0,0};
        int counter;
        for(int i: array) {
             counter=0;
            for (int n : array) {
                if (i == n) counter++;
            }
            if (counter == 1) {
                result[0]=counter;
                result [1]= i;
                break;
            }
        }
        return result;
    }
}
