import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
    private WebDriver driver;
    private String expectedTitle = "Лига Цифровой Экономики";
    private String actualTitle;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Вебрайвер инициализирован.");
    }

    @Test
    public void test1() {
        driver.manage().window().setSize(new Dimension(600, 600));//задаем размер окна 600х600
        //проверим, что ширина окна равна 600
        int width = driver.manage().window().getSize().width;//записываем ширину в переменную width.
        Assert.assertEquals(600, width);//проверяем, что ожидаемое и реальное значения равны.
        //todo Задание написать аналогичную проверку для высоты окна
        int height = driver.manage().window().getSize().height;
        Assert.assertEquals(600, height);
    }

    @Test
    public void test2() {
        /*
        todo Задание
        1. Перейти на https://digitalleague.ru/
        2. Записать в переменную actualTitle заголовок страницы сайта(использовать метод getTitle).
        3. Написать проверку (Assert) того, что expectedTitle и actualTitle равны.
         */
        driver.navigate().to("https://digitalleague.ru/");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals("Лига Цифровой Экономики", actualTitle);

    }

    @After
    public void teardown() {
        driver.quit();
        System.out.println("Вебдрайвер финализирован.");
    }
}
