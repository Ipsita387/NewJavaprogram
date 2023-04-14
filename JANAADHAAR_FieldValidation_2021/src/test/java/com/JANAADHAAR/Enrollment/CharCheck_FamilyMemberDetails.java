package com.JANAADHAAR.Enrollment;

import java.awt.AWTException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.JANAADHAAR.GenericsLibrary.AutoConstant;
import com.JANAADHAAR.GenericsLibrary.BaseTest;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_MasterModule;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_TestData;

public class CharCheck_FamilyMemberDetails extends BaseTest implements JANAADHAAR_TestData
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
	public void AlphabetsCharCheckForAadhaarNo() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.MembUploadPhotoMethod(driver);
		Thread.sleep(4000);
		masterdata.SaveDetailsFamilyMemberDetailsMethod();
		Thread.sleep(4000);
		
		masterdata.EnterAlphaNumericCharFamilyMemberDetails(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid 12 digit Adhaar Number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",64 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 64, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 64, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 2)
	public void NumericCharCheckForFirstNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter a valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",65, "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 65, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 65, "Can't Vallidate");
			System.out.println("Fail");
			
		}	
}
	@Test(priority= 3)
	public void NumericCharCheckForMiddleNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		
		try {
			
			if(s2.contains("Please enter a valid middle name") )
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",66 , "Pass");
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 66, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 66, "Can't Vallidate");
			System.out.println("Fail");
		
			
		}	
}
	@Test(priority= 4)
	public void NumericCharCheckForLastNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter a valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",67 , "Pass");
	
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 67, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 67, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
}
	@Test(priority= 5)
	public void NumericCharCheckForFatherNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",68 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 68, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 68, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 6)
	public void NumericCharCheckForMotherNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",69, "Pass");
	
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 69, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 69, "Can't Vallidate");
			System.out.println("Fail");
			
			
		}	
}
	@Test(priority= 7)
	public void AlphabetsCharCheckForMobileNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid mobile number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",70 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 70, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 70, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 7)
	public void AlphabetsCharCheckForAnnualIncome() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter real income in number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",71, "Pass");
		
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 71, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 71, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
	}
	@Test(priority= 8)
	public void AlphabetsCharCheckForBankAccountNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid bank account number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",72 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 72, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 72, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
	}
	@Test(priority= 9)
	public void InvalidCharCheckForPANNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.EnterInvalidCharIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid PAN Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",73 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 73, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 73, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority= 10)
	public void InvalidCharCheckForDLNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		//masterdata.EnterInvalidCharIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid Driving Licence Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",74 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 74, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 74, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority=11 )
	public void InvalidCharCheckForPassportNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		//masterdata.EnterInvalidCharIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid Passport Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",75 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 75, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 75, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}	
	@Test(priority= 12)
	public void InvalidCharCheckForVoterIDNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		//masterdata.EnterInvalidCharIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid Voter ID Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",76 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 76, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 76, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority= 13)
	public void InvalidCharCheckForMGNREGANumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		//masterdata.EnterInvalidCharIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid MGNREGA Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",77 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 77, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 77, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}	
}
