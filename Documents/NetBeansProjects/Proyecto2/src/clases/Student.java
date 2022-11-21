package clases;

public class Student extends Person{
    private String Carnet;
    private String Gender;
    private String Location;
    

    public Student() {
    }

    public Student(String Carnet, String Gender, String Location, String Name) {
        this.Carnet = Carnet;
        this.Gender = Gender;
        this.Location = Location;
        
    }

    /**
     * @return the Carnet
     */
    public String getCarnet() {
        return Carnet;
    }

    /**
     * @param Carnet the Carnet to set
     */
    public void setCarnet(String Carnet) {
        this.Carnet = Carnet;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Location
     */
    public String getLocation() {
        return Location;
    }

    /**
     * @param Location the Location to set
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * @return the Name
     */
    

    @Override
    public String toString() {
        return "Student{" + "Carnet=" + Carnet + ", Gender=" + Gender + ", Location=" + Location + '}';
    }
    
} 

 