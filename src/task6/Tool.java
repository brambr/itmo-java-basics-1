package task6;

import java.util.Scanner;

public class Tool {
    private int weightInGrams;

    public Tool() {
    }

    public void setWeightInGrams() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the weight of the tool:\n");
        this.weightInGrams = scanner.nextInt();
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }
}
