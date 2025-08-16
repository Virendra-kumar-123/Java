package Java;
import java.util.Scanner;

public class i_DeclarationAndAccessControl {

    public static int[] arrInt;

    public static void oddAndEven(int[] arrInt, int arrLength){
        for(int i=0, j=arrLength-1; i<arrLength/2; i++, j--){
            int m=i;
            int n=j;

            if(arrInt[i]%2 ==0 && arrInt[j]%2 !=0){
                int temp = arrInt[m];
                arrInt[m]=arrInt[n];
                arrInt[n]=temp;
            }
            if(arrInt[i]%2 != 0 && arrInt[j]%2 ==0)
                continue;

            if(arrInt[i]%2 ==0 && arrInt[j]%2 ==0)
                m--;

            if(arrInt[i]%2 !=0 && arrInt[j]%2 !=0)
                n++;
        }

        System.out.print("Arranged elements of the array : ");
        for (int i: arrInt)
            System.out.print(i+ " ");
    }

    public static void main(String[] args) {
        System.out.print("Size of the array :  ");
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        arrInt= new int[arrLength];

        System.out.print("Elements of the array : ");
        for (int i = 0; i < arrLength; i++)
            arrInt[i]=sc.nextInt();

        sc.close();
        oddAndEven(arrInt, arrLength);
    }
}
