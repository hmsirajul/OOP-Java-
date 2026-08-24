import java.util.ArrayList;

public class StudentCollection {
    private ArrayList<Student> students;
    public StudentCollection() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public Student getStudent(int index) {
        return students.get(index);
    }
    public int getSize() {
        return students.size();
    }
    public Iterator createIterator() {
        return new StudentIterator(this);
    }
}