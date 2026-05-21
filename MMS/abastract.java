
abstract class Patient {

    private int patientId;
    private String name;
    private int age;
    private String disease;

    public Patient(int patientId, String name, int age, String disease) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public  int getPatientId(){
        return patientId;
    }
    public String getName()
    {
        return  name;

    }

    public  int getage(){
        return age;
    }
    public String getDisease()
    {
        return  disease;
        
    }
    abstract double calculateBill();

}
