public class InteriorFeature implements Feature {

    public String interiorFeature;

    public InteriorFeature() {
        this.interiorFeature = "Generic";
    }

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
