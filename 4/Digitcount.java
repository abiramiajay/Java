import java.util.Scanner;
class Digitcount
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int value=sc.nextInt();
	int count=0;
	int temp=value;
	while(value>0)
	{
		count++;
		value=value/10;
	}
	System.out.println("DIGIT COUNT IS "+count);
}
}
