package run;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import step.Step1;

@RunWith(SerenityRunner.class)
public class RunStep {

    @Steps
    Step1 step;

    @Test
    public void checkS(){
        step.num1();
        step.num2();
        step.sum();
    }

    @Test
    public void checkD(){
        step.num1();
        step.num2();
        step.diff();
    }

}
