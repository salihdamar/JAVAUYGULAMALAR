package collect;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> studentsNote=new TreeSet<>(new OrderNoteComparator().reversed());

        studentsNote.add(new Student("Salih", 40));
        studentsNote.add(new Student("Elif", 30));
        studentsNote.add(new Student("Eftelya",56));

        for (Student st:studentsNote){
            System.out.println(st.getName());
        }
        System.out.println("------------------------------");

        TreeSet<Student> studentName=new TreeSet<>(new OrderNameComparator().reversed());

        studentName.add(new Student("Salih", 60));
        studentName.add(new Student("Elif", 30));
        studentName.add(new Student("Eftelya",56));

        for (Student st:studentName){
            System.out.println(st.getName());
        }

    }
}
