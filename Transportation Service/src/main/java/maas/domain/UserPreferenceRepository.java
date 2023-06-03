package maas.domain;

import maas.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "userPreferences",
    path = "userPreferences"
)
public interface UserPreferenceRepository
    extends PagingAndSortingRepository<UserPreference, java.lang.String> {}
