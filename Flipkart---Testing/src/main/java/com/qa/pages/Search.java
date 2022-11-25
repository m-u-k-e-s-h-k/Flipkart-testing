package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Search {
		    WebDriver driver ;
		    
		     
		     @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
		     WebElement user;
		     public WebElement getusername()
		     {
		     
		    	 return user;
		     }
		     
		     @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
		     WebElement password;
		     public WebElement getpassword()
		     {
		    	 return password;
		     }
		     
		     @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
		     WebElement login;
		     public WebElement loginby()
		     {
		    	 return login;
		     }
		     
		     
		     @FindBy(className="_3704LK")
		     WebElement search;
		     public WebElement searchby()
		    {
		    	return search;
		    }
		     
		     @FindBy(className="_34RNph")
			    WebElement enter;
			    public WebElement enterbutton()
			    {
			    	return enter;
			    }
			    
			    @FindBy(className="_4rR01T")
			    WebElement brand;
			    public WebElement brandchoose()
			    {
			    	return brand;
			    }
			    /*
			    
			    @FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
			    WebElement add_to_cart;
			    public WebElement addtocart()
			    {
			    	return add_to_cart;
			    }
			    */
			    
			    public Search(WebDriver driver) {
			    	this.driver=driver;
			    	PageFactory.initElements(driver, this);
			    }
			    
			    
			    
	}



