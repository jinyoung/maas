package maas.common;

import io.cucumber.spring.CucumberContextConfiguration;
import maas.TransportationServiceApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { TransportationServiceApplication.class })
public class CucumberSpingConfiguration {}
