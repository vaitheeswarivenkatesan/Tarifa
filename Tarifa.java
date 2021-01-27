import java.util.*;

public class Tarifa{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int b=sc.nextInt();
    int n=sc.nextInt();
    int sum=0;
    for(int i=0;i<n;i++){
      int x=sc.nextInt();
      sum=b+sum-x;
    }
    System.out.println(sum+b);
  }
}
