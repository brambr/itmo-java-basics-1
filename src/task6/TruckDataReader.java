package task6;

import java.util.Scanner;

public class TruckDataReader {
    private int weight;
    private String model;
    private char color;
    private float speed;
    private int wheelsQuantity;
    private int maxWeightInKilos;

    public TruckDataReader() {
    read();
    }

    public int getWeight() {

        return weight;
    }

    public String getModel() {
        return model;
    }

    public char getColor() {
        return color;
    }

    public float getSpeed() {
        return speed;
    }

    public int getWheelsQuantity() {
        return wheelsQuantity;
    }

    public int getMaxWeightInKilos() {
        return maxWeightInKilos;
    }

    private void read(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the weight of truck:\n");
        this.weight = scanner.nextInt();
        System.out.println("Please enter the model of truck:\n");
        this.model= scanner.next();
        System.out.println("Please enter the color of truck:\n");
        this.color= scanner.next().charAt(0);
        System.out.println("Please enter the speed of truck:\n");
        this.speed= scanner.nextFloat();
        System.out.println("Please enter the wheel quantity for truck:\n");
        this.wheelsQuantity= scanner.nextInt();
        System.out.println("Please enter the max weight of truck in kilos :\n");
        this.maxWeightInKilos= scanner.nextInt();
    }
}
