package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionClickTest extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("http://demoqa.com/buttons");

        WebElement btnClick=driver.findElement(By.xpath("//button[text()='Click Me']"));
        //btnClick.click();

        //1.Yöntem
        Actions aksiyonlar=new Actions(driver);  // web sayfası aksiyonlara açıldı.

        Action aksiyon= aksiyonlar.moveToElement(btnClick).click().build();
        // elementin üzerin click için git orda bekle.aksiyonu HAZIRLA.

        MyFunc.Bekle(2);
        aksiyon.perform(); // aksiyon gerçekleşiyor. işleme al, uygula.

        //kısa hali
        //aksiyonlar.moveToElement(btnClick).click().build().perform();    // çok aksiyon için

        //daha kısa hali
        //new Actions(driver).moveToElement(btnClick).click().build().perform(); //bir tek aksiyon için

        //kıpkısa hali
        //new Actions(driver).click(btnClick).build().perform(); //bir tek aksiyon için

        BekleKapat();
    }

}
