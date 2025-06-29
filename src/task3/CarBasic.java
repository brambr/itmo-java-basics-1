package task3;

public class CarBasic {
    private String color;
    private String name;
    private double weightInTons;

    public CarBasic() {
    }

    public CarBasic(String color) {
        this.color = color;
    }

    public CarBasic(double weightInTons, String color) {
        this.weightInTons = weightInTons;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeightInTons(double weightInTons) {
        this.weightInTons = weightInTons;
    }

    public String getAllParameters() {
        return " -Наименование = "+ name + "\n -Цвет = " + color +"\n -Вес(тонны)=" + weightInTons;
    }

}