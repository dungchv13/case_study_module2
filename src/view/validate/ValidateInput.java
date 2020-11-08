package view.validate;

import entities.Manager;
import functions.StudentManage;
import functions.TeacherManage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateInput {
    Scanner input = new Scanner(System.in);
    private StudentManage studentManage = new StudentManage();
    private TeacherManage teacherManage = new TeacherManage();
    private Manager manager = Manager.getInstance();

    public String inputIdForSearch(){
        String result = inputStr("\\d{4}");
        if(!studentManage.isContainStudent(result) && !teacherManage.isContainTeacher(result) && !manager.getId().equals(result)){
            System.out.print("This id isn't exist! Re-Enter: ");
            result = inputIdForSearch();
        }
        return result;
    }
    public String inputIdForAdd(){
        String result = inputStr("\\d{4}");
        if(studentManage.isContainStudent(result) || teacherManage.isContainTeacher(result) || manager.getId().equals(result)){
            System.out.print("This id already exist! Re-Enter: ");
            result = inputIdForAdd();
        }
        return result;
    }

    public String inputStr(String regex){
        String result = input.nextLine();
        if(!isValidate(regex,result)){
            System.out.print("Your input not match the format! Re-Enter:");
            result = inputStr(regex);
        }
        return result;
    }


    public boolean isValidate(String regex,String input){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
