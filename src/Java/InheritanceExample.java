package Java;

interface dummyInterference {
    int y = 25;
    void show();

    private void overRidePrivate() { System.out.println("Example of private in dummyInterference !"); }
    public static void overRide() { System.out.println("Example of public in dummyInterference !"); }
    default void overRideTest() { overRide(); System.out.println("Example of default in dummyInterference !"); }
}

class DummyParent {
    static int x = 10;
    int y = 20;
    private String str = "Virendra";

    public void overRideTest() { System.out.println("Example of default in DummyParent !"); }
    private void overRide() { System.out.println("Example of default in DummyParent !"); }
    void checkAccess() throws NumberFormatException { System.out.println("Example of public in DummyParent !");  }
    static void printName() { System.out.println("Viren in DummyParent !"); }
    private void getName() {  System.out.println("Example of private in DummyParent !"); }
    public void show() {  System.out.println("Example of default in DummyParent !");  }
}

public class InheritanceExample extends  DummyParent implements dummyInterference{
    int y = 90;

    public void overRideTest() { System.out.println("Example of default in InheritanceExample !"); }
    private void overRide() { System.out.println("Example of default in InheritanceExample !"); }
    public void show() {  System.out.println("Example of default in InheritanceExample !");  }
    protected void checkAccess() throws ArithmeticException { System.out.println("Example of public in InheritanceExample !");  }

    public static void main(String[] args) {
        dummyInterference di = new InheritanceExample() ;
        di.overRideTest();

        InheritanceExample ie = new InheritanceExample() ;
        ie.overRide();


        System.out.println("int y : "+di.y);
    }
}
