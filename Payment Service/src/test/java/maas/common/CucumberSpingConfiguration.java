package maas.common;

import io.cucumber.spring.CucumberContextConfiguration;
import maas.PaymentServiceApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PaymentServiceApplication.class })
public class CucumberSpingConfiguration {}
