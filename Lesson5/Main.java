package Lesson5;

public class Main {
    public static void main(String[] args) {

        Employee[] arrEmp = new Employee[5];
        arrEmp[0] = new Employee("Vladimir", "ingeneer", "ing@m.com", "89991112223", 300, 34);
        arrEmp[1] = new Employee("Ivan", "director", "dir@m.com", "89992223331", 2000, 45);
        arrEmp[2] = new Employee("Galina", "manager", "man@m.com", "89993334445", 450, 37);
        arrEmp[3] = new Employee("Vitaliy", "doctor", "doc@m.com", "89995556667", 600, 56);
        arrEmp[4] = new Employee("Anna", "IT-master", "mas@m.com", "89997778889", 1500, 27);

        for (Employee older : arrEmp) {
            if (older.getAge() > 40) {
                older.info();
            }
        }
    }
}
