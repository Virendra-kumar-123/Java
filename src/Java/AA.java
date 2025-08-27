package Java;

class BB{
//     protected void show(){
//        System.out.println("SHOWWW ");
//    }
}
public class AA  {
     protected void show(){
        System.out.println("ssssssSHOWWW ");
    }

    public void varArgs(int x){
        System.out.println("var args ");
    }
    public static void main(String[] args) throws Exception{
//        i_DeclarationAndAccessControl.go();
        BB b = new BB();
        AA a = new AA();
//
//        AA.show();
//        BB.show();
//        b.show();
        a.show();

//        AA ab = new BB();
//        BB ba = new AA();


    }
}
