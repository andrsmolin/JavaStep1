package Lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
            System.out.printf("Cотрудник %s занимает должность %s c окладом в %d $. Ему %d лет." +
                    "Контакты - %s, %s%n", name, position, salary, age, email, phone);
        }
    public int getAge() {
        return age;
    }
}
