package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Soru extends BaseDriver {
    //        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.
    //    Assert.assertTrue(urunFiyatToplamlam == itemTotal)

    @Test
    public void Test1() {
        driver.get("https://www.saucedemo.com/");
        MyFunc.Bekle(1);

        WebElement username = driver.findElement(By.xpath("//*[@id='user-name']"));
        username.sendKeys("standard_user");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(2);

        WebElement loginButton = driver.findElement(By.xpath("//*[@id='login-button']"));
        loginButton.click();
        MyFunc.Bekle(2);

        // 1.Ürün sepete eklendi
        WebElement product1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        product1.click();
        MyFunc.Bekle(2);

        WebElement addToCart = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        addToCart.click();
        MyFunc.Bekle(2);

        WebElement btnBack = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        btnBack.click();
        MyFunc.Bekle(2);

        //2.Ürün sepete ekle
        WebElement product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        product2.click();
        MyFunc.Bekle(2);

        //her sayfanın elemanı locator ı aynı olsa bile farklı elemandır ve yeniden bulunmalıdır
        WebElement addToCart2 = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        addToCart2.click();
        MyFunc.Bekle(2);

        WebElement sepet = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();
        MyFunc.Bekle(2);

        WebElement buttonCheckOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        buttonCheckOut.click();
        MyFunc.Bekle(2);

        //Kullanıcı bilgileri giriliyor
        WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("ismet");
        MyFunc.Bekle(2);

        WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("temur");
        MyFunc.Bekle(2);

        WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("323232");
        MyFunc.Bekle(2);

        WebElement btnContinue = driver.findElement(By.xpath("//input[@id='continue']"));
        btnContinue.click();
        MyFunc.Bekle(2);

        // Ürünlerin ücret toplamlarının kontrolü
        List<WebElement> ucretler=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam=0;
        for(WebElement u: ucretler)
        {
            System.out.println(u.getText());
            System.out.println( u.getText().replaceAll("[^0-9,.]","")   ); //replace("$","");

            toplam=toplam + Double.parseDouble( u.getText().replaceAll("[^0-9,.]",""));
        }

         // alt toplamı double olarak bulalım
        WebElement altToplamElement=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        double altToplam= Double.parseDouble( altToplamElement.getText().replaceAll("[^0-9,.]",""));
        System.out.println("altToplam = " + altToplam);


        Assert.assertTrue("Toplamlar Eşit Değil", toplam==altToplam);

        BekleKapat();
    }

}
