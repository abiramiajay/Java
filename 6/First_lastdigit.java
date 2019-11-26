import java.util.*;
class First_lastdigit
{
static int firstdigit(int value)
{
	while(value>=10)
	{
		value=value/10;
	}
return value;
}

static int lastdigit(int value)
{
 return (value%10);
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int value=sc.nextInt();
	System.out.println(firstdigit(value)+" "+lastdigit(value));


}
}