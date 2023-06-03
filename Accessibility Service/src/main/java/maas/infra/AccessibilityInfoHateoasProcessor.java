package maas.infra;

import maas.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AccessibilityInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<AccessibilityInfo>> {

    @Override
    public EntityModel<AccessibilityInfo> process(
        EntityModel<AccessibilityInfo> model
    ) {
        return model;
    }
}
