package com.JANAADHAAR.ObjectRepository;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.JANAADHAAR.GenericsLibrary.AutoConstant;
import com.JANAADHAAR.GenericsLibrary.BasePage;



public class  JANAADHAAR_MasterModule extends BasePage implements AutoConstant, JANAADHAAR_TestData
{

	
@FindBy(id = "userName")
private WebElement Username_SSO_ID;
@FindBy(id="vchPassword")
private WebElement Password_SSO_ID;
@FindBy(id="loginCaptchaImg")
private WebElement Captche;
@FindBy(id="txtLoginCaptcha")
private WebElement CaptcheTextField;

@FindBy(xpath="//a[.='Log in']")
private WebElement LoginLink;


public void SSOIDLogin()
{
	Username_SSO_ID.sendKeys(UserName);
	Password_SSO_ID.sendKeys(Password);
String text= CaptcheText();
CaptcheTextField.sendKeys(text);
LoginLink.click();
}
public String CaptcheText()
{
	String Captchetext=Captche.getText();
	return Captchetext;
}
 @FindBy(id="g61")
 private WebElement EnrollmentLink;
 @FindBy(id="p632")
 private WebElement NewEnrollmentLink;
 @FindBy(id="agree")
 private WebElement AcceptCheckbox;
 @FindBy (xpath="//button[.='Submit']")
 private WebElement SubmitLink;
 @FindBy(xpath="//button[.='Submit (New Flow)']")
	private WebElement SubmitNewFlowLink;
 public void NewEnrollment()
 {
	 EnrollmentLink.click();
	 NewEnrollmentLink.click();
	 AcceptCheckbox.click();
	 SubmitLink.click();
 }
//*************** Basic Family Information Input field ******************//
 
	@FindBy(id="belongsToRuralArea1")
	private WebElement RadioButtonYesRuralArea;
	@FindBy(id="belongsToRuralArea2")
	private WebElement RadioButtonNoRuralArea;
	@FindBy(id="totalFamilyNumber")
	private WebElement TotalFamilyNumberTextField;
	@FindBy(id="district")
	private WebElement DistrictDropdown;
	@FindBy(id="city")
	private WebElement CityDropdown;
	@FindBy(id="ward")
	private WebElement WardDropdown;
	@FindBy(id="block")
	private WebElement BlockDropdown;
	@FindBy(id="gram_panchayat")
	private WebElement GramPanchayatDropdown;
	@FindBy(id="village")
	private WebElement VillageDropdown;
	@FindBy(id="categoryOfHouse")
	private WebElement CategoryHouseDropdown;
	@FindBy(id="conditionOfHouse")
	private WebElement ConditionHouseDropdown;
	
	@FindBy(id="house_no_english")
	private WebElement HouseNoEngTextField;
	@FindBy(id="street_name_english")
	private WebElement StreetNameEngTextField;
	@FindBy(id="street_name_hindi")
	private WebElement StreetNameHindiTextField;      ////label[.='Street (In Hindi) ']/../..//li[@value='0']
	@FindBy(xpath="//label[.='Street (In Hindi) ']/../..//li[@value='0']")
	private WebElement SelectStreetNameHindiTextField;
	@FindBy(id="place_name_english")
	private WebElement PlaceNameEngTextField;
	@FindBy(id="place_name_hindi")
	private WebElement PlaceNameHindiTextField;
	@FindBy(xpath="//label[.='Place (In Hindi)']/../..//li[@value='0']")
	private WebElement SelectPlaceNameHindiTextField;
	
	@FindBy(id="landmark_eng")
	private WebElement LandmarkEngTextField;
	@FindBy(id="landmark_hindi")
	private WebElement LandmarkHindiTextField;
	@FindBy(xpath="//label[.='Landmark (In Hindi) ']/../..//li[@value='0']")
	private WebElement SelectLandmarkNameHindiTextField;
	
	@FindBy (id="pinCode")
	private WebElement PincodeTextField;
	@FindBy (id="duration_of_stay")
	private WebElement DurationOfStayTextField;
	@FindBy (id="telephoneNumber")                       ////legend[.='Family Address']
	private WebElement PersonalTelephoneNoTextField;
	@FindBy(id="btnSubmitFamilyInformation")
	private WebElement SaveLinkForFamilyInformation;
	@FindBy(xpath="//button[.='OK']")
	private WebElement OkLink;
	@FindBy(xpath = "//div[@class='invalid-feedback']")
	private WebElement ErrorStr;
	@FindBy(xpath = "//div[@class='invalid-feedback']")
	private List<WebElement> ErrorStrAll;
	@FindBy (xpath="//legend[.='Family Address']")
	private WebElement FamilyAddressLogo;
	@FindBy (xpath="//legend[.='Personal Details']")
	private WebElement PersonalDetailsLogo;
	@FindBy(id="electricityBillNo")
	private WebElement ElectricityBillNoTextField;
	@FindBy(id="wateBillNo")
	private WebElement WaterBillNoTextField;
	@FindBy(id="nameOfGasAgency")
	private WebElement GasAgencyDropdown;
	@FindBy(id="gasConnectionNo")
	private WebElement GasConnectionNoTextField;
	@FindBy(id="bplNo")
	private WebElement BPLNoTextField;
	@FindBy(id="typeOfRationCard")
	private WebElement RationCardType;
	@FindBy(id="rationCardNumber")
	private WebElement RationCardNoTextfield;
	@FindBy(id="ssppo")
	private WebElement SSPPONoTextField;
	
	
	//*************Generate Random AlphaNumeric string********************//
		public String GenerateRandomAlphaNumeric(int targetStringLength)
		{
			String SOURCE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				      + "abcdefghijklmnopqrstuvwxyz";
			StringBuilder sb = new StringBuilder(targetStringLength); 
			SecureRandom secureRnd = new SecureRandom();
			for (int i = 0; i < targetStringLength; i++)
				sb.append(SOURCE.charAt(secureRnd.nextInt(SOURCE.length()))); 
			return sb.toString();	
		}
	
	public void PersonalDetailsLogoClickMethod()
	{
		PersonalDetailsLogo.click();
	}
	
	public void FamilyAddressLogoClickMethod(WebDriver driver)
	{
		ScrolltoView(driver, FamilyAddressLogo);
		FamilyAddressLogo.click();
	}
	public void RadioButtonYesRuralAreaMethod()
	{
		RadioButtonYesRuralArea.click();
	}
	public void RadioButtonNoRuralAreaMethod()
	{
		RadioButtonNoRuralArea.click();
	}
	
	public void SelectDistrict()
    {
	selectbyvisibletext(DistrictDropdown, District);
    }
	public void SelectCity()
    {
	selectbyvisibletext(CityDropdown, City);
    }
	public void SelectWard()
    {
	selectbyindex(WardDropdown, 1);
    }
    public void SelectBlock()
    {
	selectbyindex(BlockDropdown,1);
    }
    public void SelectGramPanchayat()
    {
	selectbyindex(GramPanchayatDropdown,1);
    }
    public void SelectVillage()
    {
	selectbyindex(VillageDropdown,1);
    }
    public void SelectCategoryHouse()
    {
	selectbyindex(CategoryHouseDropdown,1);
    }
    public void SelectConditionHouse()
    {
	selectbyindex(ConditionHouseDropdown,1);
    }
    public void UnSelectDistrict()
    {
	selectbyvisibletext(DistrictDropdown, Unselect);
    }
    public void UnSelectCity()
    {
	selectbyvisibletext(CityDropdown, Unselect);
    }
    public void UnSelectWard()
    {
	selectbyvisibletext(WardDropdown, Unselect);
    }
    public void UnSelectBlock()
    {
    	selectbyvisibletext(BlockDropdown,Unselect);
    }
    public void UnSelectGramPanchayat()
    {
    	selectbyvisibletext(GramPanchayatDropdown,Unselect);
    }
    public void UnSelectVillage()
    {
    	selectbyvisibletext(VillageDropdown,Unselect);
    }
    public void UnSelectCategoryHouse()
    {
    	selectbyvisibletext(CategoryHouseDropdown,Unselect);
    }
    public void UnSelectConditionHouse()
    {
    	selectbyvisibletext(ConditionHouseDropdown,Unselect);
    }
    
    public void HouseNoEngTextMethod()
	{
    	HouseNoEngTextField.sendKeys(HouseNoEng);
	}
	public void HouseNoEngClearMethod()
	{
		HouseNoEngTextField.clear();
	}
	
		public void StreetNameEngTextMethod()
		{
			StreetNameEngTextField.sendKeys(StreetNameEng);
		}
		public void StreetNameEngClearMethod()
		{
			StreetNameEngTextField.clear();
		}
		public void StreetNameHindiTextMethod()
		{
			StreetNameHindiTextField.sendKeys(StreetNameHindi);
		}
		public void StreetNameHindiClearMethod()
		{
			StreetNameHindiTextField.clear();
		}
		public void PlaceNameEngTextMethod()
		{
			PlaceNameEngTextField.sendKeys(PlaceNameEng);
		}
		public void PlaceNameEngClearMethod()
		{
			PlaceNameEngTextField.clear();
		}
		public void PlaceNameHindiTextMethod()
		{
			PlaceNameHindiTextField.sendKeys(PlaceNameHindi);
		}
		public void PlaceNameHindiClearMethod()
		{
			PlaceNameHindiTextField.clear();
		}
		public void LandmarkEngTextMethod()
		{
			LandmarkEngTextField.sendKeys(LandmarkEng);
		}
		public void LandmarkEngClearMethod()
		{
			LandmarkEngTextField.clear();
		}
		public void LandmarkHindiTextMethod()
		{
			LandmarkHindiTextField.sendKeys(LandmarkHindi);
		}
		public void LandmarkHindiClearMethod()
		{
			LandmarkHindiTextField.clear();
		}
		public void PincodeTextMethod()
		{
			PincodeTextField.sendKeys(Pincode);
		}
		public void PincodeInvalidTextMethod() throws InterruptedException
		{
			PincodeTextField.sendKeys("8");
			Thread.sleep(2000);
		}
		public void PincodeClearMethod()
		{
			PincodeTextField.clear();
		}
		public void DurationOfStayTextMethod()
		{
			DurationOfStayTextField.sendKeys(DurationOfStay);
		}
		public void ElectricityBillNoClearMethod()
		{
			ElectricityBillNoTextField.clear();
		}
		public void WaterBillNoClearMethod()
		{
	          WaterBillNoTextField.clear();
		}
		public void GasConnectionNoClearMethod()
		{
	          GasConnectionNoTextField.clear();
		}
		public void BPLNoClearMethod()
		{
	          BPLNoTextField.clear();
		}
		public void DurationOfStayClearMethod()
		{
			DurationOfStayTextField.clear();
		}
		
