public class Main {
    public static void main(String[] args) {
        Student student = new Student(2405, "Josh", "A+");
        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());
        System.out.println(student.getGrade());

        System.out.println(student);
    }
}
