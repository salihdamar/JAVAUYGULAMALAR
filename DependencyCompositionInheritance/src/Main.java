public class Main {
    public static void main(String[] args) {
        Student st1= new Student("Mustafa","damar","123", "adana", 80);
        Student st2= new Student("Salih","damar","12345", "ankara", 30);
        Student st3= new Student("Melih","yıldız","10101", "ağrı", 100);

        Instructor teacher=new Instructor("Mahmut","damar","Bilgisayar");


        //Course has a Instructor
        Course mat=new Course("Mat101","MAT", teacher);
        System.out.println(mat.getInstructor().getName());

        Student[] stu={st1, st2, st3};

        System.out.println("Ortalama:" + mat.calcAverage(stu));


    }
}
