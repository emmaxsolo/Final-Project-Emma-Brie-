package LibraryManagementProject.models;


/**
 *
 * @author bridj,emmas
 */
/**
 * Model class for students
 * @author emmas, bridj
 */
public class Student {
    private int studentID;
    private String studentName;
    private String contactNumber;
    /**
     * Constructor
     * @param studentID
     * @param studentName
     * @param contactNumber 
     */
    public Student(int studentID, String studentName, String contactNumber) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.contactNumber = contactNumber;
    }
 
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

}
