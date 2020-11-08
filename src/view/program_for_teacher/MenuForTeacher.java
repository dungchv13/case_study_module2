package view.program_for_teacher;

import entities.Manager;
import entities.Student;
import functions.NotificationManage;
import functions.StudentManage;
import functions.TeacherManage;
import view.validate.ValidateInput;

import java.util.ArrayList;

public class MenuForTeacher {
    ValidateInput input = new ValidateInput();
    StudentManage studentManage = new StudentManage();
    TeacherManage teacherManage = new TeacherManage();
    Manager manager = Manager.getInstance();
    NotificationManage notificationManage = new NotificationManage();

    public void menu1(String id){
        System.out.println(teacherManage.searchTeacher(id).toString());
    }

    public void menu2(){
        studentManage.displayAllStudent();
    }

    public void menu3(){
        ArrayList<Student> studentList = studentManage.getStudentList();
        ArrayList<String> transcript = new ArrayList<>();
        for (Student stu:studentList) {
            System.out.print("Enter mark for Student(id:"+stu.getId()+", name:"+stu.getName()+"):");
            double mark = Double.parseDouble(input.inputStr("\\d"));                                  //chua xong
            stu.setMark(mark);
            transcript.add("Student(id:"+stu.getId()+", name:"+stu.getName()+"): "+mark);
        }
        notificationManage.writeTranscript(transcript);
        studentManage.writeStudentList(studentList);
    }

    public void menu4(){
        System.out.print("Enter student id: ");
        String id = input.inputIdForSearch();

        ArrayList<Student> studentList = studentManage.getStudentList();
        ArrayList<String> transcript = new ArrayList<>();

        for (Student stu:studentList) {
            if(stu.getId().equals(id)){
                System.out.print("Enter mark for Student(id:"+stu.getId()+", name:"+stu.getName()+"):");
                double mark = Double.parseDouble(input.inputStr("\\d"));
                stu.setMark(mark);
            }
            transcript.add("Student(id:"+stu.getId()+", name:"+stu.getName()+"): "+stu.getMark());
        }
        notificationManage.writeTranscript(transcript);
        studentManage.writeStudentList(studentList);
    }

    public void menu5(){
        notificationManage.readTranscript();
    }

    public void menu6(){
        notificationManage.readWishes();
    }

    public void menu7(){
        notificationManage.readComplaints();
    }

    public void menu8(String id){
        System.out.print("Enter notifications: ");
        String mess = input.inputStr(".+");

        notificationManage.sendNotificationToStudent(teacherManage.searchTeacher(id), mess);
    }
    public void menu9(){
        notificationManage.readNotification();
    }
    public void menu10(){
        ArrayList<Student> studentList = studentManage.getStudentList();
        System.out.println("rule: 1 is true,0 is false");
        for (Student stu:studentList) {
            System.out.print("Student(id:"+stu.getId()+", name:"+stu.getName()+") is present ?:");
            String isPresent = input.inputStr("[01]");
            if(isPresent.equals("0")){
                notificationManage.writeStudentsLate(stu);
            }
        }
    }

}
