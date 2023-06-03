package maas.domain;

import maas.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "accessibilityInfos",
    path = "accessibilityInfos"
)
public interface AccessibilityInfoRepository
    extends PagingAndSortingRepository<AccessibilityInfo, java.util.UUID> {}
