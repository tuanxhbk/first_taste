import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by TuanNguyen on 7/1/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/")
public class RunFeatures {
}
