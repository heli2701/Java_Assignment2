// WAP to explain the concept of Factory Pattern using interfaces in java

//animal.java file
interface  Animal
{
	void voice();
	void color();
}

//Tiger.java file

public class Tiger implements Animal
{
	public void voice()
	{
		System.out.println("Tiger is Roaring");
	}
	public void color()
	{
		System.out.println("The color of Tiger is Yello and black");
	}
}

// Dog.java file

public class Dog implements Animal
{
	public void voice()
	{
		System.out.println("Dog is Barking");
	}
	public void color()
	{
		System.out.println("The color of Dog is white");
	}
}

// Factory.java file
public class Factory
{
	public Animal getter(String n)
	{
		if(n.equals("Dog"))
		{
			return new Dog();
		}
		
		else if(n.equals("Tiger"))
		{
			return new Tiger();
		}
		else {
			return null;
		}
	}
}

// call.java file

import java.util.*;

public class Call
{
	public static void main(String nn[])
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Eneter the name of the class:");
		String n = k.next();
		
		Factory f = new Factory();
		f.getter(n).voice();
		f.getter(n).color();
		
	}
}

