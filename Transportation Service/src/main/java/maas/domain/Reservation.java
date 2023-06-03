package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import maas.TransportationServiceApplication;
import maas.domain.ReservationCancelled;
import maas.domain.ReservationCompleted;
import maas.domain.ReservationCreated;
import maas.domain.ReservationUpdated;

@Entity
@Table(name = "Reservation_table")
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.util.UUID reservationId;

    private java.lang.String transportationType;

    private java.lang.String pickUpLocation;

    private java.lang.String dropOffLocation;

    private java.util.Date pickUpDateTime;

    private java.util.Date dropOffDateTime;

    private java.lang.String status;

    @PostPersist
    public void onPostPersist() {
        ReservationCreated reservationCreated = new ReservationCreated(this);
        reservationCreated.publishAfterCommit();

        ReservationUpdated reservationUpdated = new ReservationUpdated(this);
        reservationUpdated.publishAfterCommit();

        ReservationCancelled reservationCancelled = new ReservationCancelled(
            this
        );
        reservationCancelled.publishAfterCommit();

        ReservationCompleted reservationCompleted = new ReservationCompleted(
            this
        );
        reservationCompleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ReservationRepository repository() {
        ReservationRepository reservationRepository = TransportationServiceApplication.applicationContext.getBean(
            ReservationRepository.class
        );
        return reservationRepository;
    }
}
