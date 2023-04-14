package com.JANAADHAAR.Enrollment;

import java.util.regex.*;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.JANAADHAAR.GenericsLibrary.BaseTest;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_MasterModule;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_TestData;

public class SpecialCharCheck_BasicFamilyInformation extends BaseTest implements JANAADHAAR_TestData
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
	public void SpecialCharCheckForPincode() throws InterruptedException
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
		    masterdata.PincodeSpecialCharMethod();
		    Thread.sleep(2000);
		    String Text=masterdata.PincodeGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
				System.out.println(msg);
				Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
				Matcher matcher = special.matcher(Text);
				boolean constainsSpecial = matcher.find();
				
				
				if(constainsSpecial != true || msg.equalsIgnoreCase("Please enter pin code")|| msg.equalsIgnoreCase("Enter valid pin of 6 digit"))
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 6, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 6, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(msg, msg);
	}
	
	@Test(priority =2)
	public void SpecialCharCheckForHouseNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.HouseNoEngClearMethod();
		Thread.sleep(2000);
		masterdata.HouseNoEngSpecialCharMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.HouseNoGetTextMethod();
		    Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			
			
			if(constainsSpecial == true)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 7, "Fail");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 7, "Pass");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =3)
	public void SpecialCharCheckForStreetEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.StreetNameEngClearMethod();
		Thread.sleep(2000);
		masterdata.StreetNameEngSpecialCharMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.StreetNameEngGetTextMethod();
		    Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			
			
			if(constainsSpecial == true)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 8, "Fail");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 8, "Pass");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =4)
	public void SpecialCharCheckForPlaceEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.PlaceNameEngClearMethod();
		Thread.sleep(2000);
		masterdata.PlaceNameEngSpecialCharMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.PlaceNameEngGetTextMethod();
		    Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			
			
			if(constainsSpecial == true)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 9, "Fail");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 9, "Pass");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =5)
	public void SpecialCharCheckForLandmarkEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.LandmarkEngClearMethod();
		Thread.sleep(2000);
		masterdata.LandmarkEngSpecialCharMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.LandmarkNameEngGetTextMethod();
		    Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			
			
			if(constainsSpecial == true)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 10, "Fail");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 10, "Pass");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =6)
	public void SpecialCharCheckForDurationOfStay() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.DurationOfStayClearMethod();
		Thread.sleep(2000);
		masterdata.DurationOfStaySpecialCharMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.DurationOfStayGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
			    Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
				Matcher matcher = special.matcher(Text);
				boolean constainsSpecial = matcher.find();
			if(constainsSpecial != true|| msg.equalsIgnoreCase("Please enter number of years of stay") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 11, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 11, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =7)
	public void SpecialCharCheckForTelephoneNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.PersonalTelephoneNoClearMethod();
		Thread.sleep(2000);
		masterdata.PersonalTelephoneNoSpecialCharMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.PersonalTelephoneNoGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
			Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			if(constainsSpecial != true|| msg.equalsIgnoreCase("Please enter valid telephone number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 12, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 12, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =8)
	public void SpecialCharCheckForElectricityBillNo() throws InterruptedException
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
		masterdata.ElectricityBillNoSpecialCharMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.ElectricityBillNoGetTextMethod();
		    
		    String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
			Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			if(constainsSpecial != true|| msg.equalsIgnoreCase("Please enter valid Bill number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 13, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 13, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =9)
	public void SpecialCharCheckForWaterBillNo() throws InterruptedException
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
		masterdata.WaterBillNoSpecialCharMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.WaterBillNoGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
		    System.out.println(msg);
		    Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			if(constainsSpecial != true|| msg.equalsIgnoreCase("Please enter valid Bill number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 14, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 14, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =10)
	public void SpecialCharCheckForGasConnectionNo() throws InterruptedException
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
		masterdata.GasConnectionNoSpecialCharMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.GasConnectionNoGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
		    System.out.println(msg);
		    Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
		    
			if(constainsSpecial != true|| msg.equalsIgnoreCase("Please enter valid Gas Connection number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 15, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 15, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =11)
	public void SpecialCharCheckForBPLNo() throws InterruptedException
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
		masterdata.BPLNoSpecialCharMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.BPLNoGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
		    System.out.println(msg);
		    Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			if(constainsSpecial != true|| msg.equalsIgnoreCase("Please enter valid BPL number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 16, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 16, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	}

