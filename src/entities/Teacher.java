package entities;

public class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher() {
    }

    public Teacher(String id, String name, String birthDay, String mail, String phone, String subject, double salary) {
        super(id, name, birthDay, mail, phone);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", birthDay='" + super.getBirthDay() + '\'' +
                ", mail='" + super.getMail() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                "subject='" + subject + '\'' +
                ", salary=" + salary +
                "} ";
    }
}
