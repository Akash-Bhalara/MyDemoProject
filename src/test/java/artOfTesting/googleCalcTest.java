package artOfTesting;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"},
features = {"D:\\Workspace\\MyDemoProject\\Features\\1.feature"})
public class googleCalcTest {
}
