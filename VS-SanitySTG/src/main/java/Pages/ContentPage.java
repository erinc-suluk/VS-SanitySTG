package Pages;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.pwc.valuestore.Driver;
import com.pwc.valuestore.HelperFunctions;
import com.pwc.valuestore.ReadXLSdata;


public class ContentPage extends HelperFunctions{
	public ContentPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	private WebElement editButton;
	
	@FindBy(xpath="//button[@data-layer='Preview']")
	private WebElement previewButton;
	
	@FindBy(xpath="//div[@class='vs-title-area__card-box-content']")
	private WebElement titleArea;
	
	@FindBy(xpath="//button[@title='Configure']")
	private WebElement configure;
	
	@FindBy(xpath="//coral-icon[@icon='properties']")
	private WebElement pageInfo;
	
	@FindBy(xpath="//button[@title='Open Properties']")
	private WebElement openPro;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Publish Page']")
	private WebElement publishPage;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='View as Published']")
	private WebElement viewPublished;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Save & Close']")
	private WebElement saveClose;
	
	@FindBy(xpath="//h2[@class='vs-title-area__card-box-content-heading page-title ']")
	private WebElement pageTitle;
	
	@FindBy(xpath="//input[@name='./jcr:title']")
	private WebElement titleField;
	
	@FindBy(xpath="(//input[@name='./jcr:title'])[2]")
	private WebElement titleField3;
	
	@FindBy(xpath="//label[normalize-space()='Title *']")
	private WebElement title;
	
	@FindBy(xpath="//label[normalize-space()='Error: Please fill out this field.']")
	private WebElement errorMessage;
	
	@FindBy(xpath="(//label[normalize-space()='Off Time *'])[1]")
	private WebElement offTime;
	
	@FindBy(xpath="//coral-datepicker[@data-cq-msm-lockable='offTime']//input[@role='combobox']")
	private WebElement dateField;
	
	@FindBy(xpath="//coral-datepicker[@data-cq-msm-lockable='offTime']//button[@title='Calendar']")
	private WebElement calendar;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Create']")
	private WebElement createButton;
	
	@FindBy(xpath="//img[@src='/content/dam/valuestore/us/en/thumbnails/Content.png']")
	private WebElement contentPage;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Next']")
	private WebElement nextButton;
	
	@FindBy(xpath="//label[normalize-space()='Primary Category Tag *']")
	private WebElement primaryCat;
	
	@FindBy(xpath="//label[normalize-space()='Primary Topic Tag *']")
	private WebElement primaryTopic;
	
	@FindBy(xpath="//label[normalize-space()='Primary Economic Buyer Tag *']")
	private WebElement primaryEco;
	
	@FindBy(xpath="//label[normalize-space()='Publish Date *']")
	private WebElement publishDate;
	
	@FindBy(xpath="//label[normalize-space()='Display Image for Content Page *']")
	private WebElement contentImage;
	
	@FindBy(xpath="(//button[@title='Open Selection Dialog'])[1]")
	private WebElement primary1;
	
	@FindBy(xpath="(//button[@title='Open Selection Dialog'])[2]")
	private WebElement primary2;
	
	@FindBy(xpath="(//button[@title='Open Selection Dialog'])[4]")
	private WebElement primary3;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./primarySolutionTag']//input[@role='combobox']")
	private WebElement primary1field;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./primaryTopicTag']//input[@role='combobox']")
	private WebElement primary2field;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./primaryEconomicBuyerTag']//input[@role='combobox']")
	private WebElement primary3field;
	
	@FindBy(xpath="//coral-columnview-item-content[@title='Category']")
	private WebElement path1forPrimary1;
	
	@FindBy(xpath="//coral-columnview-item[@title='Firmwide']//coral-columnview-item-thumbnail[@role='presentation']")
	private WebElement path2forPrimary1;
	
	@FindBy(xpath="//coral-columnview-item-content[@title='Topic']")
	private WebElement path1forPrimary2;
	
	@FindBy(xpath="//coral-columnview-item[@title='Deals']//coral-columnview-item-thumbnail[@role='presentation']")
	private WebElement path2forPrimary2;
	
	@FindBy(xpath="//coral-columnview-item-content[@title='Economic buyer']")
	private WebElement path1forPrimary3;
	
	@FindBy(xpath="//coral-columnview-item[@title='Chief Risk']//coral-columnview-item-thumbnail[@role='presentation']")
	private WebElement path2forPrimary3;
	
	@FindBy(xpath="//label[normalize-space()='Please fill out this field.']")
	private static List<WebElement> errorMessage2;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Select']")
	private WebElement selectButton;
	
	@FindBy(xpath="//div[@data-path='/content/valuestore/us/en/firmwide/qa-or-uat/erinc-content-automation-pages/jcr:content/root/container/container_276238855/container/richtext']")
	private WebElement editableText;
	
	@FindBy(xpath="//div[@aria-label='Text to Display']")
	private WebElement textArea;
	
	@FindBy(xpath="//span[@class='vs-content-details__description']")
	private WebElement contentDetails;
	
	@FindBy(xpath="//coral-buttongroup[@class='coral3-ButtonGroup rte-toolbar is-sticky is-active']//button[@title='Styles']")
	private WebElement styles;
	
	@FindBy(xpath="//coral-buttongroup[@class='coral3-ButtonGroup rte-toolbar is-sticky is-active']//button[@title='Bold (Ctrl+B)']")
	private WebElement bold;
	
	@FindBy(xpath="//button[@title='Justify']")
	private WebElement alignment;
	
	@FindBy(xpath="(//span[@class='vs-content-details__description'])[1]")
	private WebElement richText;
	
	@FindBy(xpath="//button[@title='Done']")
	private WebElement done;
	
	@FindBy(xpath="//div[@title='Title']")
	private WebElement editTitle;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement title2;
	
	@FindBy(xpath="//div[@data-path='/content/valuestore/us/en/firmwide/qa-or-uat/erinc-content-automation-pages/jcr:content/root/container/container_276238855/container/accordion']")
	private WebElement editAccordion;
	
	@FindBy(xpath="//coral-tab-label[normalize-space()='Properties']")
	private WebElement proTab;
	
	@FindBy(xpath="//input[@name='./singleExpansion']")
	private WebElement singleCheckbox;
	
	@FindBy(xpath="//coral-select[@data-cmp-accordion-v1-dialog-edit-hook='expandedSelectSingle']//button[@type='button']")
	private WebElement expandedItems;
	
	@FindBy(xpath="//coral-selectlist[@aria-multiselectable='false']//coral-selectlist-item[@value='item_1']")
	private WebElement CEO;
	
	@FindBy(xpath="//coral-selectlist[@aria-multiselectable='false']//coral-selectlist-item[@value='item_2']")
	private WebElement CFO;
	
	@FindBy(xpath="//strong[normalize-space()='The Benefit:']")
	private WebElement CEOtext;
	
	@FindBy(xpath="//strong[normalize-space()='Business:']")
	private WebElement CFOtext;
	
	@FindBy(xpath="//button[@data-cmp-hook-accordion='button']")
	private static List<WebElement> accordionButtons;
	
	@FindBy(xpath="//h2[normalize-space()='Helpful assets']")
	private WebElement helpfulassetTitle;
	
	@FindBy(xpath="//a[normalize-space()='Fortune Trust Hub']")
	private WebElement firstAsset;
	
	@FindBy(xpath="//a[@class='vs-content-details__links share-ext external']")
	private WebElement firstAssetShare;
	
	@FindBy(xpath="//a[normalize-space()='Full Fortune in US Business Survey']")
	private WebElement secondAsset;
	
	@FindBy(xpath="(//a[@class='vs-content-details__links share-ext external'])[2]")
	private WebElement secondAssetShare;
	
	@FindBy(xpath="//div[@class='vs-content-details__side-content-footer']")
	private WebElement dontForget;
	
	@FindBy(xpath="//a[normalize-space()='Open Salesforce']")
	private WebElement openSalesforce;
	
	@FindBy(xpath="//h2[@class='vs-share-external__heading']")
	private WebElement shareTitle;
	
	@FindBy(xpath="//a[@class='vs-share-external__get-link-btn get-link']")
	private WebElement copyLink;
	
	@FindBy(xpath="//a[normalize-space()='Link Copied!']")
	private WebElement copiedLink;
	
	@FindBy(xpath="//a[@class='vs-share-external__email-btn share-email']")
	private WebElement shareEmail;
	
	@FindBy(xpath="//a[@class='vs-share-external__get-link-btn share-dynamic-signal']")
	private WebElement shareSignal;
	
	@FindBy(xpath="//div[@class='vs-did-you-know__wrapper']")
	private WebElement didYouKnow;
	
	@FindBy(xpath="//span[@class='vs-did-you-know__item-heading']")
	private static List<WebElement> dykHeadings;
	
	@FindBy(xpath="//h2[@class='vs-did-you-know__heading']")
	private WebElement dykDescription;
	
	@FindBy(xpath="//h2[@class='vs-did-you-know__heading']") 
	private WebElement dykHeading;
	
	@FindBy(xpath="//a[@href='/us/en/firmwide/qa-or-uat/erinc-content-automation-pages/erinc-content-page.html']")
	private WebElement hyperLink;
	
	@FindBy(xpath="(//h2[@class='vs-content-details__feature-listing-heading'])[1]")
	private WebElement enablersTitle;
	
	@FindBy(xpath="//h3[@class='vs-content-details__feature-listing-item-heading'][normalize-space()='PLATFORMS']")
	private WebElement enablersHeading;
	
	@FindBy(xpath="//a[@data-heading='Enablers']")
	private static List<WebElement> enablersItems;
	
	@FindBy(xpath="(//h2[@class='vs-content-details__client-list-heading'])[1]")
	private WebElement allianceTitle;
	
	@FindBy(xpath="//a[@data-heading='Alliances']")
	private static List<WebElement> allianceItems;
	
	@FindBy(xpath="(//h2[@class='vs-content-details__client-list-heading'])[2]")
	private WebElement clientTitle;
	
	@FindBy(xpath="//a[@data-heading='Client examples']")
	private static List<WebElement> clientItems;
	
	@FindBy(xpath="(//h2[@class='vs-content-details__feature-listing-heading'])[2]")
	private WebElement campaignTitle;
	
	@FindBy(xpath="//a[@data-heading='Campaign materials']")
	private static List<WebElement> campaignItems;
	
	@FindBy(xpath="//div[@title='Market Demand Component']")
	private WebElement marketEdit;
	
	@FindBy(xpath="//span[normalize-space()='Market Demand']")
	private WebElement marketOption;
	
	@FindBy(xpath="//input[@name='./content/item0/./value']")
	private WebElement demandValue;
	
	@FindBy(xpath="//span[normalize-space()='$26M']")
	private WebElement marketValue1;
	
	@FindBy(xpath="//span[normalize-space()='$7.4M']")
	private WebElement marketValue2;
	
	@FindBy(xpath="//a[@data-tag-id='Deals']")
	private WebElement dealsTag;
	
	@FindBy(xpath="//img[contains(@alt, 'logo')]")
	private WebElement logo;
	
	@FindBy(xpath="//figure[@class='vs-card__figure-wrapper']")
	private static List<WebElement> tagPills;
	
	@FindBy(xpath="//h2[normalize-space()='What others are viewing']")
	private WebElement whatOthersTitle;
	
	@FindBy(xpath="(//div[@class='vs-related-items__item-content'])[1]")
	private WebElement firstWhatContent;
	
	@FindBy(xpath="//div[@class='vs-related-items__item-content']")
	private static List<WebElement> whatContents;
	
	@FindBy(xpath="//div[@class='vs-related-items__item-heading']")
	private static List<WebElement> whatTopicLabels;
	
	@FindBy(xpath="//div[@class='vs-related-items__item-icon']")
	private static List<WebElement> whatTopicFavs;
	
	@FindBy(xpath="//div[@class='cmp-experiencefragment cmp-experiencefragment--header']")
	private WebElement header;
	
	@FindBy(xpath="//div[@class='cmp-experiencefragment cmp-experiencefragment--footer']")
	private WebElement footer;
	
	@FindBy(xpath="//input[@name='./jcr:title']")
	private WebElement titleField2;
	
	@FindBy(xpath="//li[@class='navigation vs-header__sub-menu']//span[@class='selected-value']")
	private WebElement terriMenu;
	
	@FindBy(xpath="//li[@class='navigation vs-header__sub-menu']//a[@title='MX_Title']")
	private WebElement mexico;
	
	@FindBy(xpath="//li[@class='navigation vs-header__sub-menu']//a[@title='Global']")
	private WebElement global;
	
	@FindBy(xpath="//li[@class='navigation vs-header__sub-menu']//a[@title='US_Title']")
	private WebElement US;
	
	@FindBy(xpath="//h2[@class='vs-related-items__content-heading']")
	private WebElement mexicoWhatOthers;
	
	@FindBy(xpath="//div[@class='vs-title-area__card-updated-time']")
	private WebElement newLabel;
	
	@FindBy(xpath="//coral-datepicker[@name='./creationDate']//input[@role='combobox']")
	private WebElement publishDateField;
	
	@FindBy(xpath="//div[@class='vs-title-area__card-updated-time']")
	private static List<WebElement> newLabel2;
	
	@FindBy(xpath="//coral-alert-content[normalize-space()='The page has been published']")
	private WebElement publishMessage;
	
	@FindBy(xpath="//div[contains(@title, 'Enablers')]")
	private WebElement editEnablers;
	
	@FindBy(xpath="//input[@value='PLATFORMS']")
	private WebElement enablersValue1;
	
	@FindBy(xpath="//input[@value='Fortune Trust Hub']")
	private WebElement enablersValue2;
	
	@FindBy(xpath="//div[@title='PwC Contacts Component']")
	private WebElement pwcContactEdit;
	
	@FindBy(xpath="//input[@value='Support here']")
	private WebElement supportEdit;
	
	@FindBy(xpath="//input[contains(@name, 'mailtolink')]")
	private WebElement mailtoEdit;
	
	@FindBy(xpath="//a[contains(@class, 'contact')]")
	private WebElement contact;
	
	@FindBy(xpath="//textarea[@name='./jcr:description']")
	private WebElement descriptionField;
	
	
