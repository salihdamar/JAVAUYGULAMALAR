public class Course {
    Teacher courseTeacher;
    String courseName;
    String courseCode;
    String coursePrefix;
    int writtenExam;
    int oralExam;

    public Course(String courseName, String courseCode, String coursePrefix) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.coursePrefix = coursePrefix;
        this.writtenExam = 0;
        this.oralExam = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.coursePrefix.equals(t.teacherBranch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.teacherName + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.courseName + " dersinin Akademisyeni : " + courseTeacher.teacherName);
        } else {
            System.out.println(this.courseName + " dersine Akademisyen atanmamıştır.");
        }
    }
}
