import java.time.LocalDate;
import java.time.Period;

public class Building {
    private String name;
    private int numberOfFloors;
    private LocalDate constructionDate;


    public Building() {}

    public  void  setParameters(String name, int numberOfFloors, int year, int month, int day){
        this.name = name;
        this.numberOfFloors = numberOfFloors;
        this.constructionDate = LocalDate.of(year, month, day );
    }

    public void printAllParameters(){
        System.out.println( " -Наименование:" + name + "\n -Кол-во этажей:"+ numberOfFloors + " \n -Дата постройки:" + constructionDate);
    }

    public  int ageInYears(){

        LocalDate currentDate = LocalDate.now();

        Period period = Period.between( constructionDate, currentDate);

        return period.getYears();

    }
}
