package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateAccessibilityInfoCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String transportationType;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.Boolean isAccessible;
}
