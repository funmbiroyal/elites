package studentManagementSys;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class School {
    private static List<Student> studentList = new ArrayList<>();

    public void admitStudent(Student student) {
        studentList.add(student);
    }

    public boolean generateIdForAdmittedStudent(Student admittedStudent){
        SecureRandom secureRandom = new SecureRandom();
        int generatedId = secureRandom.nextInt(1000);
        admittedStudent.setId(generatedId);
        return true;
    }

    public int getTotalNumberOfRegisteredStudents() {

        return studentList.size() ;
    }
    public void updateStudent(StudentData studentDataUpdate){
        Student studentUpdate = new Student();
        if (studentDataUpdate.getId() == 0) studentUpdate.setId(studentDataUpdate.getId());
        else System.out.println("Id already assigned to the student");
    }


}
