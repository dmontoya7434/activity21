
//Create a concrete class named ExteriorFeature that implements the interface Feature with the following:

public class ExteriorFeature implements Feature {
    //Step 8

    //Create a String named exteriorFeature as an instance variable.
    public String exteriorFeature;

    //A public default constructor without parameters that sets the exteriorFeature instance variable.
    public ExteriorFeature() {
        this.exteriorFeature = "Generic";
    }

    //An overloaded constructor with the following value. A string with
    //a parameter value of exteriorFeature.
    public ExteriorFeature(String exteriorFeature) {
        this.exteriorFeature = exteriorFeature;
    }
    @Override
    public String getFeature() {
        return this.exteriorFeature;
    }

    @Override
    public void setFeature(String feature) {
        this.exteriorFeature = feature;
    }

    @Override
    public String toString() {
        return "Exterior " + "[" + exteriorFeature + "]";
    }
}
