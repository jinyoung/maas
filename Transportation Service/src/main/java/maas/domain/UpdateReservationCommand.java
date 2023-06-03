package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateReservationCommand {

    private java.util.UUID reservationId;
    private java.lang.String transportationType;
    private java.lang.String pickUpLocation;
    private java.lang.String dropOffLocation;
    private java.util.Date pickUpDateTime;
    private java.util.Date dropOffDateTime;
    private java.lang.String status;
}
