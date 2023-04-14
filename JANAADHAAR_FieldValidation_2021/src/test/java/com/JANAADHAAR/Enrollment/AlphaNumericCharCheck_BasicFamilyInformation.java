package com.JANAADHAAR.Enrollment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.JANAADHAAR.GenericsLibrary.BaseTest;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_MasterModule;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_TestData;

public class AlphaNumericCharCheck_BasicFamilyInformation extends BaseTest implements JANAADHAAR_TestData
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
	public void AlphabetsCharCheckForPincode() throws InterruptedException
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
		    masterdata.PincodeAlphabetsMethod();
		    Thread.sleep(2000);
		    String Text=masterdata.PincodeGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
				System.out.println(msg);
				Pattern special = Pattern.compile ("[a-zA-z]");
				Matcher matcher = special.matcher(Text);
				boolean constainsSpecial = matcher.find();
				
				
				if(constainsSpecial != true || msg.equalsIgnoreCase("Please enter pin code")|| msg.equalsIgnoreCase("Enter valid pin of 6 digit"))
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 39, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 39, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(msg, msg);
	}
	
	@Test(priority =2)
	public void AlphaNumericCharCheckForHouseNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.HouseNoEngClearMethod();
		Thread.sleep(2000);
		masterdata.HouseNoEngAlphaNumericMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.HouseNoGetTextMethod();
		    Pattern special = Pattern.compile ("[a-zA-Z0-9]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			
			
			if(constainsSpecial == true)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 40, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 40, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =3)
	public void AlphaNumericCharCheckForStreetEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.StreetNameEngClearMethod();
		Thread.sleep(2000);
		masterdata.StreetNameEngAlphaNumericMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.StreetNameEngGetTextMethod();
		    Pattern special = Pattern.compile ("[a-zA-Z0-9]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			
			
			if(constainsSpecial == true)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 41, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 41, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =4)
	public void AlphaNumericCharCheckForPlaceEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.PlaceNameEngClearMethod();
		Thread.sleep(2000);
		masterdata.PlaceNameEngAlphaNumericMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.PlaceNameEngGetTextMethod();
		    Pattern special = Pattern.compile ("[a-zA-Z0-9]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			
			
			if(constainsSpecial == true)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 42, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 42, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =5)
	public void AlphaNumericCharCheckForLandmarkEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.LandmarkEngClearMethod();
		Thread.sleep(2000);
		masterdata.LandmarkEngAlphaNumericMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.LandmarkNameEngGetTextMethod();
		    Pattern special = Pattern.compile ("[a-zA-Z0-9]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			
			
			if(constainsSpecial == true)
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 43, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 43, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =6)
	public void  AlphabetsCharCheckForDurationOfStay() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.DurationOfStayClearMethod();
		Thread.sleep(2000);
		masterdata.DurationOfStayAlphbetsMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.DurationOfStayGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
			    Pattern special = Pattern.compile ("[a-zA-z]");
				Matcher matcher = special.matcher(Text);
				boolean constainsSpecial = matcher.find();
			if(constainsSpecial != true|| msg.equalsIgnoreCase("Please enter number of years of stay") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 44, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 44, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =7)
	public void AlphabetsCharCheckForTelephoneNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.PersonalTelephoneNoClearMethod();
		Thread.sleep(2000);
		masterdata.PersonalTelephoneNoAlphabetsMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.PersonalTelephoneNoGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
			Pattern special = Pattern.compile ("[a-zA-z]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			if(constainsSpecial != true|| msg.equalsIgnoreCase("Please enter valid telephone number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 45, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 45, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =8)
	public void AlphanumericCharCheckForElectricityBillNo() throws InterruptedException
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
		masterdata.ElectricityBillNoAlphaNumericMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.ElectricityBillNoGetTextMethod();
		    
		    String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
			Pattern special = Pattern.compile ("[a-zA-Z0-9]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			if(constainsSpecial == true )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 46, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 46, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =9)
	public void AlphaNumericCharCheckForWaterBillNo() throws InterruptedException
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
		masterdata.WaterBillNoAlphaNumericMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.WaterBillNoGetTextMethod();
		    //String msg=masterdata.GetErrorMsgMethod();
		    //System.out.println(msg);
		    Pattern special = Pattern.compile ("[a-zA-Z0-9]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			if(constainsSpecial == true )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 47, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 47, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =10)
	public void AlphaNumericCharCheckForGasConnectionNo() throws InterruptedException
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
		masterdata.GasConnectionNoAlphaNumericMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.GasConnectionNoGetTextMethod();
		   // String msg=masterdata.GetErrorMsgMethod();
		    //System.out.println(msg);
		    Pattern special = Pattern.compile ("[a-zA-Z0-9]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
		    
			if(constainsSpecial == true )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 48, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 48, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	@Test(priority =11)
	public void AlphaNumericCharCheckForBPLNo() throws InterruptedException
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
		masterdata.BPLNoAlphaNumericMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.BPLNoGetTextMethod();
		    //String msg=masterdata.GetErrorMsgMethod();
		    //System.out.println(msg);
		    Pattern special = Pattern.compile ("[a-zA-Z0-9]");
			Matcher matcher = special.matcher(Text);
			boolean constainsSpecial = matcher.find();
			if(constainsSpecial == true )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 49, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 49, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	
	}

