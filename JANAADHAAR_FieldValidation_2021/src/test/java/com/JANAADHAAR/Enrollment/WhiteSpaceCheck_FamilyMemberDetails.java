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

public class WhiteSpaceCheck_FamilyMemberDetails extends BaseTest implements JANAADHAAR_TestData
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
	public void WhiteSpaceInitialCheckForAadhaarNo() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.MembUploadPhotoMethod(driver);
		Thread.sleep(4000);
		masterdata.EnterWhiteSpaceInitialAadhaarNo();
		Thread.sleep(3000);
		masterdata.PersonalDetailsLogoClickMethod();
		Thread.sleep(3000);
		String msg=masterdata.GetPopupMsgMethod();
		masterdata.ClickOkMethod();
		Thread.sleep(3000);
		masterdata.SaveDetailsFamilyMemberDetailsMethod();
		Thread.sleep(4000);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid 12 digit Adhaar Number") || msg.equals("Invalid Aadhaar Number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",36 , "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 36, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 36, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 2)
	public void WhiteSpaceInitialCheckForFirstNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.SaveDetailsFamilyMemberDetailsMethod();
		Thread.sleep(4000);
		
		masterdata.EnterWhiteSpaceInitialFamilyMemberDetails(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter a valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",37 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 37, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 37, "Can't Vallidate");
			System.out.println("Fail");
			
		}	
}
	@Test(priority= 3)
	public void WhiteSpaceInitialCheckForMiddleNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		
		try {
			
			if(s2.contains("Please enter a valid middle name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",38 , "Pass");
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 38, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 38, "Can't Vallidate");
			System.out.println("Fail");
		
			
		}	
}
	@Test(priority= 4)
	public void WhiteSpaceInitialCheckForLastNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter a valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",39, "Pass");
	
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 39, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 39, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
}
	@Test(priority= 5)
	public void WhiteSpaceInitialCheckForFatherNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",40 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 40, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 40, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 6)
	public void WhiteSpaceInitialCheckForMotherNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",41 , "Pass");
	
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 41, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 41, "Can't Vallidate");
			System.out.println("Fail");
			
			
		}	
}
	@Test(priority= 7)
	public void WhiteSpaceInitialCheckForMobileNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid mobile number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",42 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 42, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 42, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 8)
	public void WhiteSpaceInitialCheckForAnnualIncome() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter real income in number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",43 , "Pass");
		
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 43, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 43, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
	}
	@Test(priority= 9)
	public void WhiteSpaceInitialCheckForBankAccountNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid bank account number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",44 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 44, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 44, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
	}
	@Test(priority= 10)
	public void WhiteSpaceLastCheckForAadhaarNo() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);

               masterdata.ClearFamilyMemberDetails();
               Thread.sleep(3000);
               masterdata.EnterWhiteSpaceInitialAadhaarNo();
       		Thread.sleep(3000);
       		masterdata.PersonalDetailsLogoClickMethod();
       		Thread.sleep(3000);
       		String msg=masterdata.GetPopupMsgMethod();
       		masterdata.ClickOkMethod();
       		Thread.sleep(3000);
       		masterdata.SaveDetailsFamilyMemberDetailsMethod();
       		Thread.sleep(4000);
       		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();

		System.out.println(s2);
		
		try {
			if(s2.contains("Please enter valid 12 digit Adhaar Number") || msg.equals("Invalid Aadhaar Number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",45 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 45, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 45, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 11)
	public void WhiteSpaceLastCheckForFirstNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		masterdata.SaveDetailsFamilyMemberDetailsMethod();
		Thread.sleep(4000);
		
		masterdata.EnterWhiteSpaceLastFamilyMemberDetails(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter a valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",46 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 46, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 46, "Can't Vallidate");
			System.out.println("Fail");
			
		}	
}
	@Test(priority=12)
	public void WhiteSpaceLastCheckForMiddleNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		
		try {
			
			if(s2.contains("Please enter a valid middle name") )
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",47 , "Pass");
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 47, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 47, "Can't Vallidate");
			System.out.println("Fail");
		
			
		}	
}
	@Test(priority= 13)
	public void WhiteSpaceLastCheckForLastNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter a valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",48 , "Pass");
	
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 48, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 48, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
}
	@Test(priority= 14)
	public void WhiteSpaceLastCheckForFatherNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",49, "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 49, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 49, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 15)
	public void WhiteSpaceLastCheckForMotherNameEng() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid name"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",50, "Pass");
	
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 50, "Fail");
	
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 50, "Can't Vallidate");
			System.out.println("Fail");
			
			
		}	
}
	@Test(priority= 16)
	public void WhiteSpaceLastCheckForMobileNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid mobile number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",51 , "Pass");

			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 51, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 51, "Can't Vallidate");
			System.out.println("Fail");

			
		}	
}
	@Test(priority= 17)
	public void WhiteSpaceLastCheckForAnnualIncome() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter real income in number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",52 , "Pass");
		
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 52, "Fail");
		
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 52, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
	}
	@Test(priority= 18)
	public void WhiteSpaceLastCheckForBankAccountNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid bank account number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",53 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 53, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 53, "Can't Vallidate");
			System.out.println("Fail");
	
			
		}	
	}
	@Test(priority= 19)
	public void WhiteSpaceInitialCheckForPANNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.EnterWhiteSpaceInitialIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid PAN Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",54 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 54, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 54, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority= 20)
	public void WhiteSpaceInitialCheckForDLNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		//masterdata.EnterWhiteSpaceInitialIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid Driving Licence Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",55 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 55, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 55, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority=21 )
	public void WhiteSpaceInitialCheckForPassportNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		//masterdata.EnterWhiteSpaceInitialIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid Passport Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",56 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 56, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 56, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}	
	@Test(priority= 22)
	public void WhiteSpaceInitialCheckForVoterIDNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		//masterdata.EnterWhiteSpaceInitialIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid Voter ID Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",57 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 57, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 57, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority= 23)
	public void WhiteSpaceInitialCheckForMGNREGANumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		//masterdata.EnterWhiteSpaceInitialIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid MGNREGA Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 58, "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 58, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 58, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}	
	@Test(priority= 24)
	public void WhiteSpaceLastCheckForPANNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearIdentificationDocDetails();
		Thread.sleep(3000);
		masterdata.EnterWhiteSpaceLastIdentificationDocDetails();
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid PAN Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",59 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 59, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 59, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority= 25)
	public void WhiteSpaceLastCheckForDLNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);

		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid Driving Licence Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",60 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 60, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 60, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority=26 )
	public void WhiteSpaceLastCheckForPassportNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);

		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid Passport Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",61 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 61, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 61, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}	
	@Test(priority= 27)
	public void WhiteSpaceLastCheckForVoterIDNumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid Voter ID Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",62 , "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 62, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 62, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}
	@Test(priority= 28)
	public void WhiteSpaceLastCheckForMGNREGANumber() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);

		
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		
		try {
			
			if(s2.contains("Please enter valid MGNREGA Card number"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 63, "Pass");
				
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 63, "Fail");
			
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 63, "Can't Vallidate");
			System.out.println("Fail");
		}
			
		}	
}
