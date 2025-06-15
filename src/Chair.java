public class Chair {
    private String type;
    private int numbersOfLegs;
    private boolean isBackrestExist;

    public Chair() {
    }

    public Chair(String type, int numbersOfLegs, boolean isBackrestExist) {
        this.type = type;
        this.numbersOfLegs = numbersOfLegs;
        this.isBackrestExist = isBackrestExist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumbersOfLegs() {
        return numbersOfLegs;
    }

    public void setNumbersOfLegs(int numbersOfLegs) {
        this.numbersOfLegs = numbersOfLegs;
    }

    public boolean getIsBackrestExist() {
        return isBackrestExist;
    }

    public void setBackrestExist(boolean backrestExist) {
        isBackrestExist = backrestExist;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "type='" + type + '\'' +
                ", numbersOfLegs=" + numbersOfLegs +
                ", isBackrestExist=" + isBackrestExist +
                '}';
    }
}
