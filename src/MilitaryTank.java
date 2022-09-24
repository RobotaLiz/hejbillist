public class MilitaryTank extends Vehicle {

 public MilitaryTank(){
     vehicleType = "Tank";
     minAge = 25;
     milesToGo = 2000;
     howLong = 5;
     System.out.println(vehicleType+" created "+milesToGo+" miles to go");
 }
}
