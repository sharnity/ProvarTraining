package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="PageObject_Training"                                
     , summary=""
     , relativeUrl=""
     , connection="AdminConnection"
     )             
public class PageObject_Training {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Account Name*']/following-sibling::input")
	public WebElement accountName;
	@TextType()
	@FindBy(xpath = "//textarea[@name='street']")
	public WebElement street;
	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='MoreShow More']/lightning-icon/lightning-primitive-icon")
	public WebElement showMoreOptions;
	@LinkType()
	@FindBy(linkText = "Opportunities")
	public WebElement opportunitiesMenu;
	@TextType()
	@FindByLabel(label = "SAT")
	public WebElement sAT;
			
}
