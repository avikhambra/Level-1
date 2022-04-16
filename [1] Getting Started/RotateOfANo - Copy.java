import java.util.*; 
  public class RotateOfANo{
   
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
     // write your code here  
      int n = scn.nextInt();
      int k = scn.nextInt();
      //Count
      int temp = n;
      int digit = 0;
      while(temp != 0){
        temp = temp/10;
        digit++;
      }
      //check k is - or +
      k = k % digit;
      if(k<0){
        k = k+digit;
      }

      // 10*mlt or 10*div
      int div = 1;
      int mlt = 1;
      for(int i = 1; i<=digit; i++){
        
        if(i<=k){
          div = div*10;
        }else{
          mlt = mlt*10;
        }

      }

      int q = n/div;
      int rem = n%div;

      int Rotate = q + rem*mlt;
      System.out.println(Rotate);
      scn.close();

    }
  }

/*
Input --------------->
562984
2

Output ---------------->
845629
  */