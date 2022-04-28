package uk.co.renbinden.libdnd.proficiency;

import uk.co.renbinden.libdnd.item.tool.vehicle.MountType;
import uk.co.renbinden.libdnd.item.tool.vehicle.VehicleType;
import uk.co.renbinden.libdnd.item.tool.vehicle.WaterborneVehicleType;

public class VehicleProficiency implements Proficiency {

    public enum VehicleProficiencyType {
        LAND,
        WATER
    }

    private final VehicleProficiencyType type;

    public VehicleProficiency(VehicleProficiencyType type) {
        this.type = type;
    }

    public VehicleProficiencyType getType() {
        return type;
    }

    public boolean isApplicableTo(VehicleType vehicleType) {
        return switch (getType()) {
            case LAND -> vehicleType instanceof MountType;
            case WATER -> vehicleType instanceof WaterborneVehicleType;
        };
    }
}
