package com.qa.Test_Scripts;

import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
import org.testng.annotations.DataProvider;
import com.qa.Utility.Excel_utility;
import com.qa.pages.Search;
import java.io.IOException;

public class Brand_click extends Test_base {

				@Test(dataProvider = "getdata")
				public void searchby(String username,String password,String name) throws InterruptedException
				{
					
					Search page = new Search(driver);
					Thread.sleep(1000);
				     page.getusername().sendKeys(username);
					
					page.getpassword().sendKeys(password);
					page.loginby().click();
					Thread.sleep(3000);
					page.searchby().sendKeys(name);
					Thread.sleep(2000);
					page.enterbutton().click();
					Thread.sleep(3000);
					page.brandchoose().click();
				
				}
			   
			@DataProvider
			public Object [] [] getdata() throws IOException
			{
				 String xFile ="C:\\Users\\sumamukesh\\Desktop\\eclipse\\Flipkart---Testing\\src\\main\\java\\com\\qa\\Test_data\\Data.xlsx";
			 String Xsheet="Sheet1";
			 int row = Excel_utility.getrowcount(xFile, Xsheet);
			 int column = Excel_utility.getcellcount(xFile,Xsheet,row);
			 String [] [] data = new String[row][column];
			 for (int i =1;i<=row;i++)
			 {
			    for (int j =0;j<column;j++)
			       {
			          data[i-1][j] =Excel_utility.getcelldata(xFile,Xsheet,i,j);
			       }
			  }
			  return data;
			}
			}










