package stqa.barancev.addressbook.test;

import org.testng.annotations.Test;
import stqa.barancev.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCriation();
        app.getGroupHelper().returnToGroupPage();
    }

}
