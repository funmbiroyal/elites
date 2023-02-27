package studentManagementSys;

public class Student {
    private String firstname;
    private String lastname;
    private int id;
  private final School school = new School();
  private AdmissionStatus admissionStatus;
    private String email;
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student apply(StudentData studentData) {
        Student student = new Student();
        student.setFirstname(studentData.getFirstname());
        student.setLastname(studentData.getLastname());
        student.setEmail(studentData.getEmail());
        school.admitStudent(student);

        return student;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
