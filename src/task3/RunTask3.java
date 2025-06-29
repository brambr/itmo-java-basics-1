package task3;

public class RunTask3 {
    public RunTask3() {
    }

    public void case31() {
        System.out.println("3.1");
        Study study = new Study("Изучение Java-это просто!");
        System.out.println(study.printCourse());

    }

    public void case32() {
        System.out.println("3.2");
        Car car1 = new Car(1.2, "Красный");
        Car car2 = new Car("Зеленый");

        car1.setName("Ford Mustang");
        car2.setName("Ford RAM 1500");
        car2.setWeightInTons(2.4);

        System.out.println(" Автомобиль #1 - параметры: \n" + car1.getAllParameters());
        System.out.println(" Автомобиль #2 - параметры: \n" + car2.getAllParameters());

    }

    public void case33() {
        System.out.println("3.3");
        Building building1 = new Building();
        Building building2 = new Building();

        building1.setParameters("Лахта Центр", 87, 2018, 1, 29);
        building2.setParameters("Дом Зингера", 7, 1904, 1, 1);

        System.out.println("Параметры здания #1:");
        building1.printAllParameters();
        System.out.println(" Зданию " + building1.ageInYears() + " лет.");

        System.out.println("Параметры здания #2:");
        building2.printAllParameters();
        System.out.println(" Зданию " + building2.ageInYears() + " лет.");
    }

    public void case34() {
        System.out.println("3.4 ");
        Tree tree1 = new Tree();
        Tree tree2 = new Tree("Ива", 5.5);
        Tree tree3 = new Tree("Дуб", 250d, true);

        System.out.println(" Дерево #1 - параметры:" + tree1);
        System.out.println(" Дерево #2 - параметры:" + tree2);
        System.out.println(" Дерево #3 - параметры:" + tree3);

    }
}