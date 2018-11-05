public class VehicleFrame implements Chassis {
    //Step 4

    public String vehichleFrameType;

    public VehicleFrame() {

        this.vehichleFrameType = "Unibody";
    }

    public VehicleFrame(String vehichleFrameType) {
        this.vehichleFrameType = vehichleFrameType;
    }

    @Override
    public Chassis getChassisType() {
        return this;
    }

    @Override
    public void setChassis(String vehicleChassis) {
        this.vehichleFrameType = vehichleFrameType;
    }

    @Override
    public String toString() {
        return "Chassis :" + Chassis.chassis + "\n" +
                "Vehicle Frame   :" + vehichleFrameType;
    }
}
