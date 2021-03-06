package com.prcmind.view;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.prcmind.utils.ReflectUtil;

public class ReportParamView implements Serializable {

	private static final long serialVersionUID = 1857581288851781834L;

	private String enterpriseNo;//

	private String scaleNo;//

	private String medicNo;// 施测者

	private String medicName;// 施测者姓名

	private String testeeName;// 儿童姓名

	private String cardType;// 身份信息卡类型

	private String cardNo;// 身份证号码

	private String sex;// 性别

	private String birthDay;// 出生日期

	private String testDay;// 完成问卷日期

	private String gestationalWeeks;// 孕周

	private String gestationalDays;// 孕天

	private String births;// 出生时情况

	private String consignorName;// 完成问卷人姓名

	private String consignorType;// 与儿童关系

	private String weight;// 体重

	private String address;// 通讯地址

	private String zip;// 邮政编码

	private String email;// 电子邮箱

	private String tel;// 联系电话

	private String remarks;// 备注

	private String patronnInfo;// 协助填写问卷人

	private String motherCultureDegree;// 母亲文化程度

	private String motherCareerCategory;// 母亲职业大类

	private String motherCareer;// 母亲职业

	private String fatherCultureDegree;// 父亲文化程度

	private String fatherCareerCategory;// 父亲职业大类

	private String fatherCareer;// 父亲职业

	private String caregiversCultureDegree;// 主要照顾人文化程度

	private String motherBirthday;// 母亲生日

	private String fatherBirthday;// 父亲生日

	private String maritalStatus;// 婚姻状况

	private String birthsResult;// 出生情况（数字转中文）

	private String abnormalities;
	private String testeeNameHide;

	private boolean testeeNameShow;

	private String cardTypeHide;

	private boolean cardTypeShow;

	private String cardNoHide;

	private boolean cardNoShow;

	private String sexHide;

	private boolean sexShow;

	private String birthDayHide;

	private boolean birthDayShow;

	private String testDayHide;

	private boolean testDayShow;

	private String gestationalWeeksDaysHide;

	private boolean gestationalWeeksDaysShow;

	private String birthsHide;

	private boolean birthsShow;

	private String consignorNameHide;

	private boolean consignorNameShow;

	private String consignorTypeHide;

	private boolean consignorTypeShow;

	private String weightHide;

	private boolean weightShow;

	private String addressHide;

	private boolean addressShow;

	private String zipHide;

	private boolean zipShow;

	private String emailHide;

	private boolean emailShow;

	private String telHide;

	private boolean telShow;

	private String patronnInfoHide;

	private boolean patronnInfoShow;

	private String motherCultureDegreeHide;

	private boolean motherCultureDegreeShow;

	private String motherCareerCategoryHide;

	private boolean motherCareerCategoryShow;

	private String motherCareerHide;

	private boolean motherCareerShow;

	private String fatherCultureDegreeHide;

	private boolean fatherCultureDegreeShow;

	private String fatherCareerCategoryHide;

	private boolean fatherCareerCategoryShow;

	private String fatherCareerHide;

	private boolean fatherCareerShow;

	private String caregiversCultureDegreeHide;

	private boolean caregiversCultureDegreeShow;

	private String maritalStatusHide;

	private boolean maritalStatusShow;

	private String motherBirthdayHide;

	private boolean motherBirthdayShow;

	private String fatherBirthdayHide;

	private boolean fatherBirthdayShow;

	private String remarksHide;

	private boolean remarksShow;
	
	private String abnormalitiesHide;
	private boolean abnormalitiesShow;

	public String getAbnormalities() {
		return abnormalities;
	}

	public void setAbnormalities(String abnormalities) {
		this.abnormalities = abnormalities;
	}

	public String getAbnormalitiesHide() {
		return abnormalitiesHide;
	}

	public void setAbnormalitiesHide(String abnormalitiesHide) {
		this.abnormalitiesHide = abnormalitiesHide;
	}

	public boolean isAbnormalitiesShow() {
		return abnormalitiesShow;
	}

	public void setAbnormalitiesShow(boolean abnormalitiesShow) {
		this.abnormalitiesShow = abnormalitiesShow;
	}

	public String getMedicNo() {
		return medicNo;
	}

	public void setMedicNo(String medicNo) {
		this.medicNo = medicNo;
	}

