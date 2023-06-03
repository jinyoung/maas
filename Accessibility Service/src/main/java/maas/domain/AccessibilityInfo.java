package maas.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import maas.AccessibilityServiceApplication;

@Entity
@Table(name = "AccessibilityInfo_table")
@Data
public class AccessibilityInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.util.UUID accessibilityId;

    private java.lang.String transportationType;

    private java.lang.Boolean isAccessible;

    private java.lang.String assistancesAvailable;

    private java.lang.String language;

    @PrePersist
    public void onPrePersist() {}

    public static AccessibilityInfoRepository repository() {
        AccessibilityInfoRepository accessibilityInfoRepository = AccessibilityServiceApplication.applicationContext.getBean(
            AccessibilityInfoRepository.class
        );
        return accessibilityInfoRepository;
    }
}
