package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class VoicePromptCreated extends AbstractEvent {

    private java.util.UUID voicePromptId;
    private java.util.UUID reservationId;
    private java.lang.String userId;
    private java.lang.String message;
    private java.lang.String language;

    public VoicePromptCreated(VoicePrompt aggregate) {
        super(aggregate);
    }

    public VoicePromptCreated() {
        super();
    }
}
