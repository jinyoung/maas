package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import maas.UserExperienceServiceApplication;
import maas.domain.VoicePromptCreated;
import maas.domain.VoicePromptUpdated;

@Entity
@Table(name = "VoicePrompt_table")
@Data
public class VoicePrompt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.util.UUID voicePromptId;

    private java.util.UUID reservationId;

    private java.lang.String userId;

    private java.lang.String message;

    private java.lang.String language;

    @PostPersist
    public void onPostPersist() {
        VoicePromptCreated voicePromptCreated = new VoicePromptCreated(this);
        voicePromptCreated.publishAfterCommit();

        VoicePromptUpdated voicePromptUpdated = new VoicePromptUpdated(this);
        voicePromptUpdated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static VoicePromptRepository repository() {
        VoicePromptRepository voicePromptRepository = UserExperienceServiceApplication.applicationContext.getBean(
            VoicePromptRepository.class
        );
        return voicePromptRepository;
    }
}
