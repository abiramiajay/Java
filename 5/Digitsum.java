import java.util.Scanner;
class Digitsum
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int value=sc.nextInt();
	int temp=0;
	int original=value;
	int remainder;
	while(value>0)
	{
	remainder=value%10;
	temp=temp+remainder;
	value=value/10;
	}
	System.out.println("SUM OF DIGIT IS "+temp);
}
}
