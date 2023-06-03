package maas.infra;

import maas.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class VoicePromptHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<VoicePrompt>> {

    @Override
    public EntityModel<VoicePrompt> process(EntityModel<VoicePrompt> model) {
        return model;
    }
}
