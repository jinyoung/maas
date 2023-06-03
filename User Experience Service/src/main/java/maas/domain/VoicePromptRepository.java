package maas.domain;

import maas.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "voicePrompts",
    path = "voicePrompts"
)
public interface VoicePromptRepository
    extends PagingAndSortingRepository<VoicePrompt, java.util.UUID> {}
