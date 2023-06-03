package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class PaymentUpdated extends AbstractEvent {

    private java.util.UUID paymentId;
    private java.lang.String status;

    public PaymentUpdated(Payment aggregate) {
        super(aggregate);
    }

    public PaymentUpdated() {
        super();
    }
}
