package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class VehicleStatusUpdated extends AbstractEvent {

    private java.lang.String vehicleId;
    private java.lang.String status;

    public VehicleStatusUpdated(Vehicle aggregate) {
        super(aggregate);
    }

    public VehicleStatusUpdated() {
        super();
    }
}
