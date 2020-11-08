package view.program_for_manager;

import view.validate.ValidateInput;

public class ManagerProgram {
    private static ManagerProgram instance;
    private ManagerProgram(){

    }
    public static ManagerProgram getInstance(){
        if(instance == null){
            instance = new ManagerProgram();
        }
        return instance;
    }

    ValidateInput input = new ValidateInput();
    MenuForManager menu = new MenuForManager();
    public void program(){
        do{
            System.out.println("-------------------ManagerMenu-------------------");
            System.out.println("01.Nhập thông tin học viên mới.");
            System.out.println("02.Xóa thông tin học viên");
            System.out.println("03.Cập nhật thông tin học viên.");
            System.out.println("04.Nhập thông tin giáo viên mới.");
            System.out.println("05.Xóa thông tin giáo viên.");
            System.out.println("06.Cập nhật thông tin giáo viên");
            System.out.println("07.Tìm kiếm thông tin học viên theo id.");
            System.out.println("08.Tìm kiếm thông tin giáo viên theo id.");
            System.out.println("09.Xem danh sách học viên.");
            System.out.println("10.Xem danh sách giáo viên.");
            System.out.println("11.Xem bảng điểm của học viên.");
            System.out.println("12.Xem danh sách học viên đi muộn.");
            System.out.println("13.Xem mong muốn của học viên.");
            System.out.println("14.Xem phàn nàn của học viên");
            System.out.println("15.Gửi thông báo tới học viên.");
            System.out.println("16.Xem các thông báo đã gửi tới học viên.");
            System.out.println("0.Exit.");
            System.out.print("Chose:");
            int choice = Integer.parseInt(input.inputStr("\\d{1,2}"));                               //chua xong;
            switch (choice){
                case 1:
                    System.out.println("*************************");
                    menu.menu1();
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
                    break;
                case 10:
                    System.out.println("*************************");
                    menu.menu10();
                    System.out.println("*************************");
                    break;
                case 11:
                    System.out.println("*************************");
                    menu.menu11();
                    System.out.println("*************************");
                    break;
                case 12:
                    System.out.println("*************************");
                    menu.menu12();
                    System.out.println("*************************");
                    break;
                case 13:
                    System.out.println("*************************");
                    menu.menu13();
                    System.out.println("*************************");
                    break;
                case 14:
                    System.out.println("*************************");
                    menu.menu14();
                    System.out.println("*************************");
                    break;
                case 15:
                    System.out.println("*************************");
                    menu.menu15();
                    System.out.println("*************************");
                    break;
                case 16:
                    System.out.println("*************************");
                    menu.menu16();
                    System.out.println("*************************");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Chưa có chức năng này1");
            }

        }while(true);
    }
}
