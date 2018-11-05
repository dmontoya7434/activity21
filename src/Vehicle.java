import java.util.Date;

public class Vehicle implements Engine, Chassis{
    //Step 9
    private Date vehicleManufacturedDate;
    private String vehicleManufacturer;
    private String vehicleMake;
    private String vehicleModel;
    private Chassis vehicleFrame;
    private String vehicleType;
    private String driveTrain;
    private Engine vehicleEngine;


    public Vehicle() {
        this.vehicleManufacturer = "Generic";
        this.vehicleManufacturedDate = new Date();
        this.vehicleMake = "Generic";
        this.vehicleModel = "Generic";
        this.vehicleType = "Generic";
        this.vehicleFrame = new VehicleFrame();
        this.vehicleEngine = new ManufacturedEngine();
        this.vehicleEngine.setEngineType("Generic");
        this.vehicleEngine.setDriveTrain("Generic");
    }

    public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake, String vehicleModel,
                   Chassis vehicleFrame, String vehicleType, String driveTrain, Engine vehicleEngine) {
        this.vehicleManufacturedDate = vehicleManufacturedDate;
        this.vehicleManufacturer = vehicleManufacturer;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleFrame = vehicleFrame;
        this.vehicleType = vehicleType;
        this.driveTrain = driveTrain;
        this.vehicleEngine = vehicleEngine;
    }

    @Override
    public Chassis getChassisType() {
        return null;
    }

    @Override
    public void setChassis(String vehicleChassis) {
        this.setChassis(vehicleChassis);
    }

    @Override
    public void setEngineCylinders(int engineCylinders) {
        this.setEngineCylinders(0);
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        this.vehicleEngine.setEngineManufacturedDate(date);
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        this.vehicleEngine.setEngineManufacturer(manufacturer);
    }

    @Override
    public void setEngineMake(String engineMake) {
        this.vehicleEngine.setEngineMake(engineMake);
    }

    @Override
    public void setEngineModel(String engineModel) {
        this.vehicleEngine.setEngineModel(engineModel);
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.vehicleEngine.setDriveTrain(driveTrain);
    }

    @Override
    public void setEngineType(String fuel) {

        this.vehicleEngine.setEngineType(fuel);
    }

    @Override
    public String toString() {
        return "Manufacturer Name : " + this.vehicleManufacturer + "\n" +
                        "Manufactured Date : " +
                        this.vehicleManufacturedDate.toString() + "\n" +
                        "Vehicle Make : " + this.vehicleMake + "\n" +
                        "Vehicle Model : " + this.vehicleModel + "\n" +
                        "Vehicle Type : " + this.vehicleType + "\n" +
                        vehicleEngine.toString();
    }
}
