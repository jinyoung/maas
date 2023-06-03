package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdatePaymentCommand {

    private java.util.UUID paymentId;
    private java.lang.String status;
}
