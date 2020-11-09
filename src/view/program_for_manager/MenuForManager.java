package view.program_for_manager;

import entities.Manager;
import entities.Student;
import entities.Teacher;
import functions.NotificationManage;
import functions.StudentManage;
import functions.TeacherManage;
import view.validate.ValidateInput;

public class MenuForManager {
    ValidateInput input = new ValidateInput();
    StudentManage studentManage = new StudentManage();
    TeacherManage teacherManage = new TeacherManage();
    Manager manager = Manager.getInstance();
    NotificationManage notificationManage = new NotificationManage();




    public void menu1(){
//        String id, String name, String birthDay, String mail, String phone, String className
        System.out.print("Enter student id(bốn chữ số): ");
        String id = input.inputIdForAdd();
        System.out.print("Enter student name(viết hoa chữ cái đầu): ");
        String name = input.inputStr("[A-Z].+");
        System.out.print("Enter student birthday(dd/mm/yyyy): ");
        String birthDay = input.inputStr("(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})");
        System.out.print("Enter student email: ");
        String mail = input.inputStr("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+");
        System.out.print("Enter student phone number(10 chữ số): ");
        String phone = input.inputStr("\\d{10}");
        System.out.print("Enter student class name(viết hoa chữ cái đầu): ");
        String className = input.inputStr("[A-Z].+");

        Student student = new Student(id,name,birthDay,mail,phone,className);

        studentManage.addStudent(student);
    }

    public void menu2(){
        System.out.print("Enter student id(bốn chữ số): ");
        String id = input.inputIdForSearch();

        studentManage.removeStudent(id);
    }

    public void menu3(){
        System.out.print("Enter student id(bốn chữ số): ");
        String id = input.inputIdForSearch();
        studentManage.removeStudent(id);

        System.out.print("Enter student new id(bốn chữ số): ");
        String newId = input.inputIdForAdd();
        System.out.print("Enter student new name(viết hoa chữ cái đầu): ");
        String name = input.inputStr("[A-Z].+");
        System.out.print("Enter student new birthday(dd/mm/yyyy): ");
        String birthDay = input.inputStr("(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})");
        System.out.print("Enter student new email: ");
        String mail = input.inputStr("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+");
        System.out.print("Enter student new phone number(10 chữ số): ");
        String phone = input.inputStr("\\d{10}");
        System.out.print("Enter student new class name(viết hoa chữ cái đầu): ");
        String className = input.inputStr("C[01]\\d{3}K\\d");

        Student student = new Student(newId,name,birthDay,mail,phone,className);

        studentManage.addStudent(student);
    }

    public void menu4(){
//String id, String name, String birthDay, String mail, String phone, String subject, double salary
        System.out.print("Enter teacher id(bốn chữ số): ");
        String id = input.inputIdForAdd();
        System.out.print("Enter teacher name(viết hoa chữ cái đầu): ");
        String name = input.inputStr("[A-Z].+");
        System.out.print("Enter teacher birthday(dd/mm/yyyy): ");
        String birthDay = input.inputStr("(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})");
        System.out.print("Enter teacher email: ");
        String mail = input.inputStr("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+");
        System.out.print("Enter teacher phone number(10 chữ số): ");
        String phone = input.inputStr("\\d{10}");
        System.out.print("Enter teacher subject(viết hoa chữ cái đầu): ");
        String subject = input.inputStr("[A-Z].+");
        System.out.println("Enter teacher salary(chỉ chữ số): ");
        double salary = Double.parseDouble(input.inputStr("\\d+"));

        Teacher teacher = new Teacher(id,name,birthDay,mail,phone,subject,salary);

        teacherManage.addTeacher(teacher);
    }

    public void menu5(){
        System.out.print("Enter teacher id(bốn chữ số): ");
        String id = input.inputIdForSearch();

        teacherManage.removeTeacher(id);
    }

    public void menu6(){
        System.out.print("Enter teacher id(bốn chữ số): ");
        String id = input.inputIdForSearch();
        teacherManage.removeTeacher(id);

        System.out.print("Enter teacher new id(bốn chữ số): ");
        String newId = input.inputIdForAdd();
        System.out.print("Enter teacher new name(viết hoa chữ cái đầu): ");
        String name = input.inputStr("[A-Z].+");
        System.out.print("Enter teacher new birthday(dd/mm/yyyy): ");
        String birthDay = input.inputStr("(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})");
        System.out.print("Enter teacher new email: ");
        String mail = input.inputStr("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+");
        System.out.print("Enter teacher new phone number(10 chữ số): ");
        String phone = input.inputStr("\\d{10}");
        System.out.print("Enter teacher new subject(viết hoa chữ cái đầu): ");
        String subject = input.inputStr("[A-Z].+");
        System.out.println("Enter teacher new salary(chỉ chữ số): ");
        double salary = Double.parseDouble(input.inputStr("\\d+"));

        Teacher teacher = new Teacher(newId,name,birthDay,mail,phone,subject,salary);
        teacherManage.addTeacher(teacher);
    }
    public void menu7(){
        System.out.print("Enter student id(bốn chữ số): ");
        String id = input.inputIdForSearch();

        System.out.println(studentManage.searchStudent(id).toString());
    }

    public void menu8(){
        System.out.print("Enter teacher id(bốn chữ số): ");
        String id = input.inputIdForSearch();

        System.out.println(teacherManage.searchTeacher(id).toString());
    }

    public void menu9(){
        studentManage.displayAllStudent();

    }
    public void menu10(){
        teacherManage.displayAllTeacher();
    }

    public void menu11(){
        notificationManage.readTranscript();
    }
    public void menu12(){
        notificationManage.readStudentLateFile();
    }
    public void menu13(){
        notificationManage.readWishes();
    }
    public void menu14(){
        notificationManage.readComplaints();
    }
    public void menu15(){
        System.out.print("Enter notifications: ");
        String mess = input.inputStr(".+");

        notificationManage.sendNotificationToStudent(manager,mess);
    }
    public void menu16(){
        notificationManage.readNotification();
    }
}
