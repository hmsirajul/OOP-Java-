public class Main {

    public static void main(String[] args) {
        StudentCollection collection = new StudentCollection(5);
        collection.addStudent(new Student("1101", "Sirajul"));
        collection.addStudent(new Student("1102", "Kabir"));
        collection.addStudent(new Student("1103", "Sakib"));
        collection.addStudent(new Student("1104", "Nadia"));
        collection.addStudent(new Student("1105", "Jannat"));
        Iterator iterator = collection.createIterator();
        System.out.println("Students in the course:");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }
}