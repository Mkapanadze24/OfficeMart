import StepObject.SearchPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends ChromeRunner {
    @Test
    @Step("საძიებო ღილაკზე დაკლიკებით უნდა გამოვიდეს ჩასაწერი ველი - {გამოდის ჩასაწერი ველი}")
    public void Search_field_visible() {
        SearchPageSteps searchPageSteps = new SearchPageSteps();
        searchPageSteps.SearchInput();
        Assert.assertTrue(searchPageSteps.Search.is(Condition.visible));
    }

    @Test
    @Step("საძიებო ველში სწორი მონაცემებით ძებნა მაგ: კალამი ბურთულიანი - {დაბრუნებული მონაცემების სახელებში უნდა იყოს ძებნისას გადაცემული სიტყვა}")
    public void Search_correct_data() {
        SearchPageSteps searchPageSteps = new SearchPageSteps();
        searchPageSteps.SearchInput();
        searchPageSteps.SearchTextinput("კალამი ბურთულიანი");
        Assert.assertTrue(searchPageSteps.SearchText.is(Condition.visible));
    }

    @Test
    @Step("საძიებო ველში არასწორი მონაცემებით ძებნა (მაგ: satesto)- {უნდა გამოიტანოს შედეგი ტექსტით: \"საძიებო სიტყვა 'satesto' ვერაფერი მოიძებნა\"}")
    public void Search_incorrect_data() {
        SearchPageSteps searchPageSteps = new SearchPageSteps();
        searchPageSteps.SearchInput();
        searchPageSteps.NoSearchTextInput("satesto");
        Assert.assertTrue(searchPageSteps.SearchText.is(Condition.visible));
    }
}