	public String getMedicName() {
		return medicName;
	}

	public void setMedicName(String medicName) {
		this.medicName = medicName;
	}

	public String getTesteeName() {
		return testeeName;
	}

	public void setTesteeName(String testeeName) {
		this.testeeName = testeeName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getTestDay() {
		return testDay;
	}

	public void setTestDay(String testDay) {
		this.testDay = testDay;
	}

	public String getGestationalWeeks() {
		return gestationalWeeks;
	}

	public void setGestationalWeeks(String gestationalWeeks) {
		this.gestationalWeeks = gestationalWeeks;
	}

	public String getBirths() {
		return births;
	}

	public void setBirths(String births) {
		this.births = births;
	}

	public String getConsignorName() {
		return consignorName;
	}

	public void setConsignorName(String consignorName) {
		this.consignorName = consignorName;
	}

	public String getConsignorType() {
		return consignorType;
	}

	public void setConsignorType(String consignorType) {
		this.consignorType = consignorType;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getPatronnInfo() {
		return patronnInfo;
	}

	public void setPatronnInfo(String patronnInfo) {
		this.patronnInfo = patronnInfo;
	}

	public String getMotherCultureDegree() {
		return motherCultureDegree;
	}

	public void setMotherCultureDegree(String motherCultureDegree) {
		this.motherCultureDegree = motherCultureDegree;
	}

	public String getMotherCareerCategory() {
		return motherCareerCategory;
	}

	public void setMotherCareerCategory(String motherCareerCategory) {
		this.motherCareerCategory = motherCareerCategory;
	}

	public String getMotherCareer() {
		return motherCareer;
	}

	public void setMotherCareer(String motherCareer) {
		this.motherCareer = motherCareer;
	}

	public String getFatherCultureDegree() {
		return fatherCultureDegree;
	}

	public void setFatherCultureDegree(String fatherCultureDegree) {
		this.fatherCultureDegree = fatherCultureDegree;
	}

	public String getFatherCareerCategory() {
		return fatherCareerCategory;
	}

	public void setFatherCareerCategory(String fatherCareerCategory) {
		this.fatherCareerCategory = fatherCareerCategory;
	}

	public String getFatherCareer() {
		return fatherCareer;
	}

	public void setFatherCareer(String fatherCareer) {
		this.fatherCareer = fatherCareer;
	}

	public String getCaregiversCultureDegree() {
		return caregiversCultureDegree;
	}

	public void setCaregiversCultureDegree(String caregiversCultureDegree) {
		this.caregiversCultureDegree = caregiversCultureDegree;
	}

	public String getMotherBirthday() {
		return motherBirthday;
	}

	public void setMotherBirthday(String motherBirthday) {
		this.motherBirthday = motherBirthday;
	}

	public String getFatherBirthday() {
		return fatherBirthday;
	}

	public void setFatherBirthday(String fatherBirthday) {
		this.fatherBirthday = fatherBirthday;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getTesteeNameHide() {
		return testeeNameHide;
	}

	public void setTesteeNameHide(String testeeNameHide) {
		this.testeeNameHide = testeeNameHide;
	}

	public String getCardTypeHide() {
		return cardTypeHide;
	}

	public void setCardTypeHide(String cardTypeHide) {
		this.cardTypeHide = cardTypeHide;
	}

	public String getCardNoHide() {
		return cardNoHide;
	}

	public void setCardNoHide(String cardNoHide) {
		this.cardNoHide = cardNoHide;
	}

	public String getSexHide() {
		return sexHide;
	}

	public void setSexHide(String sexHide) {
		this.sexHide = sexHide;
	}

	public String getBirthDayHide() {
		return birthDayHide;
	}

	public void setBirthDayHide(String birthDayHide) {
		this.birthDayHide = birthDayHide;
	}

	public String getTestDayHide() {
		return testDayHide;
	}

	public void setTestDayHide(String testDayHide) {
		this.testDayHide = testDayHide;
	}

	public String getGestationalWeeksDaysHide() {
		return gestationalWeeksDaysHide;
	}

	public void setGestationalWeeksDaysHide(String gestationalWeeksDaysHide) {
		this.gestationalWeeksDaysHide = gestationalWeeksDaysHide;
	}

	public String getBirthsHide() {
		return birthsHide;
	}

	public void setBirthsHide(String birthsHide) {
		this.birthsHide = birthsHide;
	}

	public String getConsignorNameHide() {
		return consignorNameHide;
	}

	public void setConsignorNameHide(String consignorNameHide) {
		this.consignorNameHide = consignorNameHide;
	}

	public String getConsignorTypeHide() {
		return consignorTypeHide;
	}

	public void setConsignorTypeHide(String consignorTypeHide) {
		this.consignorTypeHide = consignorTypeHide;
	}

	public String getWeightHide() {
		return weightHide;
	}

	public void setWeightHide(String weightHide) {
		this.weightHide = weightHide;
	}

	public String getAddressHide() {
		return addressHide;
	}

	public void setAddressHide(String addressHide) {
		this.addressHide = addressHide;
	}

	public String getZipHide() {
		return zipHide;
	}

	public void setZipHide(String zipHide) {
		this.zipHide = zipHide;
	}

	public String getEmailHide() {
		return emailHide;
	}

	public void setEmailHide(String emailHide) {
		this.emailHide = emailHide;
	}

	public String getTelHide() {
		return telHide;
	}

	public void setTelHide(String telHide) {
		this.telHide = telHide;
	}

	public String getPatronnInfoHide() {
		return patronnInfoHide;
	}

	public void setPatronnInfoHide(String patronnInfoHide) {
		this.patronnInfoHide = patronnInfoHide;
	}

	public String getMotherCareerCategoryHide() {
		return motherCareerCategoryHide;
	}

	public void setMotherCareerCategoryHide(String motherCareerCategoryHide) {
		this.motherCareerCategoryHide = motherCareerCategoryHide;
	}

	public String getMotherCareerHide() {
		return motherCareerHide;
	}

	public void setMotherCareerHide(String motherCareerHide) {
		this.motherCareerHide = motherCareerHide;
	}

	public String getFatherCultureDegreeHide() {
		return fatherCultureDegreeHide;
	}

	public void setFatherCultureDegreeHide(String fatherCultureDegreeHide) {
		this.fatherCultureDegreeHide = fatherCultureDegreeHide;
	}

	public String getFatherCareerCategoryHide() {
		return fatherCareerCategoryHide;
	}

	public void setFatherCareerCategoryHide(String fatherCareerCategoryHide) {
		this.fatherCareerCategoryHide = fatherCareerCategoryHide;
	}

	public String getFatherCareerHide() {
		return fatherCareerHide;
	}

	public void setFatherCareerHide(String fatherCareerHide) {
		this.fatherCareerHide = fatherCareerHide;
	}

	public String getCaregiversCultureDegreeHide() {
		return caregiversCultureDegreeHide;
	}

	public void setCaregiversCultureDegreeHide(String caregiversCultureDegreeHide) {
		this.caregiversCultureDegreeHide = caregiversCultureDegreeHide;
	}

	public String getMaritalStatusHide() {
		return maritalStatusHide;
	}

	public void setMaritalStatusHide(String maritalStatusHide) {
		this.maritalStatusHide = maritalStatusHide;
	}

	public String getRemarksHide() {
		return remarksHide;
	}

	public void setRemarksHide(String remarksHide) {
		this.remarksHide = remarksHide;
	}

	public boolean isTesteeNameShow() {
		return testeeNameShow;
	}

	public void setTesteeNameShow(boolean testeeNameShow) {
		this.testeeNameShow = testeeNameShow;
	}

	public boolean isCardTypeShow() {
		return cardTypeShow;
	}

	public void setCardTypeShow(boolean cardTypeShow) {
		this.cardTypeShow = cardTypeShow;
	}

	public boolean isCardNoShow() {
		return cardNoShow;
	}

	public void setCardNoShow(boolean cardNoShow) {
		this.cardNoShow = cardNoShow;
	}

	public boolean isSexShow() {
		return sexShow;
	}

	public void setSexShow(boolean sexShow) {
		this.sexShow = sexShow;
	}

	public boolean isBirthDayShow() {
		return birthDayShow;
	}

	public void setBirthDayShow(boolean birthDayShow) {
		this.birthDayShow = birthDayShow;
	}

	public boolean isTestDayShow() {
		return testDayShow;
	}

	public void setTestDayShow(boolean testDayShow) {
		this.testDayShow = testDayShow;
	}

	public boolean isGestationalWeeksDaysShow() {
		return gestationalWeeksDaysShow;
	}

	public void setGestationalWeeksDaysShow(boolean gestationalWeeksDaysShow) {
		this.gestationalWeeksDaysShow = gestationalWeeksDaysShow;
	}

	public boolean isBirthsShow() {
		return birthsShow;
	}

	public void setBirthsShow(boolean birthsShow) {
		this.birthsShow = birthsShow;
	}

	public boolean isConsignorNameShow() {
		return consignorNameShow;
	}

	public void setConsignorNameShow(boolean consignorNameShow) {
		this.consignorNameShow = consignorNameShow;
	}

	public boolean isConsignorTypeShow() {
		return consignorTypeShow;
	}

	public void setConsignorTypeShow(boolean consignorTypeShow) {
		this.consignorTypeShow = consignorTypeShow;
	}

	public boolean isWeightShow() {
		return weightShow;
	}

	public void setWeightShow(boolean weightShow) {
		this.weightShow = weightShow;
	}

	public boolean isAddressShow() {
		return addressShow;
	}

	public void setAddressShow(boolean addressShow) {
		this.addressShow = addressShow;
	}

	public boolean isZipShow() {
		return zipShow;
	}

	public void setZipShow(boolean zipShow) {
		this.zipShow = zipShow;
	}

	public boolean isEmailShow() {
		return emailShow;
	}

	public void setEmailShow(boolean emailShow) {
		this.emailShow = emailShow;
	}

	public boolean isTelShow() {
		return telShow;
	}

	public void setTelShow(boolean telShow) {
		this.telShow = telShow;
	}

	public boolean isPatronnInfoShow() {
		return patronnInfoShow;
	}

	public void setPatronnInfoShow(boolean patronnInfoShow) {
		this.patronnInfoShow = patronnInfoShow;
	}

	public boolean isMotherCareerCategoryShow() {
		return motherCareerCategoryShow;
	}

	public void setMotherCareerCategoryShow(boolean motherCareerCategoryShow) {
		this.motherCareerCategoryShow = motherCareerCategoryShow;
	}

	public boolean isMotherCareerShow() {
		return motherCareerShow;
	}

	public void setMotherCareerShow(boolean motherCareerShow) {
		this.motherCareerShow = motherCareerShow;
	}

	public boolean isFatherCultureDegreeShow() {
		return fatherCultureDegreeShow;
	}

	public void setFatherCultureDegreeShow(boolean fatherCultureDegreeShow) {
		this.fatherCultureDegreeShow = fatherCultureDegreeShow;
	}

	public boolean isFatherCareerCategoryShow() {
		return fatherCareerCategoryShow;
	}

	public void setFatherCareerCategoryShow(boolean fatherCareerCategoryShow) {
		this.fatherCareerCategoryShow = fatherCareerCategoryShow;
	}

	public boolean isFatherCareerShow() {
		return fatherCareerShow;
	}

	public void setFatherCareerShow(boolean fatherCareerShow) {
		this.fatherCareerShow = fatherCareerShow;
	}

	public boolean isCaregiversCultureDegreeShow() {
		return caregiversCultureDegreeShow;
	}

	public void setCaregiversCultureDegreeShow(boolean caregiversCultureDegreeShow) {
		this.caregiversCultureDegreeShow = caregiversCultureDegreeShow;
	}

	public boolean isMaritalStatusShow() {
		return maritalStatusShow;
	}

	public void setMaritalStatusShow(boolean maritalStatusShow) {
		this.maritalStatusShow = maritalStatusShow;
	}

	public String getMotherBirthdayHide() {
		return motherBirthdayHide;
	}

	public void setMotherBirthdayHide(String motherBirthdayHide) {
		this.motherBirthdayHide = motherBirthdayHide;
	}

	public boolean isMotherBirthdayShow() {
		return motherBirthdayShow;
	}

	public void setMotherBirthdayShow(boolean motherBirthdayShow) {
		this.motherBirthdayShow = motherBirthdayShow;
	}

	public String getFatherBirthdayHide() {
		return fatherBirthdayHide;
	}

	public void setFatherBirthdayHide(String fatherBirthdayHide) {
		this.fatherBirthdayHide = fatherBirthdayHide;
	}

	public boolean isFatherBirthdayShow() {
		return fatherBirthdayShow;
	}

	public void setFatherBirthdayShow(boolean fatherBirthdayShow) {
		this.fatherBirthdayShow = fatherBirthdayShow;
	}

	public boolean isRemarksShow() {
		return remarksShow;
	}

	public void setRemarksShow(boolean remarksShow) {
		this.remarksShow = remarksShow;
	}

	public String getBirthsResult() {
		return birthsResult;
	}

	public void setBirthsResult(String birthsResult) {
		this.birthsResult = birthsResult;
	}

	public String getGestationalDays() {
		return gestationalDays;
	}

	public void setGestationalDays(String gestationalDays) {
		this.gestationalDays = gestationalDays;
	}

	public String getEnterpriseNo() {
		return enterpriseNo;
	}

	public void setEnterpriseNo(String enterpriseNo) {
		this.enterpriseNo = enterpriseNo;
	}

	public String getScaleNo() {
		return scaleNo;
	}

	public void setScaleNo(String scaleNo) {
		this.scaleNo = scaleNo;
	}
	
	public String getMotherCultureDegreeHide() {
		return motherCultureDegreeHide;
	}

	public void setMotherCultureDegreeHide(String motherCultureDegreeHide) {
		this.motherCultureDegreeHide = motherCultureDegreeHide;
	}

	public boolean isMotherCultureDegreeShow() {
		return motherCultureDegreeShow;
	}

	public void setMotherCultureDegreeShow(boolean motherCultureDegreeShow) {
		this.motherCultureDegreeShow = motherCultureDegreeShow;
	}

	/**
	 * 验证各个字段是否显示
	 * 
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	public void checkShow() throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = ReportParamView.class.getDeclaredFields();
		Map<String, Object> map = new HashMap<>();
		for (Field field : fields) {
			String fieldName = field.getName();
			int prefixIndex = fieldName.indexOf("Hide");
			if (prefixIndex > 0) {
				boolean isShow = true;// 不传值默认显示
				Object value = field.get(this);
				if (value != null) {
					String valueStr = (String) value;
					if (valueStr.equals("1")) {
						isShow = false;
					}
				} 
				else {
					String name = fieldName.replace("Hide", "").trim();
					if (map.size() > 3 ) {
							if (!map.containsKey(name)) {
								isShow = false;
							}
					}
				}
				String showFieldName = fieldName.substring(0, prefixIndex) + "Show";
				Field showField = ReflectUtil.getField(this, showFieldName);
				showField.setAccessible(true);
				showField.set(this, isShow);
			} else {
				if(fieldName.indexOf("Show")< 0){
					Object value = field.get(this);
					if (value != null && !fieldName.equals("serialVersionUID")) {
						map.put(fieldName, value);
					}
				}
				
				

			}
		}
	}

	public void getBirthsSituation() {
		String birthsResult = "";
		if (!StringUtils.isEmpty(this.getBirths())) {
			String births = this.getBirths();
			if (births.startsWith(";")) {
				births = births.substring(1, births.length());
			}
			if (births.endsWith(";")) {
				births = births.substring(0, births.length() - 1);
			}
			String[] arr = births.split(";");
			for (int i = 0; i < arr.length; i++) {
				birthsResult += birthConvert(Integer.valueOf(arr[i])) + ";";
			}
			birthsResult = birthsResult.substring(0, birthsResult.length() - 1);
		}
		setBirthsResult(birthsResult);
	}

	public static String birthConvert(int birthId) {
		String birth = "";
		switch (birthId) {
		case 0:
			birth = "足月";
			break;
		case 1:
			birth = "早产";
			break;
		case 2:
			birth = "顺产";
			break;
		case 3:
			birth = "剖腹产";
			break;
		case 4:
			birth = "产钳助产";
			break;
		case 5:
			birth = "吸引器助产";
			break;
		case 6:
			birth = "双胎";
			break;
		case 7:
			birth = "其他异常情况";
			break;
		default:
			birth = "";
			break;
		}
		return birth;
	}

	@Override
	public String toString() {
		return "ReportParamView [enterpriseNo=" + enterpriseNo + ", scaleNo=" + scaleNo + ", medicNo=" + medicNo
				+ ", medicName=" + medicName + ", testeeName=" + testeeName + ", cardType=" + cardType + ", cardNo="
				+ cardNo + ", sex=" + sex + ", birthDay=" + birthDay + ", testDay=" + testDay + ", gestationalWeeks="
				+ gestationalWeeks + ", gestationalDays=" + gestationalDays + ", births=" + births + ", consignorName="
				+ consignorName + ", consignorType=" + consignorType + ", weight=" + weight + ", address=" + address
				+ ", zip=" + zip + ", email=" + email + ", tel=" + tel + ", remarks=" + remarks + ", patronnInfo="
				+ patronnInfo + ", motherCultureDegree=" + motherCultureDegree + ", motherCareerCategory="
				+ motherCareerCategory + ", motherCareer=" + motherCareer + ", fatherCultureDegree="
				+ fatherCultureDegree + ", fatherCareerCategory=" + fatherCareerCategory + ", fatherCareer="
				+ fatherCareer + ", caregiversCultureDegree=" + caregiversCultureDegree + ", motherBirthday="
				+ motherBirthday + ", fatherBirthday=" + fatherBirthday + ", maritalStatus=" + maritalStatus
				+ ", birthsResult=" + birthsResult + ", abnormalities=" + abnormalities + ", testeeNameHide="
				+ testeeNameHide + ", testeeNameShow=" + testeeNameShow + ", cardTypeHide=" + cardTypeHide
				+ ", cardTypeShow=" + cardTypeShow + ", cardNoHide=" + cardNoHide + ", cardNoShow=" + cardNoShow
				+ ", sexHide=" + sexHide + ", sexShow=" + sexShow + ", birthDayHide=" + birthDayHide + ", birthDayShow="
				+ birthDayShow + ", testDayHide=" + testDayHide + ", testDayShow=" + testDayShow
				+ ", gestationalWeeksDaysHide=" + gestationalWeeksDaysHide + ", gestationalWeeksDaysShow="
				+ gestationalWeeksDaysShow + ", birthsHide=" + birthsHide + ", birthsShow=" + birthsShow
				+ ", consignorNameHide=" + consignorNameHide + ", consignorNameShow=" + consignorNameShow
				+ ", consignorTypeHide=" + consignorTypeHide + ", consignorTypeShow=" + consignorTypeShow
				+ ", weightHide=" + weightHide + ", weightShow=" + weightShow + ", addressHide=" + addressHide
				+ ", addressShow=" + addressShow + ", zipHide=" + zipHide + ", zipShow=" + zipShow + ", emailHide="
				+ emailHide + ", emailShow=" + emailShow + ", telHide=" + telHide + ", telShow=" + telShow
				+ ", patronnInfoHide=" + patronnInfoHide + ", patronnInfoShow=" + patronnInfoShow
				+ ", motherCultureDegreeHide=" + motherCultureDegreeHide + ", motherCultureDegreeShow="
				+ motherCultureDegreeShow + ", motherCareerCategoryHide=" + motherCareerCategoryHide
				+ ", motherCareerCategoryShow=" + motherCareerCategoryShow + ", motherCareerHide=" + motherCareerHide
				+ ", motherCareerShow=" + motherCareerShow + ", fatherCultureDegreeHide=" + fatherCultureDegreeHide
				+ ", fatherCultureDegreeShow=" + fatherCultureDegreeShow + ", fatherCareerCategoryHide="
				+ fatherCareerCategoryHide + ", fatherCareerCategoryShow=" + fatherCareerCategoryShow
				+ ", fatherCareerHide=" + fatherCareerHide + ", fatherCareerShow=" + fatherCareerShow
				+ ", caregiversCultureDegreeHide=" + caregiversCultureDegreeHide + ", caregiversCultureDegreeShow="
				+ caregiversCultureDegreeShow + ", maritalStatusHide=" + maritalStatusHide + ", maritalStatusShow="
				+ maritalStatusShow + ", motherBirthdayHide=" + motherBirthdayHide + ", motherBirthdayShow="
				+ motherBirthdayShow + ", fatherBirthdayHide=" + fatherBirthdayHide + ", fatherBirthdayShow="
				+ fatherBirthdayShow + ", remarksHide=" + remarksHide + ", remarksShow=" + remarksShow
				+ ", abnormalitiesHide=" + abnormalitiesHide + ", abnormalitiesShow=" + abnormalitiesShow + "]";
	}
	
	
}
