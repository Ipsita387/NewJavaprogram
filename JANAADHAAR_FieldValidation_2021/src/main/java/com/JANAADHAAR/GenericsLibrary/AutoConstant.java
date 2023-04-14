package com.JANAADHAAR.GenericsLibrary;

public interface AutoConstant {
	static Xls_AllMethods fileone = new Xls_AllMethods("D:\\JANAADHAAR_FieldValidation_2021\\Jan_Aadhaar_FieldValidation_Mapping.xlsx");
	//String url = "http://192.168.10.226:30547/#/citizenPortal/citizenBoard";
	String loginurl = "http://192.168.10.226:30604/#/login";
	String UserName="SUBRATKSHARMA90";
	String Password="Csmpl@123";
	
	
	
	String Column_name= "Status";
	String CitizenRegistration_Sheet="CitizenRegistration";
	String BasicDetails_Sheet="BasicDetails";
	String path="D:\\JANAADHAAR_FieldValidation_2021\\pp-size.jpeg";
	String memb_path="D:\\JANAADHAAR_FieldValidation_2021\\SUBRAT.jpg";
	String FamilyInformation_Sheet="BasicFamilyInformation";
	String PersonalInformationHoF_Sheet="PersonalInformationHoF";
	String FamilyIdentityDocuments_Sheet="FamilyIdentityDocs";    //FamilyIdentityDocs
	String FamilyMembDetails_Sheet="FamilyMemberDetails";
}
