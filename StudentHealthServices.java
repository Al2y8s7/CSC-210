/**
 * Alvin Nguyen
 * 12/5/2016
 * CSC-210 MWF 9-10 am
 * This program is designed to simulate a management system for patient records.
 * The following information will be printed for each patient:
 * Name, Date of Birth, Reason for Visit, Body Temperature, Heart Rate, Diagnosis and Prescribed Medicine.
 * 
 */
package studenthealthservices;

public class StudentHealthServices {

    public static void main(String[] args) {
        //Create an instance object of EMR using an array
        EMR[] recordOfPatients = new EMR[5];
        //Print number of patients
        System.out.println("Number of Patients: " + " " + EMR.getCountOfPatients());
        //Declare and initialize variables of array
        recordOfPatients[0] = new EMR("Gideon", "June 6th 1978", "Sharp Stomach Pain", 101, 68, "Cirrhosis", "Liver Transplant");
        recordOfPatients[1] =  new EMR("Weiser","November 27, 1988", "Broken bone" , 99.8, 66, "Fractured Hip", "Morphine");
        recordOfPatients[2] =  new EMR("Adeline", "January 22, 1948", "Memory Loss", 97.5, 59, "Alzheimers", "Donepezil");
        recordOfPatients[3] =  new EMR("Genevieve", "March 11, 1999", "Trouble concentrating", 94.1, 60, "ADHD", "Ritalin");
        recordOfPatients[4] =  new EMR("Elizabeth", "August 2, 1985", "Spinal cord injury", 89.9, 55, "Quadripelgic", "Surgery / Rehabilitation");
        //Print number of patients after array has been initialized
        System.out.println("Number of Patients: " + " " + EMR.getCountOfPatients());
        //Print number of patients
        for(int i = 0; i < recordOfPatients.length - 2; i++){
            System.out.println();
            System.out.printf("%20s%-2s%-2s%-2s\n","**** Patient", " ", (i+1), "****");
            System.out.println();
            System.out.printf("%1s%-16s%-2s%-2s\n", "Name" , " ", ":" , recordOfPatients[i].getName());
            System.out.printf("%1s%-17s%-2s%-2s\n", "DOB"," ", ":" , recordOfPatients[i].getDateOfBirth());
            System.out.printf("%10s%-10s%-2s%-2s\n", "Heart Rate", " ", ":", recordOfPatients[i].getHeartRate());
            System.out.printf("%16s%-4s%-2s%-2s\n", "Reason For Visit", " ", ":", recordOfPatients[i].getReasonForVisit());
            System.out.printf("%8s%-11s%-2s%-2s\n", "Diagnosis"," ", ":", recordOfPatients[i].getDiagnosis());
            System.out.printf("%10s%-1s%-2s%-2s\n","Prescribed Medicine", " ", ":", recordOfPatients[i].getMedicine());           
        }
    }
}
