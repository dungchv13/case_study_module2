package view;

import entities.Manager;
import functions.StudentManage;
import functions.TeacherManage;
import view.program_for_manager.ManagerProgram;
import view.program_for_student.StudentProgram;
import view.program_for_teacher.TeacherProgram;
import view.validate.ValidateInput;

public class Main {
    public static void main(String[] args) {
        ValidateInput input = new ValidateInput();
        StudentManage studentManage = new StudentManage();
        TeacherManage teacherManage = new TeacherManage();

        StudentProgram studentProgram = StudentProgram.getInstance();
        TeacherProgram teacherProgram = TeacherProgram.getInstance();
        ManagerProgram managerProgram = ManagerProgram.getInstance();

        System.out.println("____________LOGIN____________");
        System.out.print("Enter your id: ");
        String id = input.inputIdForSearch();

        if(studentManage.isContainStudent(id)){
            studentProgram.program(id);
        }else if(teacherManage.isContainTeacher(id)){
            teacherProgram.program(id);
        }else{
            managerProgram.program();
        }


    }
}
