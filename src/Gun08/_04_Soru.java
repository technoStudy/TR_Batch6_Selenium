package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_Soru extends BaseDriver {
//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz


    @Test
    public void Test1()
    {
        driver.get("https://www.facebook.com/");

        WebElement createAccount=driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
        createAccount.click();

        MyFunc.Bekle(2);

        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("İsmet");

        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("Temur");

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("İsmet@gmail.com");

        MyFunc.Bekle(2);

        WebElement webDay=driver.findElement(By.id("day"));
        WebElement webMonth=driver.findElement(By.id("month"));
        WebElement webYear=driver.findElement(By.id("year"));

        Select dayMenu=new Select(webDay);
        Select monthMenu=new Select(webMonth);
        Select yearMenu=new Select(webYear);

        dayMenu.selectByValue("23");
        monthMenu.selectByValue("2");
        yearMenu.selectByValue("1974");

        BekleKapat();
    }


}
