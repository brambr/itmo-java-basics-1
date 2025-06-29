
package task6;

public abstract class Human {
    private String name;
    private String familyName;

    public Human(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }
    public abstract void printFullInfo();

}