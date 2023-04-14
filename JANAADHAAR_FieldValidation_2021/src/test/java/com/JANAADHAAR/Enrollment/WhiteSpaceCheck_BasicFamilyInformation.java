package com.JANAADHAAR.Enrollment;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.JANAADHAAR.GenericsLibrary.BaseTest;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_MasterModule;
import com.JANAADHAAR.ObjectRepository.JANAADHAAR_TestData;

public class WhiteSpaceCheck_BasicFamilyInformation extends BaseTest implements JANAADHAAR_TestData
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
	public void WhiteSpaceCheckInitialForPincode() throws InterruptedException
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
		    masterdata.PincodeWhiteSpaceInitialMethod();
		    Thread.sleep(2000);
		    String Text=masterdata.PincodeGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
				System.out.println(msg);
		
		    if(!Text.equals(WhiteSpaceInitial)|| msg.equalsIgnoreCase("Please enter pin code")|| msg.equalsIgnoreCase("Enter valid pin of 6 digit") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 17, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 17, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(msg, msg);
	}
	@Test(priority =2)
	public void WhiteSpaceCheckLastForPincode() throws InterruptedException
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
		    masterdata.PincodeWhiteSpaceLastMethod();
		    Thread.sleep(2000);
		    String Text=masterdata.PincodeGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
				System.out.println(msg);
		
		    if(!Text.equals(WhiteSpaceLast)|| msg.equalsIgnoreCase("Please enter pin code")|| msg.equalsIgnoreCase("Enter valid pin of 6 digit") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 18, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 18, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(msg, msg);
	}
	@Test(priority =3)
	public void WhiteSpaceCheckInitialForHouseNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.HouseNoEngClearMethod();
		Thread.sleep(2000);
		masterdata.HouseNoEngWhiteSpaceInitialMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.HouseNoGetTextMethod();
		    if(Text.equals(WhiteSpaceInitial))
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 19, "Fail");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 19, "Pass");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =4)
	public void WhiteSpaceCheckLastForHouseNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.HouseNoEngClearMethod();
		Thread.sleep(2000);
		masterdata.HouseNoEngWhiteSpaceLastMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.HouseNoGetTextMethod();
		    if(Text.equals(WhiteSpaceLast))
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 20, "Fail");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 20, "Pass");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =5)
	public void WhiteSpaceCheckInitialForStreetEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.StreetNameEngClearMethod();
		Thread.sleep(2000);
		masterdata.StreetNameEngWhiteSpaceInitialMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.StreetNameEngGetTextMethod();
		    if(Text.equals(WhiteSpaceInitial))
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 21, "Fail");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 21, "Pass");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =6)
	public void WhiteSpaceCheckLastForStreetEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.StreetNameEngClearMethod();
		Thread.sleep(2000);
		masterdata.StreetNameEngWhiteSpaceLastMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.StreetNameEngGetTextMethod();
		    if(Text.equals(WhiteSpaceLast))
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 22, "Fail");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 22, "Pass");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =6)
	public void WhiteSpaceCheckInitialForPlaceEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.PlaceNameEngClearMethod();
		Thread.sleep(2000);
		masterdata.PlaceNameEngWhiteSpaceInitialMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.PlaceNameEngGetTextMethod();
		    if(Text.equals(WhiteSpaceInitial))
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 23, "Fail");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 23, "Pass");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =7)
	public void WhiteSpaceCheckLastForPlaceEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.PlaceNameEngClearMethod();
		Thread.sleep(2000);
		masterdata.PlaceNameEngWhiteSpaceLastMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.PlaceNameEngGetTextMethod();
		    if(Text.equals(WhiteSpaceLast))
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 24, "Fail");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 24, "Pass");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =8)
	public void WhiteSpaceCheckInitialForLandmarkEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.LandmarkEngClearMethod();
		Thread.sleep(2000);
		masterdata.LandmarkEngWhiteSpaceInitialMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.LandmarkNameEngGetTextMethod();
		    if(Text.equals(WhiteSpaceInitial))
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 25, "Fail");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 25, "Pass");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =9)
	public void WhiteSpaceCheckLastForLandmarkEng() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.LandmarkEngClearMethod();
		Thread.sleep(2000);
		masterdata.LandmarkEngWhiteSpaceLastMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.LandmarkNameEngGetTextMethod();
		    if(Text.equals(WhiteSpaceLast))
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 26, "Fail");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 26, "Pass");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =10)
	public void WhiteSpaceCheckInitialForDurationOfStay() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.DurationOfStayClearMethod();
		Thread.sleep(2000);
		masterdata.DurationOfStayWhiteSpaceInitialMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.DurationOfStayGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
			if(!Text.equals(WhiteSpaceInitial)|| msg.equalsIgnoreCase("Please enter number of years of stay") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 27, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 27, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =11)
	public void WhiteSpaceCheckLastForDurationOfStay() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.DurationOfStayClearMethod();
		Thread.sleep(2000);
		masterdata.DurationOfStayWhiteSpaceLastMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.DurationOfStayGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
			if(!Text.equals(WhiteSpaceLast)|| msg.equalsIgnoreCase("Please enter number of years of stay") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 28, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 28, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =12)
	public void WhiteSpaceCheckInitialForTelephoneNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.PersonalTelephoneNoClearMethod();
		Thread.sleep(2000);
		masterdata.PersonalTelephoneNoWhiteSpaceInitialMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.PersonalTelephoneNoGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
			if(!Text.equals(WhiteSpaceInitial)|| msg.equalsIgnoreCase("Please enter valid telephone number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 29, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 29, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =13)
	public void WhiteSpaceCheckLastForTelephoneNo() throws InterruptedException
	{
		JANAADHAAR_MasterModule masterdata=new JANAADHAAR_MasterModule(driver);
		masterdata.ClearFamilyInformationUrban();
		masterdata.EnterFamilyInformationUrban();
		Thread.sleep(3000);
		masterdata.PersonalTelephoneNoClearMethod();
		Thread.sleep(2000);
		masterdata.PersonalTelephoneNoWhiteSpaceLastMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.PersonalTelephoneNoGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
			if(!Text.equals(WhiteSpaceLast)|| msg.equalsIgnoreCase("Please enter valid telephone number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 30, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 30, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =14)
	public void WhiteSpaceCheckInitialForElectricityBillNo() throws InterruptedException
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
		masterdata.ElectricityBillNoWhiteSpaceInitialMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.ElectricityBillNoGetTextMethod();
		    
		    String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
			if(!Text.equals(WhiteSpaceInitial)|| msg.equalsIgnoreCase("Please enter valid Bill number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 31, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 31, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =15)
	public void WhiteSpaceCheckLastForElectricityBillNo() throws InterruptedException
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
		masterdata.ElectricityBillNoWhiteSpaceLastMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.ElectricityBillNoGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
			System.out.println(msg);
			if(!Text.equals(WhiteSpaceLast)|| msg.equalsIgnoreCase("Please enter valid Bill number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 32, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 32, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =16)
	public void WhiteSpaceCheckInitialForWaterBillNo() throws InterruptedException
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
		masterdata.WaterBillNoWhiteSpaceInitialMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.WaterBillNoGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
		    System.out.println(msg);
			if(!Text.equals(WhiteSpaceInitial)|| msg.equalsIgnoreCase("Please enter valid Bill number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 33, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 33, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =17)
	public void WhiteSpaceCheckLastForWaterBillNo() throws InterruptedException
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
		masterdata.WaterBillNoWhiteSpaceLastMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.WaterBillNoGetTextMethod();
		    
		    String msg=masterdata.GetErrorMsgMethod();
		    System.out.println(msg);
			if(!Text.equals(WhiteSpaceLast)|| msg.equalsIgnoreCase("Please enter valid Bill number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 34, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 34, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =18)
	public void WhiteSpaceCheckInitialForGasConnectionNo() throws InterruptedException
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
		masterdata.GasConnectionNoWhiteSpaceInitialMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.GasConnectionNoGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
		    System.out.println(msg);
			if(!Text.equals(WhiteSpaceInitial)|| msg.equalsIgnoreCase("Please enter valid Gas Connection number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 35, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 35, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =19)
	public void WhiteSpaceCheckLastForGasConnectionNo() throws InterruptedException
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
		masterdata.GasConnectionNoWhiteSpaceLastMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.GasConnectionNoGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
		    System.out.println(msg);
			if(!Text.equals(WhiteSpaceLast)|| msg.equalsIgnoreCase("Please enter valid Gas Connection number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 36, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 36, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =18)
	public void WhiteSpaceCheckInitialForBPLNo() throws InterruptedException
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
		masterdata.BPLNoWhiteSpaceInitialMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.BPLNoGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
		    System.out.println(msg);
			if(!Text.equals(WhiteSpaceInitial)|| msg.equalsIgnoreCase("Please enter valid BPL number") )
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 37, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 37, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	@Test(priority =19)
	public void WhiteSpaceCheckLastForBPLNo() throws InterruptedException
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
		masterdata.BPLNoWhiteSpaceLastMethod();
		 Thread.sleep(2000);
		    String Text=masterdata.BPLNoGetTextMethod();
		    String msg=masterdata.GetErrorMsgMethod();
		    System.out.println(msg);
			if(!Text.equals(WhiteSpaceLast)|| msg.equalsIgnoreCase("Please enter valid BPL number") )
			 
			 {
				
				fileone.setCellData(FamilyInformation_Sheet, "Status", 38, "Pass");
				
			 }
			
			 else
			 {
				 fileone.setCellData(FamilyInformation_Sheet, "Status", 38, "Fail");
				
			 }	
			 
			 SoftAssert softAssert = new SoftAssert();
			 softAssert.assertEquals(Text, Text);
	}
	}

