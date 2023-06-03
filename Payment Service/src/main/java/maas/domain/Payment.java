package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import maas.PaymentServiceApplication;
import maas.domain.PaymentCreated;
import maas.domain.PaymentUpdated;

@Entity
@Table(name = "Payment_table")
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.util.UUID paymentId;

    private java.util.UUID reservationId;

    private java.lang.Double amount;

    private java.lang.String status;

    @PostPersist
    public void onPostPersist() {
        PaymentCreated paymentCreated = new PaymentCreated(this);
        paymentCreated.publishAfterCommit();

        PaymentUpdated paymentUpdated = new PaymentUpdated(this);
        paymentUpdated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static PaymentRepository repository() {
        PaymentRepository paymentRepository = PaymentServiceApplication.applicationContext.getBean(
            PaymentRepository.class
        );
        return paymentRepository;
    }
}
