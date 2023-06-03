package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateVoicePromptCommand {

    private java.util.UUID voicePromptId;
    private java.lang.String message;
}
