import StepObject.SearchPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends ChromeRunner {
    @Test
    @Description ("Case_1")
    public void Search_field_visible() {
        SearchPageSteps searchPageSteps = new SearchPageSteps();
        searchPageSteps.SearchInput();
        Assert.assertTrue(searchPageSteps.Search.is(Condition.visible));
    }

    @Test
    @Description ("Case_2")
    public void Search_correct_data() {
        SearchPageSteps searchPageSteps = new SearchPageSteps();
        searchPageSteps.SearchInput();
        searchPageSteps.SearchTextinput("კალამი ბურთულიანი");
        Assert.assertTrue(searchPageSteps.SearchText.is(Condition.visible));
    }

    @Test
    @Description ("Case_3")
    public void Search_incorrect_data() {
        SearchPageSteps searchPageSteps = new SearchPageSteps();
        searchPageSteps.SearchInput();
        searchPageSteps.NoSearchTextInput("satesto");
        Assert.assertTrue(searchPageSteps.SearchText.is(Condition.visible));
    }
}

