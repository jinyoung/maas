package maas.domain;

import java.util.*;
import lombok.*;
import maas.domain.*;
import maas.infra.AbstractEvent;

@Data
@ToString
public class UserPreferenceCreated extends AbstractEvent {

    private java.lang.String userId;
    private java.lang.Boolean accessibleTransportation;
    private java.lang.Boolean assistanceRequired;
    private java.lang.String language;

    public UserPreferenceCreated(UserPreference aggregate) {
        super(aggregate);
    }

    public UserPreferenceCreated() {
        super();
    }
}
