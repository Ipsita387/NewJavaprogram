package com.JANAADHAAR.Enrollment;

import java.awt.AWTException;
import java.util.List;

import org.testng.annotations.Test;

import com.JANAADHAAR.GenericsLibrary.AutoConstant;
import com.JANAADHAAR.GenericsLibrary.BaseTest;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_MasterModule;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_TestData;

public class MandatoryCheck_FamilyMemberDetails extends BaseTest implements JANAADHAAR_TestData 
{
	@Test(priority = 0)
	public void EnterBasicFamilyInformationScreen() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.SSOIDLogin();
		Thread.sleep(2000);
		masterdata.NewEnrollment();
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.ClearFamilyIdentityDocument();
		Thread.sleep(2000);
		masterdata.EnterFamilyIdentityDocument();
		Thread.sleep(2000);
		masterdata.SaveFamilyInformationMethod();
		Thread.sleep(4000);
		masterdata.ClickOkMethod();
			
	}
	@Test(priority= 1)
	public void MandatoryCheckForUploadPhoto() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.SaveDetailsFamilyMemberDetailsMethod();
		Thread.sleep(4000);
		try {
			String msg=masterdata.GetPopupMsgMethod();
			if(msg.equalsIgnoreCase("Photo required"))
			{
				System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",2 , "Pass");
				masterdata.ClickOkMethod();
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 2, "Fail");
				masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 2, "Can't Vallidate");
			System.out.println("Fail");
			masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=2)
	public void MandatoryCheckForAadhaarNo() throws AWTException, InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		masterdata.MembUploadPhotoMethod(driver);
		masterdata.SaveDetailsFamilyMemberDetailsMethod();
		Thread.sleep(4000);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		System.out.println(s2);
		try {
			//String msg=masterdata.GetErrorMsgMethod();
			if(s2.contains("Aadhaar No. is required"))
			{
		
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",3 , "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
	
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 3, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 3, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=3)
	public void MandatoryCheckForFirstNameEng() throws AWTException, InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			//String msg=masterdata.GetErrorMsgMethod();
			if(s2.contains("First Name is required"))
			{
				//System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",4, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				//System.out.println(msg);
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 4, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 4, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=4)
	public void MandatoryCheckForLastNameEng() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			//String msg=masterdata.GetErrorMsgMethod();
			if(s2.contains("Last Name is required"))
			{
				//System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",5, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				//System.out.println(msg);
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 5, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 5, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=5)
	public void MandatoryCheckForFirstNameHnd() throws AWTException, InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			//String msg=masterdata.GetErrorMsgMethod();
			if(s2.contains("First Name is required"))
			{
				//System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",6, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				//System.out.println(msg);
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 6, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 6, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=6)
	public void MandatoryCheckForLastNameHnd() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			//String msg=masterdata.GetErrorMsgMethod();
			if(s2.contains("Last Name is required"))
			{
				//System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",7, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				//System.out.println(msg);
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 7, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 7, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=7)
	public void MandatoryCheckForGender() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			String msg=masterdata.GetErrorMsgMethod();
			if(s2.contains("Please select gender"))
			{
				//System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",8, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				//System.out.println(msg);
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 8, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 8, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=7)
	public void MandatoryCheckForDOB() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			String msg=masterdata.GetErrorMsgMethod();
			if(s2.contains("Provide date of birth"))
			{
				//System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",9, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				//System.out.println(msg);
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 9, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 9, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=8)
	public void MandatoryCheckForFatherNameEng() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			String msg=masterdata.GetErrorMsgMethod();
			if(s2.contains("Please enter father's name"))
			{
				//System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",10, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				//System.out.println(msg);
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 10, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 10, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=9)
	public void MandatoryCheckForMotherNameEng() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			String msg=masterdata.GetErrorMsgMethod();
			if(s2.contains("Please enter mother's name"))
			{
				//System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",12, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				//System.out.println(msg);
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 12, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 12, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=10)
	public void MandatoryCheckForFatherNameHnd() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			String msg=masterdata.GetErrorMsgMethod();
			if(s2.contains("Please enter father's name"))
			{
				//System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",11, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				//System.out.println(msg);
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 11, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",11, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=11)
	public void MandatoryCheckForMotherNameHnd() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			String msg=masterdata.GetErrorMsgMethod();
			if(s2.contains("Please enter mother's name"))
			{
				//System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",13, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				//System.out.println(msg);
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 13, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 13, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=12)
	public void MandatoryCheckForFamilyCategory() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			String msg=masterdata.GetErrorMsgMethod();
			if(s2.contains("Please select family category"))
			{
				//System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",14, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				//System.out.println(msg);
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 14, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 14, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=13)
	public void MandatoryCheckForCaste() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			String msg=masterdata.GetErrorMsgMethod();
			if(s2.contains("Please select caste"))
			{
				//System.out.println(msg);
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",15, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
				//System.out.println(msg);
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 15, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 15, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=14)
	public void MandatoryCheckForMaritalStatus() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			
			if(s2.contains("Please select marital status"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",16, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
		
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 16, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 16, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=15)
	public void MandatoryCheckForResidentCategory() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			
			if(s2.contains("Please select resident category"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",17, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
		
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 17, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 17, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=16)
	public void MandatoryCheckForEducationLevel() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			
			if(s2.contains("Please enter educational Level"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",18, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
		
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 18, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 18, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=17)
	public void MandatoryCheckForOccupation() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			
			if(s2.contains("Please select occupation"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",19, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
		
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 19, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 19, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=18)
	public void MandatoryCheckForLandOwner() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			
			if(s2.contains("Please select land owner"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",20, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
		
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 20, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 20, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
	@Test(priority=19)
	public void MandatoryCheckForAge() throws AWTException, InterruptedException
	{
JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		
		//masterdata.MembUploadPhotoMethod(driver);
		List<String> s2=masterdata.GetAllErrorLevelMsgMethod();
		Thread.sleep(4000);
		try {
			
			if(s2.contains("Age is required"))
			{
			
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status",21, "Pass");
				//masterdata.ClickOkMethod();
			}
			else
			{
		
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 21, "Fail");
				//masterdata.ClickOkMethod();
			}
			
		} catch (Exception e) {
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(FamilyMembDetails_Sheet, "Status", 21, "Can't Vallidate");
			System.out.println("Fail");
			//masterdata.ClickOkMethod();
			
		}	
	}
}
