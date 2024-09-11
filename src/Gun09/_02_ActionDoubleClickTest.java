package Gun09;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionDoubleClickTest extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("http://demoqa.com/buttons");

        WebElement btnDblClick=driver.findElement(By.id("doubleClickBtn"));

        //1.Yöntem
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(btnDblClick).doubleClick().build();
        aksiyon.perform();

        //2.Yöntem
        //new Actions(driver).doubleClick(btnDblClick).build().perform();

        BekleKapat();
    }

}
