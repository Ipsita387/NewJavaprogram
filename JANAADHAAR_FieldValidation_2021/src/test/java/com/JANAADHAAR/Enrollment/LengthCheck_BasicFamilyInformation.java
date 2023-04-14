package com.JANAADHAAR.Enrollment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.JANAADHAAR.GenericsLibrary.BaseTest;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_MasterModule;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_TestData;

public class LengthCheck_BasicFamilyInformation extends BaseTest implements JANAADHAAR_TestData
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
	public void MaxLengthCheckForPincode() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		 masterdata.FamilyAddressLogoClickMethod(driver);
		    Thread.sleep(2000);
		    masterdata.UnSelectDistrict();
		    Thread.sleep(2000);
		    masterdata.SaveFamilyInformationMethod();
		  masterdata.PincodeInvalidTextMethod();
		    Thread.sleep(2000);
		    masterdata.PincodeClearMethod();
		    Thread.sleep(2000);
		    masterdata.PincodeMaxLengthCheckMethod();
		    Thread.sleep(2000);
		    String msg=masterdata.PincodeGetTextMethod();
		    int Length=msg.length();
			
			
			if(Length == 6)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 50, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 50, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(msg, msg);
	}
	
	@Test(priority =2)
	public void MaxLengthCheckForHouseNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.HouseNoEngClearMethod();
		Thread.sleep(2000);
		masterdata.HouseNoEngMaxLengthMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.HouseNoGetTextMethod();
		    int Length=Text.length();
			
			
			if(Length == 30)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 51, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 51, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =3)
	public void MaxLengthCheckForStreetEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.StreetNameEngClearMethod();
		Thread.sleep(2000);
		masterdata.StreetNameEngMaxLengthMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.StreetNameEngGetTextMethod();
		    int Length=Text.length();
			
			
			if(Length == 30)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 52, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 52, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =4)
	public void MaxLengthCheckForPlaceEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.PlaceNameEngClearMethod();
		Thread.sleep(2000);
		masterdata.PlaceNameEngMaxLengthMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.PlaceNameEngGetTextMethod();
		    int Length=Text.length();
			
			
			if(Length == 30)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 53, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 53, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =5)
	public void MaxLengthCheckForLandmarkEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.LandmarkEngClearMethod();
		Thread.sleep(2000);
		masterdata.LandmarkEngMaxLengthMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.LandmarkNameEngGetTextMethod();
             int Length=Text.length();
			
			
			if(Length == 30)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 54, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 54, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =6)
	public void  MaxLengthCheckForDurationOfStay() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.DurationOfStayClearMethod();
		Thread.sleep(2000);
		masterdata.DurationOfStayMaxLengthMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.DurationOfStayGetTextMethod();
            int Length=Text.length();
			
			
			if(Length == 3)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 55, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 55, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =7)
	public void MinLengthCheckForTelephoneNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.PersonalTelephoneNoClearMethod();
		Thread.sleep(2000);
		masterdata.PersonalTelephoneNoMinLengthMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.PersonalTelephoneNoGetTextMethod();
          int Length=Text.length();
			
			
			if(Length == 11)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 56, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 56, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =8)
	public void MaxLengthCheckForTelephoneNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.PersonalTelephoneNoClearMethod();
		Thread.sleep(2000);
		masterdata.PersonalTelephoneNoMaxLengthMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.PersonalTelephoneNoGetTextMethod();
          int Length=Text.length();
          String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
	
			if(Length==14 || msg.equalsIgnoreCase("Please enter valid telephone number") )
			
		
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 57, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 57, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =9)
	public void MaxLengthCheckForElectricityBillNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.ClearFamilyIdentityDocument();
		Thread.sleep(2000);
		masterdata.EnterFamilyIdentityDocument();
		masterdata.ElectricityBillNoClearMethod();
		Thread.sleep(2000);
		masterdata.ElectricityBillNoMaxLengthMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.ElectricityBillNoGetTextMethod();
		    
        int Length=Text.length();
			
			
			if(Length == 30)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 58, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 58, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =10)
	public void MaxLengthCheckForWaterBillNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.ClearFamilyIdentityDocument();
		Thread.sleep(2000);
		masterdata.EnterFamilyIdentityDocument();
		masterdata.WaterBillNoClearMethod();
		Thread.sleep(2000);
		masterdata.WaterBillNoMaxLengthMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.WaterBillNoGetTextMethod();
            int Length=Text.length();
			
			
			if(Length == 30)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 59, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 59, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =10)
	public void MaxLengthCheckForGasConnectionNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.ClearFamilyIdentityDocument();
		Thread.sleep(2000);
		masterdata.EnterFamilyIdentityDocument();
		masterdata.GasConnectionNoClearMethod();
		Thread.sleep(2000);
		masterdata.GasConnectionNoMaxLengthMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.GasConnectionNoGetTextMethod();
              int Length=Text.length();
			
			
			if(Length == 20)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 60, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 60, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =11)
	public void MaxLengthCheckForBPLNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.ClearFamilyIdentityDocument();
		Thread.sleep(2000);
		masterdata.EnterFamilyIdentityDocument();
		masterdata.BPLNoClearMethod();
		Thread.sleep(2000);
		masterdata.BPLNoMaxLengthMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.BPLNoGetTextMethod();
            int Length=Text.length();
			
			
			if(Length == 30)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 61, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 61, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	}

