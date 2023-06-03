package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateUserPreferenceCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String userId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.Boolean accessibleTransportation;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.Boolean assistanceRequired;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String language;
}
