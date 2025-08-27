package Java;


public class AccssAnotherSingleton {

    public static void main(String[] args){
        System.out.println("Address : "+SingletonConcept.getInstance());
        ii_DataType d = new ii_DataType();

        int[] xx = new int[d.x];
        System.out.println("length : "+xx.length);

    }
}
