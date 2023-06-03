package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import maas.TransportationServiceApplication;
import maas.domain.UserPreferenceCreated;
import maas.domain.UserPreferenceUpdated;

@Entity
@Table(name = "UserPreference_table")
@Data
public class UserPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.String userId;

    private java.lang.Boolean accessibleTransportation;

    private java.lang.Boolean assistanceRequired;

    private java.lang.String language;

    @PostPersist
    public void onPostPersist() {
        UserPreferenceCreated userPreferenceCreated = new UserPreferenceCreated(
            this
        );
        userPreferenceCreated.publishAfterCommit();

        UserPreferenceUpdated userPreferenceUpdated = new UserPreferenceUpdated(
            this
        );
        userPreferenceUpdated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static UserPreferenceRepository repository() {
        UserPreferenceRepository userPreferenceRepository = TransportationServiceApplication.applicationContext.getBean(
            UserPreferenceRepository.class
        );
        return userPreferenceRepository;
    }
}
