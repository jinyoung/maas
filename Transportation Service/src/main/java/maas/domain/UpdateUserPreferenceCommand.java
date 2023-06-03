package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateUserPreferenceCommand {

    private java.lang.String userId;
    private java.lang.Boolean accessibleTransportation;
    private java.lang.Boolean assistanceRequired;
    private java.lang.String language;
}
