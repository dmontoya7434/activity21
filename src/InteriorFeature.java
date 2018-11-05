
//Create a concrete class named InteriorFeature that implements the interface Feature with the following:
public class InteriorFeature implements Feature {

    // Create a String named interiorFeature as an instance variable
    public String interiorFeature;

    // Default Constructor with no parameter and makes instance variables generic
    public InteriorFeature() {
        this.interiorFeature = "Generic";
    }

    // An overloaded constructor with the following value:
    // A String with a parameter value of interiorFeature
    public InteriorFeature(String interiorFeature) {
        this.interiorFeature = interiorFeature;
    }


    @Override
    public String getFeature() {
        return this.interiorFeature;
    }

    @Override
    public void setFeature(String feature) {

    }

    @Override
    public String toString() {
        return "Interior" + "[" +interiorFeature + "]";
    }
}
