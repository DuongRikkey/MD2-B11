package Collection.EX9.business.feature;

import Collection.EX9.business.entiy.Student;

public interface IStudentFeature {
    void addStudent(Student student);
    void remove(int deleteID);
    Student findStudentById(int id);
    double getAVGAllStudentScore();
    void sortByScore();
}
