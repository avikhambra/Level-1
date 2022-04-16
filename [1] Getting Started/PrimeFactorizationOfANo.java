import java.util.*;

public class PrimeFactorizationOfANo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();
        
        for(int i = 2; i * i <= n; i++){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n / i;
            }
        }
        
        if(n != 1){
            System.out.print(n);
        }     
	}
}
