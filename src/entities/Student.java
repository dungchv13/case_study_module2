package entities;

public class Student extends Person {
    private String className;
    private double mark = -1;

    public Student() {
    }

    public Student(String id, String name, String birthDay, String mail, String phone, String className) {
        super(id, name, birthDay, mail, phone);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", birthDay='" + super.getBirthDay() + '\'' +
                ", mail='" + super.getMail() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", className='" + className + '\'' +
                "} ";
    }
}
