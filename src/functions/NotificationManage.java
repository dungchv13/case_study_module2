package functions;

import entities.Person;
import entities.Student;
import entities.Teacher;
import fileProcess.TextFileProcess;

import java.time.LocalDate;
import java.util.ArrayList;

public class NotificationManage {
    private final String WISHES_PATH = "File/textFile/Notification/Wishes";
    private final String COMPLAINTS_PATH = "File/textFile/Notification/Complaints";
    private final String NOTIFICATION_TO_STUDENT = "File/textFile/Notification/NotificationToStudent";
    private final String STUDENT_LATE_FOR_CLASS = "File/textFile/Notification/NotificationToStudent";
    private final String TRANSCRIPT = "File/textFile/Transcript";

    private TextFileProcess text = new TextFileProcess();


    public void writeTranscript(ArrayList<String> transcript){
        text.writeFile(transcript,TRANSCRIPT);
    }

    public void readTranscript(){
        ArrayList<String> transcript = text.readFile(TRANSCRIPT);

        if(transcript == null){
            System.out.println("Điểm chưa được cập nhật!");
        }
        for (String str: transcript) {
            System.out.println(str);
        }
        System.out.println("Link to file text: "+TRANSCRIPT);
    }


    public void readWishes(){
        ArrayList<String> wishesList = text.readFile(WISHES_PATH);
        if(wishesList == null){
            System.out.println("Học viên và giáo viên không có mong muốn nào!");
            return;
        }
        for (String str: wishesList) {
            System.out.println(str);
        }
        System.out.println("Link to file text: "+WISHES_PATH);
    }

    public void readComplaints(){
        ArrayList<String> complaintsList = text.readFile(COMPLAINTS_PATH);
        if(complaintsList == null){
            System.out.println("Học viên và giáo viên không có phàn nàn gì!");
            return;
        }
        for (String str: complaintsList) {
            System.out.println(str);
        }
        System.out.println("Link to file text: "+COMPLAINTS_PATH);
    }
    public void readLateList(){
        ArrayList<String> lateList = text.readFile(STUDENT_LATE_FOR_CLASS);
        if(lateList == null){
            System.out.println("Không có học sinh đi muộn!");
            return;
        }
        for (String str: lateList) {
            System.out.println(str);
        }
        System.out.println("Link to file text: "+STUDENT_LATE_FOR_CLASS);

    }
    public void readStudentNote(){
        ArrayList<String> notificationList = text.readFile(NOTIFICATION_TO_STUDENT);
        if(notificationList == null){
            System.out.println("Không có thông báo nào cả!");
            return;
        }
        for (String str: notificationList) {
            System.out.println(str);
        }
        System.out.println("Link to file text: "+NOTIFICATION_TO_STUDENT);
    }



    public void addStudentToLateForClassList(Student student,String mins){
        ArrayList<String> lateList = text.readFile(STUDENT_LATE_FOR_CLASS);
        if(lateList == null){
            lateList = new ArrayList<>();
        }
        String str = LocalDate.now() +": Student(id:"+student.getId()+", name:"+student.getName()+"): "+mins;
        lateList.add(str);
        text.writeFile(lateList,STUDENT_LATE_FOR_CLASS);
    }




    public void sendNotificationToStudent(Person person,String message){
        ArrayList<String> notificationList = text.readFile(NOTIFICATION_TO_STUDENT);
        if(notificationList == null){
            notificationList = new ArrayList<>();
        }
        String str;
        if(person instanceof Teacher){
            str = LocalDate.now() +": Teacher(id:"+person.getId()+", name:"+person.getName()+"): "+message;
        }else{
            str = LocalDate.now() +": Manager(id:"+person.getId()+", name:"+person.getName()+"): "+message;
        }


        notificationList.add(str);

        text.writeFile(notificationList,NOTIFICATION_TO_STUDENT);
    }

    public void writeWishes(Person person,String message){
        ArrayList<String> wishesList = text.readFile(WISHES_PATH);
        if(wishesList == null){
            wishesList = new ArrayList<>();
        }
        String str = LocalDate.now() +": (id:"+person.getId()+", name:"+person.getName()+"): "+message;

        wishesList.add(str);

        text.writeFile(wishesList,WISHES_PATH);
    }


    public void writeComplaints(String mess){
        ArrayList<String> complaintsList = text.readFile(COMPLAINTS_PATH);
        if(complaintsList == null){
            complaintsList = new ArrayList<>();
        }

        String str = LocalDate.now()+": "+mess;
        complaintsList.add(str);

        text.writeFile(complaintsList,COMPLAINTS_PATH);
    }


}