ReadXLSdata read1=new ReadXLSdata();
	
	public void setPageTitle(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
		test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    test.info("Wait for page title's visibility and get the text");
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	   // wait.until(ExpectedConditions.visibilityOf(previewButton));
	   /* js.executeScript("arguments[0].click();", editButton);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", previewButton);
	    //previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(pageTitle));
	    String title=pageTitle.getText();
	    System.out.println(title);
	    test.info("Switch back to default content and click page info button and open properties");
	    Driver.getDriver().switchTo().defaultContent();
	    HelperFunctions.staticWait(2);
	    //test.info("Go to authoring content page");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	   // HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for page info's visibility and clicked on it");*/
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(pageInfo));
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", pageInfo);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", previewButton);
	    Driver.getDriver().switchTo().frame(0);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(pageTitle));
	    String title=pageTitle.getText();
	    System.out.println(title);
	    test.info("Switch back to default content and click page info button and open properties");
	    Driver.getDriver().switchTo().defaultContent();
	    HelperFunctions.staticWait(2);
	    js.executeScript("arguments[0].click();", pageInfo);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    wait2.until(ExpectedConditions.visibilityOf(openPro));
	    test.info("Clicked on open properties");
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(60);
	    //HelperFunctions.staticWait(3);
	    String title2=titleField.getAttribute("value");
	    System.out.println(title2);
	    Assert.assertEquals(title, title2);
	    test.info("Verify the title value matches the page title");
	    HelperFunctions.staticWait(2);
	    test.info("Enter new title value and save and close");
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    titleField.clear();
	    HelperFunctions.staticWait(2);
	    String mockTitle="erinc-content2";
	    titleField.sendKeys(mockTitle);
	    HelperFunctions.staticWait(2);
	    saveClose.click();
	    HelperFunctions.waitForPageToLoad(60);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    //test.info("Wait for page info's visibility");
	   // JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	   // js2.executeScript("arguments[0].click();", pageInfo);
	   // HelperFunctions.staticWait(3);
	   // test.info("Clicked on publish page");
	   // publishPage.click();
	  //  HelperFunctions.staticWait(3);
	    js.executeScript("arguments[0].click();", pageInfo);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", previewButton);
	    HelperFunctions.staticWait(2);
	    Driver.getDriver().switchTo().frame(0);
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 30);
	    wait3.until(ExpectedConditions.visibilityOf(pageTitle));
	   // test.info("Go to content page publisher");
	    //Driver.getDriver().get(read1.getCellData("VALUE", 10));
	   // test.info("Wait for page to load");
	   // HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
	   // test.info("Wait for visibility of the page title");
	   // WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	   // wait2.until(ExpectedConditions.visibilityOf(pageTitle));
	    String title3=pageTitle.getText();
	    System.out.println(title3);
	    Assert.assertEquals(mockTitle,title3);
	    test.info("Verify the title value matches the page title");
	    HelperFunctions.staticWait(2);
	  //  test.info("Go to authoring content page");
	  //  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	  //  test.info("Wait for page to load");
	  //  HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
	    Driver.getDriver().switchTo().defaultContent();
	    //HelperFunctions.staticWait(2);
	    test.info("Wait for page info's visibility and clicked on it");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(pageInfo));
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", pageInfo);
	    wait4.until(ExpectedConditions.visibilityOf(openPro));
	    test.info("Clicked on open properties");
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(60);
	    //HelperFunctions.staticWait(3);
	    test.info("Enter new first title value and save and close");
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    titleField.clear();
	    HelperFunctions.staticWait(2);
	    titleField.sendKeys("erinc-content Automation pages");
	    HelperFunctions.staticWait(2);
	    saveClose.click();
	    HelperFunctions.waitForPageToLoad(60);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for page info's visibility");
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	    js4.executeScript("arguments[0].click();", pageInfo);
	    wait4.until(ExpectedConditions.visibilityOf(publishPage));
	    test.info("Clicked on publish page");
	    publishPage.click();
	    HelperFunctions.staticWait(5);
	}
	
	public void setMandatoryFields(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 4));
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on Content page");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(contentPage));
	    visibleElement.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on Next button");
	    nextButton.click();
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on Title field");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    WebElement visibleElement2 = wait2.until(ExpectedConditions.visibilityOf(titleField));
	    visibleElement2.click();
	    HelperFunctions.staticWait(2);
	    String titleText = title.getText();
	    boolean hasAsterisk = titleText.contains("*");
	    Assert.assertTrue(hasAsterisk, "The 'titleText' field does not have an asterisk.");
	    test.info("Verified The 'titleText' field has an asterisk.");
	    HelperFunctions.staticWait(2);
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    test.info("Cleared on Title field");
	    titleField.clear();
	    HelperFunctions.staticWait(4);
	    test.info("Verified error message is displayed for Title field");
	    Assert.assertTrue(errorMessage.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on Title field");
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    test.info("Send text on Title field");
	    titleField.sendKeys("asfsf");
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to Off Time field");
	    HelperFunctions.scrollToElement(offTime);
	    HelperFunctions.staticWait(2);
	    String offTimeText = offTime.getText();
	    boolean hasAsterisk2 = offTimeText.contains("*");
	    Assert.assertTrue(hasAsterisk2, "The 'Off Time' field does not have an asterisk.");
	    test.info("Verified Off Time field has asterisk");
	    HelperFunctions.staticWait(2);
	    test.info("Click on Off Time field and enter formatted date time");
	    dateField.click();
	    HelperFunctions.staticWait(2);
	    LocalDateTime dateTime = LocalDateTime.now().plusMonths(3);
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm a");
	 String formattedDateTime = dateTime.format(formatter);
	 dateField.sendKeys(formattedDateTime);
	 HelperFunctions.staticWait(2);
	 calendar.click();
	 HelperFunctions.staticWait(2);
	 calendar.click();
	 HelperFunctions.staticWait(2);
	 WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	 boolean isNotClickable = wait4.until(ExpectedConditions.invisibilityOfElementLocated(By.id("createButton")));

	 if (isNotClickable) {
	     System.out.println("The element is not clickable");
	     Assert.assertTrue(true);
	 } else {
	     System.out.println("The element is clickable");
	 }
	   test.info("Verified the create button is not clickable");
	 HelperFunctions.staticWait(2);
	 String primaryCategory = primaryCat.getText();
	 boolean hasAsterisk3 = primaryCategory.contains("*");
	 Assert.assertTrue(hasAsterisk3, "The 'primary category' field does not have an asterisk.");
	 test.info("Verified Primary Category field has asterisk");
	 HelperFunctions.staticWait(2);
     String primarytopic = primaryTopic.getText();
     boolean hasAsterisk4 = primarytopic.contains("*");
	 Assert.assertTrue(hasAsterisk4, "The 'primary topic' field does not have an asterisk.");   
	 test.info("Verified Primary Topic field has asterisk");
	 HelperFunctions.staticWait(2);
	 String primaryEconomic = primaryEco.getText();
     boolean hasAsterisk5 = primaryEconomic.contains("*");
	 Assert.assertTrue(hasAsterisk5, "The 'primary Economic' field does not have an asterisk."); 
	 test.info("Verified Primary Economic field has asterisk");
	 HelperFunctions.staticWait(2);
	 test.info("Scroll to published date field");
	 HelperFunctions.scrollToElement(publishDate);
	 HelperFunctions.staticWait(2);
	 String publishdate = publishDate.getText();
     boolean hasAsterisk6 = publishdate.contains("*");
	 Assert.assertTrue(hasAsterisk6, "The 'publish date' field does not have an asterisk."); 
	 test.info("Verified publish date field has asterisk");
	 HelperFunctions.staticWait(2);
	 String contentimage = contentImage.getText();
     boolean hasAsterisk7 = contentimage.contains("*");
	 Assert.assertTrue(hasAsterisk7, "The 'content image' field does not have an asterisk."); 
	 test.info("Verified content image field has asterisk");
	 HelperFunctions.staticWait(3);
	}
	public void setPrimaryTags(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	    //Driver.getDriver().get(read1.getCellData("VALUE", 4));
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for content page visibility and click on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(contentPage));
	    visibleElement.click();
	    HelperFunctions.staticWait(2);
	    test.info("Click on Next button");
	    nextButton.click();
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    WebElement visibleElement2 = wait2.until(ExpectedConditions.visibilityOf(titleField));
	    visibleElement2.click();
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to Off time element");
	    HelperFunctions.scrollToElement(offTime);
	    HelperFunctions.staticWait(2);
	    test.info("Click on Primary 1 tag and select tags");
        primary1.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 30);
	    wait3.until(ExpectedConditions.visibilityOf(path1forPrimary1));
        path1forPrimary1.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(path2forPrimary1));
        path2forPrimary1.click();
        HelperFunctions.staticWait(2);
        selectButton.click();
        //HelperFunctions.staticWait(2);
        test.info("Click on Primary 2 tag and select tags");
        WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
	    wait5.until(ExpectedConditions.visibilityOf(primary2));
        primary2.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 30);
	    wait6.until(ExpectedConditions.visibilityOf(path1forPrimary2));
        path1forPrimary2.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 30);
	    wait7.until(ExpectedConditions.visibilityOf(path2forPrimary2));
        path2forPrimary2.click();
        HelperFunctions.staticWait(2);
        selectButton.click();
        //HelperFunctions.staticWait(2);
        test.info("Click on Primary 3 tag and select tags");
        WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 30);
	    wait8.until(ExpectedConditions.visibilityOf(primary3));
        primary3.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait9 = new WebDriverWait(Driver.getDriver(), 30);
	    wait9.until(ExpectedConditions.visibilityOf(path1forPrimary3));
        path1forPrimary3.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait10 = new WebDriverWait(Driver.getDriver(), 30);
	    wait10.until(ExpectedConditions.visibilityOf(path2forPrimary3));
        path2forPrimary3.click();
        HelperFunctions.staticWait(2);
        selectButton.click();
        test.info("Check for error message list");
        WebDriverWait wait11 = new WebDriverWait(Driver.getDriver(), 30);
        boolean isListInvisible = wait11.until(ExpectedConditions.invisibilityOfAllElements(errorMessage2));
        assert isListInvisible : "Error message list exists on the page!";
        HelperFunctions.staticWait(2);
        test.info("Cleared primary 1 field and checked error message is displayed");
        primary1field.click();
        HelperFunctions.staticWait(2);
        primary1field.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
        HelperFunctions.staticWait(2);
        test.info("Cleared primary 2 field and checked error message is displayed");
        primary2field.click();
        HelperFunctions.staticWait(2);
        primary2field.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
        HelperFunctions.staticWait(2);
        test.info("Cleared primary 3 field and checked error message is displayed");
        primary3field.click();
        HelperFunctions.staticWait(2);
        primary3field.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
        //HelperFunctions.staticWait(2);
        WebDriverWait wait12 = new WebDriverWait(Driver.getDriver(), 10);
        List<WebElement> displayedElements = wait12.until(ExpectedConditions.visibilityOfAllElements(errorMessage2));
        assert !displayedElements.isEmpty() : "Error message list is not displayed on the page!";
        HelperFunctions.staticWait(2);
	}
	public void setAddingText(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
		//Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(pageInfo));
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", pageInfo);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    previewButton.click();
	    //js.executeScript("arguments[0].click();", previewButton);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    //js.executeScript("arguments[0].click();", editButton);
	    editButton.click();
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    //js.executeScript("arguments[0].click();", previewButton);
	    previewButton.click();
	    //Driver.getDriver().switchTo().frame(0);
	    test.info("Wait for preview icon is displayed and click on it");
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    //wait.until(ExpectedConditions.elementToBeClickable(previewButton));
	    //HelperFunctions.staticWait(3);
	    //previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 30);
	    wait1.until(ExpectedConditions.visibilityOf(richText));
	    test.info("Getting the rich text's font weight");
	    String fontWeight = richText.getCssValue("font-weight");
	    Driver.getDriver().switchTo().defaultContent();
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    test.info("Clicked on edit button to edit the rich text");
	    editButton.click();
	    //js.executeScript("arguments[0].click();", editButton);
	    //editButton.click();
	    try {
	    	Thread.sleep(5000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    editableText.click();
	    //HelperFunctions.staticWait(2);
	    //WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.elementToBeClickable(configure));
	    configure.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Clicked on edit area");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 30);
	    wait3.until(ExpectedConditions.visibilityOf(textArea));
	    textArea.click();
	    HelperFunctions.staticWait(10);
	    test.info("Wait for styles icon is displayed and Verified");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(styles));
	    Assert.assertTrue(styles.isDisplayed());
	    HelperFunctions.staticWait(1);
	    test.info("Verified bold icon was displayed");
	    Assert.assertTrue(bold.isDisplayed());
	    HelperFunctions.staticWait(1);
	    test.info("Verified alignment was displayed");
	    Assert.assertTrue(alignment.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on content details");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.elementToBeClickable(contentDetails));
        contentDetails.click();
        HelperFunctions.staticWait(2);
        test.info("Selected whole content and clicked on bold");
        contentDetails.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        HelperFunctions.staticWait(3);
        bold.click();
        HelperFunctions.staticWait(3);
        done.click();
        HelperFunctions.staticWait(5);
        test.info("Clicked on page info and published the page");
       /* JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(3);*/
        wait2.until(ExpectedConditions.visibilityOf(pageInfo));
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", pageInfo);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", previewButton);
	    Driver.getDriver().switchTo().frame(0);
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 30);
	    wait8.until(ExpectedConditions.visibilityOf(richText));
	    test.info("Getting the rich text's font weight");
	    String fontWeight2 = richText.getCssValue("font-weight");
	    test.info("Verified the rich text's font weight has changed");
	    Assert.assertNotEquals(fontWeight, fontWeight2);
	    Driver.getDriver().switchTo().defaultContent();
	    test.info("Clicked on edit button to edit the rich text");
	    js.executeScript("arguments[0].click();", editButton);
	    //editButton.click();
	    try {
	    	Thread.sleep(5000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    HelperFunctions.staticWait(2);
	    editableText.click();
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait9 = new WebDriverWait(Driver.getDriver(), 30);
	    wait9.until(ExpectedConditions.elementToBeClickable(configure));
	    configure.click();
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait10 = new WebDriverWait(Driver.getDriver(), 30);
	    wait10.until(ExpectedConditions.visibilityOf(textArea));
	    test.info("Clicked on edit area");
	    textArea.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on content details");
	    contentDetails.click();
        HelperFunctions.staticWait(2);
        test.info("Selected whole content and clicked on bold");
        contentDetails.sendKeys(Keys.chord(Keys.CONTROL, "a"));
       // HelperFunctions.staticWait(2);
        WebDriverWait wait11 = new WebDriverWait(Driver.getDriver(), 30);
	    wait11.until(ExpectedConditions.visibilityOf(bold));
        bold.click();
        HelperFunctions.staticWait(3);
        done.click();
        HelperFunctions.staticWait(5);
        test.info("Clicked on page info and published the page");
        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", pageInfo);
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait12 = new WebDriverWait(Driver.getDriver(), 30);
	    wait12.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(5);
	}
	public void setTitleEdit(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
		 //Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    wait.until(ExpectedConditions.visibilityOf(pageInfo));
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", pageInfo);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    //previewButton.click();
	    test.info("Wait for edit button visibility and clicked on it");
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    //wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    //HelperFunctions.staticWait(3);
	    editButton.click();
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to the edit title and clicked on it");
	    HelperFunctions.scrollToElement(editTitle);
	    HelperFunctions.staticWait(3);
	    editTitle.click();
	   // HelperFunctions.staticWait(3);
	    test.info("Clicked on configure button");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.elementToBeClickable(configure));
	    configure.click();
	    //HelperFunctions.staticWait(3);
	    String actualTitle="Who's impacted";
	    String mockTitle="Benefits";
	    test.info("Wait for title field visibility and clicked on it");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 30);
	    wait3.until(ExpectedConditions.visibilityOf(titleField3));
	    titleField3.click();
	    HelperFunctions.staticWait(2);
	    titleField3.clear();
	    HelperFunctions.staticWait(2);
	    test.info("Changed the title and clicked on done button");
	    titleField3.sendKeys(mockTitle);
	    HelperFunctions.staticWait(2);
	    done.click();
        //HelperFunctions.staticWait(5);
       /* test.info("Clicked on page info and published the page");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(publishMessage));*/
	    //HelperFunctions.staticWait(3);
	    wait.until(ExpectedConditions.visibilityOf(pageInfo));
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", pageInfo);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    //WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 30);
	    //wait8.until(ExpectedConditions.elementToBeClickable(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    WebDriverWait wait9 = new WebDriverWait(Driver.getDriver(), 30);
	    wait9.until(ExpectedConditions.visibilityOf(title2));
	    test.info("Verified the title has been changed");
	    Assert.assertTrue(title2.getText().contains(mockTitle));
	    Driver.getDriver().switchTo().defaultContent();
	    try {
	    	Thread.sleep(5000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    test.info("Clicked on the edit button");
	    editButton.click();
	   // HelperFunctions.staticWait(3);
	   // HelperFunctions.scrollToElement(editTitle);
	    test.info("Clicked on the edit title");
	    HelperFunctions.staticWait(3);
	    editTitle.click();
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on configure button");
	    WebDriverWait wait10 = new WebDriverWait(Driver.getDriver(), 30);
	    wait10.until(ExpectedConditions.elementToBeClickable(configure));
	    configure.click();
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on title field and enter the first title");
	    WebDriverWait wait11 = new WebDriverWait(Driver.getDriver(), 30);
	    wait11.until(ExpectedConditions.visibilityOf(titleField3));
	    titleField3.click();
	    HelperFunctions.staticWait(2);
	    titleField3.clear();
	    HelperFunctions.staticWait(2);
	    titleField3.sendKeys(actualTitle);
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on done button");
	    done.click();
        HelperFunctions.staticWait(5);
        test.info("Clicked on page info and published the page");
        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", pageInfo);
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait12 = new WebDriverWait(Driver.getDriver(), 30);
	    wait12.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    //HelperFunctions.staticWait(5);
	    //WebDriverWait wait10 = new WebDriverWait(Driver.getDriver(), 10);
	   // wait10.until(ExpectedConditions.visibilityOf(publishMessage));
	    //HelperFunctions.staticWait(3);
	    WebDriverWait wait13 = new WebDriverWait(Driver.getDriver(), 15);
	    wait13.until(ExpectedConditions.elementToBeClickable(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    WebDriverWait wait14 = new WebDriverWait(Driver.getDriver(), 10);
	    wait14.until(ExpectedConditions.visibilityOf(title2));
	    test.info("Verified the title has been changed");
	    Assert.assertTrue(title2.getText().contains(actualTitle));
	    HelperFunctions.staticWait(3);
	}
	public void setAccordion(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	    //Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	 
	    test.info("Wait for edit button visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    //HelperFunctions.staticWait(3);
	    editButton.click();
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on edit accordion");
	    editAccordion.click();
	    wait.until(ExpectedConditions.elementToBeClickable(configure));
	    test.info("Clicked on configure");
	    configure.click();
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for pro tab visibility and clicked on it");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.elementToBeClickable(proTab));
	    proTab.click();
	    wait2.until(ExpectedConditions.visibilityOf(singleCheckbox));
	    test.info("Check if single checkbox is selected");
	    Assert.assertTrue(singleCheckbox.isSelected());
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on expanded items");
	    expandedItems.click();
	    wait2.until(ExpectedConditions.visibilityOf(CFO));
	    test.info("Clicked on CFO");
	    CFO.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on done button");
	    done.click();
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 30);
	    wait3.until(ExpectedConditions.elementToBeClickable(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(2);
	    test.info("Check if CEO text is not displayed");
	    Assert.assertFalse(CEOtext.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Check if CFO text is displayed");
	    Assert.assertTrue(CFOtext.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Wait for first accordion button is clickable and clicked on it");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.elementToBeClickable(accordionButtons.get(0)));
	    accordionButtons.get(0).click();
	    wait4.until(ExpectedConditions.visibilityOf(CEOtext));
	    test.info("Check if CEO text is displayed");
	    Assert.assertTrue(CEOtext.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Check if CFO text is not displayed");
	    Assert.assertFalse(CFOtext.isDisplayed());
	    test.info("Wait for second accordion button is clickable and clicked on it");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
	    wait5.until(ExpectedConditions.elementToBeClickable(accordionButtons.get(1)));
	    accordionButtons.get(1).click();
	    wait4.until(ExpectedConditions.visibilityOf(CFOtext));
	    test.info("Check if CEO text is not displayed");
	    Assert.assertFalse(CEOtext.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Check if CFO text is displayed");
	    Assert.assertTrue(CFOtext.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	public void setHelpfulAssets(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	  
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.elementToBeClickable(helpfulassetTitle));
	    test.info("Verify that helpfulassetTitle is displayed");
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(helpfulassetTitle.isDisplayed());
	    HelperFunctions.staticWait(2);
	    String href = firstAsset.getAttribute("href");
	    String href2 = secondAsset.getAttribute("href");
	    String href3 = openSalesforce.getAttribute("href");
	    Assert.assertTrue(href != null && !href.isEmpty(), "The href attribute is null or empty");
	    test.info("Verify that href is not null or empty");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(href2 != null && !href2.isEmpty(), "The href2 attribute is null or empty");
	    test.info("Verify that href2 is not null or empty");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(href3 != null && !href3.isEmpty(), "The href3 attribute is null or empty");
	    test.info("Verify that href3 is not null or empty");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on first asset share icon");
	    firstAssetShare.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Wait for share modal page is visible");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(shareTitle));
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(copyLink.isDisplayed());
	    test.info("Verify that copyLink is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(shareEmail.isDisplayed());
	    test.info("Verify that shareEmail is displayed");
	    HelperFunctions.staticWait(2);
	    String href4 = shareSignal.getAttribute("href");
	    Assert.assertTrue(href4 != null && !href4.isEmpty(), "The href4 attribute is null or empty");
	    test.info("Verify that href4 is not null or empty");
	    Assert.assertTrue(shareSignal.isDisplayed());  
	    test.info("Verify that shareSignal is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on copy link button");
	    copyLink.click();
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
	    wait5.until(ExpectedConditions.visibilityOf(copiedLink));
	    Assert.assertTrue(copiedLink.isDisplayed()); 
	    test.info("Verify that copiedLink is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setDidYouKnow(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	    //Driver.getDriver().get(read1.getCellData("VALUE", 2));
	   /* test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for did you know is visible");
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		js.executeScript("window.scrollBy(0,250)", "");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(didYouKnow));
	    Assert.assertTrue(didYouKnow.isDisplayed());
	    HelperFunctions.staticWait(2);
	    for(WebElement each: dykHeadings) {
	    if(each.isDisplayed()) {
	    	Assert.assertTrue(true);
	    }else {
	    	Assert.assertTrue(false);
	    }
	    }
	    test.info("Verify if all did you know headings are displayed");
	    HelperFunctions.staticWait(2);
	   // Assert.assertTrue(dykDescription.isDisplayed());
	   // test.info("Verify if all did you know description is displayed");
	    HelperFunctions.staticWait(2);
	    String href = hyperLink.getAttribute("href");
	    Assert.assertTrue(href != null && !href.isEmpty(), "The href attribute is null or empty");
	    test.info("Verify that href is not null or empty");
	    HelperFunctions.staticWait(2);
	    String currentUrl=Driver.getDriver().getCurrentUrl();
	    test.info("Clicked on hyperlink");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", hyperLink);
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(30);
	    HelperFunctions.staticWait(3);
	    String currentUrl2=Driver.getDriver().getCurrentUrl();
	    Assert.assertNotEquals(currentUrl, currentUrl2);
	   /* WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles2 = Driver.getDriver().getWindowHandles();
	    Assert.assertEquals(windowHandles2.size(), 2, "Expected two windows to be open, but found " + windowHandles2.size());
	    test.info("Verify that hyperlink is open in a new tab");*/
	    test.info("Verified hyperlink opens with different url");
	    HelperFunctions.staticWait(3);
	   
	}
	public void setEnablers(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 2));
	  /*  test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to enablers title");
	    HelperFunctions.scrollToElement(enablersTitle);
	    test.info("Wait for enablers title is visible");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(enablersTitle));
	    Assert.assertTrue(enablersTitle.isDisplayed());
	    test.info("Verify enablers title is displayed");
	    Assert.assertTrue(enablersHeading.isDisplayed());
	    test.info("Verify enablers heading is displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each:enablersItems) {
	    	Assert.assertTrue(each.isDisplayed());
	    	if(each.getAttribute("href")!= null && !each.getAttribute("href").isEmpty()) {
	    		 Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verify enablers items are displayed and href values are not null or empty");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on enabler item");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", enablersItems.get(0));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles2 = Driver.getDriver().getWindowHandles();
	    Assert.assertEquals(windowHandles2.size(), 2, "Expected two windows to be open, but found " + windowHandles2.size());
	    test.info("Verify that link is open in a new tab");
	    HelperFunctions.staticWait(2);
	    
	}
	public void setAlliances(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	    //Driver.getDriver().get(read1.getCellData("VALUE", 2));
	   /* test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(3);
	    //HelperFunctions.scrollToElement(enablersTitle);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("window.scrollBy(0,400)", "");
	    test.info("Wait for alliance title's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(allianceTitle));
	    Assert.assertTrue(allianceTitle.isDisplayed());
	    test.info("Verified alliance title is visible");
	    HelperFunctions.staticWait(2);
	    System.out.println(allianceItems.size());
	    test.info("Wait for alliance item's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOfAllElements(allianceItems));
	    test.info("Getting first item's text");
	    String alliance1 = allianceItems.get(0).getText().trim();
	    System.out.println(alliance1);
	    test.info("Getting first item's href");
	    String alliance1href=allianceItems.get(0).getAttribute("href");
	    System.out.println(alliance1href);
	    test.info("Getting first item's text");
	    String alliance2=allianceItems.get(1).getText().trim();
	    System.out.println(alliance2);
	    test.info("Getting first item's href");
	    String alliance2href=allianceItems.get(1).getAttribute("href");
	    String expectedhref1="https://www.salesforce.com/";
	    String expectedhref2="http://www.sap.com/";
	    String expectedText1="Salesforce";
	    String expectedText2="SAP";
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(alliance1, expectedText1);
	    test.info("Verified first item's text matched with expected text");
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(alliance2, expectedText2);
	    test.info("Verified second item's text matched with expected text");
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(alliance1href, expectedhref1);
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(alliance2href, expectedhref2);
	    HelperFunctions.staticWait(3);
	    
	}
	public void setCreatingPageWithoutMandatoryFields(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	    Driver.getDriver().get(read1.getCellData("VALUE", 4));
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for content page's visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(contentPage));
	    visibleElement.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on next button");
	    nextButton.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for title field's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    WebElement visibleElement2 = wait2.until(ExpectedConditions.visibilityOf(titleField));
	    visibleElement2.click();
	    HelperFunctions.staticWait(2);
	    String titleText = title.getText();
	    boolean hasAsterisk = titleText.contains("*");
	    Assert.assertTrue(hasAsterisk, "The 'titleText' field does not have an asterisk.");
	    test.info("Verified title has asterisk");
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
		 boolean isNotClickable = wait4.until(ExpectedConditions.invisibilityOfElementLocated(By.id("createButton")));

		 if (isNotClickable) {
		     System.out.println("The element is not clickable");
		     Assert.assertTrue(true);
		 } else {
		     System.out.println("The element is clickable");
		 }
		 test.info("Verified create button is not clickable");
		 HelperFunctions.staticWait(3);
	    
	}
	public void setClientExamples(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to enablers title");
	    HelperFunctions.scrollToElement(enablersTitle);
	   // JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	   // js2.executeScript("window.scrollBy(0,400)", "");
	    test.info("Wait for client title's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(clientTitle));
	    Assert.assertTrue(clientTitle.isDisplayed());
	    test.info("Verified the client title is displayed");
	    HelperFunctions.staticWait(2);
	    System.out.println(clientItems.size());
	    test.info("Wait for client items' visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOfAllElements(clientItems));
	    test.info("Getting the first client item's text");
	    String client1 = clientItems.get(0).getText().trim();
	    System.out.println(client1);
	    test.info("Getting the first client item's href value");
	    String client1href=clientItems.get(0).getAttribute("href");
	    System.out.println(client1href);
	    test.info("Getting the second client item's text");
	    String client2=clientItems.get(1).getText().trim();
	    System.out.println(client2);
	    test.info("Getting the second client item's href value");
	    String client2href=clientItems.get(1).getAttribute("href");
	    String expectedhref1="http://www.amazon.com/";
	    String expectedhref2="http://www.pwc.com/";
	    String expectedText1="Amazon";
	    String expectedText2="Conga + PwC";
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(client1, expectedText1);
	    test.info("Verified first client's text matched with expected text");
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(client2, expectedText2);
	    test.info("Verified second client's text matched with expected text");
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(client1href, expectedhref1);
	    test.info("Verified first client's href value matched with expected href value");
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(client2href, expectedhref2);
	    test.info("Verified second client's href value matched with expected href value");
	    HelperFunctions.staticWait(3);
	    
	}
	public void setCampaignMaterials(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to enablers title");
	    HelperFunctions.scrollToElement(enablersTitle);
	    test.info("Wait for visibility of campaign title");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
	    wait5.until(ExpectedConditions.visibilityOf(campaignTitle));
	    Assert.assertTrue(campaignTitle.isDisplayed());
	    test.info("Verify campaign title is visible");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: campaignItems) {
	    if(each.isDisplayed()) {
	    	Assert.assertTrue(true);
	    }else {
	    	Assert.assertTrue(false);
	    }
	    }
	    test.info("Verify campaign items are visible");
	    HelperFunctions.staticWait(2);
	    String href = campaignItems.get(0).getAttribute("href");
	    Assert.assertTrue(href != null && !href.isEmpty(), "The href attribute is null or empty");
	    test.info("Verify campaign item's href value1 is not null or empty");
	    String href2 = campaignItems.get(1).getAttribute("href");
	    Assert.assertTrue(href2 != null && !href2.isEmpty(), "The href2 attribute is null or empty");
	    test.info("Verify campaign item's href value2 is not null or empty");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on campaign item");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", campaignItems.get(0));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles2 = Driver.getDriver().getWindowHandles();
	    Assert.assertEquals(windowHandles2.size(), 2, "Expected two windows to be open, but found " + windowHandles2.size());
	    test.info("Verify campaign item's href value is open in a new tab");
	    HelperFunctions.staticWait(2);
	   
	}
	public void setMarketDemandOrange(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	    //Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	
	    test.info("Wait for edit button's visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    HelperFunctions.staticWait(3);
	    editButton.click();
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to market edit and clicked on it");
	    HelperFunctions.scrollToElement(marketEdit);
	    HelperFunctions.staticWait(3);
	    marketEdit.click();
	    HelperFunctions.staticWait(3);
	    test.info("Wait for configure button's visibility and clicked on it");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.elementToBeClickable(configure));
	    configure.click();
	    HelperFunctions.staticWait(3);
	    test.info("Wait for market option's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(marketOption));
	    test.info("Clicked on demand value and send value");
	    String mockValue="$26M";
	    demandValue.click();
	    HelperFunctions.staticWait(2);
	    demandValue.clear();
	    HelperFunctions.staticWait(2);
	    demandValue.sendKeys(mockValue);
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on done button");
	    done.click();
        HelperFunctions.staticWait(2);
        test.info("Clicked on page info and published the page");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.elementToBeClickable(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(2);
	    test.info("Wait for market value's visibility");
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.visibilityOf(marketValue1));
	    test.info("Getting the css value of market values");
	    String orangeColor="rgba(235, 140, 0, 1)";
	    String color = marketValue1.getCssValue("color");
	    System.out.println("The color of the text is: " + color);
	    Assert.assertEquals(color, orangeColor);
	    HelperFunctions.staticWait(2);
	    String color2 = marketValue2.getCssValue("color");
	    System.out.println("The color of the text is: " + color2);
	    Assert.assertEquals(color2, orangeColor);
	    test.info("Verified the market values' color is orange");
	    HelperFunctions.staticWait(3);
	    
	}
	public void setShareModal(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	  
	    test.info("Wait for asset title to be visible");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    wait.until(ExpectedConditions.visibilityOf(helpfulassetTitle));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(helpfulassetTitle.isDisplayed());
	    test.info("Assert that asset title and share button are visible");
	    HelperFunctions.staticWait(2);
	    test.info("Click on the first asset's share button");
	    firstAssetShare.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Wait for share modal to be visible");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(shareTitle));
	    Assert.assertTrue(copyLink.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(shareEmail.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Assert that copy link and share email options are visible");
	    String href4 = shareSignal.getAttribute("href");
	    Assert.assertTrue(href4 != null && !href4.isEmpty(), "The href4 attribute is null or empty");
	    Assert.assertTrue(shareSignal.isDisplayed()); 
	    test.info("Assert that share signal link is visible and has a non-empty href attribute");
	    HelperFunctions.staticWait(2);
	    test.info("Click on the 'Copy Link' option");
	    copyLink.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Wait for the 'Link copied!' confirmation to be visible");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
	    wait5.until(ExpectedConditions.visibilityOf(copiedLink));
	    Assert.assertTrue(copiedLink.isDisplayed()); 
	    test.info("Assert that the 'Link copied!' confirmation is visible");
	    HelperFunctions.staticWait(2);
	}
	public void setTagPillsExist(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	  
	    test.info("Wait for visibility of logo");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Checked each elements have tag pill as a child element");
	    for (WebElement element :tagPills) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
            boolean hasChildElement = element.findElements(By.xpath("//div[@class='vs-card__favorite-pill-wrapper']"))
                    .size() > 0;
            if (hasChildElement) {
            	Assert.assertTrue(true);
                System.out.println("The element has the child element");
            } else {
            	Assert.assertTrue(false);
                System.out.println("The element does not have the child element");
            }
        }
	    test.info("Verified each elements have tag pill as a child element");
	    HelperFunctions.staticWait(3);
	}
	public void setSharableLinks(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	  
	    test.info("Wait for asset title to be visible");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    wait.until(ExpectedConditions.visibilityOf(helpfulassetTitle));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(helpfulassetTitle.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(firstAssetShare.isDisplayed());
	    test.info("Assert that asset title and share button are visible");
	    test.info("Click on the first asset's share button");
	    firstAssetShare.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Wait for share modal to be visible");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(shareTitle));
	    Assert.assertTrue(copyLink.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(shareEmail.isDisplayed());
	    test.info("Assert that copy link and share email options are visible");
	    HelperFunctions.staticWait(2);
	    String href4 = shareSignal.getAttribute("href");
	    Assert.assertTrue(href4 != null && !href4.isEmpty(), "The href4 attribute is null or empty");
	    Assert.assertTrue(shareSignal.isDisplayed()); 
	    test.info("Assert that share signal link is visible and has a non-empty href attribute");
	    HelperFunctions.staticWait(2);
	    test.info("Click on the 'Copy Link' option");
	    copyLink.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Wait for the 'Link copied!' confirmation to be visible");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
	    wait5.until(ExpectedConditions.visibilityOf(copiedLink));
	    Assert.assertTrue(copiedLink.isDisplayed()); 
	    test.info("Assert that the 'Link copied!' confirmation is visible");
	    HelperFunctions.staticWait(2);
	}
	public void setExpirationDate(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 4));
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on Content page");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(contentPage));
	    visibleElement.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on Next button");
	    nextButton.click();
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of Title field");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(titleField2));
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to Off Time field");
	    HelperFunctions.scrollToElement(offTime);
	    HelperFunctions.staticWait(2);
	    String offTimeText = offTime.getText();
	    boolean hasAsterisk2 = offTimeText.contains("*");
	    Assert.assertTrue(hasAsterisk2, "The 'Off Time' field does not have an asterisk.");
	    test.info("Verified Off Time field has asterisk");
	    HelperFunctions.staticWait(2);
	    test.info("Click on Off Time field and enter formatted date time");
	    dateField.click();
	    HelperFunctions.staticWait(2);
	    LocalDateTime dateTime = LocalDateTime.now().plusMonths(3);
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm a");
	 String formattedDateTime = dateTime.format(formatter);
	 dateField.sendKeys(formattedDateTime);
	 HelperFunctions.staticWait(2);
	 calendar.click();
	 HelperFunctions.staticWait(2);
	 calendar.click();
	 HelperFunctions.staticWait(2);
	 
	}
	public void setShareModals(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	   // HelperFunctions.staticWait(3);
	    //test.info("Verify that helpfulassetTitle is displayed");
	    //Assert.assertTrue(helpfulassetTitle.isDisplayed());
	    //HelperFunctions.staticWait(2);
	    test.info("Clicked on first asset share icon");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(firstAssetShare));
	    Assert.assertTrue(firstAssetShare.isDisplayed());
	    firstAssetShare.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Wait for share modal page is visible");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
	    wait5.until(ExpectedConditions.visibilityOf(shareTitle));
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(copyLink.isDisplayed());
	    test.info("Verify that copyLink is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(shareEmail.isDisplayed());
	    test.info("Verify that shareEmail is displayed");
	    HelperFunctions.staticWait(2);
	    String href4 = shareSignal.getAttribute("href");
	    Assert.assertTrue(href4 != null && !href4.isEmpty(), "The href4 attribute is null or empty");
	    test.info("Verify that href4 is not null or empty");
	    Assert.assertTrue(shareSignal.isDisplayed());  
	    test.info("Verify that shareSignal is displayed");
	    HelperFunctions.staticWait(2);
	}
	
	public void setWhatOthersViewing(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	  
	    test.info("Wait for visibility of first asset share icon");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(firstAssetShare));
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to what others viewing title");
	    HelperFunctions.scrollToElement(whatOthersTitle);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(whatOthersTitle.isDisplayed());
	    test.info("Verify that whatOthersTitle is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Checking all content title's border bottom are changing when move the cursor");
	    for (WebElement whatContent : whatContents) {
	        String originalBorderBottom = whatContent.getCssValue("border-bottom");
	        System.out.println(originalBorderBottom);
	        
	        Actions actions = new Actions(Driver.getDriver());
	        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	        js2.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", whatContent);
	        
	        actions.moveToElement(whatContent).build().perform();
	        String borderBottom = whatContent.getCssValue("border-bottom");
	        System.out.println("borderBottom: " + borderBottom);
	        
	        Assert.assertNotEquals(originalBorderBottom, borderBottom);
	        HelperFunctions.staticWait(2);
	        test.info("Verified all content title's border bottom are changing when move the cursor");
	    }
	    HelperFunctions.staticWait(2);
	}
	public void setWhatOthersViewingElements(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for visibility of first asset share icon");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(firstAssetShare));
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to what others viewing title");
	    HelperFunctions.scrollToElement(whatOthersTitle);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(whatOthersTitle.isDisplayed());
	    test.info("Verify that whatOthersTitle is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Checking all content title are displayed");
	    for (WebElement whatContent : whatContents) {
	        if(whatContent.isDisplayed()) {
	        	Assert.assertTrue(true);
	        }else {
	        	Assert.assertTrue(false);
	        }
	    }
	    test.info("Verified all content title are displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Checking all content label are displayed");
	    for (WebElement whatTopic : whatTopicLabels) {
	        if(whatTopic.isDisplayed()) {
	        	Assert.assertTrue(true);
	        }else {
	        	Assert.assertTrue(false);
	        }
	    }
	    test.info("Verified all content label are displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Checking all content fav icon are displayed");
	    for (WebElement whatTopicFav : whatTopicFavs) {
	        if(whatTopicFav.isDisplayed()) {
	        	Assert.assertTrue(true);
	        }else {
	        	Assert.assertTrue(false);
	        }
	    }
	    test.info("Verified all content fav icon are displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setHeaderFooter(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for visibility of header");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(header));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(header.isDisplayed());
	    test.info("Verified the header is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to footer");
	    HelperFunctions.scrollToElement(footer);
	    test.info("Wait for visibility of footer");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
	    wait5.until(ExpectedConditions.visibilityOf(footer));
	    Assert.assertTrue(footer.isDisplayed());
	    test.info("Verified the footer is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Go to the homepage");
	    Driver.getDriver().get(read1.getCellData("VALUE", 11));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of header");
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 30);
	    wait6.until(ExpectedConditions.visibilityOf(header));
	    Assert.assertTrue(header.isDisplayed());
	    test.info("Verified the header is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to footer");
	    HelperFunctions.scrollToElement(footer);
	    test.info("Wait for visibility of footer");
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 30);
	    wait7.until(ExpectedConditions.visibilityOf(footer));
	    Assert.assertTrue(footer.isDisplayed());
	    test.info("Verified the footer is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Go to the topic landing page");
	    Driver.getDriver().get(read1.getCellData("VALUE", 12));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of header");
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 30);
	    wait8.until(ExpectedConditions.visibilityOf(header));
	    Assert.assertTrue(header.isDisplayed());
	    test.info("Verified the header is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to footer");
	    HelperFunctions.scrollToElement(footer);
	    test.info("Wait for visibility of footer");
	    WebDriverWait wait9 = new WebDriverWait(Driver.getDriver(), 30);
	    wait9.until(ExpectedConditions.visibilityOf(footer));
	    Assert.assertTrue(footer.isDisplayed());
	    test.info("Verified the footer is displayed");
	    HelperFunctions.staticWait(3);
	    
	    
	}
	public void setWhatOthersViewingOtherTerritorities(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	
	    test.info("Wait for page to load");
	   // HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for visibility of header");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 20);
	    wait4.until(ExpectedConditions.visibilityOf(header));
	    HelperFunctions.staticWait(3);
	    HelperFunctions.scrollToElement(mexicoWhatOthers);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(!mexicoWhatOthers.getText().contains("What"));
	    HelperFunctions.staticWait(3);
	 
	}
	public void setNewLabel(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
		 //Driver.getDriver().get(read1.getCellData("VALUE", 2));
        test.info("Wait for page to load");
	   /* HelperFunctions.waitForPageToLoad(15);
	  
	    test.info("Wait for visibility of new label");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(newLabel));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(newLabel.isDisplayed());
	    test.info("Verified new label is displayed");
	    HelperFunctions.staticWait(2);
	    Driver.getDriver().get(read1.getCellData("VALUE", 16));*/
	    test.info("Go to authoring page and click page info button and open properties");
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 30);
	    wait1.until(ExpectedConditions.visibilityOf(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    
	    wait1.until(ExpectedConditions.visibilityOf(newLabel));
	    Assert.assertTrue(newLabel.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Driver.getDriver().switchTo().defaultContent();
	    editButton.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Wait for visibility of page info and clicked on it");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(pageInfo));
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    wait2.until(ExpectedConditions.visibilityOf(openPro));
	    test.info("Clicked on open properties");
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(60);
	    HelperFunctions.staticWait(3);
	    test.info("Scrolled to publish date and cleared it");
	    HelperFunctions.scrollToElement(publishDateField);
	    HelperFunctions.staticWait(2);
	    publishDateField.click();
	    HelperFunctions.staticWait(2);
	    publishDateField.clear();
	    test.info("Scrolled to publish date and cleared it");
	    HelperFunctions.staticWait(2);
	    LocalDate threeMonthsAgo = LocalDate.now().minusMonths(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String formattedDate = threeMonthsAgo.format(formatter);
        publishDateField.sendKeys(formattedDate);
        test.info("Enter the date before than today");
	    HelperFunctions.staticWait(3);
	    saveClose.click();
	    test.info("Clicked on save and close");
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of page info and clicked on it");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 30);
	    wait3.until(ExpectedConditions.visibilityOf(pageInfo));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", pageInfo);
	    wait3.until(ExpectedConditions.visibilityOf(publishPage));
	    test.info("Clicked on publish page");
	    publishPage.click();
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(publishMessage));
	    test.info("Go to the publisher page");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 17));
	    HelperFunctions.waitForPageToLoad(15);*/
	    HelperFunctions.staticWait(3);
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(newLabel2.isEmpty());
	    test.info("Verified new label is NOT displayed");
	    HelperFunctions.staticWait(2);
	    Driver.getDriver().switchTo().defaultContent();
	    editButton.click();
	    //HelperFunctions.staticWait(2);
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 16));
	    test.info("Go to authoring page and click page info button and open properties");
	    HelperFunctions.waitForPageToLoad(15);*/
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of page info and clicked on it");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
	    wait5.until(ExpectedConditions.visibilityOf(pageInfo));
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", pageInfo);
	    wait5.until(ExpectedConditions.visibilityOf(openPro));
	    test.info("Clicked on open properties");
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(60);
	    HelperFunctions.staticWait(3);
	    HelperFunctions.scrollToElement(publishDateField);
	    HelperFunctions.staticWait(2);
	    publishDateField.click();
	    HelperFunctions.staticWait(2);
	    publishDateField.clear();
	    HelperFunctions.staticWait(2);
	    test.info("Scrolled to publish date and cleared it");
	    LocalDate today = LocalDate.now();
	    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String formattedDate2 = today.format(formatter2);
	    publishDateField.sendKeys(formattedDate2);
	    HelperFunctions.staticWait(2);
	    test.info("Enter the today's date");
	    saveClose.click();
	    test.info("Clicked on save and close");
	    HelperFunctions.waitForPageToLoad(30);
	   // HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of page info and clicked on it");
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 30);
	    wait6.until(ExpectedConditions.visibilityOf(pageInfo));
	    JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	    js4.executeScript("arguments[0].click();", pageInfo);
	    wait6.until(ExpectedConditions.visibilityOf(publishPage));
	    test.info("Clicked on publish page");
	    publishPage.click();
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 30);
	    wait7.until(ExpectedConditions.visibilityOf(publishMessage));
	    HelperFunctions.staticWait(3);
	}
	
	public void setEnablersGXEdit(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    //Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    wait.until(ExpectedConditions.visibilityOf(pageInfo));
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", pageInfo);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    test.info("Wait for edit button visibility and clicked on it");
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    //wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    //HelperFunctions.staticWait(3);
	    editButton.click();
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to the edit title and clicked on it");
	    HelperFunctions.scrollToElement(editEnablers);
	    HelperFunctions.staticWait(3);
	    editEnablers.click();
	   // HelperFunctions.staticWait(3);
	    test.info("Clicked on configure button");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.elementToBeClickable(configure));
	    configure.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(enablersValue1));
	    String value1="PLATFORMS";
	    String value2="Fortune Trust Hub";
	    enablersValue1.click();
	    HelperFunctions.staticWait(2);
	    enablersValue1.clear();
	    HelperFunctions.staticWait(2);
	    enablersValue1.sendKeys(value1);
	    HelperFunctions.staticWait(2);
	    enablersValue2.click();
	    HelperFunctions.staticWait(2);
	    enablersValue2.clear();
	    HelperFunctions.staticWait(2);
	    enablersValue2.sendKeys(value2);
	    HelperFunctions.staticWait(2);
	    done.click();
	    HelperFunctions.staticWait(7);
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    Assert.assertTrue(enablersItems.get(0).getText().contains(value2));
	    HelperFunctions.staticWait(3);
	}
	public void setpwcGXEdit(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    //Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    wait.until(ExpectedConditions.visibilityOf(pageInfo));
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", pageInfo);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    test.info("Wait for edit button visibility and clicked on it");
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    //wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    //HelperFunctions.staticWait(3);
	    editButton.click();
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to the edit title and clicked on it");
	    HelperFunctions.scrollToElement(pwcContactEdit);
	    HelperFunctions.staticWait(3);
	    pwcContactEdit.click();
	   // HelperFunctions.staticWait(3);
	    test.info("Clicked on configure button");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.elementToBeClickable(configure));
	    configure.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 30);
	    wait3.until(ExpectedConditions.visibilityOf(supportEdit));
	    String value1="Support here";
	    String value2="us_value_store@pwc.com";
	    supportEdit.click();
	    HelperFunctions.staticWait(2);
	    supportEdit.clear();
	    HelperFunctions.staticWait(2);
	    supportEdit.sendKeys(value1);
	    HelperFunctions.staticWait(2);
	    mailtoEdit.click();
	    HelperFunctions.staticWait(2);
	    mailtoEdit.clear();
	    HelperFunctions.staticWait(2);
	    mailtoEdit.sendKeys(value2);
	    HelperFunctions.staticWait(2);
	    done.click();
	    HelperFunctions.staticWait(7);
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(contact.getText().contains(value1));
	    HelperFunctions.staticWait(3);
	}
	public void setExternalPageMandatoryFields(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   
        test.info("Wait for page to load");
	  
	   
	    test.info("Wait for page info's visibility and clicked on it");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 60);
	    wait2.until(ExpectedConditions.visibilityOf(pageInfo));
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    wait2.until(ExpectedConditions.visibilityOf(openPro));
	    test.info("Clicked on open properties");
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(60);
	    wait2.until(ExpectedConditions.visibilityOf(titleField));
	    test.info("Clicking on title field and clear");
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    titleField.clear();
	    wait2.until(ExpectedConditions.visibilityOf(errorMessage));
	    test.info("Verified error message is displayed");
	    String title="Automation External Page";
	    HelperFunctions.staticWait(2);
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    titleField.sendKeys(title);
	    test.info("Clicked on title field and send title");
	    HelperFunctions.staticWait(2);
        descriptionField.click();
        HelperFunctions.staticWait(2);
        descriptionField.clear();
	    test.info("Clicking on description field and clear it");
	    wait2.until(ExpectedConditions.visibilityOf(errorMessage));
	    test.info("Verified error message is displayed");
	    String desc="Automation Testing";
	    HelperFunctions.staticWait(2);
	    descriptionField.click();
	    HelperFunctions.staticWait(2);
	    descriptionField.sendKeys(desc);
	    test.info("Clicked on description field and send description");
	    HelperFunctions.staticWait(2);
	    saveClose.click();
	    test.info("Clicked on save and close");
	    HelperFunctions.waitForPageToLoad(90);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    test.info("Wait for page info's visibility and clicked on it");
	    JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	    js4.executeScript("arguments[0].click();", pageInfo);
	    wait2.until(ExpectedConditions.visibilityOf(publishPage));
	    test.info("Clicked on publish page");
	    publishPage.click();
	    HelperFunctions.staticWait(5);
	}
	
}