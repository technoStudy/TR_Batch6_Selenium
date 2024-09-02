package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_GetCssValue_Yeni extends BaseDriver {
    public static void main(String[] args) {
        //BaslangicIslemleri(); direk static bölüm çalıştı

        driver.get("https://www.snapdeal.com/");

        WebElement aramaKutusu=driver.findElement(By.id("inputValEnter"));

        //parametrenin değerini veriyor
        System.out.println("aramaKutusu.class = " + aramaKutusu.getAttribute("class"));

        // elementi şekillendiren değerleri veriyor
        System.out.println("aramaKutusu.color = " + aramaKutusu.getCssValue("color"));
        System.out.println("aramaKutusu.background = " + aramaKutusu.getCssValue("background"));
        System.out.println("aramaKutusu.font-size = " + aramaKutusu.getCssValue("font-size"));
        System.out.println("aramaKutusu.border = " + aramaKutusu.getCssValue("border"));
        System.out.println("aramaKutusu.font-family = " + aramaKutusu.getCssValue("font-family"));

        BekleKapat();
    }
}
