package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class PaymentCreated extends AbstractEvent {

    private java.util.UUID paymentId;
    private java.util.UUID reservationId;
    private java.lang.Double amount;
    private java.lang.String status;

    public PaymentCreated(Payment aggregate) {
        super(aggregate);
    }

    public PaymentCreated() {
        super();
    }
}
