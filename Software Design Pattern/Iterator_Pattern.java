import java.util.ArrayList;
import java.util.List;

// ======================================================
// Student Class
// ======================================================
// This is the object that we want to store in our collection.

class Student {

    private String name;
    private int id;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Display student information
    public void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}


// ======================================================
// Iterator Interface
// ======================================================
// This interface defines the basic operations required
// to move through the collection.

interface StudentIterator {

    // Checks whether another student is available
    boolean hasNext();

    // Returns the next student
    Student next();
}


// ======================================================
// Concrete Iterator
// ======================================================
// This class controls how we move through the students
// one by one.

class StudentListIterator implements StudentIterator {

    private List<Student> students;

    // Keeps track of the current position
    private int position = 0;

    // Constructor
    public StudentListIterator(List<Student> students) {
        this.students = students;
    }

    // Check if another student exists
    @Override
    public boolean hasNext() {
        return position < students.size();
    }

    // Get the next student
    @Override
    public Student next() {

        if (hasNext()) {
            return students.get(position++);
        }

        return null;
    }
}


// ======================================================
// Student Collection
// ======================================================
// This class stores the students.
//
// The Main class does NOT directly access the internal
// ArrayList. Instead, it uses an Iterator.

class StudentCollection {

    private List<Student> students = new ArrayList<>();


    // Add a student to the collection
    public void addStudent(Student student) {
        students.add(student);
    }


    // Create and return an Iterator
    public StudentIterator createIterator() {
        return new StudentListIterator(students);
    }
}


// ======================================================
// Main Class
// ======================================================

public class Main {

    public static void main(String[] args) {

        // Create a student collection
        StudentCollection collection = new StudentCollection();


        // Add students
        collection.addStudent(
                new Student("Rahim", 101)
        );

        collection.addStudent(
                new Student("Karim", 102)
        );

        collection.addStudent(
                new Student("Hasan", 103)
        );

        collection.addStudent(
                new Student("Sakib", 104)
        );


        // Create Iterator
        StudentIterator iterator = collection.createIterator();


        System.out.println("===== STUDENT LIST =====");


        // Traverse the collection one student at a time
        while (iterator.hasNext()) {

            Student student = iterator.next();

            student.showDetails();
        }
    }
}