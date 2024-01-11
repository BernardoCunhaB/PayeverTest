package Tests;

import org.junit.Test;
import pages.FashionPage;
import pages.RandomPrograns;

public class FashionTest {
    FashionPage fashionPage;
    RandomPrograns randomPrograns;
    String url = "https://commerceos.staging.devpayever.com/registration/fashion";




    @Test
    public void fashionTest() throws InterruptedException {
        fashionPage = new FashionPage();
        randomPrograns = new RandomPrograns();

        //region Step 1
        System.out.println("Step1 - Create account");
        fashionPage.page(url);
        fashionPage.firstName("Bernardo");
        fashionPage.lastName("Borges");
        String randomEmail = randomPrograns.generateRandomEmail();
        fashionPage.email(randomEmail);
        fashionPage.password("F%02ls58");
        fashionPage.confirmPassword("F%02ls58");
        fashionPage.singUp();
        //endregion

        //region Step 2
        System.out.println("Step2 - Create account");
        fashionPage.companyName("TestQA");
        String randomPhoneNumber = randomPrograns.generateRandomPhoneNumber();
        fashionPage.phoneNumber(randomPhoneNumber);
        fashionPage.getStart();
        //endregion

        //region Step 3
        System.out.println("Step3 - Create account");
        fashionPage.getStart2();
        //endregion

        //region Step 4
        System.out.println("Step4 - Validation");
        fashionPage.Transactions();
        fashionPage.Checkout();
        fashionPage.Connect();
        fashionPage.Products();
        fashionPage.Shop();
        fashionPage.Message();
        fashionPage.Settings();
        fashionPage.CloseSystem();
        //endregion

    }
}
