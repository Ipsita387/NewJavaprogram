package com.JANAADHAAR.Enrollment;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.JANAADHAAR.GenericsLibrary.BaseTest;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_MasterModule;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_TestData;

public class DropdownCheck_BasicFamilyInformation extends BaseTest implements JANAADHAAR_TestData 
{

	@Test(priority = 0)
	public void EnterBasicFamilyInformationScreen() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.SSOIDLogin();
		Thread.sleep(2000);
		masterdata.NewEnrollment();
			
	}
	@Test(priority =1)
	public void SelectedDataShouldBeDisplayedForDistrict() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.ClearFamilyIdentityDocument();
		Thread.sleep(2000);
		masterdata.EnterFamilyIdentityDocument();
		String s1=masterdata.GetNameOfDistrictMethod();
		 List<String> s2=masterdata.NameOfDistrictGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 62, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 62, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
	}
	@Test(priority =2)
	public void SelectedDataShouldBeDisplayedForCity() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.ClearFamilyIdentityDocument();
		Thread.sleep(2000);
		masterdata.EnterFamilyIdentityDocument();
		String s1=masterdata.GetNameOfCityMethod();
		 List<String> s2=masterdata.NameOfCityGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 63, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 63, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
	}
	@Test(priority =3)
	public void SelectedDataShouldBeDisplayedForWardNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.ClearFamilyIdentityDocument();
		Thread.sleep(2000);
		masterdata.EnterFamilyIdentityDocument();
		String s1=masterdata.GetNameOfWardMethod();
		 List<String> s2=masterdata.NameOfWardGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 64, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 64, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
	}
	@Test(priority =4)
	public void SelectedDataShouldBeDisplayedForCategoryOfHouse() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.ClearFamilyIdentityDocument();
		Thread.sleep(2000);
		masterdata.EnterFamilyIdentityDocument();
		String s1=masterdata.GetNameOfCategoryOfHouseMethod();
		 List<String> s2=masterdata.NameOfCategoryOfHouseGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 65, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 65, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
	}
	@Test(priority =5)
	public void SelectedDataShouldBeDisplayedForConditionOfHouse() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.ClearFamilyIdentityDocument();
		Thread.sleep(2000);
		masterdata.EnterFamilyIdentityDocument();
		String s1=masterdata.GetNameOfConditionOfHouseMethod();
		 List<String> s2=masterdata.NameOfConditionOfHouseGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 66, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 66, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
	}
	@Test(priority =6)
	public void SelectedDataShouldBeDisplayedForGasAgency() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.ClearFamilyIdentityDocument();
		Thread.sleep(2000);
		masterdata.EnterFamilyIdentityDocument();
		String s1=masterdata.GetNameOfGasAgencyMethod();
		 List<String> s2=masterdata.NameOfGasAgencyGetAllOptionsMethod();
		 if (s2.contains(s1))
		 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 67, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 67, "Fail");
				
			 }
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(s1, s1);
	}
}
