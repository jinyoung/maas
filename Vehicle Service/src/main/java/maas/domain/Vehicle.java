package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import maas.VehicleServiceApplication;
import maas.domain.VehicleStatusUpdated;

@Entity
@Table(name = "Vehicle_table")
@Data
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.String vehicleId;

    private java.lang.String type;

    private java.lang.String model;

    private java.lang.String driver;

    private java.lang.String licensePlate;

    @PostPersist
    public void onPostPersist() {
        VehicleStatusUpdated vehicleStatusUpdated = new VehicleStatusUpdated(
            this
        );
        vehicleStatusUpdated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static VehicleRepository repository() {
        VehicleRepository vehicleRepository = VehicleServiceApplication.applicationContext.getBean(
            VehicleRepository.class
        );
        return vehicleRepository;
    }
}
