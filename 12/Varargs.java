class Varargs
{
private static void params1(Object...arguments)
{
	System.out.println("object array:");
	for(Object o:arguments)
	{
		System.out.println(o+" ");
		}

}
private static void params2(Object...arguments)
{
	System.out.println("object1 array:");
		for(int i=0;i<arguments.length;i++)
		{
			System.out.println(arguments[i]+" ");
		}

	}
public static void main(String[] args)
{
	params1("hello",1,20.30f,true,'K' );
	params2("hai",2,new Float (20.30f),new Boolean (true),new Character('a') );
	}
}