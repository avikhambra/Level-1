import java.util.*;
public class ReverseANumber{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        scn.close();
        int temp = n;
        int nod = 0;

        while(temp != 0 ){

            temp = temp/10;
            nod++;
        }
        //System.out.print(count);

        int div = (int)Math.pow(10,nod-1);

        while(div != 0){

            int q = n/div;
            System.out.println(q);

             n = n%div;
             div = div/10;
        }  
        
    }
}
