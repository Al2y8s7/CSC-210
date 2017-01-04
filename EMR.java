/**
 * Alvin Nguyen
 * 12/5/2016
 * CSC-210 MWF 9-10 am
 * This class contains declares 7 data fields regarding patient information, a default constructor to update the countOfPatients variable, 
 * a constructor to retrieve the current values for name, date of birth and updates the countOfPatient variable.
 * Getters and setters are created to retrieve and assign values to the 7 data fields.
 */
package studenthealthservices;

public class EMR {
    //Create data fields
    private String name;
    private String dateOfBirth;
    private String reasonForVisit;
    private double bodyTemperature;
    private double heartRate;
    private String diagnosis;
    private String medicine;
   //Create counter variable
    private static int countOfPatients;
   //Create  default constructor for class
    public EMR(){
       countOfPatients++; 
    }
    //Create constructor
    public EMR(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        countOfPatients++;
    }
   //Create constructor for all data fields
    public EMR(String name, String dateOfBirth, String reasonForVisit, double bodyTemperature, double heartRate, String diagnosis, String medicine) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.reasonForVisit = reasonForVisit;
        this.bodyTemperature = bodyTemperature;
        this.heartRate = heartRate;
        this.diagnosis = diagnosis;
        this.medicine = medicine;
        countOfPatients++;
    }   
    //Create getters for data fields
    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getMedicine() {
        return medicine;
    }
    //Create setters for data fields
    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    //Create getter for static variable
    public static int getCountOfPatients() {
        return countOfPatients;
    }
    public static boolean redFlags(double bodyTemperature, double heartRate){
        if((heartRate < 60 || heartRate > 100) || (bodyTemperature < 97.3 || bodyTemperature > 99.1)){
            return true;
        }
        return false;
    }
    //Implement toString method
    @Override
    public String toString() {
        return "EMR{" + "name=" + name + ", dateOfBirth=" + dateOfBirth + ", reasonForVisit=" + reasonForVisit + ", bodyTemperature=" + bodyTemperature + ", heartRate=" + heartRate + ", diagnosis=" + diagnosis + ", medicine=" + medicine + '}';
    }  
}
