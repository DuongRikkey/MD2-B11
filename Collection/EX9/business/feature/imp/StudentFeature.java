package Collection.EX9.business.feature.imp;

import Collection.EX9.business.entiy.Student;
import Collection.EX9.business.feature.IStudentFeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class StudentFeature implements IStudentFeature {
    public static List<Student> students = new ArrayList<Student>();
    static {
        students.add(new Student(1,"Duong",9.0));
        students.add(new Student(2,"Duong1",5.0));
        students.add(new Student(3,"Duong2",7.0));
        students.add(new Student(4,"Duong3",6.0));
    }



    @Override
    public void addStudent(Student student) {
        students.add(student);

    }

    @Override
    public void remove(int deleteID) {
        students.remove(deleteID);

    }

    @Override
    public Student findStudentById(int id) {
        for(Student student : students) {
            if (student.getStudentId()==id){
                return student;
            }
        }
        return null;
    }

    @Override
    public double getAVGAllStudentScore() {
        double sum = 0;
        for(Student student : students) {
            sum+= student.getAverageScore();
        }
        return sum/students.size();
    }

    @Override
    public void sortByScore() {
        students.sort(Comparator.comparing(Student::getAverageScore));

    }

}
