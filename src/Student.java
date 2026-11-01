
public abstract class Student {

    private int id;
    private String name;
    private int age;


    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public abstract double calculateGpa();


    @Override
    public String toString() {
        return
                "ID: " + id + " | Name: " + name + " | Age: " + age + " | GPA: " + calculateGpa();
    }
}
