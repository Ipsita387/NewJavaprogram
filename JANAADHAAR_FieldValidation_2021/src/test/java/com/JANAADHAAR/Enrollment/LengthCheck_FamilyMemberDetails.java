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

public class LengthCheck_FamilyMemberDetails extends BaseTest implements JANAADHAAR_TestData
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
	public void LengthCheckForAadhaarNo() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.MembUploadPhotoMethod(driver);
		Thread.sleep(4000);
		masterdata.SaveDetailsFamilyMemberDetailsMethod();
		Thread.sleep(4000);
		
		masterdata.CheckMaxLengthFamilyMemberDetails(driver);
		Thread.sleep(4000);
		masterdata.CheckMaxLengthIdentificationDocDetails();
		Thread.sleep(4000);
		String msg=masterdata.FamilyMembAadhaarGetTextMethod();
	    int Length=msg.length();
		
		
		try {
			
			if(Length==12)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",78 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 78, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 78, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 2)
	public void LengthCheckForFirstNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		String msg=masterdata.MembFirstNameEngGetTextMethod();
	    int Length=msg.length();
		
		try {
			
			if(Length==50)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",79 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 79, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 79, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}	

	@Test(priority= 3)
	public void LengthCheckForMiddleNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		String msg=masterdata.MembMiddleNameEngGetTextMethod();
	    int Length=msg.length();
		
		try {
			
			if(Length==50)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",80 , "Pass");
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 80, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 80, "Can't Vallidate");
			System.out.println("Fail");
		
			
		}	
}
	@Test(priority= 4)
	public void LengthCheckForLastNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		String msg=masterdata.MembLastNameEngGetTextMethod();
	    int Length=msg.length();
		
		try {
			
			if(Length==50)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",81 , "Pass");
	
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 81, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 81, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
}
	@Test(priority= 5)
	public void LengthCheckForFatherNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		String msg=masterdata.MembFatherNameEngGetTextMethod();
	    int Length=msg.length();
		
		try {
			
			if(Length==100)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",82 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 82, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 82, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 6)
	public void LengthCheckForMotherNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		String msg=masterdata.MembMotherNameEngGetTextMethod();
	    int Length=msg.length();
		
		try {
			
			if(Length==100)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",83, "Pass");
	
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 83, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 83, "Can't Vallidate");
			System.out.println("Fail");
			
			
		}	
}
	@Test(priority= 7)
	public void LengthCheckForMobileNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		String msg=masterdata.MembMobileNoGetTextMethod();
	    int Length=msg.length();
		
		try {
			
			if(Length==10)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",84 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 84, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 84, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 7)
	public void LengthCheckForAnnualIncome() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		String msg=masterdata.MembAnnualIncomeGetTextMethod();
	    int Length=msg.length();
		
		try {
			
			if(Length==30)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",85 , "Pass");
		
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 85, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 85, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
	}
	@Test(priority= 8)
	public void LengthCheckForBankAccountNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		String msg=masterdata.MembBankAccountNoGetTextMethod();
	    int Length=msg.length();
		
		try {
			
			if(Length==30)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",86 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 86, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 86, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
	}
	@Test(priority= 9)
	public void LengthCheckForPANNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String msg=masterdata.MembPANCardNoGetTextMethod();
	    int Length=msg.length();
		try {
			
			if(Length==30)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",87 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 87, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 87, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority= 10)
	public void LengthCheckForDLNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String msg=masterdata. MembDLNoGetTextMethod();
	    int Length=msg.length();
		
		try {
			
			if(Length==20)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",88 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 88, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 88, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority=11 )
	public void LengthCheckForPassportNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String msg=masterdata. MembPassportNoGetTextMethod();
	    int Length=msg.length();
		try {
			
			if(Length==20)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",89 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 89, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 89, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}	
	@Test(priority= 12)
	public void LengthCheckForVoterIDNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String msg=masterdata.MembVoterIDNoGetTextMethod();
	    int Length=msg.length();
		try {
			
			if(Length==20)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",90 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 90, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 90, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority= 13)
	public void LengthCheckForMGNREGANumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String msg=masterdata.MembMGNREGACardNoGetTextMethod();
	    int Length=msg.length();
		try {
			
			if(Length==30)
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",91 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 91, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 91, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}	
}
