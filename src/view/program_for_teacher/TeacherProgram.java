package view.program_for_teacher;

import functions.TeacherManage;
import view.validate.ValidateInput;

public class TeacherProgram {


    private static TeacherProgram instance;

    private TeacherProgram() {
    }

    public static TeacherProgram getInstance(){
        if(instance == null){
            instance = new TeacherProgram();
        }
        return instance;
    }






    ValidateInput input = new ValidateInput();
    MenuForTeacher menu = new MenuForTeacher();

    public void program(String id){
        do{
            System.out.println("-------------------TeacherMenu-------------------");
            System.out.println("1.Hiển thị thông tin cá nhân.");
            System.out.println("2.Xem thông tin các học viên.");
            System.out.println("3.Cập nhật điểm cho học viên.");
            System.out.println("4.Cập nhật lại điểm cho một học viên.");
            System.out.println("5.Xem bảng điểm.");
            System.out.println("6.Xem mong muốn của học viên");
            System.out.println("7.Xem than phiền của học viên.");
            System.out.println("8.Gửi thông báo tới học viên.");
            System.out.println("9.Xem các thông báo đã gửi tới học viên.");
            System.out.println("0.Exit.");
            System.out.print("Chose:");
            int choice = Integer.parseInt(input.inputStr("[0-9]"));
            switch (choice){
                case 1:
                    System.out.println("*************************");
                    menu.menu1(id);
                    System.out.println("*************************");
                    break;
                case 2:
                    System.out.println("*************************");
                    menu.menu2();
                    System.out.println("*************************");
                    break;
                case 3:
                    System.out.println("*************************");
                    menu.menu3();
                    System.out.println("*************************");
                    break;
                case 4:
                    System.out.println("*************************");
                    menu.menu4();
                    System.out.println("*************************");
                    break;
                case 5:
                    System.out.println("*************************");
                    menu.menu5();
                    System.out.println("*************************");
                    break;
                case 6:
                    System.out.println("*************************");
                    menu.menu6();
                    System.out.println("*************************");
                    break;
                case 7:
                    System.out.println("*************************");
                    menu.menu7();
                    System.out.println("*************************");
                    break;
                case 8:
                    System.out.println("*************************");
                    menu.menu8();
                    System.out.println("*************************");
                    break;
                case 9:
                    System.out.println("*************************");
                    menu.menu9();
                    System.out.println("*************************");
                case 0:
                    System.exit(0);
            }






        }while(true);
    }
}
