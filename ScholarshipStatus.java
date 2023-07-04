public class ScholarshipStatus {
   //States
   
    public int studentID;
    public String nameofStudent;
    public String districtName;
    public String talukName;
    public String institutionName;
    public String courseName;
    public String department;
    public String phoneNumber;
    public String email;
    public String address;
    public int date;
    public String courseYear;
    public long accountNumber;
    public long utrNumber;
	public int pinCode;
   

    // Constructor
	
    public ScholarshipStatus(int studentID, String nameofStudent, String districtName,String talukName,String institutionName,String courseName) {
        this.studentID = studentID;
        this.nameofStudent = nameofStudent;
        this.districtName =districtName;
        this.talukName= talukName;
        this.institutionName = institutionName;
        this.courseName = courseName;
    }
 // Behaviours
 
    public void applicationVerification() {
    }

    public void amountSanctioned() {
    }

    public void getBalance() {
    }

    public void pushtoDBT() {
    }

    public void deactivateAccount() {
    }
	
	public void transfer(){
	}
	
    public void changeAccountNumber() {
    }

    public void updatePhoneNumber() {
    }

    public void updateAadharNumber() {
    }

    public void updateName() {
    }

    public static void main(String[] args) {
       ScholarshipStatus  Status = new ScholarshipStatus (2021082299,"Rajesh B","Belagavi","Belagavi","SGBIT","BE");
		System.out.println(Status);
		System.out.println(Status.studentID);
		System.out.println(Status.nameofStudent);
		System.out.println(Status.districtName);
		System.out.println(Status.talukName);
		System.out.println(Status.institutionName);
		System.out.println(Status.courseName);
    }
}









