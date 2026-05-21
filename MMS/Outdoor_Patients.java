class Outdoor_Patients extends Patient {

    private double doctorFee;
    public Outdoor_Patients( int patientId, String name, int age, String disease, double  doctorFee){
    
    super(patientId, name, age, disease);
    this.doctorFee = doctorFee;

    }

    double calculateBill(){
        return doctorFee;
    }

}