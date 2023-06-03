package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class ReservationCompleted extends AbstractEvent {

    private java.util.UUID reservationId;

    public ReservationCompleted(Reservation aggregate) {
        super(aggregate);
    }

    public ReservationCompleted() {
        super();
    }
}
