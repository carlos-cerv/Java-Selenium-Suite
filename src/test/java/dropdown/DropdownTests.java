package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        pages.DropdownPage dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropdown(option);
        java.util.List<String> selectedOptions = dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"Option not selected");
    }

}
