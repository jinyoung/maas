package maas.common;

import io.cucumber.spring.CucumberContextConfiguration;
import maas.AccessibilityServiceApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { AccessibilityServiceApplication.class })
public class CucumberSpingConfiguration {}
