package stqa.barancev.addressbook.test;

import org.testng.annotations.Test;
import stqa.barancev.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation() {

        app.getNavigationHelper().goToContactPage();
        app.getGroupHelper().fillTheContactForm(new ContactData("Test", "Testovich", "Testtov", "new address", "33333333", "333333333", "test.testtovtestovich.@mail.mail", "1999"));
        app.getGroupHelper().submitContactCreation();
        app.getGroupHelper().returnToHomePage();
    }


}
