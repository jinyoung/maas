package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class ReservationUpdated extends AbstractEvent {

    private java.util.UUID reservationId;
    private java.lang.String transportationType;
    private java.lang.String pickUpLocation;
    private java.lang.String dropOffLocation;
    private java.util.Date pickUpDateTime;
    private java.util.Date dropOffDateTime;
    private java.lang.String status;

    public ReservationUpdated(Reservation aggregate) {
        super(aggregate);
    }

    public ReservationUpdated() {
        super();
    }
}
