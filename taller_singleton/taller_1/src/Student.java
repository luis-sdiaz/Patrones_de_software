public class Student {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public String getName(){
        return name;
    }

    public int getAge () {
        return age;
    }

    public void displayInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);

    }
}
