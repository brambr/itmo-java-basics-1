public class Truck extends Car{
    private int wheelsQuantity;
    private int maxWeightInKilos;

    public Truck(int w, String m, char c, float s, int wheelsQuantity, int maxWeightInKilos) {
        super(w, m, c, s);
        this.wheelsQuantity = wheelsQuantity;
        this.maxWeightInKilos = maxWeightInKilos;
    }
    public void newWheels(int wheelsQuantity){
        this.wheelsQuantity= wheelsQuantity;
        System.out.println( this.wheelsQuantity + " wheels have been set for the truck.");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "wheelsQuantity=" + wheelsQuantity +
                ", maxWeightInKilos=" + maxWeightInKilos +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", speed=" + speed +
                '}';
    }
}
