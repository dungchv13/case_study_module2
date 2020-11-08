package view.program_for_student;

import functions.StudentManage;
import view.validate.ValidateInput;

public class StudentProgram {




    private static StudentProgram instance;

    private StudentProgram() {
    }

    public static StudentProgram getInstance() {
        if(instance == null){
            instance = new StudentProgram();
        }
        return instance;
    }





    ValidateInput input = new ValidateInput();
    MenuForStudent menu = new MenuForStudent();

    public void program(String id){
        do{
            System.out.println("-------------------StudentMenu-------------------");
            System.out.println("1.Hiển thị thông tin cá nhân.");
            System.out.println("2.Tra cứu điểm.");
            System.out.println("3.Gửi than phiền.");
            System.out.println("4.Gửi mong muốn.");
            System.out.println("5.Xem thông tin các giáo viên và quản lý.");
            System.out.println("6.Xem các thông báo từ giáo viên và quản lý.");

            System.out.println("0.Exit.");
            System.out.print("Chose:");
            int choice = Integer.parseInt(input.inputStr("[0-6]"));
            switch (choice){
                case 1:
                    System.out.println("*************************");
                    menu.menu1(id);
                    System.out.println("*************************");
                    break;
                case 2:
                    System.out.println("*************************");
                    menu.menu2(id);
                    System.out.println("*************************");
                    break;
                case 3:
                    System.out.println("*************************");
                    menu.menu3();
                    System.out.println("*************************");
                    break;
                case 4:
                    System.out.println("*************************");
                    menu.menu4(id);
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
                case 0:
                    System.exit(0);
            }

        }while(true);
    }
}
