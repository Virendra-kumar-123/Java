package Delete;
import java.io.File;


public class MainWithoutStatic {
    public void go() {
        System.out.println("Calling without static");
    }

    public void main(String[] args){
        this.go();

        String str = "0";
        int i = Integer.parseInt(str);
//        int i = str.getInteger(str);

        System.out.println("i : "+i);
    }
}
