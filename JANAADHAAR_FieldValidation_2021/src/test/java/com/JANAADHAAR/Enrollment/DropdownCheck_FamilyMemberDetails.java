package com.JANAADHAAR.Enrollment;

import java.awt.AWTException;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.JANAADHAAR.GenericsLibrary.BaseTest;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_MasterModule;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_TestData;

public class DropdownCheck_FamilyMemberDetails extends BaseTest implements JANAADHAAR_TestData
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
	@Test(priority =1)
	public void SelectedDataShouldBeDisplayedForMemberGender() throws InterruptedException, AWTException
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
		String s1=masterdata.GetNameOfgenderMethod();
		 List<String> s2=masterdata.NameOfgenderGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyMembDetails_Sheet, "Status", 99, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyMembDetails_Sheet, "Status", 99, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
		
}
	@Test(priority =2)
	public void SelectedDataShouldBeDisplayedForCategoryOfFamily() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String s1=masterdata.GetNameOfCategoryOfFamilyMethod();
		 List<String> s2=masterdata.NameOfCategoryOfFamilyGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyMembDetails_Sheet, "Status", 100, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyMembDetails_Sheet, "Status", 100, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
		
}
	@Test(priority =3)
	public void SelectedDataShouldBeDisplayedForCaste() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String s1=masterdata.GetNameOfCasteOfFamilyMethod();
		 List<String> s2=masterdata.NameOfCasteGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyMembDetails_Sheet, "Status", 101, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyMembDetails_Sheet, "Status", 101, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
		
}
	@Test(priority =4)
	public void SelectedDataShouldBeDisplayedForMaritalStatus() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String s1=masterdata.GetNameOfMaritalStatusMethod();
		 List<String> s2=masterdata.NameOfMaritalStatusGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyMembDetails_Sheet, "Status", 102, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyMembDetails_Sheet, "Status", 102, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
		
}
	@Test(priority =5)
	public void SelectedDataShouldBeDisplayedForResidentCategory() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String s1=masterdata.GetNameOfResidentCategoryMethod();
		 List<String> s2=masterdata.NameOfResidentCategoryGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyMembDetails_Sheet, "Status", 103, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyMembDetails_Sheet, "Status", 103, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
		
}
	@Test(priority =6)
	public void SelectedDataShouldBeDisplayedForEducationLevel() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String s1=masterdata.GetNameOfEducationLevelMethod();
		 List<String> s2=masterdata.NameOfEducationLevelGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyMembDetails_Sheet, "Status", 104, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyMembDetails_Sheet, "Status", 104, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
		
}
	@Test(priority =7)
	public void SelectedDataShouldBeDisplayedForOccupation() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String s1=masterdata.GetNameOfOccupationMethod();
		 List<String> s2=masterdata.NameOfOccupationGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyMembDetails_Sheet, "Status", 105, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyMembDetails_Sheet, "Status", 105, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
		
}
	@Test(priority =8)
	public void SelectedDataShouldBeDisplayedForBankName() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String s1=masterdata.GetNameOfBankMethod();
		 List<String> s2=masterdata.NameOfBankGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyMembDetails_Sheet, "Status", 106, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyMembDetails_Sheet, "Status", 106, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
		
}
	@Test(priority =9)
	public void SelectedDataShouldBeDisplayedForBankDistrict() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String s1=masterdata.GetNameOfBankDistrictMethod();
		 List<String> s2=masterdata.NameOfBankDistrictGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyMembDetails_Sheet, "Status", 107, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyMembDetails_Sheet, "Status", 107, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
		
}
	@Test(priority =10)
	public void SelectedDataShouldBeDisplayedForBankIFSCCode() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String s1=masterdata.GetNameOfBankIFSCMethod();
		 List<String> s2=masterdata.NameOfBankIFSCGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyMembDetails_Sheet, "Status", 108, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyMembDetails_Sheet, "Status", 108, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
		
}
	@Test(priority =11)
	public void SelectedDataShouldBeDisplayedForLandOwner() throws InterruptedException, AWTException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		String s1=masterdata.GetNameOfLandOwnerMethod();
		 List<String> s2=masterdata.NameOfCategoryLandOwnerGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyMembDetails_Sheet, "Status", 109, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyMembDetails_Sheet, "Status", 109, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
		
}
}
