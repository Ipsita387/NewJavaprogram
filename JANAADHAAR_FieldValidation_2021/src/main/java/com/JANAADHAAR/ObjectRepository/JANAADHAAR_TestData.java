package com.JANAADHAAR.ObjectRepository;

import java.util.ArrayList;

public interface JANAADHAAR_TestData {
	
	//******************BasicFamilyDetails  **************************//

    String AadhaarNo = "731082669477";
	String MobileNumber = "8851921502";
	String Unselect="Select";
	String WhiteSpaceInitial = "  89";
	String WhiteSpaceLast="89 ";
	String WhiteSpaceInitialAlpha = " kisan";
	String WhiteSpaceLastAlpha="kisan ";
	String WhiteSpaceMiddle = "ab pq";
	
	String SpecialCharInitialAlpha="<>%!@#$^&*()_City";
	String SpecialCharLastAlpha="City!@#$^&*()_";
	String SpecialCharInitialInt="!@#$^&*()_111";
	String SpecialCharLastInt="111!@#$&*()_";
	String SpecialCharMiddleInt="11!@#$&*()_1";

	//String SqlCharInitialAlpha="City";
	String SqlCharLastAlpha="City<>%";
	String SqlCharInitialInt="<>%111";
	String SqlCharLastInt="111<>%";
	String SqlCharMiddleInt="11<>%1";
	
	String MoreThan50 = "NamquisnullaIntegermalesuadaIninenimgghhvggvgvbvhhhhhhhhjjjj";
	String MoreThan200 = "NamquisnullaIntegermalesuadaIninenimgghhvggvgvbvhhhhhhhhjjjjNamquisnullaIntegermalesuadaIninenimgghhvggvgvbvhhhhhhhhjjjjNamquisnullaIntegermalesuadaIninenimgghhvggvgvbvhhhhhhhhjjjjpppppppppppppppppppppppppppppp";
	String MoreThan10 = "97768876476";
	String MoreThan12= "95559733624451";
	String AlphaNumeric = "ABCxyz123";
	String Alphabets = "ABCxyz";
	String UniqueAadhaar="690326111844";
	String UniqueMobileNumber="9776887647";
	
	//************BasicDetails****************//
	String AadhaarForBasicDetails="216617426374";
	String MobileNoForBasicDetails="8851921502";
	
//***************Residential Address**********************//
	String HouseNoEng = "20";
	String HouseNoHindi="20";
	String StreetNameEng="Rajdhani Marg";
	String StreetNameHindi="Rajdhani Marg   ";
	String PlaceNameEng= "Udhamgarh";
	String PlaceNameHindi="Udhamgarh   ";
	String LandmarkEng="KM Hospital";
	String LandmarkHindi="KM Hospital   ";
	String Pincode= "768004";
	String DurationOfStay="20";
	String MoreThan6 = "7680041";
	String ValidEmail="abc12@gmail.com";
	String InValidEmail="abc12@@gmail..com";
	String TelephoneNo="8851921504";
	String LandlineNo="11111111111";
	//***************Personal Information of HoF**********************//
	String Personal_GuardianName="sudhir shah";
	
	
	String MoreThan16Int="32828742093123456789";
	String RelationHof="Self";
	
	String Personal_SpouseName="Dibya kumari";
	
	//String BankIFSCCode="SBIN0031730";
	
	//String Personal_Occupation="State personnel";
	String Personal_StateEmpID="RJDA200913005597";
	
	
	
	
	String Personal_SpicialAbledCategory="LOW VISION";
	//***************Family Identity Documents**********************//
	
	//String RationCardNo="200000479183";
	String ElectricityBillNo="3105140753434";
	String WaterBillNo="4190875782";
	String GasAgencyName="HP Gas";
	String GasConnectionNo="7737981";
	String BPLNumber="98243179876124";
	
	
	String InsurancePolicyNo="66982674825";
	String FoodSecurityNo="1234567890";
	//String LabourcardNo="7857656545646";
		
	String EmploymentRegistrationNo="J16G57-09469776534";
	String NPRNumber="ABC235467890";
	String SpecialDescription="Abh$%^%&%$@lia  hhgg676553!@(),..rekkk";
	String FamilyMembersCount="3";
    String IntValueMoreThan15="16";
    String MoreThan30="ABC977688764769776887647697768876476";
    String MoreThan20="Abc9776887647697768876476";
	String MoreThan10AN="BFDPM63851P";
	//***************Family Member Personal Details**********************//
	String Member_FirstName="Dibya";
	String Member_middleName="kumari";
	String Member_lastName="Singh";
	
	
	String Member_Community="Muslims";
	String Member_Category=" OTHER BACKWARD CLASS - अन्य पिछड़ा वर्ग";
	String Member_Caste="12 DAROGA - 12 दरोगा";
	String Member_SpCategory="Normal";
	String Member_RelationHof="Husband/wife";
	String Member_Aadhaar="955597336244";
	String Member_AadhaarAck="123987654345";
	String Member_MobileNo="8851921502";
	
	//***************Family Informations Details**********************//
	String District="Jaipur - जयपुर ";
	String City="Jaipur Greater ";
	//********Family Member Personal Details*********************//
	String FirstName = "Ranjan";
	String FirstNameHnd = "Ranjan   ";
	String MiddleName = "kumar";
	String MiddleNameHnd = "kumar   ";
	String LastName = "mahana";
	String LastNameHnd = "mahana  ";
	String DOB = "11-December-1980";
	String DOB1 = "11-December-1981";
	String GenderType = "Male";
	String Personal_FatherName="Kiran kumar";
	String Personal_FatherNameHnd="Kiran kumar   ";
	String Personal_MotherName="Kamala devi";
	String Personal_MotherNameHnd="Kamala devi   ";
	String PersonalBankAccountNo="32828742093";
	String MaritalStatusN=" Single - अविवाहित";
	String MaritalStatusY=" Married - विवाहित";
	String BankName="STATE BANK OF INDIA - भारतीय स्टेट बैंक";
	String BankDistrict="Jaipur ";
	String BankIFSCcode="   JAIPUR -   जयपुर  ( SBIN0050339 )";
	String Personal_residentCategory="Resident";
	String Personal_Occupation=" Farmer - कृषक";
	String Personal_EducationLevel=" 12 Pass - उच्च माध्यमिक";
	String Personal_AnnualIncome="9000";
	String RationCardNo="007110000388";
	String InvalidRationCardNo="06110000389";
	String AadhaarForValidateRation="497500546674";
	String RationCardType="STATE BPL";
	String VoterIdNo="WKH1186254";
	String InvalidVoterIdNo="1186254WKH";
	String PassportNo="H9137927";
	String InvalidPassportNo="137927H9";
	String PANCardNo="BFDPM6385P";
	String InvalidPAN="BFDP2638PP";
	String DLNo="TN9920190000999";
	String InvalidDLNo="920190000999TN9";
	String LabourcardNo="b29/2016/0199756";
	String InvalidLabourcardNo="b29/2018/0111111";
	String Member_Gender="Male - पुरुष";
	String Member_SpouseName="Dibya Kumari";
	String LandownerCategory="Marginal Farmer - सीमान्त किसान";
	String MGNREGACardNo="ABCD9876264532169";
	String InvalidMGNREGACardNo="876264532169ABCD9";
	String ValidSSPPONo="10300626";
	String InvalidSSPPONo="13006260111";
}
