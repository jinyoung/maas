package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateReservationCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String transportationType;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String pickUpLocation;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String dropOffLocation;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.util.Date pickUpDateTime;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.util.Date dropOffDateTime;
}
