public class StudentIterator implements Iterator {
    private StudentCollection collection;
    private int position = 0;
    public StudentIterator(StudentCollection collection) {
        this.collection = collection;
    }
    public boolean hasNext() {
        return position < collection.getSize();
    }
    public Student next() {
        if (hasNext()) {
            Student student = collection.getStudent(position);
            position++;
            return student;
        }

        return null;
    }
}