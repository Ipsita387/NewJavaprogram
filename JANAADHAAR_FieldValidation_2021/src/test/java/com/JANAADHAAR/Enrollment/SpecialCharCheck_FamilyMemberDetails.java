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

public class SpecialCharCheck_FamilyMemberDetails extends BaseTest implements JANAADHAAR_TestData
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
	public void SpecialCharCheckForAadhaarNo() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.MembUploadPhotoMethod(driver);
		Thread.sleep(4000);
		masterdata.SaveDetailsFamilyMemberDetailsMethod();
		Thread.sleep(4000);
		
		masterdata.EnterSpecialCharFamilyMemberDetails(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid 12 digit Adhaar Number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",22 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 22, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 22, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 2)
	public void SpecialCharCheckForFirstNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter a valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",23 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 23, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 23, "Can't Vallidate");
			System.out.println("Fail");
			
		}	
}
	@Test(priority= 3)
	public void SpecialCharCheckForMiddleNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		String msg=masterdata.MembFirstNameEngGetTextMethod();
		Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
		Matcher matcher = special.matcher(msg);
		boolean constainsSpecial = matcher.find();
		
		try {
			
			if(s2.contains("Please enter a valid middle name") || constainsSpecial == false)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",24 , "Pass");
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 24, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 24, "Can't Vallidate");
			System.out.println("Fail");
		
			
		}	
}
	@Test(priority= 4)
	public void SpecialCharCheckForLastNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter a valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",25 , "Pass");
	
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 25, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 25, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
}
	@Test(priority= 5)
	public void SpecialCharCheckForFatherNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",26 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 26, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 26, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 6)
	public void SpecialCharCheckForMotherNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",27 , "Pass");
	
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 27, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 27, "Can't Vallidate");
			System.out.println("Fail");
			
			
		}	
}
	@Test(priority= 7)
	public void SpecialCharCheckForMobileNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid mobile number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",28 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 28, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 28, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 7)
	public void SpecialCharCheckForAnnualIncome() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter real income in number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",29 , "Pass");
		
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 29, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 29, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
	}
	@Test(priority= 8)
	public void SpecialCharCheckForBankAccountNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid bank account number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",30 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 30, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 30, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
	}
	@Test(priority= 9)
	public void SpecialCharCheckForPANNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.EnterSpecialCharIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid PAN Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",31 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 31, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 31, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority= 10)
	public void SpecialCharCheckForDLNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		//masterdata.EnterSpecialCharIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid Driving Licence Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",32 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 32, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 32, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority=11 )
	public void SpecialCharCheckForPassportNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		//masterdata.EnterSpecialCharIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid Passport Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",33 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 33, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 33, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}	
	@Test(priority= 12)
	public void SpecialCharCheckForVoterIDNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		//masterdata.EnterSpecialCharIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid Voter ID Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",34 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 34, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 34, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority= 13)
	public void SpecialCharCheckForMGNREGANumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		//masterdata.EnterSpecialCharIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid MGNREGA Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",35 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 35, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 35, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}	
}
