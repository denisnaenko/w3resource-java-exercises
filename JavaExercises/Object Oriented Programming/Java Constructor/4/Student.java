public class Student {
    private final int studentId;
    private final String studentName;
    private final String grade;

    public Student() {
        this(0, "Unknown", "None");
    }

    public Student(int studentId, String studentName, String grade) {
        if (studentName == null || grade == null) {
            throw new IllegalArgumentException("Name and grade cannot be null");
        }

        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public int getStudentId() { return studentId; }
    public String getStudentName() { return studentName; }
    public String getGrade() { return grade; }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
