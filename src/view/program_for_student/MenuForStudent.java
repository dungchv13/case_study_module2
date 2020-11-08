package view.program_for_student;

import entities.Manager;
import functions.NotificationManage;
import functions.StudentManage;
import functions.TeacherManage;
import view.validate.ValidateInput;

public class MenuForStudent {
        ValidateInput input = new ValidateInput();
        StudentManage studentManage = new StudentManage();
        TeacherManage teacherManage = new TeacherManage();
        Manager manager = Manager.getInstance();
        NotificationManage notificationManage = new NotificationManage();

    public void menu1(String id){
        System.out.println(studentManage.searchStudent(id).toString());
    }
    public void menu2(String id){
        double point = studentManage.searchStudent(id).getMark();
        if(point == -1){
            System.out.println("Điểm chưa được cập nhật!");
            return;
        }
        System.out.println("Điểm của bạn là :" + point);
    }
    public void menu3(){
        System.out.print("Enter your complaints:");
        String mess = input.inputStr(".+");
        notificationManage.writeComplaints(mess);
    }
    public void menu4(String id){
        System.out.print("Enter your wishes:");
        String mess = input.inputStr(".+");

        notificationManage.writeWishes(studentManage.searchStudent(id), mess);
    }
    public void menu5(){
        teacherManage.displayAllTeacher();
        System.out.println(manager.toString());
    }
    public void menu6(){
        notificationManage.readStudentNote();
    }
}
