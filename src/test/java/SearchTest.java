import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class SearchTest {
    @Test
    @DisplayName("search need element")
    public void searchElementTest() {
        SearchPage searchPage = page(SearchPage.class);
        Selenide.open(searchPage.URL);
        searchPage
                .setElement();

        assertTrue("element not found", searchPage.getText());
    }

}
