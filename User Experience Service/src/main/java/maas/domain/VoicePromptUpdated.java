package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class VoicePromptUpdated extends AbstractEvent {

    private java.util.UUID voicePromptId;
    private java.lang.String message;

    public VoicePromptUpdated(VoicePrompt aggregate) {
        super(aggregate);
    }

    public VoicePromptUpdated() {
        super();
    }
}
