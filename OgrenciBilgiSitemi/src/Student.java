public class Student {
    String studentName,studentNo;
    int classes;
    Course math;
    Course physics;
    Course chemical;
    double examAverage;
    double mathAverage, physicsAverage, chemicalAverage;
    boolean isPass;

   Student(String studentName, int classes,  String studentNo, Course math, Course physics, Course chemical) {
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.classes = classes;
        this.math = math;
        this.physics = physics;
        this.chemical = chemical;
        calculateExamAverage();
        this.isPass = false;
   }


   public void addBulkOralExam(int math, int physics, int chemical) {

        if (math >= 0 && math <= 100) {
            this.math.oralExam = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.oralExam = physics;
        }

        if (chemical >= 0 && chemical <= 100) {
            this.chemical.oralExam = chemical;
        }

   }
    public void addBulkWrittenExam(int math, int physics, int chemical) {

        if (math >= 0 && math <= 100) {
            this.math.writtenExam = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.writtenExam = physics;
        }

        if (chemical >= 0 && chemical <= 100) {
            this.chemical.writtenExam = chemical;
        }

    }


    public void isPass() {
        if ((this.math.writtenExam == 0 && this.math.oralExam == 0 ) || (this.physics.writtenExam == 0 && this.physics.oralExam == 0)
                || (this.chemical.writtenExam == 0 && this.chemical.oralExam == 0))
        {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.examAverage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calculateExamAverage() {

        this.mathAverage = this.math.writtenExam *0.8 + this.math.oralExam * 0.2;
        this.physicsAverage = this.physics.writtenExam *0.8 + this.physics.oralExam * 0.2;
        this.chemicalAverage = this.chemical.writtenExam *0.8 + this.chemical.oralExam * 0.2;
        this.examAverage = (mathAverage + physicsAverage + chemicalAverage) / 3;
    }

    public boolean isCheckPass() {
        calculateExamAverage();
        return this.examAverage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.studentName);
        System.out.println("Matematik Notu : " + this.mathAverage);
        System.out.println("Fizik Notu : " + this.physicsAverage);
        System.out.println("Kimya Notu : " + this.chemicalAverage);
    }
}
