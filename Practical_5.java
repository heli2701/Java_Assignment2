// WAP to explain the concept of Encapsulation in java
public class Person {
    private String name;
    private int age;
 
    public String name()
  {
        return name;
  }
 
    public void setName(String name) { 
      this.name = name;
    }
 
    public int age() {
      return age; 
    }
 
    public void setAge(int age) { 
      this.age = age;
    }
}
 
public class Main {
    public static void main(String[] args)
    {
        Person person = new Person();
        person.setName("heli");
        person.setAge(18);
 
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
    }
}
