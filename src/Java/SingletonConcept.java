package Java;
import java.util.Date;

public  class SingletonConcept {
    private static SingletonConcept singletonConcept;

    private SingletonConcept(){
    }

    public static SingletonConcept getInstance(){
        if(singletonConcept == null)
            singletonConcept = new SingletonConcept();

        return singletonConcept;
    }

}

