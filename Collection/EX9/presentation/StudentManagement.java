package Collection.EX9.presentation;

import Collection.EX9.business.entiy.Student;
import Collection.EX9.business.feature.IStudentFeature;
import Collection.EX9.business.feature.imp.StudentFeature;

import java.util.Scanner;

public class StudentManagement {
    IStudentFeature studentFeature = new StudentFeature();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        // show ra menu
        do
        {

            System.out.println("************************************* MUSIC *****************************************************");
            System.out.println(" Viết một class StudentManagement với các phương thức sau:\n");
            System.out.println("1. Phương thức show all hiển thị tất cả student hiển thị tất cả student");
            System.out.println("2. Phương thức void addStudent(Student student) để thêm một sinh viên vào danh sách sinh viên");
            System.out.println("3. Phương thức void removeStudent(int studentId) để xóa sinh viên có mã số sinh viên là studentId khỏi danh sách sinh viên");
            System.out.println("4. Phương thức Student findStudentById(int studentId) để tìm kiếm sinh viên ");
            System.out.println("5. Phương thức getAverageScore tính và trả về điểm trung bình của tất cả student");
            System.out.println("6. Phương thức sortByScore sắp xếp sinh viên theo điểm tăng dần");
            System.out.println("7. Thoát");
            System.out.println("************************************************************");
            System.out.println("Lựa chọn đê: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                {
                    studentManagement.showAllStudent();
                    break;
                }
                case 2:
                {
                    studentManagement.addNewStudent(scanner);
                    break;
                }
                case 3:
                {
                    studentManagement.removeStudent(scanner);
                    break;
                }
                case 4:
                {
                    studentManagement.findStudentById(scanner);
                    break;
                }
                case 5:
                {
                    studentManagement.getAverageScore(scanner);
                    break;
                }
                case 6:
                {
                    studentManagement.sortScore();
                }
                case 7:
                {
                    System.exit(0);
                    break;
                }
//                default:
//                    System.err.println("Vui lòng nhập lại từ 1 -> 4");
            }
        }
        while (true);

    }

    private void sortScore() {
        studentFeature.sortByScore();
        showAllStudent();
    }

    public void getAverageScore(Scanner scanner) {

            System.out.println("Điểm trung bình toàn bộ học sinh");
            System.out.println( studentFeature.getAVGAllStudentScore());


    }

    public void findStudentById(Scanner scanner) {
        System.out.println("Mời bạn nhập ID:");

        try {
            int id = Integer.parseInt(scanner.nextLine());
            Student foundStudent = studentFeature.findStudentById(id);

            if (foundStudent != null) {
                System.out.println("Sinh viên tìm thấy: " + foundStudent);
            } else {
                System.err.println("Không tìm thấy sinh viên với ID: " + id);
            }
        } catch (NumberFormatException e) {
            System.err.println("Vui lòng nhập một số nguyên hợp lệ.");
        }

    }


    public void removeStudent(Scanner scanner) {
        System.out.println("Nhập ID sinh viên cần xóa:");

        try {
            int deleteId = Integer.parseInt(scanner.nextLine());
            boolean found = false;

          for(int i=0;i<StudentFeature.students.size();i++){
              if(StudentFeature.students.get(i).getStudentId()==deleteId){
                  studentFeature.remove(deleteId-1);

                  found = true;
                  System.out.println("Sinh viên có id"+deleteId+"đã xóa");
                  break;
              }
          }

            if (!found) {
                System.err.println("Không tìm thấy sinh viên với ID: " + deleteId);
            }
        } catch (NumberFormatException e) {
            System.err.println("Vui lòng nhập một số nguyên hợp lệ.");
        }
    }

    public void showAllStudent() {
        if(StudentFeature.students.isEmpty()){
            System.err.println("Danh sach trong");
            return;
        }
        for(Student student : StudentFeature.students){
            System.out.println(student);
        }

    }

    public void addNewStudent(Scanner scanner) {
        System.out.println("Nhap so luong muon them");

            int n = Integer.parseInt(scanner.nextLine());

                for (int i = 0; i < n; i++) {
                    Student student = new Student();
                    student.inputData(scanner);
                    studentFeature .addStudent(student);



    }


}}

