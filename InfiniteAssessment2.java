import java.util.Scanner;

class Person{
    String name;
    String dateOfBirth;
    String gender;
    String mobileNumber;
    String bloodGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }


}

class Donor extends Person {
    String bloodBankName;
    String donorType;
    String donationDate;

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getDonorType() {
        return donorType;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    public void displayDonationDetails(){
        System.out.println("Name : "+ name);
        System.out.println("Date of Birth :"+dateOfBirth);
        System.out.println("Gender :"+gender);
        System.out.println("Mobile Number :"+mobileNumber);
        System.out.println("Blood Group :"+bloodGroup);
        System.out.println("Blood Bank Name :"+bloodBankName);
        System.out.println("Donor Type :"+ donorType);
        System.out.println("Donation Date :"+ donationDate);
    }
}

public class InfiniteAssessment2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Donor donorDetails= new Donor();
        System.out.println("Enter the name :");
        String name="";
        name+=sc.nextLine();
        donorDetails.setName(name);
        System.out.println("Enter Date of Birth :");
        String DOB="";
        DOB+=sc.nextLine();
        donorDetails.setDateOfBirth(DOB);
        System.out.println("Enter Gender :");
        donorDetails.setGender(sc.nextLine());
        System.out.println("Enter Mobile Number :");
        donorDetails.setMobileNumber(sc.nextLine());
        System.out.println("Enter Blood Group :");
        String BGroup="";
        BGroup+=sc.nextLine();
        donorDetails.setBloodGroup(BGroup);
        System.out.println("Enter Blood Bank Name :");
        String BB="";
        BB+=sc.nextLine();
        donorDetails.setBloodBankName(BB);
        String DType="";
        DType+=sc.nextLine();
        donorDetails.setDonorType(DType);
        System.out.println("Enter Donation Date :");
        donorDetails.setDonationDate(sc.nextLine());
        donorDetails.displayDonationDetails();
        sc.close();
    }


}