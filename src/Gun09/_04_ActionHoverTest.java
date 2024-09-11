package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionHoverTest extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://www.hepsiburada.com/");
        Actions aksiyonlar=new Actions(driver); //aksiyonDriver
        MyFunc.Bekle(2);

        WebElement element=driver.findElement(By.xpath("//span[text()='Moda']"));
        Action aksiyon=aksiyonlar.moveToElement(element).build(); // üzerine gittin
        aksiyon.perform(); // üzerinde olduğunu etkinleştir.


        //new Actions(driver).moveToElement(element).build().perform();

        BekleKapat();
    }



}
