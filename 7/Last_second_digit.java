import java.util.*;
class Last_second_digit
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int value=sc.nextInt();
	int x=(value%100)/10;
	System.out.println(x);

}
}