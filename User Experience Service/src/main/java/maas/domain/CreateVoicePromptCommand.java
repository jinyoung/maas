package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateVoicePromptCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.util.UUID reservationId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String userId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String message;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private java.lang.String language;
}
