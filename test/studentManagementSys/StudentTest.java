package studentManagementSys;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student prospectiveStudent;
    private StudentData studentData;
    School school;

    @BeforeEach
    void setUp() {
        prospectiveStudent = new Student();
        studentData = new StudentData();
        school = new School();
    }

    @Test
    void testThatStudentCanApply() {
        prospectiveStudent.setFirstname("Inem");
        prospectiveStudent.setLastname("Udosoro");
        prospectiveStudent.setEmail("I-udosoro@gmail.com");
        Student registeredStudent = prospectiveStudent.apply(studentData);
        assertNotNull(registeredStudent);
        assertEquals("Inem",prospectiveStudent.getFirstname());
        assertEquals("Udosoro",prospectiveStudent.getLastname());
        assertEquals("I-udosoro@gmail.com",prospectiveStudent.getEmail());
    }

    @Test
    void testTheNumberOfRegisteredStudents() {
        //register student
        Student registeredStudent = prospectiveStudent.apply(studentData);
        assertNotNull(registeredStudent);
        //check that the list of student has increased to 1
         int studentSize = school.getTotalNumberOfRegisteredStudents();
         assertEquals(1, studentSize);
    }
    @Test
    void testThatIdCanBeGeneratedForTheAdmittedStudent(){
        prospectiveStudent.setFirstname("Inem");
        prospectiveStudent.setLastname("Udosoro");
        prospectiveStudent.setEmail("I-udosoro@gmail.com");
        Student admittedStudent = prospectiveStudent.apply(studentData);
        assertNotNull(admittedStudent);
       assertTrue(school.generateIdForAdmittedStudent(admittedStudent));
        System.out.println(admittedStudent.getId());
    }
}