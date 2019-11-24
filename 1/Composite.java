import java.util.Scanner;
public class Composite {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
      int temp=num;
      int count=0;
      for(int i=2;i<=num;i++)
      {
        if(num%i==0)
        {
        count++;
        }
      }
      if(count>1)
      {
        System.out.println(temp +" is composite number");
      }
      else
      {
         System.out.println(temp +" is not composite number");
    }
}
}