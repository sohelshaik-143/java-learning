class SmartThermostat {
    // 1. The data is private. No one can bypass this variable directly.
    private int temperatureCelsius;

    // Constructor sets a safe default starting point
    public SmartThermostat(int initialTemp) {
        this.temperatureCelsius = initialTemp;
    }

    // 2. THE GETTER: Controls how the outside world "reads" the data.
    // It can also format or log the data before handing it over.
    public int getTemperatureCelsius() {
        System.out.println("Thermostat screen requested current temperature...");
        return this.temperatureCelsius;
    }

    // 3. THE SETTER: Controls how the outside world "writes" or changes the data.
    // This is where your real-world business logic and validation live!
    public void setTemperatureCelsius(int newTemperature) {
        // Enforce real-world rules and safety boundaries
        if (newTemperature < 15) {
            System.out.println("Error: Cannot set below 15°C. System prevents freezing!");
        } else if (newTemperature > 30) {
            System.out.println("Error: Cannot set above 30°C. System prevents overheating!");
        } else {
            // If the data passes the test, it is allowed to change the private variable
            this.temperatureCelsius = newTemperature;
            System.out.println("Success: Temperature updated to " + newTemperature + "°C");
        }
    }
}

// How this works in the application:
public class Main {
    public static void main(String[] args) {
        SmartThermostat livingRoomThermostat = new SmartThermostat(22);

        // Try to read the temperature via the GETTER
        System.out.println("Current Readout: " + livingRoomThermostat.getTemperatureCelsius() + "°C\n");

        // Try to set an unsafe temperature (Too hot!)
        livingRoomThermostat.setTemperatureCelsius(95); 
        
        // Try to set an unsafe temperature (Too cold!)
        livingRoomThermostat.setTemperatureCelsius(5);  

        // Set a perfectly safe temperature
        livingRoomThermostat.setTemperatureCelsius(24); 

        // Verify the successful change
        System.out.println("\nFinal Verified Readout: " + livingRoomThermostat.getTemperatureCelsius() + "°C");
    }
}
here it is not my code but i understood the pattern first of we al analyse the pattern
  1. when we hav ea protecyted data with private keyword we can directly acceess it but w ca access through control methods that are getter and setter
  2. after learning th methods it can be use in encapuslation means wrapping of data and methods in a single unit 
  3.by using ghetter methods we can get the value what we have modify 
  4.by using setter we ca n modify the intial value if we take intialse it for 27 we acn set the data by creating a new object and add modifier like
  if we took a object 
  temperature temp = new temperature();
temp.settemperature(47);
after that we can use get the get the value =
  System.out.println(temp.getvalue());
by this we can modify rhe data when the data is protected with private keyword
  on e top that it can only modify within the class only not outside teh class note it 
  
