package Test;
public class Hospital {
    String Name;
    int BirthYear;
    int Age;
    String Address;
    String PhoneNo;
    String Gender;
    String BloodGroup;
    boolean appoientmentStatus;
    double medicalFee;
    public void Patient(){
        this.Name="Alex";
        this.BirthYear=2002;
        this.Age=22;
        this.Address="Daffodil Smart city";
        this.PhoneNo="01781641350";
        this.Gender="Male";
        this.BloodGroup="O+ve";
        this.appoientmentStatus=true;
        this.medicalFee=2000;

    }
   void display(){
        System.out.println(Name);
        System.out.println(BirthYear);
        System.out.println(Age);
        System.out.println(Address);
        System.out.println(PhoneNo);
        System.out.println(Gender);
        System.out.println(BloodGroup);
        System.out.println(appoientmentStatus);
        System.out.println(medicalFee);
   }
    public static void main(String[] args){
        Hospital p1=new Hospital();
        p1.Patient();
        p1.display();
    }
}