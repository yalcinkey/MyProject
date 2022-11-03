
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

    public class CheatSheet {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "./resources/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            // BROWSER METHODS

            driver.get("https://www.amazon.com"); //Get is used to navigate to a specific page.
            // Waits for every single element to be downloaded.
            driver.navigate().to("https://www.amazon.com"); //Doesn't wait for every element to be downloaded
            // It saves navigation history.
            driver.navigate().refresh();
            driver.navigate().back();
            driver.navigate().forward();
            driver.close(); // Closes only current window.
            driver.quit(); //Closes every associated window.
            driver.getTitle(); // Gets the title of the page.
            driver.getCurrentUrl(); // Returns the URL of the current page as a string.
            driver.manage().window().maximize(); // Maximizes the size of the window.
            // .click;
            // .sendKeys("example");
            // .clear();
            // .getSize();
            // .size(); returns the size
            // .getText(); method fetches text present in the html including sub-elements text.
            // isDisplayed() returns a true or false based on the state of the element whether it is displayed or not.
            // Thread.sleep(2000); //Waits 2 seconds


            // SELENIUM LOCATORS
            driver.findElement(By.id("dog_item")); // EXAMPLE <li id="dog_item">Dog</li>
            driver.findElement(By.name("dog_name")); //EXAMPLE <li name="dog_name">Dog</li>
            driver.findElement(By.tagName("a")); // EXAMPLE <a href="http://www.google.com">Google</a>
            driver.findElement(By.className("dog")); //EXAMPLE <li class="dog">Dog</li>
            driver.findElement(By.linkText("Google")); //EXAMPLE <a href="http://www.google.com">Google</a>
            driver.findElement(By.partialLinkText("ogle")); //EXAMPLE <a href="http://www.google.com">Google</a>
            driver.findElement(By.xpath("//img[@class='logo img-responsive']"));
            driver.findElement(By.cssSelector(".shop-account-menu"));

            // Absolute Path: /→ Starts from html tag, starts with single slashes.
            // Relative Path: // → can be anywhere in the page, starts with double slashes.

            // BASIC XPATH
            // Tag_Name[@Attribute='Value'] // → SYNTAX
            // input[@name='uid'] → Uses name as attribute to locate.
            // a[@id='search'] → Uses id
            // select[@class='offerings'] → Uses class
            // img → Uses just tag name
            // div[@value='RESET'] → Uses value attribute
            // a[@href='http://demo.com/'] → uses link
            // img[@src='//cdn.amazon.com/images/cake.png'] → uses src attribute
            // *[@name='fname'] → * means any tagname.
            // *[@name='fname']/input → / single slash means the child element of the specified element with input tag.

            // XPATH FOR DYNAMIC ELEMENTS
            // CONTAINS
            // *[contains(@name,'btn')] we have taken the 'name' as an attribute and 'btn' as a partial value.
            // LOGICAL OPERATORS
            // *[@type='submit' or @name='btnReset'] Example with Logical Operator 'OR'
            // input[@type='submit' and @name='btnLogin'] Example with Logical Operator 'AND'
            // STARTS WITH
            // label[starts-with(@id,'message')]
            // TEXT()
            // *[text() ='whatever'] With text function, we find the element with exact text match.
            // PARTIAL TEXT
            // *[contains(text(),'what')]

            // To get to child element from parent element use "/"
            // To get to parent element from child element use "/.." this takes you one level up
            // Find Element by using two or more Attrs and their values
            // tagName[@Attr1='attr1Val' and/or @Attr2='attr2Val' and/or @Attr3='attr3Val'] EXAMPLE


            // SOME TAGS AND MEANINGS
            // <a> → means its a link
            // <table> → means its a table
            // <img> → means its an image
            // <p> → means new paragraph
            // <div> → means divide up page content into sections, and applying styles.


            // EXAMPLE OF CREATING A LIST AND ACCESSING EACH ELEMENTS ON THE LIST BY INDEX NUMBER
            List<WebElement> elements = driver.findElements(By.name("name"));
            System.out.println("Number of elements:" +elements.size());
            elements.get(0).click();
            elements.get(1).click();


            // WEBTABLES
            // 'table' tag → defines HTML table.
            // 'thead' tag → defines container for table header.
            // 'tbody' tag → defines a container for rows and columns in table body.
            // 'tr' → defines rows in an HTML table.
            // 'td'/'th' → define the column of an HTML table. (th = table header)

            // CSS
            // Syntax difference of XPATH and CSS
            // XPATH: //*[@name='booking'] ← → CSS: [name='booking']
            // Choosing multiple attributes EXAMPLE: input[name='email'][type='text']
            // Using nth-child EXAMPLE: driver.findElement(By.cssSelector("#ui-id-2>li:nth-child(1) span"))

            // CSS SHORTCUTS
            // . → refers to class EXAMPLE: driver.findElement(By.cssSelector( "input.submitbtn")); input is tag, submitbtn is class
            // # → refers to ID EXAMPLE: driver.findElement(By.cssSelector( "#cake"));
            // > → jumps to the child EXAMPLE: driver.findElement(By.css(".submit>div"));

            // HI Group 5 ........
        }
    }




