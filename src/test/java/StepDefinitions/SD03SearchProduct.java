package StepDefinitions;

import Pages.P03SearchProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.asserts.SoftAssert;

public class SD03SearchProduct {
    P03SearchProduct searchProduct = new P03SearchProduct();

    @Given("Enter Search Keyword")
    public void enterSearchKeyword()
    {
        searchProduct.setSearchKeyword();
        searchProduct.clickSearchBTN();

    }

    @And("Navigated to Search Screen")
    public void navigateToSearchPage() throws InterruptedException {
      String SearchPageURL =  TestBase.driver.getCurrentUrl();
      System.out.println("Search URL is :"+SearchPageURL);
      String SearchResult = TestBase.driver.findElement(P03SearchProduct.searchResultKeyword).getAttribute("value");
      SoftAssert softAssert= new SoftAssert();softAssert.assertTrue(SearchPageURL.contains("https://demo.nopcommerce.com/search?q"),"Succes Assertion for URL");
      softAssert.assertEquals(searchProduct.searchText,SearchResult  );
      System.out.println("Expected is : "+ searchProduct.searchText + "\n" + "And Actual is :" +SearchResult);
      softAssert.assertAll();
    }
}