		public void PersonalTelephoneNoTextMethod()
		{
			PersonalTelephoneNoTextField.sendKeys(TelephoneNo);
		}
		public void PersonalTelephoneNoClearMethod()
		{
			PersonalTelephoneNoTextField.clear();
		}
		 public String PincodeGetTextMethod()
			{
				String Pin = PincodeTextField.getAttribute("value");
				return Pin;
			}
		 public String HouseNoGetTextMethod()
			{
				String Text =HouseNoEngTextField.getAttribute("value");
				return Text;
			}
		 public String StreetNameEngGetTextMethod()
			{
				String Text =StreetNameEngTextField.getAttribute("value");
				return Text;
			}
		 public String PlaceNameEngGetTextMethod()
			{
				String Text =PlaceNameEngTextField.getAttribute("value");
				return Text;
			}
		 public String ElectricityBillNoGetTextMethod()
			{
				String Text =ElectricityBillNoTextField.getAttribute("value");
				return Text;
			}
		 public String WaterBillNoGetTextMethod()
			{
				String Text =WaterBillNoTextField.getAttribute("value");
				return Text;
			}
		 public String GasConnectionNoGetTextMethod()
			{
				String Text =GasConnectionNoTextField.getAttribute("value");
				return Text;
			}
		 public String BPLNoGetTextMethod()
			{
				String Text =BPLNoTextField.getAttribute("value");
				return Text;
			}
		 public String DurationOfStayGetTextMethod()
			{
				String Text =DurationOfStayTextField.getAttribute("value");
				return Text;
			}
		 public String LandmarkNameEngGetTextMethod()
			{
				String Text =LandmarkEngTextField.getAttribute("value");
				return Text;
			}
			public String PersonalTelephoneNoGetTextMethod()
			{
				String TelephoneNo = PersonalTelephoneNoTextField.getAttribute("value");
				return TelephoneNo;
			}
			public void SaveFamilyInformationMethod()
			{
				SaveLinkForFamilyInformation.click();
			}
			public void ClickOkMethod()
			{
				OkLink.click();
			}
			public String GetErrorMsgMethod()
			 {
				String ActualStr=ErrorStr.getText();
				return ActualStr;
			 }
			public void TotalFamilyNumberTextMethod()
			{
				TotalFamilyNumberTextField.sendKeys(FamilyMembersCount);
			}
			public void TotalFamilyNumberClearMethod()
			{
				TotalFamilyNumberTextField.clear();
			}
//			public String TotalFamilyNumberGetTextMethod()
//			{
//				String TotalFamilyNumber =TotalFamilyNumberTextField.getAttribute("value");
//				return TotalFamilyNumber;
//			}
				public void EnterFamilyInformationUrban() throws InterruptedException
				{
					//TotalFamilyNumberTextField.sendKeys(FamilyMembersCount);
					PincodeTextField.sendKeys(Pincode);
					Thread.sleep(2000);
					selectbyvalue(DistrictDropdown, "12");
					Thread.sleep(2000);
					selectbyvalue(CityDropdown, "194");
					Thread.sleep(2000);
					selectbyindex(WardDropdown, 1);
					Thread.sleep(2000);
					selectbyindex(CategoryHouseDropdown,1);
					Thread.sleep(2000);
					selectbyindex(ConditionHouseDropdown,1);
					HouseNoEngTextField.sendKeys(HouseNoEng);
					StreetNameEngTextField.sendKeys(StreetNameEng);
					Thread.sleep(4000);
					StreetNameHindiTextField.sendKeys(StreetNameHindi);
					Thread.sleep(4000);
					SelectStreetNameHindiTextField.click();
					LandmarkEngTextField.sendKeys(LandmarkEng);
					Thread.sleep(4000);
					LandmarkHindiTextField.sendKeys(LandmarkHindi);
					Thread.sleep(4000);
					SelectLandmarkNameHindiTextField.click();
					PlaceNameEngTextField.sendKeys(PlaceNameEng);
					Thread.sleep(4000);
					PlaceNameHindiTextField.sendKeys(PlaceNameHindi);
					Thread.sleep(4000);
					SelectPlaceNameHindiTextField.click();
					DurationOfStayTextField.sendKeys(DurationOfStay);
					PersonalTelephoneNoTextField.sendKeys(LandlineNo);
				}
				public void ClearFamilyInformationUrban() throws InterruptedException
				{
					//TotalFamilyNumberTextField.sendKeys(FamilyMembersCount);
					Thread.sleep(10000);
					PincodeTextField.clear();
					Thread.sleep(4000);
					selectbyvisibletext(DistrictDropdown, Unselect);
					Thread.sleep(2000);
					selectbyvisibletext(CityDropdown, Unselect);
					Thread.sleep(2000);
					selectbyvisibletext(WardDropdown,Unselect);
					Thread.sleep(2000);
					selectbyvisibletext(CategoryHouseDropdown,Unselect);
					Thread.sleep(4000);
					selectbyvisibletext(ConditionHouseDropdown,Unselect);
					HouseNoEngTextField.clear();
					Thread.sleep(2000);
					StreetNameEngTextField.clear();
					Thread.sleep(2000);
					StreetNameHindiTextField.clear();
					Thread.sleep(2000);
					LandmarkEngTextField.clear();
					Thread.sleep(2000);
					LandmarkHindiTextField.clear();
					Thread.sleep(2000);
					PlaceNameEngTextField.clear();
					Thread.sleep(2000);
					PlaceNameHindiTextField.clear();
					DurationOfStayTextField.clear();
					Thread.sleep(2000);
					PersonalTelephoneNoTextField.clear();
					Thread.sleep(2000);
					
				}
				public List<String> GetAllErrorLevelMsgMethod()
				{
					//List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : ErrorStrAll) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public void EnterFamilyIdentityDocument() throws InterruptedException
				{
				ElectricityBillNoTextField.sendKeys(ElectricityBillNo);
				Thread.sleep(2000);
				WaterBillNoTextField.sendKeys(WaterBillNo);
				Thread.sleep(2000);
				selectbyvisibletext(GasAgencyDropdown, GasAgencyName);
				Thread.sleep(2000);
				GasConnectionNoTextField.sendKeys(GasConnectionNo);
				Thread.sleep(2000);
				BPLNoTextField.sendKeys(BPLNumber);
				}
				public void ClearFamilyIdentityDocument() throws InterruptedException
				{
				ElectricityBillNoTextField.clear();
				Thread.sleep(2000);
				WaterBillNoTextField.clear();
				Thread.sleep(2000);
				selectbyvisibletext(GasAgencyDropdown, Unselect);
				Thread.sleep(2000);
				GasConnectionNoTextField.clear();
				Thread.sleep(2000);
				BPLNoTextField.clear();
				}
				//********************** Basic Family Details White Space  ***************************//	
				public void HouseNoEngWhiteSpaceInitialMethod()
				{
					HouseNoEngTextField.sendKeys(WhiteSpaceInitial);
				}
				public void HouseNoEngWhiteSpaceLastMethod()
				{
					HouseNoEngTextField.sendKeys(WhiteSpaceLast);
				}
				public void StreetNameEngWhiteSpaceInitialMethod()
				{
					StreetNameEngTextField.sendKeys(WhiteSpaceInitial);
				}	
				public void StreetNameEngWhiteSpaceLastMethod()
				{
					StreetNameEngTextField.sendKeys(WhiteSpaceLast);
				}
				
				public void PlaceNameEngWhiteSpaceInitialMethod()
				{
					PlaceNameEngTextField.sendKeys(WhiteSpaceInitial);
				}
				public void PlaceNameEngWhiteSpaceLastMethod()
				{
					PlaceNameEngTextField.sendKeys(WhiteSpaceLast);
				}	
				
				public void LandmarkEngWhiteSpaceInitialMethod()
				{
					LandmarkEngTextField.sendKeys(WhiteSpaceInitial);
				}
				public void LandmarkEngWhiteSpaceLastMethod()
				{
					LandmarkEngTextField.sendKeys(WhiteSpaceLast);
				}
				
				public void PincodeWhiteSpaceInitialMethod()
				{
					PincodeTextField.sendKeys(WhiteSpaceInitial);
				}	
				public void PincodeWhiteSpaceLastMethod()
				{
					PincodeTextField.sendKeys(WhiteSpaceLast);
				}
				public void DurationOfStayWhiteSpaceInitialMethod()
				{
					DurationOfStayTextField.sendKeys(WhiteSpaceInitial);
				}	
				public void DurationOfStayWhiteSpaceLastMethod()
				{
					DurationOfStayTextField.sendKeys(WhiteSpaceLast);
				}
				public void PersonalTelephoneNoWhiteSpaceInitialMethod()
				{
					PersonalTelephoneNoTextField.sendKeys(WhiteSpaceInitial);
				}
				public void PersonalTelephoneNoWhiteSpaceLastMethod()
				{
					PersonalTelephoneNoTextField.sendKeys(WhiteSpaceLast);
				}
				public void ElectricityBillNoWhiteSpaceInitialMethod()
				{
					ElectricityBillNoTextField.sendKeys(WhiteSpaceInitial);
				}
				public void ElectricityBillNoWhiteSpaceLastMethod()
				{
					ElectricityBillNoTextField.sendKeys(WhiteSpaceLast);
				}
				public void WaterBillNoWhiteSpaceInitialMethod()
				{
					WaterBillNoTextField.sendKeys(WhiteSpaceInitial);
				}
				public void WaterBillNoWhiteSpaceLastMethod()
				{
					WaterBillNoTextField.sendKeys(WhiteSpaceLast);
				}
				public void GasConnectionNoWhiteSpaceInitialMethod()
				{
					GasConnectionNoTextField.sendKeys(WhiteSpaceInitial);
				}
				public void GasConnectionNoWhiteSpaceLastMethod()
				{
					GasConnectionNoTextField.sendKeys(WhiteSpaceLast);
				}
				public void BPLNoWhiteSpaceInitialMethod()
				{
					BPLNoTextField.sendKeys(WhiteSpaceInitial);
				}
				public void BPLNoWhiteSpaceLastMethod()
				{
					BPLNoTextField.sendKeys(WhiteSpaceLast);
				}
				//********************** Basic Family Details Special/SQL Char  ***************************//	
				public void HouseNoEngSpecialCharMethod()
				{
					HouseNoEngTextField.sendKeys(SpecialCharInitialAlpha);
				}
	
				public void StreetNameEngSpecialCharMethod()
				{
					StreetNameEngTextField.sendKeys(SpecialCharInitialAlpha);
				}
				
				public void PlaceNameEngSpecialCharMethod()
				{
					PlaceNameEngTextField.sendKeys(SpecialCharInitialAlpha);
				}	
				
				public void LandmarkEngSpecialCharMethod()
				{
					LandmarkEngTextField.sendKeys(SpecialCharInitialAlpha);
				}
				
				public void PincodeSpecialCharMethod()
				{
					PincodeTextField.sendKeys(SpecialCharInitialAlpha);
				}
				public void DurationOfStaySpecialCharMethod()
				{
					DurationOfStayTextField.sendKeys(SpecialCharInitialAlpha);
				}	
				public void PersonalTelephoneNoSpecialCharMethod()
				{
					PersonalTelephoneNoTextField.sendKeys(SpecialCharInitialAlpha);
				}
				public void ElectricityBillNoSpecialCharMethod()
				{
					ElectricityBillNoTextField.sendKeys(SpecialCharInitialAlpha);
				}
		
				public void WaterBillNoSpecialCharMethod()
				{
					WaterBillNoTextField.sendKeys(SpecialCharInitialAlpha);
				}
				public void GasConnectionNoSpecialCharMethod()
				{
					GasConnectionNoTextField.sendKeys(SpecialCharInitialAlpha);
				}
		
				public void BPLNoSpecialCharMethod()
				{
					BPLNoTextField.sendKeys(SpecialCharInitialAlpha);
				}
				
				//********************** Basic Family Details Alphanumeric Char  ***************************//	
				public void HouseNoEngAlphaNumericMethod()
				{
					HouseNoEngTextField.sendKeys(AlphaNumeric);
				}

				public void StreetNameEngAlphaNumericMethod()
				{
					StreetNameEngTextField.sendKeys(AlphaNumeric);
				}
				
				public void PlaceNameEngAlphaNumericMethod()
				{
					PlaceNameEngTextField.sendKeys(AlphaNumeric);
				}	
				
				public void LandmarkEngAlphaNumericMethod()
				{
					LandmarkEngTextField.sendKeys(AlphaNumeric);
				}
				
				public void PincodeAlphabetsMethod()
				{
					PincodeTextField.sendKeys(Alphabets);
				}
				public void DurationOfStayAlphbetsMethod()
				{
					DurationOfStayTextField.sendKeys(Alphabets);
				}	
				public void PersonalTelephoneNoAlphabetsMethod()
				{
					PersonalTelephoneNoTextField.sendKeys(Alphabets);
				}
				public void ElectricityBillNoAlphaNumericMethod()
				{
					ElectricityBillNoTextField.sendKeys(AlphaNumeric);
				}

				public void WaterBillNoAlphaNumericMethod()
				{
					WaterBillNoTextField.sendKeys(AlphaNumeric);
				}
				public void GasConnectionNoAlphaNumericMethod()
				{
					GasConnectionNoTextField.sendKeys(AlphaNumeric);
				}

				public void BPLNoAlphaNumericMethod()
				{
					BPLNoTextField.sendKeys(AlphaNumeric);
				}
				//********************** Basic Family Details MaxLength Char  ***************************//	
				public void HouseNoEngMaxLengthMethod()
				{
					HouseNoEngTextField.sendKeys(GenerateRandomAlphaNumeric(40));
				}

				public void StreetNameEngMaxLengthMethod()
				{
					StreetNameEngTextField.sendKeys(GenerateRandomAlphaNumeric(40));
				}
				
				public void PlaceNameEngMaxLengthMethod()
				{
					PlaceNameEngTextField.sendKeys(GenerateRandomAlphaNumeric(40));
				}	
				
				public void LandmarkEngMaxLengthMethod()
				{
					LandmarkEngTextField.sendKeys(GenerateRandomAlphaNumeric(40));
				}
				
				public void PincodeMaxLengthCheckMethod()
				{
					PincodeTextField.sendKeys(MoreThan6);
				}
				public void DurationOfStayMaxLengthMethod()
				{
					DurationOfStayTextField.sendKeys(MoreThan6);
				}
				public void PersonalTelephoneNoMinLengthMethod()
				{
					PersonalTelephoneNoTextField.sendKeys(LandlineNo);
				}
				public void PersonalTelephoneNoMaxLengthMethod()
				{
					PersonalTelephoneNoTextField.sendKeys(MoreThan12);
				}
				public void ElectricityBillNoMaxLengthMethod()
				{
					ElectricityBillNoTextField.sendKeys(GenerateRandomAlphaNumeric(40));
				}

				public void WaterBillNoMaxLengthMethod()
				{
					WaterBillNoTextField.sendKeys(GenerateRandomAlphaNumeric(40));
				}
				public void GasConnectionNoMaxLengthMethod()
				{
					GasConnectionNoTextField.sendKeys(GenerateRandomAlphaNumeric(40));
				}

				public void BPLNoMaxLengthMethod()
				{
					BPLNoTextField.sendKeys(GenerateRandomAlphaNumeric(40));
				}
				//********************** Basic Family Details Dropdown Check  ***************************//	
				public String GetNameOfDistrictMethod()
				{
					String s=selectedText(DistrictDropdown);
			    	return s;
				}
				public List<String> NameOfDistrictGetAllOptionsMethod()
				{
					Select sel = new Select(DistrictDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfCityMethod()
				{
					String s=selectedText(CityDropdown);
			    	return s;
				}
				public List<String> NameOfCityGetAllOptionsMethod()
				{
					Select sel = new Select(CityDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfWardMethod()
				{
					String s=selectedText(WardDropdown);
			    	return s;
				}
				public List<String> NameOfWardGetAllOptionsMethod()
				{
					Select sel = new Select(WardDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfCategoryOfHouseMethod()
				{
					String s=selectedText(CategoryHouseDropdown);
			    	return s;
				}
				public List<String> NameOfCategoryOfHouseGetAllOptionsMethod()
				{
					Select sel = new Select(CategoryHouseDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfConditionOfHouseMethod()
				{
					String s=selectedText(ConditionHouseDropdown);
			    	return s;
				}
				public List<String> NameOfConditionOfHouseGetAllOptionsMethod()
				{
					Select sel = new Select(ConditionHouseDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfGasAgencyMethod()
				{
					String s=selectedText(GasAgencyDropdown);
			    	return s;
				}
				public List<String> NameOfGasAgencyGetAllOptionsMethod()
				{
					Select sel = new Select(GasAgencyDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				
				
		//************************FamilyMemberDetails************************************//
				
				@FindBy(id="adhaar_number")
				private WebElement FamilyMembAadhaarTextField;
				@FindBy(id="aadhaarAckID")
				private WebElement FamilyMembAadhaarAckTextField;
				@FindBy(id="firstNameEng")
				private WebElement MembFirstNameEngTextField;
				@FindBy(id="middleNameEng")
			    private WebElement MembMiddleNameEngTextField;
				@FindBy(id="lastNameEng")
				private WebElement MembLastNameEngTextField;
				@FindBy(id="firstNameHnd")
				private WebElement MembFirstNameHindiTextField;
				@FindBy(xpath="//label[contains(text(),'First Name (In Hindi)')]/../..//li[@value='0']")
				private WebElement SelectMembFirstNameHindiTextField;
				@FindBy(id="middleNameHnd")
			    private WebElement MembMiddleNameHindiTextField;
				@FindBy(xpath="//label[contains(text(),'Middle Name (In Hindi)')]/../..//li[@value='0']")
				private WebElement SelectMembMiddleNameHindiTextField;
				@FindBy(id="lastNameHnd")
				private WebElement MembLastNameHindiTextField;
				@FindBy(xpath="//label[contains(text(),'Last Name (In Hindi)')]/../..//li[@value='0']")
				private WebElement SelectMembLastNameHindiTextField;
				@FindBy(id="gender")
				private WebElement MembGenderDropdown;
				@FindBy(id="fatherNameEng=")
				private WebElement MembFatherNameEngTextField;
				@FindBy(id="fatherNameHnd")
				private WebElement MembFatherNameHindiTextField;
				@FindBy(xpath="//label[@for='fatherNameHnd']/../..//li[@value='0']")
				private WebElement SelectMembFatherNameHindiTextField;
				@FindBy(id="motherNameEng=")
				private WebElement MembMotherNameEngTextField;
				@FindBy(id="motherNameHnd=")
				private WebElement MembMotherNameHindiTextField;
				@FindBy(xpath="//label[@for='motherNameHnd']/..//li[@value='0']")
				private WebElement SelectMembMotherNameHindiTextField;
				@FindBy(xpath="//label[@for='spouseNameHnd']/..//li[@value='0']")
				private WebElement SelectMembSpouseNameHindiTextField;
				@FindBy(id="casteCategory")
				private WebElement CategoryOfFamilyDropdown;
				@FindBy(id="caste")
				private WebElement MembCasteDropdown;
				@FindBy(id="maritalStatus")
				private WebElement MembMaritalStatusDropdown;
				@FindBy(id="residentCategory")
				private WebElement MembResidentCategoryDropdown;
				@FindBy(id="spouseNameEng")
				private WebElement MembSpouseNameEngTextField;
				@FindBy(id="spouseNameHnd")
				private WebElement MembSpouseNameHindiTextField;
				@FindBy(id="eductaionalLevel=")
				private WebElement MembEducationLevelDropdown;
				@FindBy(id="occupation")
				private WebElement MembOccupationDropdown;
				@FindBy(id="mobileNumber")
				private WebElement MembMobileNoTextField;
				@FindBy(id="email")
				private WebElement MembEmailIDTextField;
				@FindBy(id="realIncome")
				private WebElement MembAnnualIncomeTextField;
				@FindBy(id="bankId")
				private WebElement MembBankNameDropdown;
				@FindBy(id="bankDistrict")
				private WebElement MembBankDistrictNameDropdown;
				@FindBy(id="bankBranchId")
				private WebElement MembBankIFSCDropdown;
				@FindBy(id="bankAccountNumber")
				private WebElement MembBankAccountNoTextField;
				@FindBy(id="voterIdNo")
				private WebElement VoterIDNoTextField;
				@FindBy(id="passportNo")
				private WebElement PassportNoTextField;
				@FindBy(id="panNo")
				private WebElement PANCardNoTextField;
				@FindBy(id="drivingLicenseNo")
				private WebElement DrivingLicenseNoTextField;
				@FindBy(id="labourCardNo")
				private WebElement LabourCardNoTextField;
				@FindBy(id="mngregaCardNo")
				private WebElement MNGREGACardNoTextField;
				@FindBy(id="btnSubmitFamilyMemberDetails")
				private WebElement SaveDetailsFamilyMemberDetails;
				@FindBy(xpath="//a[.='Upload Photo']")
				private WebElement MembUploadPhotoUILink;
				@FindBy(xpath="(//span[.='Upload Photo'])[3]")
				private WebElement MembUploadPhotoLink;
				@FindBy(xpath= "(//span[.='Upload Photo'])[3]/../../../..//button[.='Confirm']")
				private WebElement MembUploadPhotoConfirmLink;
				@FindBy(xpath="//button[.='Upload Documents']")
				private WebElement MembUploadDocumentsLink;
				@FindBy(id="dob")
				private WebElement DOBTextField;
				@FindBy(id="ssppo")
				private WebElement SocialSecurityPPONoTextField;
				@FindBy(id="landowner")
			private WebElement CategoryOfLandownerDropdown;
				@FindBy(id="swal2-title")
				private WebElement AlertPopupMsg;
				@FindBy(xpath="//label[.='Social Security PPO No. ']")
				private WebElement labelForSSPPONo;
				public String GetPopupMsgMethod()
				 {
					String ActualStr=AlertPopupMsg.getText();
					return ActualStr;
				 }
				public void MembUploadPhotoMethod(WebDriver driver) throws AWTException, InterruptedException
			    {
					ScrolltoView(driver, MembUploadPhotoUILink);
			    	MembUploadPhotoUILink.click();
			    	Thread.sleep(2000);
			    	MembUploadPhotoLink.click();
			    	StringSelection file=new StringSelection(memb_path);
			    	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			    	Thread.sleep(3000);
			    	clipboard.setContents(file,null);
			    	robotUpload();
			    	Thread.sleep(2000);
			    	MembUploadPhotoConfirmLink.click();
			    	
			    }
				
				public void EnterFamilyMemberDetails(WebDriver driver) throws InterruptedException
				{
					FamilyMembAadhaarTextField.sendKeys(Member_Aadhaar);
					 Thread.sleep(800);
					 MembFirstNameEngTextField.sendKeys(FirstName);
					 Thread.sleep(800);
					 MembMiddleNameEngTextField.sendKeys(MiddleName);
					 Thread.sleep(800);
					 MembLastNameEngTextField.sendKeys(LastName);
					 Thread.sleep(800);
					 MembFirstNameHindiTextField.sendKeys(FirstNameHnd);
					 Thread.sleep(4000);
					 SelectMembFirstNameHindiTextField.click();
					 Thread.sleep(3000);
					 MembMiddleNameHindiTextField.sendKeys(MiddleNameHnd);
					 Thread.sleep(3000);
					 SelectMembMiddleNameHindiTextField.click();
					 Thread.sleep(3000);
					 MembLastNameHindiTextField.sendKeys(LastNameHnd);
					 Thread.sleep(3000);
					 SelectMembLastNameHindiTextField.click();
					 Thread.sleep(3000);
					 selectbyvisibletext(MembGenderDropdown, Member_Gender);
					 Thread.sleep(2000);
					//jsclick(driver, DOBTextField);
					//Thread.sleep(4000);
					 DOBTextField.sendKeys(DOB);
					//jsEnterText(driver, DOBTextField, DOB);
					 DOBTextField.clear();
					Thread.sleep(10000);
					DOBTextField.sendKeys(DOB1);
					// DOBTextField.click();
					 PersonalDetailsLogo.click();
					 MembFatherNameEngTextField.sendKeys(Personal_FatherName);
					 Thread.sleep(800);
					 MembFatherNameHindiTextField.sendKeys(Personal_FatherNameHnd);
					 Thread.sleep(3000);
					 SelectMembFatherNameHindiTextField.click();
					 MembMotherNameEngTextField.sendKeys(Personal_MotherName);
					 Thread.sleep(3000);
					 MembMotherNameHindiTextField.sendKeys(Personal_MotherNameHnd);
					 Thread.sleep(3000);
					 SelectMembMotherNameHindiTextField.click();
					 selectbyvalue(CategoryOfFamilyDropdown, "4");
					 Thread.sleep(2000);
					 selectbyvisibletext(MembCasteDropdown, Member_Caste);
					 Thread.sleep(2000);
					 selectbyvalue(MembMaritalStatusDropdown, "3");
					 Thread.sleep(2000);
					 selectbyvisibletext(MembResidentCategoryDropdown, Personal_residentCategory);
					 Thread.sleep(2000);
					 MembMobileNoTextField.sendKeys(MobileNumber);
					 Thread.sleep(800);
					 MembEmailIDTextField.sendKeys(ValidEmail);
					 selectbyvalue(MembEducationLevelDropdown, "48");
					 Thread.sleep(2000);
					 selectbyvalue(MembOccupationDropdown, "96");
					 Thread.sleep(2000);
					 MembAnnualIncomeTextField.sendKeys(Personal_AnnualIncome);
					 
					 selectbyvisibletext(MembBankNameDropdown, BankName);
					 Thread.sleep(3000);
					 MembBankDistrictNameDropdown.click();
					 Thread.sleep(3000);
					 selectbyindex(MembBankDistrictNameDropdown, 1);
					 Thread.sleep(800);
					 selectbyindex(MembBankIFSCDropdown, 1);
					 Thread.sleep(2000);
					 MembBankAccountNoTextField.sendKeys(PersonalBankAccountNo);
					 Thread.sleep(800);
					 selectbyvisibletext(CategoryOfLandownerDropdown, LandownerCategory);
	
				}
				public void EnterIdentificationDocDetails() throws InterruptedException
				{
					PANCardNoTextField.sendKeys(PANCardNo);
					Thread.sleep(2000);
					DrivingLicenseNoTextField.sendKeys(DLNo);
					Thread.sleep(2000);
					PassportNoTextField.sendKeys(PassportNo);
					Thread.sleep(2000);
					VoterIDNoTextField.sendKeys(VoterIdNo);
					Thread.sleep(2000);
					MNGREGACardNoTextField.sendKeys(MGNREGACardNo);
					Thread.sleep(2000);
					
				}
				public void EnterWhiteSpaceInitialIdentificationDocDetails() throws InterruptedException
				{
					PANCardNoTextField.sendKeys(WhiteSpaceInitial);
					Thread.sleep(2000);
					DrivingLicenseNoTextField.sendKeys(WhiteSpaceInitial);
					Thread.sleep(2000);
					PassportNoTextField.sendKeys(WhiteSpaceInitial);
					Thread.sleep(2000);
					VoterIDNoTextField.sendKeys(WhiteSpaceInitial);
					Thread.sleep(2000);
					MNGREGACardNoTextField.sendKeys(WhiteSpaceInitial);
					Thread.sleep(2000);
					
				}
				public void EnterWhiteSpaceLastIdentificationDocDetails() throws InterruptedException
				{
					PANCardNoTextField.sendKeys(WhiteSpaceLast);
					Thread.sleep(2000);
					DrivingLicenseNoTextField.sendKeys(WhiteSpaceLast);
					Thread.sleep(2000);
					PassportNoTextField.sendKeys(WhiteSpaceLast);
					Thread.sleep(2000);
					VoterIDNoTextField.sendKeys(WhiteSpaceLast);
					Thread.sleep(2000);
					MNGREGACardNoTextField.sendKeys(WhiteSpaceLast);
					Thread.sleep(2000);
					
				}
				public void EnterSpecialCharIdentificationDocDetails() throws InterruptedException
				{
					PANCardNoTextField.sendKeys(SpecialCharInitialAlpha);
					Thread.sleep(2000);
					DrivingLicenseNoTextField.sendKeys(SpecialCharInitialAlpha);
					Thread.sleep(2000);
					PassportNoTextField.sendKeys(SpecialCharInitialAlpha);
					Thread.sleep(2000);
					VoterIDNoTextField.sendKeys(SpecialCharInitialAlpha);
					Thread.sleep(2000);
					MNGREGACardNoTextField.sendKeys(SpecialCharInitialAlpha);
					Thread.sleep(2000);
					
				}
				public void EnterInvalidCharIdentificationDocDetails() throws InterruptedException
				{
					PANCardNoTextField.sendKeys(InvalidPAN);
					Thread.sleep(2000);
					DrivingLicenseNoTextField.sendKeys(InvalidDLNo);
					Thread.sleep(2000);
					PassportNoTextField.sendKeys(InvalidPassportNo);
					Thread.sleep(2000);
					VoterIDNoTextField.sendKeys(InvalidVoterIdNo);
					Thread.sleep(2000);
					MNGREGACardNoTextField.sendKeys(InvalidMGNREGACardNo);
					Thread.sleep(2000);
					
					
				}
				public void CheckMaxLengthIdentificationDocDetails() throws InterruptedException
				{
					PANCardNoTextField.sendKeys(MoreThan30);
					Thread.sleep(2000);
					DrivingLicenseNoTextField.sendKeys(MoreThan30);
					Thread.sleep(2000);
					PassportNoTextField.sendKeys(MoreThan30);
					Thread.sleep(2000);
					VoterIDNoTextField.sendKeys(MoreThan30);
					Thread.sleep(2000);
					MNGREGACardNoTextField.sendKeys(MoreThan30);
					Thread.sleep(2000);
					
					
				}
				public void ClearIdentificationDocDetails() throws InterruptedException
				{
					PANCardNoTextField.clear();
					Thread.sleep(2000);
					DrivingLicenseNoTextField.clear();
					Thread.sleep(2000);
					PassportNoTextField.clear();
					Thread.sleep(2000);
					VoterIDNoTextField.clear();
					Thread.sleep(2000);
					MNGREGACardNoTextField.clear();
					Thread.sleep(2000);
					
				}
				public void EnterValidLabourCardNo()
				{
					LabourCardNoTextField.sendKeys(LabourcardNo);
				}
				public void ClearValidLabourCardNo()
				{
					LabourCardNoTextField.clear();
				}
				public void EnterInvalidLabourCardNo()
				{
					LabourCardNoTextField.sendKeys(InvalidLabourcardNo);
				}
				@FindBy(xpath="//input[@name='radioSelectRationCardMemberForAddFamilyMember']")
				private WebElement SelectRadioButtonRespectiveMemb;
				@FindBy(xpath="(//span[.='12000078'])[2]/../../..//button[.='Submit']")
				private WebElement SelectSubmitForValidate;
				public void EnterValidRationCard(WebDriver driver) throws InterruptedException
				{
					ScrolltoView(driver, FamilyMembAadhaarTextField);
					Thread.sleep(2000);
					FamilyMembAadhaarTextField.clear();
					Thread.sleep(2000);
					FamilyMembAadhaarTextField.sendKeys(AadhaarForValidateRation);
					Thread.sleep(2000);
					selectbyvalue(RationCardType, "2");
					Thread.sleep(2000);
					RationCardNoTextfield.sendKeys(RationCardNo);
					RationCardSearchfield.click();
					
				}
				@FindBy(xpath="/html/body/app-root/app-landing/div/app-enrollment/app-add-family-member/div[2]/div[2]/div/div[1]/form/div/div[2]/fieldset[5]/div/div[8]/div/div/div/span")
				private WebElement RationCardSearchfield;
				public void EnterInValidRationCard() throws InterruptedException
				{
					selectbyvalue(RationCardType, "2");
					Thread.sleep(2000);
					RationCardNoTextfield.sendKeys(InvalidRationCardNo);
					RationCardSearchfield.click();
					Thread.sleep(2000);
					
				}
				
				public void ValidateRationCard() throws InterruptedException
				{
					SelectRadioButtonRespectiveMemb.click();
					Thread.sleep(2000);
					
					SelectSubmitForValidate.click();
					
				}
				public void EnterValidSSPPONo()
				{
					SSPPONoTextField.sendKeys(ValidSSPPONo);
				}
				public void ClearSSPPONo()
				{
					SSPPONoTextField.clear();
					
				}
				public void EnterInvalidSSPPONo()
				{
					SSPPONoTextField.sendKeys(InvalidSSPPONo);
				}
				
				public void EnterSpecialCharFamilyMemberDetails(WebDriver driver) throws InterruptedException
				{
					FamilyMembAadhaarTextField.sendKeys(SpecialCharInitialAlpha);
					 Thread.sleep(800);
					 MembFirstNameEngTextField.sendKeys(SpecialCharInitialAlpha);
					 Thread.sleep(800);
					 MembMiddleNameEngTextField.sendKeys(SpecialCharInitialAlpha);
					 Thread.sleep(800);
					 MembLastNameEngTextField.sendKeys(SpecialCharInitialAlpha);
					 Thread.sleep(800);
					 MembFirstNameHindiTextField.sendKeys(FirstNameHnd);
					 Thread.sleep(4000);
					 SelectMembFirstNameHindiTextField.click();
					 Thread.sleep(3000);
					 MembMiddleNameHindiTextField.sendKeys(MiddleNameHnd);
					 Thread.sleep(3000);
					 SelectMembMiddleNameHindiTextField.click();
					 Thread.sleep(3000);
					 MembLastNameHindiTextField.sendKeys(LastNameHnd);
					 Thread.sleep(3000);
					 SelectMembLastNameHindiTextField.click();
					 Thread.sleep(3000);
					 selectbyvisibletext(MembGenderDropdown, Member_Gender);
					 Thread.sleep(2000);
					//jsclick(driver, DOBTextField);
					//Thread.sleep(4000);
					 DOBTextField.sendKeys(DOB);
					//jsEnterText(driver, DOBTextField, DOB);
					 DOBTextField.clear();
					Thread.sleep(10000);
					DOBTextField.sendKeys(DOB1);
					// DOBTextField.click();
					 PersonalDetailsLogo.click();
					 MembFatherNameEngTextField.sendKeys(SpecialCharInitialAlpha);
					 Thread.sleep(800);
					 MembFatherNameHindiTextField.sendKeys(Personal_FatherNameHnd);
					 Thread.sleep(3000);
					 SelectMembFatherNameHindiTextField.click();
					 MembMotherNameEngTextField.sendKeys(SpecialCharInitialAlpha);
					 Thread.sleep(3000);
					 MembMotherNameHindiTextField.sendKeys(Personal_MotherNameHnd);
					 Thread.sleep(3000);
					 SelectMembMotherNameHindiTextField.click();
					 selectbyvalue(CategoryOfFamilyDropdown, "4");
					 Thread.sleep(2000);
					 selectbyvisibletext(MembCasteDropdown, Member_Caste);
					 Thread.sleep(2000);
					 selectbyvalue(MembMaritalStatusDropdown, "3");
					 Thread.sleep(2000);
					 selectbyvisibletext(MembResidentCategoryDropdown, Personal_residentCategory);
					 Thread.sleep(2000);
					 MembMobileNoTextField.sendKeys(SpecialCharInitialAlpha);
					 Thread.sleep(800);
					 MembEmailIDTextField.sendKeys(ValidEmail);
					 selectbyvalue(MembEducationLevelDropdown, "48");
					 Thread.sleep(2000);
					 selectbyvalue(MembOccupationDropdown, "96");
					 Thread.sleep(2000);
					 MembAnnualIncomeTextField.sendKeys(SpecialCharInitialAlpha);
					 
					 selectbyvisibletext(MembBankNameDropdown, BankName);
					 Thread.sleep(3000);
					 MembBankDistrictNameDropdown.click();
					 Thread.sleep(3000);
					 selectbyindex(MembBankDistrictNameDropdown, 1);
					 Thread.sleep(800);
					 selectbyindex(MembBankIFSCDropdown, 1);
					 Thread.sleep(2000);
					 MembBankAccountNoTextField.sendKeys(SpecialCharInitialAlpha);
					 Thread.sleep(800);
					 selectbyvisibletext(CategoryOfLandownerDropdown, LandownerCategory);
	
				}
				public void CheckMaxLengthFamilyMemberDetails(WebDriver driver) throws InterruptedException
				{
					FamilyMembAadhaarTextField.sendKeys(MoreThan12);
					 Thread.sleep(800);
					 MembFirstNameEngTextField.sendKeys(MoreThan200);
					 Thread.sleep(800);
					 MembMiddleNameEngTextField.sendKeys(MoreThan200);
					 Thread.sleep(800);
					 MembLastNameEngTextField.sendKeys(MoreThan200);
					 Thread.sleep(800);
					 MembFirstNameHindiTextField.sendKeys(FirstNameHnd);
					 Thread.sleep(4000);
					 SelectMembFirstNameHindiTextField.click();
					 Thread.sleep(3000);
					 MembMiddleNameHindiTextField.sendKeys(MiddleNameHnd);
					 Thread.sleep(3000);
					 SelectMembMiddleNameHindiTextField.click();
					 Thread.sleep(3000);
					 MembLastNameHindiTextField.sendKeys(LastNameHnd);
					 Thread.sleep(3000);
					 SelectMembLastNameHindiTextField.click();
					 Thread.sleep(3000);
					 selectbyvisibletext(MembGenderDropdown, Member_Gender);
					 Thread.sleep(2000);
					//jsclick(driver, DOBTextField);
					//Thread.sleep(4000);
					 DOBTextField.sendKeys(DOB);
					//jsEnterText(driver, DOBTextField, DOB);
					 DOBTextField.clear();
					Thread.sleep(10000);
					DOBTextField.sendKeys(DOB1);
					// DOBTextField.click();
					 PersonalDetailsLogo.click();
					 MembFatherNameEngTextField.sendKeys(MoreThan200);
					 Thread.sleep(800);
					 MembFatherNameHindiTextField.sendKeys(Personal_FatherNameHnd);
					 Thread.sleep(3000);
					 SelectMembFatherNameHindiTextField.click();
					 MembMotherNameEngTextField.sendKeys(MoreThan200);
					 Thread.sleep(3000);
					 MembMotherNameHindiTextField.sendKeys(Personal_MotherNameHnd);
					 Thread.sleep(3000);
					 SelectMembMotherNameHindiTextField.click();
					 selectbyvalue(CategoryOfFamilyDropdown, "4");
					 Thread.sleep(2000);
					 selectbyvisibletext(MembCasteDropdown, Member_Caste);
					 Thread.sleep(2000);
					 selectbyvalue(MembMaritalStatusDropdown, "3");
					 Thread.sleep(2000);
					 selectbyvisibletext(MembResidentCategoryDropdown, Personal_residentCategory);
					 Thread.sleep(2000);
					 MembMobileNoTextField.sendKeys(MoreThan10);
					 Thread.sleep(800);
					 MembEmailIDTextField.sendKeys(ValidEmail);
					 selectbyvalue(MembEducationLevelDropdown, "48");
					 Thread.sleep(2000);
					 selectbyvalue(MembOccupationDropdown, "96");
					 Thread.sleep(2000);
					 MembAnnualIncomeTextField.sendKeys(MoreThan30);
					 
					 selectbyvisibletext(MembBankNameDropdown, BankName);
					 Thread.sleep(3000);
					 MembBankDistrictNameDropdown.click();
					 Thread.sleep(3000);
					 selectbyindex(MembBankDistrictNameDropdown, 1);
					 Thread.sleep(800);
					 selectbyindex(MembBankIFSCDropdown, 1);
					 Thread.sleep(2000);
					 MembBankAccountNoTextField.sendKeys(MoreThan30);
					 Thread.sleep(800);
					 selectbyvisibletext(CategoryOfLandownerDropdown, LandownerCategory);
	
				}
				public void EnterAlphaNumericCharFamilyMemberDetails(WebDriver driver) throws InterruptedException
				{
					FamilyMembAadhaarTextField.sendKeys(Alphabets);
					 Thread.sleep(800);
					 MembFirstNameEngTextField.sendKeys(MoreThan10);
					 Thread.sleep(800);
					 MembMiddleNameEngTextField.sendKeys(MoreThan10);
					 Thread.sleep(800);
					 MembLastNameEngTextField.sendKeys(MoreThan10);
					 Thread.sleep(800);
					 MembFirstNameHindiTextField.sendKeys(FirstNameHnd);
					 Thread.sleep(4000);
					 SelectMembFirstNameHindiTextField.click();
					 Thread.sleep(3000);
					 MembMiddleNameHindiTextField.sendKeys(MiddleNameHnd);
					 Thread.sleep(3000);
					 SelectMembMiddleNameHindiTextField.click();
					 Thread.sleep(3000);
					 MembLastNameHindiTextField.sendKeys(LastNameHnd);
					 Thread.sleep(3000);
					 SelectMembLastNameHindiTextField.click();
					 Thread.sleep(3000);
					 selectbyvisibletext(MembGenderDropdown, Member_Gender);
					 Thread.sleep(2000);
					//jsclick(driver, DOBTextField);
					//Thread.sleep(4000);
					 DOBTextField.sendKeys(DOB);
					//jsEnterText(driver, DOBTextField, DOB);
					 DOBTextField.clear();
					Thread.sleep(10000);
					DOBTextField.sendKeys(DOB1);
					// DOBTextField.click();
					 PersonalDetailsLogo.click();
					 MembFatherNameEngTextField.sendKeys(MoreThan10);
					 Thread.sleep(800);
					 MembFatherNameHindiTextField.sendKeys(Personal_FatherNameHnd);
					 Thread.sleep(3000);
					 SelectMembFatherNameHindiTextField.click();
					 MembMotherNameEngTextField.sendKeys(MoreThan10);
					 Thread.sleep(3000);
					 MembMotherNameHindiTextField.sendKeys(Personal_MotherNameHnd);
					 Thread.sleep(3000);
					 SelectMembMotherNameHindiTextField.click();
					 selectbyvalue(CategoryOfFamilyDropdown, "4");
					 Thread.sleep(2000);
					 selectbyvisibletext(MembCasteDropdown, Member_Caste);
					 Thread.sleep(2000);
					 selectbyvalue(MembMaritalStatusDropdown, "3");
					 Thread.sleep(2000);
					 selectbyvisibletext(MembResidentCategoryDropdown, Personal_residentCategory);
					 Thread.sleep(2000);
					 MembMobileNoTextField.sendKeys(Alphabets);
					 Thread.sleep(800);
					 MembEmailIDTextField.sendKeys(ValidEmail);
					 selectbyvalue(MembEducationLevelDropdown, "48");
					 Thread.sleep(2000);
					 selectbyvalue(MembOccupationDropdown, "96");
					 Thread.sleep(2000);
					 MembAnnualIncomeTextField.sendKeys(Alphabets);
					 
					 selectbyvisibletext(MembBankNameDropdown, BankName);
					 Thread.sleep(3000);
					 MembBankDistrictNameDropdown.click();
					 Thread.sleep(3000);
					 selectbyindex(MembBankDistrictNameDropdown, 1);
					 Thread.sleep(800);
					 selectbyindex(MembBankIFSCDropdown, 1);
					 Thread.sleep(2000);
					 MembBankAccountNoTextField.sendKeys(Alphabets);
					 Thread.sleep(800);
					 selectbyvisibletext(CategoryOfLandownerDropdown, LandownerCategory);
	
				}
				public void EnterWhiteSpaceInitialFamilyMemberDetails(WebDriver driver) throws InterruptedException
				{
					
					 MembFirstNameEngTextField.sendKeys(WhiteSpaceInitialAlpha);
					 Thread.sleep(800);
					 MembMiddleNameEngTextField.sendKeys(WhiteSpaceInitialAlpha);
					 Thread.sleep(800);
					 MembLastNameEngTextField.sendKeys(WhiteSpaceInitialAlpha);
					 Thread.sleep(800);
					 MembFirstNameHindiTextField.sendKeys(FirstNameHnd);
					 Thread.sleep(4000);
					 SelectMembFirstNameHindiTextField.click();
					 Thread.sleep(3000);
					 MembMiddleNameHindiTextField.sendKeys(MiddleNameHnd);
					 Thread.sleep(3000);
					 SelectMembMiddleNameHindiTextField.click();
					 Thread.sleep(3000);
					 MembLastNameHindiTextField.sendKeys(LastNameHnd);
					 Thread.sleep(3000);
					 SelectMembLastNameHindiTextField.click();
					 Thread.sleep(3000);
					 selectbyvisibletext(MembGenderDropdown, Member_Gender);
					 Thread.sleep(2000);
					//jsclick(driver, DOBTextField);
					//Thread.sleep(4000);
					 DOBTextField.sendKeys(DOB);
					//jsEnterText(driver, DOBTextField, DOB);
					 DOBTextField.clear();
					Thread.sleep(10000);
					DOBTextField.sendKeys(DOB1);
					// DOBTextField.click();
					 PersonalDetailsLogo.click();
					 MembFatherNameEngTextField.sendKeys(WhiteSpaceInitialAlpha);
					 Thread.sleep(800);
					 MembFatherNameHindiTextField.sendKeys(Personal_FatherNameHnd);
					 Thread.sleep(3000);
					 SelectMembFatherNameHindiTextField.click();
					 MembMotherNameEngTextField.sendKeys(WhiteSpaceInitialAlpha);
					 Thread.sleep(3000);
					 MembMotherNameHindiTextField.sendKeys(Personal_MotherNameHnd);
					 Thread.sleep(3000);
					 SelectMembMotherNameHindiTextField.click();
					 selectbyvalue(CategoryOfFamilyDropdown, "4");
					 Thread.sleep(2000);
					 selectbyvisibletext(MembCasteDropdown, Member_Caste);
					 Thread.sleep(2000);
					 selectbyvalue(MembMaritalStatusDropdown, "3");
					 Thread.sleep(2000);
					 selectbyvisibletext(MembResidentCategoryDropdown, Personal_residentCategory);
					 Thread.sleep(2000);
					 MembMobileNoTextField.sendKeys(WhiteSpaceInitial);
					 Thread.sleep(800);
					 MembEmailIDTextField.sendKeys(ValidEmail);
					 selectbyvalue(MembEducationLevelDropdown, "48");
					 Thread.sleep(2000);
					 selectbyvalue(MembOccupationDropdown, "96");
					 Thread.sleep(2000);
					 MembAnnualIncomeTextField.sendKeys(WhiteSpaceInitial);
					 
					 selectbyvisibletext(MembBankNameDropdown, BankName);
					 Thread.sleep(3000);
					 MembBankDistrictNameDropdown.click();
					 Thread.sleep(3000);
					 selectbyindex(MembBankDistrictNameDropdown, 1);
					 Thread.sleep(800);
					 selectbyindex(MembBankIFSCDropdown, 1);
					 Thread.sleep(2000);
					 MembBankAccountNoTextField.sendKeys(WhiteSpaceInitial);
					 Thread.sleep(800);
					 selectbyvisibletext(CategoryOfLandownerDropdown, LandownerCategory);
	
				}
				public void EnterWhiteSpaceInitialAadhaarNo() throws InterruptedException
				{
					FamilyMembAadhaarTextField.sendKeys(WhiteSpaceInitial);
					 Thread.sleep(800);
				}
				public void EnterWhiteSpaceLastAadhaarNo() throws InterruptedException
				{
					FamilyMembAadhaarTextField.sendKeys(WhiteSpaceLast);
					Thread.sleep(800);
				}
				public void EnterWhiteSpaceLastFamilyMemberDetails(WebDriver driver) throws InterruptedException
				{
					
					 MembFirstNameEngTextField.sendKeys(WhiteSpaceLastAlpha);
					 Thread.sleep(800);
					 MembMiddleNameEngTextField.sendKeys(WhiteSpaceLastAlpha);
					 Thread.sleep(800);
					 MembLastNameEngTextField.sendKeys(WhiteSpaceLastAlpha);
					 Thread.sleep(800);
					 MembFirstNameHindiTextField.sendKeys(FirstNameHnd);
					 Thread.sleep(4000);
					 SelectMembFirstNameHindiTextField.click();
					 Thread.sleep(3000);
					 MembMiddleNameHindiTextField.sendKeys(MiddleNameHnd);
					 Thread.sleep(3000);
					 SelectMembMiddleNameHindiTextField.click();
					 Thread.sleep(3000);
					 MembLastNameHindiTextField.sendKeys(LastNameHnd);
					 Thread.sleep(3000);
					 SelectMembLastNameHindiTextField.click();
					 Thread.sleep(3000);
					 selectbyvisibletext(MembGenderDropdown, Member_Gender);
					 Thread.sleep(2000);
					//jsclick(driver, DOBTextField);
					//Thread.sleep(4000);
					 DOBTextField.sendKeys(DOB);
					//jsEnterText(driver, DOBTextField, DOB);
					 DOBTextField.clear();
					Thread.sleep(10000);
					DOBTextField.sendKeys(DOB1);
					// DOBTextField.click();
					 PersonalDetailsLogo.click();
					 MembFatherNameEngTextField.sendKeys(WhiteSpaceLastAlpha);
					 Thread.sleep(800);
					 MembFatherNameHindiTextField.sendKeys(Personal_FatherNameHnd);
					 Thread.sleep(3000);
					 SelectMembFatherNameHindiTextField.click();
					 MembMotherNameEngTextField.sendKeys(WhiteSpaceLastAlpha);
					 Thread.sleep(3000);
					 MembMotherNameHindiTextField.sendKeys(Personal_MotherNameHnd);
					 Thread.sleep(3000);
					 SelectMembMotherNameHindiTextField.click();
					 selectbyvalue(CategoryOfFamilyDropdown, "4");
					 Thread.sleep(2000);
					 selectbyvisibletext(MembCasteDropdown, Member_Caste);
					 Thread.sleep(2000);
					 selectbyvalue(MembMaritalStatusDropdown, "3");
					 Thread.sleep(2000);
					 selectbyvisibletext(MembResidentCategoryDropdown, Personal_residentCategory);
					 Thread.sleep(2000);
					 MembMobileNoTextField.sendKeys(WhiteSpaceLast);
					 Thread.sleep(800);
					 MembEmailIDTextField.sendKeys(ValidEmail);
					 selectbyvalue(MembEducationLevelDropdown, "48");
					 Thread.sleep(2000);
					 selectbyvalue(MembOccupationDropdown, "96");
					 Thread.sleep(2000);
					 MembAnnualIncomeTextField.sendKeys(WhiteSpaceLast);
					 
					 selectbyvisibletext(MembBankNameDropdown, BankName);
					 Thread.sleep(3000);
					 MembBankDistrictNameDropdown.click();
					 Thread.sleep(3000);
					 selectbyindex(MembBankDistrictNameDropdown, 1);
					 Thread.sleep(800);
					 selectbyindex(MembBankIFSCDropdown, 1);
					 Thread.sleep(2000);
					 MembBankAccountNoTextField.sendKeys(WhiteSpaceLast);
					 Thread.sleep(800);
					 selectbyvisibletext(CategoryOfLandownerDropdown, LandownerCategory);
	
				}
				public void ClearFamilyMemberDetails() throws InterruptedException
				{
					FamilyMembAadhaarTextField.clear();
					 Thread.sleep(800);
					 MembFirstNameEngTextField.clear();
					 Thread.sleep(800);
					 MembMiddleNameEngTextField.clear();
					 Thread.sleep(800);
					 MembLastNameEngTextField.clear();
					 Thread.sleep(800);
					 MembFirstNameHindiTextField.clear();
					 Thread.sleep(800);
					 MembMiddleNameHindiTextField.clear();
					 Thread.sleep(800);
					 MembLastNameHindiTextField.clear();
					 Thread.sleep(800);
					 selectbyvisibletext(MembGenderDropdown,Unselect);
					 Thread.sleep(2000);
					 DOBTextField.clear();
					 Thread.sleep(800);
					 MembFatherNameEngTextField.clear();
					 Thread.sleep(800);
					 MembFatherNameHindiTextField.clear();
					 Thread.sleep(3000);
					 MembMotherNameEngTextField.clear();
					 Thread.sleep(3000);
					 MembMotherNameHindiTextField.clear();
					 Thread.sleep(3000);
					 selectbyvisibletext(CategoryOfFamilyDropdown, Unselect);
					 Thread.sleep(2000);
					 selectbyvisibletext(MembCasteDropdown,Unselect);
					 Thread.sleep(2000);
					 selectbyvisibletext(MembMaritalStatusDropdown, Unselect);
					 Thread.sleep(2000);
					 selectbyvisibletext(MembResidentCategoryDropdown, Unselect);
					 Thread.sleep(2000);
					 MembMobileNoTextField.clear();
					 Thread.sleep(800);
					 MembEmailIDTextField.clear();
					 selectbyvisibletext(MembEducationLevelDropdown,Unselect);
					 Thread.sleep(2000);
					 selectbyvisibletext(MembOccupationDropdown, Unselect);
					 Thread.sleep(2000);
					 MembAnnualIncomeTextField.clear();
					 
					 selectbyvisibletext(MembBankNameDropdown, Unselect);
					 Thread.sleep(800);
					 selectbyvisibletext(MembBankDistrictNameDropdown, Unselect);
					 Thread.sleep(800);
					 selectbyvisibletext(MembBankIFSCDropdown, Unselect);
					 Thread.sleep(2000);
					 MembBankAccountNoTextField.clear();
					 Thread.sleep(800);
					 selectbyvisibletext(CategoryOfLandownerDropdown, Unselect);
	
				}
				public void SetMarriedMemInformation() throws InterruptedException
				{
					selectbyvisibletext(MembMaritalStatusDropdown, MaritalStatusY);
					 Thread.sleep(2000);
					 MembSpouseNameEngTextField.sendKeys(Member_SpouseName);
					 MembSpouseNameHindiTextField.sendKeys(Member_SpouseName);
					 Thread.sleep(2000);
					SelectMembSpouseNameHindiTextField.click();
					 
				}
				public void ClearMarriedMemInformation() throws InterruptedException
				{
					selectbyvisibletext(MembMaritalStatusDropdown, Unselect);
					 Thread.sleep(2000);
					 MembSpouseNameEngTextField.clear();
					 MembSpouseNameHindiTextField.clear();
					 
				}
			
				
				public void FamilyMembAadhaarTextMethod()
				{
					FamilyMembAadhaarTextField.sendKeys(Member_Aadhaar);
				}
				public String FamilyMembAadhaarGetTextMethod()
				{
					String s=FamilyMembAadhaarTextField.getAttribute("value");
					return s;
				}
				public void ClearFamilyMembAadhaarMethod()
				{
					FamilyMembAadhaarTextField.clear();
				}
				public void FamilyMembAadhaarAckTextMethod()
				{
					FamilyMembAadhaarAckTextField.sendKeys(Member_AadhaarAck);
				}
				public void FamilyMembAadhaarAckGetTextMethod()
				{
					FamilyMembAadhaarAckTextField.getAttribute("value");
				}
				public void FamilyMembAadhaarAckclearMethod()
				{
					FamilyMembAadhaarAckTextField.clear();
				}
				public void MembFirstNameEngTextMethod()
				{
					MembFirstNameEngTextField.sendKeys(FirstName);
				}
				public void ClearMembFirstNameEngMethod()
				{
					MembFirstNameEngTextField.clear();
				}
				public String MembFirstNameEngGetTextMethod()
				{
					String s=MembFirstNameEngTextField.getAttribute("value");
					return s;
				}
				public void MembMiddleNameEngTextMethod()
				{
					MembMiddleNameEngTextField.sendKeys(MiddleName);
				}
				public void MembMiddleNameEngClearMethod()
				{
					MembMiddleNameEngTextField.clear();
				}
				public String MembMiddleNameEngGetTextMethod()
				{
					String s=MembMiddleNameEngTextField.getAttribute("value");
					return s;
				}
				public void MembLastNameEngTextMethod()
				{
					MembLastNameEngTextField.sendKeys(Member_lastName);
				}
				public void ClearMembLastNameEngMethod()
				{
					MembLastNameEngTextField.clear();
				}
				public String MembLastNameEngGetTextMethod()
				{
					String s=MembLastNameEngTextField.getAttribute("value");
					return s;
				}
				public void MembFirstNameHindiTextMethod()
				{
					MembFirstNameHindiTextField.sendKeys(Member_FirstName);
				}
				public void MembFirstNameHindiClearMethod()
				{
					MembFirstNameHindiTextField.clear();
				}
				public void MembFirstNameHindiGetTextMethod()
				{
					MembFirstNameHindiTextField.getAttribute("value");
				}
				public void MembMiddleNameHindiTextMethod()
				{
					MembMiddleNameHindiTextField.sendKeys(Member_middleName);
				}
				public void MembMiddleNameHindiClearMethod()
				{
					MembMiddleNameHindiTextField.clear();
				}
				public void MembMiddleNameHindiGetTextMethod()
				{
					MembMiddleNameHindiTextField.getAttribute("value");
				}
				public void MembLastNameHindiTextMethod()
				{
					MembLastNameHindiTextField.sendKeys(Member_lastName);
				}
				public void MembLastNameHindiClearMethod()
				{
					MembLastNameHindiTextField.clear();
				}
				public void MembLastNameHindiGetTextMethod()
				{
					MembLastNameHindiTextField.getAttribute("value");
				}
				public void SelectMembGender()
				{
					selectbyvisibletext(MembGenderDropdown, Member_Gender);
				}
				public void UnSelectMembGender()
				{
					selectbyvisibletext(MembGenderDropdown,Unselect );
				}
				public void MembFatherNameEngTextMethod()
				{
					MembFatherNameEngTextField.sendKeys(Personal_FatherName);
				}
				public void MembFatherNameClearTextMethod()
				{
					MembFatherNameEngTextField.clear();
				}
				public String MembFatherNameEngGetTextMethod()
				{
					String s=MembFatherNameEngTextField.getAttribute("value");
					return s;
				}
				public void MembFatherNameHindiTextMethod()
				{
					MembFatherNameHindiTextField.sendKeys(Personal_FatherName);
				}
				public void MembFatherNameHindiClearMethod()
				{
					MembFatherNameHindiTextField.clear();
				}
				public void MembFatherNameHindiGetTextMethod()
				{
					MembFatherNameHindiTextField.getAttribute("value");
				}
				public void MembMotherNameEngTextMethod()
				{
					MembMotherNameEngTextField.sendKeys(Personal_MotherName);
				}
				public void MembMotherNameEngClearMethod()
				{
					MembMotherNameEngTextField.clear();
				}
				public String MembMotherNameEngGetTextMethod()
				{
					String s=MembMotherNameEngTextField.getAttribute("value");
					return s;
				}
				public void MembMotherNameHindiTextMethod()
				{
					MembMotherNameHindiTextField.sendKeys(Personal_MotherName);
				}
				public void MembMotherNameHindiClearMethod()
				{
					MembMotherNameHindiTextField.clear();
				}
				public void MembMotherNameHindiGetTextMethod()
				{
					MembMotherNameHindiTextField.getAttribute("value");
				}
		
				public void SelectCategoryOfFamily()
				{
					selectbyvisibletext(CategoryOfFamilyDropdown, Member_Category);
				}
				public void UnSelectCategoryOfFamily()
				{
					selectbyvisibletext(CategoryOfFamilyDropdown, Unselect);
				}
				public void SelectMembCaste()
				{
					selectbyvisibletext(MembCasteDropdown, Member_Caste);
				}
				public void UnSelectMembCaste()
				{
					selectbyvisibletext(MembCasteDropdown, Unselect);
				}
				public void SelectMembMaritalStatusY()
				{
					selectbyvisibletext(MembMaritalStatusDropdown, MaritalStatusY);
				}
				public void UnSelectMembMaritalStatus()
				{
					selectbyvisibletext(MembMaritalStatusDropdown, Unselect);
				}
				public void MembSpouseNameEngTextMethod()
				{
					MembSpouseNameEngTextField.sendKeys(Member_SpouseName);
				}
				public void MembSpouseNameEngClearMethod()
				{
					MembSpouseNameEngTextField.clear();
				}
				public void MembSpouseNameEngGetTextMethod()
				{
					MembSpouseNameEngTextField.getAttribute("value");
				}
				public void MembSpouseNameHindiTextMethod()
				{
					MembSpouseNameHindiTextField.sendKeys(Member_SpouseName);
				}
				public void MembSpouseNameHindiClearMethod()
				{
					MembSpouseNameHindiTextField.clear();
				}
				public void MembSpouseNameHindiGetTextMethod()
				{
					MembSpouseNameHindiTextField.getAttribute("value");
				}
				public void SelectMembResidentCategory()
				{
					selectbyvisibletext(MembResidentCategoryDropdown, Personal_residentCategory);
				}
				public void UnSelectMembResidentCategory()
				{
					selectbyvisibletext(MembResidentCategoryDropdown, Unselect);
				}
				public void SelectMembEducationLevel()
				{
					selectbyvisibletext(MembEducationLevelDropdown, Personal_EducationLevel);
				}
				public void UnSelectMembEducationLevel()
				{
					selectbyvisibletext(MembEducationLevelDropdown, Unselect);
				}
				public void SelectMembOccupation()
				{
					selectbyvisibletext(MembOccupationDropdown, Personal_Occupation);
				}
				public void UnSelectMembOccupation()
				{
					selectbyvisibletext(MembOccupationDropdown, Unselect);
				}
		
				public void ClearMembAnnualIncome()
				{
					MembAnnualIncomeTextField.clear();
				}
				public void MembMobileNoClearMethod()
				{
					MembMobileNoTextField.clear();
				}
				public String MembMobileNoGetTextMethod()
				{
					String s=MembMobileNoTextField.getAttribute("value");
					return s;
				}
				public void MembEmailIDTextMethod()
				{
					MembEmailIDTextField.sendKeys(ValidEmail);
				}
				public void InvalidMembEmailIDTextMethod()
				{
					MembEmailIDTextField.sendKeys(InValidEmail);
				}
				public void MembEmailIDClearMethod()
				{
					MembEmailIDTextField.clear();
				}
				public String MembEmailIDGetTextMethod()
				{
					String s=MembEmailIDTextField.getAttribute("value");
					return s;
				}
				public void SelectMembBankName()
				{
					selectbyvisibletext(MembBankNameDropdown, BankName);
				}
				public void UnSelectMembBankName()
				{
					selectbyvisibletext(MembBankNameDropdown, Unselect);
				}
				public void SelectMembBankIFSC()
				{
					selectbyvisibletext(MembBankIFSCDropdown, BankIFSCcode);
				}
				public void UnSelectMembBankIFSC()
				{
					selectbyvisibletext(MembBankIFSCDropdown, Unselect);
				}
				public void MembBankAccountNoTextMethod()
				{
					MembBankAccountNoTextField.sendKeys(PersonalBankAccountNo);
				}
				public void MembBankAccountNoClearMethod()
				{
					MembBankAccountNoTextField.clear();
				}
				
				
				public String MembBankAccountNoGetTextMethod()
				{
					String s=MembBankAccountNoTextField.getAttribute("value");
					return s;
				}
				public String MembAnnualIncomeGetTextMethod()
				{
					String s=MembAnnualIncomeTextField.getAttribute("value");
					return s;
				}
				public String MembPANCardNoGetTextMethod()
				{
					String s=PANCardNoTextField.getAttribute("value");
					return s;
				}
				public String MembDLNoGetTextMethod()
				{
					String s=DrivingLicenseNoTextField.getAttribute("value");
					return s;
				}
				public String MembPassportNoGetTextMethod()
				{
					String s=PassportNoTextField.getAttribute("value");
					return s;
				}
				public String MembVoterIDNoGetTextMethod()
				{
					String s=VoterIDNoTextField.getAttribute("value");
					return s;
				}
				public String MembMGNREGACardNoGetTextMethod()
				{
					String s=MNGREGACardNoTextField.getAttribute("value");
					return s;
				}
				public void clickOnLabelSSPPONo()
				{
					labelForSSPPONo.click();
				}
				
				//********************** Basic Member Details Dropdown Check  ***************************//	
				public String GetNameOfgenderMethod()
				{
					String s=selectedText(MembGenderDropdown);
			    	return s;
				}
				public List<String> NameOfgenderGetAllOptionsMethod()
				{
					Select sel = new Select(MembGenderDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfCategoryOfFamilyMethod()
				{
					String s=selectedText(CategoryOfFamilyDropdown);
			    	return s;
				}
				public List<String> NameOfCategoryOfFamilyGetAllOptionsMethod()
				{
					Select sel = new Select(CategoryOfFamilyDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfCasteOfFamilyMethod()
				{
					String s=selectedText(MembCasteDropdown);
			    	return s;
				}
				public List<String> NameOfCasteGetAllOptionsMethod()
				{
					Select sel = new Select(MembCasteDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfMaritalStatusMethod()
				{
					String s=selectedText(MembMaritalStatusDropdown);
			    	return s;
				}
				public List<String> NameOfMaritalStatusGetAllOptionsMethod()
				{
					Select sel = new Select(MembMaritalStatusDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfResidentCategoryMethod()
				{
					String s=selectedText(MembResidentCategoryDropdown);
			    	return s;
				}
				public List<String> NameOfResidentCategoryGetAllOptionsMethod()
				{
					Select sel = new Select(MembResidentCategoryDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfEducationLevelMethod()
				{
					String s=selectedText(MembEducationLevelDropdown);
			    	return s;
				}
				public List<String> NameOfEducationLevelGetAllOptionsMethod()
				{
					Select sel = new Select(MembEducationLevelDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfOccupationMethod()
				{
					String s=selectedText(MembOccupationDropdown);
			    	return s;
				}
				public List<String> NameOfOccupationGetAllOptionsMethod()
				{
					Select sel = new Select(MembOccupationDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfBankMethod()
				{
					String s=selectedText(MembBankNameDropdown);
			    	return s;
				}
				public List<String> NameOfBankGetAllOptionsMethod()
				{
					Select sel = new Select(MembBankNameDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfBankDistrictMethod()
				{
					String s=selectedText(MembBankDistrictNameDropdown);
			    	return s;
				}
				public List<String> NameOfBankDistrictGetAllOptionsMethod()
				{
					Select sel = new Select(MembBankDistrictNameDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfBankIFSCMethod()
				{
					String s=selectedText(MembBankIFSCDropdown);
			    	return s;
				}
				public List<String> NameOfBankIFSCGetAllOptionsMethod()
				{
					Select sel = new Select(MembBankIFSCDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
				public String GetNameOfLandOwnerMethod()
				{
					String s=selectedText(CategoryOfLandownerDropdown);
			    	return s;
				}
				public List<String> NameOfCategoryLandOwnerGetAllOptionsMethod()
				{
					Select sel = new Select(CategoryOfLandownerDropdown);
					List<WebElement> allOptions= sel.getOptions();
					List<String> originalList = new ArrayList<String>();
					for (WebElement webElement : allOptions) {
						originalList.add(webElement.getText());
					}
					return originalList;
				}
			public void SaveDetailsFamilyMemberDetailsMethod()
			{
				SaveDetailsFamilyMemberDetails.click();
			}
	 public JANAADHAAR_MasterModule(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
}
