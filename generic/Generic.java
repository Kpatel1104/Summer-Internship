

class Test<T, U>
{
	T obj1; // An object of type T
	U obj2; // An object of type U



	Test(T obj1, U obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
}



class Generic
{
	public static void main (String[] args)
	{
		Test <String, Integer> obj =
			new Test<String, Integer>("CSE", 04);

		obj.print();
	}
}
