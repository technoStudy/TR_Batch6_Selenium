package Gun08;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElamaninStatusu extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("sali.isDisplayed() = " + sali.isDisplayed()); // Gözükür durumda mı
        System.out.println("sali.isEnabled() = " + sali.isEnabled()); // etkin durumda mı
        System.out.println("sali.isSelected() = " + sali.isSelected()); // çekli ve seçilmiş durumda mı, false

        sali.click(); // salı çeklendi, tiklendi
        System.out.println("sali.isSelected() = " + sali.isSelected()); // true


        WebElement cumartesi=driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        System.out.println("cumartesi.isDisplayed() = " + cumartesi.isDisplayed()); // true
        System.out.println("cumartesi.isEnabled() = " + cumartesi.isEnabled()); //false
        System.out.println("cumartesi.isSelected() = " + cumartesi.isSelected()); //false

        Assert.assertTrue(cumartesi.isDisplayed()==true);

        BekleKapat();
    }


}
