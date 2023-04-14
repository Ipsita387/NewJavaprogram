package com.JANAADHAAR.Enrollment;

import java.awt.AWTException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.JANAADHAAR.GenericsLibrary.AutoConstant;
import com.JANAADHAAR.GenericsLibrary.BaseTest;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_MasterModule;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_TestData;

public class OtherConditionsCheck_FamilyMemberDetails extends BaseTest implements JANAADHAAR_TestData 
{
	@Test(priority = 0)
	public void EnterBasicFamilyInformationScreen() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.SSOIDLogin();
		Thread.sleep(2000);
		masterdata.NewEnrollment();
//		masterdata.ClearFamilyInformationUrban();
//		masterdata.EnterFamilyInformationUrban();
//		Thread.sleep(3000);
//		masterdata.ClearFamilyIdentityDocument();
//		Thread.sleep(2000);
//		masterdata.EnterFamilyIdentityDocument();
		Thread.sleep(3000);
		masterdata.SaveFamilyInformationMethod();
		Thread.sleep(4000);
		masterdata.ClickOkMethod();
			
	}
	@Test(priority= 1)
	public void CheckValidLabourCardNo() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.MembUploadPhotoMethod(driver);
		Thread.sleep(4000);
		//masterdata.SaveDetailsFamilyMemberDetailsMethod();
		Thread.sleep(4000);
		
		masterdata.EnterFamilyMemberDetails(driver);
		Thread.sleep(4000);
		masterdata.EnterIdentificationDocDetails();
		Thread.sleep(15000);
		
		masterdata.EnterValidLabourCardNo();
		Thread.sleep(2000);
		//masterdata.PersonalDetailsLogoClickMethod();
		//Thread.sleep(2000);
		
//		masterdata.CheckMaxLengthIdentificationDocDetails();
//		Thread.sleep(4000);
//		String msg=masterdata.FamilyMembAadhaarGetTextMethod();
//	    int Length=msg.length();
		
		
		try {
			String msg=masterdata.GetPopupMsgMethod();
			masterdata.ClickOkMethod();
			if(!msg.equals("Invalid labourcard number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",92 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 92, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 92, "Pass");
			//System.out.println("Fail");

			
		}	
}
	@Test(priority= 2)
	public void CheckInValidLabourCardNo() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearValidLabourCardNo();
		Thread.sleep(2000);
		masterdata.EnterInvalidLabourCardNo();
		
		//masterdata.PersonalDetailsLogoClickMethod();
		//Thread.sleep(2000);
		
//		masterdata.CheckMaxLengthIdentificationDocDetails();
//		Thread.sleep(4000);
//		String msg=masterdata.FamilyMembAadhaarGetTextMethod();
//	    int Length=msg.length();
		
		
		try {
			String msg=masterdata.GetPopupMsgMethod();
			masterdata.ClickOkMethod();
			Thread.sleep(3000);
			masterdata.ClickOkMethod();
			if(msg.equals("Invalid labourcard number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",93 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 93, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 93, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority =4)
	public void CheckInValidRationCardNo() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.EnterInValidRationCard();
		try {
			String msg=masterdata.GetPopupMsgMethod();
			//masterdata.ClickOkMethod();
			Thread.sleep(3000);
			masterdata.ClickOkMethod();
			if(msg.equals("Rationcard details not found"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",94 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 94, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 94, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
		
	}
	@Test(priority =5)
	public void CheckValidRationCardNo() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		masterdata.EnterValidRationCard(driver);
		Thread.sleep(3000);
		//masterdata.ValidateRationCard();
		try {
			masterdata.ValidateRationCard();
			String msg=masterdata.GetPopupMsgMethod();
			masterdata.ClickOkMethod();
			Thread.sleep(3000);
			//masterdata.ClickOkMethod();
			if(msg.equals("Ration card details verified"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",95 , "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 95, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 95, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
		
	}
	@Test(priority =6)
	public void CheckValidSSPPONo() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.EnterValidSSPPONo();
		Thread.sleep(3000);
		masterdata.clickOnLabelSSPPONo();
		//masterdata.ValidateRationCard();
		try {
			//masterdata.ValidateRationCard();
			String msg=masterdata.GetPopupMsgMethod();
			masterdata.ClickOkMethod();
			Thread.sleep(3000);
			//masterdata.ClickOkMethod();
			if(msg.equals("SSPPO Verified !!"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",96 , "Pass");
				
				//masterdata.ClickOkMethod();
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 96, "Fail");
				masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 96, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
		
	}
	@Test(priority =7)
	public void CheckInvalidSSPPONo() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearSSPPONo();
		Thread.sleep(3000);
		
		masterdata.EnterInvalidSSPPONo();
		Thread.sleep(3000);
		masterdata.ClickOkMethod();
		//masterdata.ValidateRationCard();
		masterdata.clickOnLabelSSPPONo();
		try {
			//masterdata.ValidateRationCard();
			String msg=masterdata.GetPopupMsgMethod();
			Thread.sleep(3000);
			masterdata.ClickOkMethod();
			Thread.sleep(3000);
			//masterdata.ClickOkMethod();
			if(msg.equals("Some error occured")||msg.equals("Invalid SSPPO Number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",97 , "Pass");
				//masterdata.ClickOkMethod();
				//masterdata.ClickOkMethod();
				//masterdata.ClickOkMethod();
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 97, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 97, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
		
	}
	@Test(priority=8)
	public void CheckValidationForEmailId() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.MembEmailIDClearMethod();
		Thread.sleep(3000);
		masterdata.ClickOkMethod();
		masterdata.InvalidMembEmailIDTextMethod();
		String data=masterdata.MembEmailIDGetTextMethod();
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern invalid=Pattern.compile(regex);
		Matcher match=invalid.matcher(data);
		Boolean result=match.find();
		try {
			String msg=masterdata.GetErrorMsgMethod();
			if(msg.equalsIgnoreCase("Please enter valid email Id") && result== true)
			{
				System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 98, "Pass");
				row++;
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 98, "Fail");
				row++;
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 98, "Can't Vallidate");
			System.out.println("Fail");
			row++;
			
		}
	}
}
