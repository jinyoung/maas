package maas.infra;

import maas.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserPreferenceHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<UserPreference>> {

    @Override
    public EntityModel<UserPreference> process(
        EntityModel<UserPreference> model
    ) {
        return model;
    }
}
