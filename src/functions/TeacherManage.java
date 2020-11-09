package functions;

import entities.Teacher;
import fileProcess.BinaryFileProcess;
import fileProcess.TextFileProcess;

import java.util.ArrayList;

public class TeacherManage {
    private final String BINARY_PATH = "File/binaryFile/TeacherBinaryFile";
    private final String TEXT_PATH = "File/textFile/TeacherList";
    private TextFileProcess text = new TextFileProcess();
    private BinaryFileProcess binary = new BinaryFileProcess();

    private ArrayList<Teacher> teacherList;

    public void addTeacher(Teacher teacher){
        teacherList = (ArrayList<Teacher>) binary.readFile(BINARY_PATH);
        if(teacherList == null){
            teacherList = new ArrayList<>();
        }
        teacherList.add(teacher);
        text.writeFile(makeStringList(teacherList),TEXT_PATH);
        binary.writeFile(teacherList,BINARY_PATH);
    }
    public void removeTeacher(String id){
        teacherList = (ArrayList<Teacher>) binary.readFile(BINARY_PATH);
        Teacher t1 = new Teacher();
        for (Teacher teacher:teacherList) {
            if(teacher.getId().equals(id)){
                t1 = teacher;
            }
        }
        teacherList.remove(t1);
        text.writeFile(makeStringList(teacherList),TEXT_PATH);
        binary.writeFile(teacherList,BINARY_PATH);

    }


    public void displayAllTeacher(){
        teacherList = (ArrayList<Teacher>) binary.readFile(BINARY_PATH);
        for (Teacher teacher:teacherList) {
            System.out.println(teacher.toString());
        }
    }

    public Teacher searchTeacher(String id){
        teacherList = (ArrayList<Teacher>) binary.readFile(BINARY_PATH);
        for (Teacher teacher:teacherList) {
            if(teacher.getId().equals(id)){
                return teacher;
            }
        }
        return null;
    }

    public boolean isContainTeacher(String id){
        teacherList = (ArrayList<Teacher>) binary.readFile(BINARY_PATH);
        if(teacherList == null){
            return false;
        }
        for (Teacher teacher:teacherList) {
            if(teacher.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Teacher> getTeacherList() {
        return (ArrayList<Teacher>) binary.readFile(BINARY_PATH);
    }

    private ArrayList<String> makeStringList(ArrayList<Teacher> list){
        ArrayList<String> result = new ArrayList<>();
        for (Teacher teacher:list) {
            result.add(teacher.toString());
        }
        return result;
    }


}
