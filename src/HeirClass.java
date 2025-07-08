public class HeirClass extends ParentClass{
    public HeirClass() {
    }

    public void printNumber(){
        System.out.println("Число из родительского класса = "+super.getNumber());
    }
}
