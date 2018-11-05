public class ExteriorFeature implements Feature {
    //Step 8

    public String exteriorFeature;

    public ExteriorFeature() {
        this.exteriorFeature = "Generic";
    }

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
