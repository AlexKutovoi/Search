import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.page;

public class SearchPage {
    public static final String URL = "https://www.google.com/";

    //search element
    @FindBy(how= How.XPATH, using = "//input[@title='Поиск']")
    private SelenideElement searchWindow;

    // search result
    @FindBy(how= How.XPATH, using = "//div[@id='rso']")
    private SelenideElement resultWindow;

    @Step("enter search element")
    public SearchPage setElement(){
        searchWindow.sendKeys("купить кофемашину bork c804");
        searchWindow.sendKeys(Keys.ENTER);
        return page(SearchPage.class);
    }

    @Step("get search text ")
    public boolean getText() {

        System.out.println(resultWindow.shouldHave(text("mvideo.ru")).getSize());
        return true;
    }
}
