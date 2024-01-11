package Tests;

import org.junit.Test;
import pages.FashionPage;
import pages.RandomPrograns;
import pages.SantanderPage;

public class SantanderTest {

    SantanderPage santanderPage;
    RandomPrograns randomPrograns;
    String url = "https://commerceos.staging.devpayever.com/registration/santander";

    @Test
    public void SantanderTest() throws InterruptedException {
        santanderPage = new SantanderPage();
        randomPrograns = new RandomPrograns();

        //region Step 1
        System.out.println("Step1 - Create account");
        santanderPage.page(url);
        santanderPage.firstName("Bernardo");
        santanderPage.lastName("Borges");
        String randomEmail = randomPrograns.generateRandomEmail();
        santanderPage.email(randomEmail);
        santanderPage.password("F%02ls58");
        santanderPage.confirmPassword("F%02ls58");
        santanderPage.singUp();
        //endregion

        //region Step 2
        System.out.println("Step2 - Create account");
        santanderPage.companyName("TestQA");
        santanderPage.industry();
        String randomPhoneNumber = randomPrograns.generateRandomPhoneNumber();
        santanderPage.phoneNumber(randomPhoneNumber);
        String randomVATNumber = randomPrograns.generateVatNumber();
        santanderPage.VATNumber(randomVATNumber);
        santanderPage.getStart();
        //endregion

        //region Step 3
        System.out.println("Step3 - Create account");
        santanderPage.getStart2();
        //endregion

        //region Step 4
        System.out.println("Step4 - Validation");
        santanderPage.Transactions();
        santanderPage.Checkout();
        santanderPage.Connect();
        santanderPage.PointOfSale();
        santanderPage.Settings();
        santanderPage.CloseSystem();
        //endregion

    }

}