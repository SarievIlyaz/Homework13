import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
        MyClass myClass = new MyClass("Ilyaz","Sariev",32,"Plov", "Java","English", "Soft Skills");
        System.out.println("My name is: "+ myClass.getName());
        System.out.println("My surname is: "+ myClass.getSurname());
        System.out.println("I am is: "+ myClass.getAge());
        System.out.println("My favorite dish: "+ myClass.getDish());
        System.out.println("My courses at the Peaksoft school: ");
        System.out.println(Arrays.toString(myClass.getCourses()));
    }
}