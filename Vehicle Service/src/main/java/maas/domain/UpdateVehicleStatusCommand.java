package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateVehicleStatusCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String vehicleId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String status;
}
