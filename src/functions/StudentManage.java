package functions;

import entities.Student;
import fileProcess.BinaryFileProcess;
import fileProcess.TextFileProcess;

import java.util.ArrayList;

public class StudentManage {
    private final String BINARY_PATH = "File/binaryFile/StudentBinaryFile";
    private final String TEXT_PATH = "File/textFile/StudentList";
    private TextFileProcess text = new TextFileProcess();
    private BinaryFileProcess binary = new BinaryFileProcess();

    private ArrayList<Student> studentList;

    public void addStudent(Student stu){
        studentList = (ArrayList<Student>) binary.readFile(BINARY_PATH);
        if(studentList == null){
            studentList = new ArrayList<>();
        }
        studentList.add(stu);
        text.writeFile(makeStringList(studentList),TEXT_PATH);
        binary.writeFile(studentList,BINARY_PATH);
    }

    public void removeStudent(String id){
        studentList = (ArrayList<Student>) binary.readFile(BINARY_PATH);
        Student s1 = new Student();
        for (Student stu:studentList) {
            if(stu.getId().equals(id)){
                s1 = stu;
            }
        }
        studentList.remove(s1);
        text.writeFile(makeStringList(studentList),TEXT_PATH);
        binary.writeFile(studentList,BINARY_PATH);

    }

    public void updateInfoStudent(String oldId,Student newStudentInfo){
        removeStudent(oldId);
        addStudent(newStudentInfo);
    }

    public void displayAllStudent(){
        studentList = (ArrayList<Student>) binary.readFile(BINARY_PATH);
        for (Student stu:studentList) {
            System.out.println(stu.toString());
        }
    }

    public Student searchStudent(String id){
        studentList = (ArrayList<Student>) binary.readFile(BINARY_PATH);
        for (Student stu:studentList) {
            if(stu.getId().equals(id)){
                return stu;
            }
        }
        return null;
    }

    public boolean isContainStudent(String id){
        studentList = (ArrayList<Student>) binary.readFile(BINARY_PATH);
        if(studentList == null){
            return false;
        }
        for (Student stu:studentList) {
            if(stu.getId().equals(id)){
                return true;
            }
        }
        return false;
    }



    private ArrayList<String> makeStringList(ArrayList<Student> list){
        ArrayList<String> result = new ArrayList<>();
        for (Student stu:list) {
            result.add(stu.toString());
        }
        return result;
    }
    public ArrayList<Student> getStudentList() {
        return (ArrayList<Student>) binary.readFile(BINARY_PATH);
    }
    public void writeStudentList(ArrayList<Student> list){
        binary.writeFile(list,BINARY_PATH);
    }

}
