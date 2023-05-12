package StepObject;

import PageObject.SearchPage;

public class SearchPageSteps extends SearchPage {

    public SearchPageSteps SearchInput(){
        Search.click();
        return this;
    }
    public SearchPageSteps SearchTextinput(String Text){
        SearchText.setValue("კალამი ბურთულიანი");
        return this;
    }

    public SearchPageSteps NoSearchTextInput (String Texts){
        SearchText.setValue("satesto");
        return this;
    }
}
