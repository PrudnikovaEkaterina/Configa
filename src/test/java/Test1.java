import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class Test1 extends TestBase{
    @Test
    @DisplayName("Просто тест")
    void test (){
        open(baseUrl);
        $ ("[href='/novostroyki']").click();
        sleep(3000);
    }

}
