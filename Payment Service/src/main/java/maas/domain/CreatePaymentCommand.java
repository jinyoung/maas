package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreatePaymentCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.util.UUID reservationId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.Double amount;
}
