public class Vehicle{
    Driver driver;
    int minAge;
    String vehicleType;
    int howLong;
    int milesToGo;
    public void drive(){
        if(driver == null){
            System.out.println(vehicleType + " didnt drive, there is no driver");
        }
        else{
            milesToGo -= howLong;
            System.out.println(vehicleType+" drove "+howLong+" miles - "+milesToGo+" miles to go");
        }

    }
    public void setDriver(Driver driver){
        if(driver.age >= minAge){
            this.driver = driver;
            System.out.println("Driver changed to "+driver.name);
        }
        else {
            System.out.println("Driver not changed! "+driver.name+" is "+driver.age+", must be "+minAge+" or older to drive "+vehicleType);
        }
    }

    public Driver getDriver() {
        return driver;
    }

    public int setMinAge(){
        return minAge;
    }
}
