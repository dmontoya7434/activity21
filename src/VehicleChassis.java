public class VehicleChassis implements Chassis {

    String chassisName;

    public VehicleChassis(){
        this.chassisName = Chassis.chassis;
    }
    public VehicleChassis(String chassisName) {
        this.chassisName = chassisName;
    }

    @Override
    public Chassis getChassisType() {
        return this;
    }

    @Override
    public void setChassis(String vehicleChassis) {
        this.chassisName = vehicleChassis;

    }

    @Override
    public String toString() {
        return "Chassis Name    :" + chassisName + "\n";
    }
}
