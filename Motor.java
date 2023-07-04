public class Motor {
    // States
    public String motorNumber;
    public String motorType;
    public double voltage;
    public double current;
    public boolean isMotorRunning;
    public boolean isMotorFunctional;
    public double motorTemperature;
    public double motorSpeed;
    public String manufacturer;
    public String installationDate;

    // Constructor
    public Motor(String motorNumber, String motorType, double voltage, double current, boolean isMotorRunning, String manufacturer) {
        this.motorNumber = motorNumber;
        this.motorType = motorType;
        this.voltage = voltage;
        this.current = current;
        this.isMotorRunning = isMotorRunning;
        this.manufacturer = manufacturer;
    }

    // Behaviors
    public void startMotor() {
       
    }

    public void stopMotor() {
    
    }

    public void checkMotorStatus() {
 
    }

    public void increaseMotorSpeed() {
       
    }

    public void decreaseMotorSpeed() {
       
    }

    public void checkMotorTemperature() {
        
    }

    public void changeMotorType() {
      
    }

    public void updateManufacturer() {
      
    }

    public void updateInstallationDate() {
      
    }

    public static void main(String[] args) {
        Motor motor = new Motor("M123", "Electric", 220.0, 5.0, false, "ABC Motors");
        System.out.println(motor);
        System.out.println(motor.motorNumber);
        System.out.println(motor.motorType);
        System.out.println(motor.voltage);
        System.out.println(motor.current);
        System.out.println(motor.isMotorRunning);
        System.out.println(motor.manufacturer);
    }
}