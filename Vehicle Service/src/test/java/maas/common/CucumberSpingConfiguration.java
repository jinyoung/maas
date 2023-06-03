package maas.common;

import io.cucumber.spring.CucumberContextConfiguration;
import maas.VehicleServiceApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { VehicleServiceApplication.class })
public class CucumberSpingConfiguration {}
