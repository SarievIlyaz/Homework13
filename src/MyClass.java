public class MyClass {
    private String name;
    private String surname;
    private int age;
    private String dish;
    private String [] courses;

    public MyClass (String name, String surname, int age, String dish) {
        this.name = name;
        this.surname  = surname;
        this.age = age;
        this.dish = dish;
    }
    public MyClass (){

    }
    public MyClass(String name, String surname, int age, String dish,String...courses){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dish = dish;
        this.courses = courses;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getDish() {
        return dish;
    }

    public String[] getCourses() {
        return courses;
    }
}

