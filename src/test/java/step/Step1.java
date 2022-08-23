package step;

import model.tinh;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class Step1 {
    tinh  tinh = new tinh();


    @Step("Nhập điểm 1")
    public void num1(){
        tinh.setSo1(5);
    }

    @Step("Nhập điểm 2")
    public void num2(){
        tinh.setSo2(4);
    }

    @Step("Tính tổng")
    public void sum(){
        Assert.assertEquals(9, tinh.tinh_tong());
    }

    @Step("Tính hiệu")
    public void diff(){
        Assert.assertEquals(1, tinh.tinh_hieu());
    }

}
