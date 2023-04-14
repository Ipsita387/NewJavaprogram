package com.JANAADHAAR.Enrollment;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.JANAADHAAR.GenericsLibrary.AutoConstant;
import com.JANAADHAAR.GenericsLibrary.BaseTest;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_MasterModule;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_TestData;


public class MandatoryCheck_BasicFamilyInformation extends BaseTest implements JANAADHAAR_TestData 
{
	
	
	@Test(priority = 0)
	public void EnterBasicFamilyInformationScreen() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.SSOIDLogin();
		Thread.sleep(2000);
		masterdata.NewEnrollment();
			
	}
	@Test(priority = 1)
	public void MandatoryCheckForPincode() throws InterruptedException
	{
      JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
     row=2;
	    masterdata.ClearFamilyInformationUrban();
	    Thread.sleep(2000);
	    masterdata.FamilyAddressLogoClickMethod(driver);
	    Thread.sleep(2000);
	    masterdata.SaveFamilyInformationMethod();
	  masterdata.PincodeInvalidTextMethod();
	    Thread.sleep(2000);
	    masterdata.PincodeClearMethod();
	    Thread.sleep(2000);
	    masterdata.PincodeInvalidTextMethod();
	    Thread.sleep(2000);
	    masterdata.PincodeClearMethod();
	    masterdata.SaveFamilyInformationMethod();	  
		
		try {
			String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
			if(msg.equalsIgnoreCase("Please enter pin code")|| msg.equalsIgnoreCase("Enter valid pin of 6 digit"))
			{
				System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyInformation_Sheet, "Status", row, "Pass");
				row++;
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyInformation_Sheet, "Status", row, "Fail");
				row++;
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyInformation_Sheet, Column_name, row, "Can't Vallidate");
			System.out.println("Fail");
			row++;
			
		}	
	}
	@Test(priority = 2)
	public void MandatoryCheckForDistrict() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.UnSelectDistrict();
		Thread.sleep(3000);
		masterdata.SaveFamilyInformationMethod();
		
		try {
			String msg=masterdata.GetErrorMsgMethod();
			if(msg.equalsIgnoreCase("Please select district"))
			{
				System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyInformation_Sheet, "Status", row, "Pass");
				row++;
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyInformation_Sheet, "Status", row, "Fail");
				row++;
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyInformation_Sheet, Column_name, row, "Can't Vallidate");
			System.out.println("Fail");
			row++;
			
		}	
	}
	@Test(priority = 3)
	public void MandatoryCheckForCity() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		masterdata.ClearFamilyInformationUrban();
		Thread.sleep(2000);
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(2000);
		masterdata.UnSelectCity();
		
		try {
			String msg=masterdata.GetErrorMsgMethod();
			if(msg.equalsIgnoreCase("Please select city"))
			{
				System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyInformation_Sheet, "Status", row, "Pass");
				row++;
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyInformation_Sheet, "Status", row, "Fail");
				row++;
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyInformation_Sheet, "Status", row, "Can't Vallidate");
			System.out.println("Fail");
			row++;
			
		}	
	}
	@Test(priority = 4)
	public void MandatoryCheckForWard() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		masterdata.ClearFamilyInformationUrban();
		Thread.sleep(2000);
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(2000);
		masterdata.UnSelectWard();
		
		try {
			String msg=masterdata.GetErrorMsgMethod();
			if(msg.equalsIgnoreCase("Please select city"))
			{
				System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyInformation_Sheet, "Status", row, "Pass");
				row++;
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyInformation_Sheet, "Status", row, "Fail");
				row++;
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyInformation_Sheet, Column_name, row, "Can't Vallidate");
			System.out.println("Fail");
			row++;
			
		}	
	}
}

