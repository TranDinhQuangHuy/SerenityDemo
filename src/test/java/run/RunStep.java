package run;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import step.StepPerroMart;

@RunWith(SerenityRunner.class)
public class RunStep {

    @Steps
    StepPerroMart step;

    @Test
    public void checkS(){
        step.open();
        step.homepage();
        step.collection();
        step.search();
        step.product();
        step.cart();
    }


}
