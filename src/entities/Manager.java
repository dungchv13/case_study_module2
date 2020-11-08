package entities;

public class Manager extends Person {
    private static Manager instance;

    private Manager(String id, String name, String birthDay, String mail, String phone) {
        super(id, name, birthDay, mail, phone);
    }

    public static Manager getInstance(){
        if(instance == null){
            instance = new Manager("9999","Admin","20/12/2014","admin@asd.com","0123569874");
        }
        return instance;
    }
}
