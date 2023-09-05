import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class kullanimSartlari extends BaseDriver {
    @Test
    public void Test1() {
        loginTesti();

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 6000);");
        MyFunc.Bekle(1);

        WebElement kulsart = driver.findElement(By.xpath(" //a[@href='https://techno.study/tr/terms'] "));
        kulsart.click();
        MyFunc.Bekle(2);

        WebElement bize=driver.findElement(By.xpath(" //*[@class='tn-atom'and @field='tn_text_1661174897949']" ));
        if (bize.getText().equals("Bize ulaşın!"));
        System.out.println("bize ulasin sayfasi dogru acilmistir");





    }

}
