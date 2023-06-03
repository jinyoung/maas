package maas.common;

import io.cucumber.spring.CucumberContextConfiguration;
import maas.UserExperienceServiceApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UserExperienceServiceApplication.class })
public class CucumberSpingConfiguration {}
