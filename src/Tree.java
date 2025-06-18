public class Tree {
 private double ageInYears;
 private boolean isAlive;
 private String name;

    public Tree(String name, double ageInYears) {
        this.name = name;
        this.ageInYears = ageInYears;
    }

    public Tree(String name, double ageInYears, boolean isAlive) {
        this.ageInYears = ageInYears;
        this.isAlive = isAlive;
        this.name = name;
    }

    public Tree() {
        System.out.println(" Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "ageInYears=" + ageInYears +
                ", isAlive=" + isAlive +
                ", name='" + name + '\'' +
                '}';
    }
}
