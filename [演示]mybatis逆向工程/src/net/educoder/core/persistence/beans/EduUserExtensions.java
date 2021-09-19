package net.educoder.core.persistence.beans;

import java.util.Date;

public class EduUserExtensions {
    private Long id;

    private Long userId;

    private Date birthday;

    private String briefIntroduction;

    private Integer gender;

    private String location;

    private String occupation;

    private Integer workExperience;

    private Integer zipCode;

    private Date createTime;

    private Date updateTime;

    private String technicalTitle;

    private Integer identity;

    private String studentId;

    private String teacherRealname;

    private String studentRealname;

    private String locationCity;

    private Integer schoolId;

    private String description;

    private Integer departmentId;

    private Integer eduBackground;

    private Integer eduEntryYear;

    private String backupRecord;

    private String province;

    private String city;

    private String customDepartment;

    private Boolean showEmail;

    private Boolean showLocation;

    private Boolean showDepartment;

    private String honor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBriefIntroduction() {
        return briefIntroduction;
    }

    public void setBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction == null ? null : briefIntroduction.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public Integer getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTechnicalTitle() {
        return technicalTitle;
    }

    public void setTechnicalTitle(String technicalTitle) {
        this.technicalTitle = technicalTitle == null ? null : technicalTitle.trim();
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getTeacherRealname() {
        return teacherRealname;
    }

    public void setTeacherRealname(String teacherRealname) {
        this.teacherRealname = teacherRealname == null ? null : teacherRealname.trim();
    }

    public String getStudentRealname() {
        return studentRealname;
    }

    public void setStudentRealname(String studentRealname) {
        this.studentRealname = studentRealname == null ? null : studentRealname.trim();
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity == null ? null : locationCity.trim();
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getEduBackground() {
        return eduBackground;
    }

    public void setEduBackground(Integer eduBackground) {
        this.eduBackground = eduBackground;
    }

    public Integer getEduEntryYear() {
        return eduEntryYear;
    }

    public void setEduEntryYear(Integer eduEntryYear) {
        this.eduEntryYear = eduEntryYear;
    }

    public String getBackupRecord() {
        return backupRecord;
    }

    public void setBackupRecord(String backupRecord) {
        this.backupRecord = backupRecord == null ? null : backupRecord.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCustomDepartment() {
        return customDepartment;
    }

    public void setCustomDepartment(String customDepartment) {
        this.customDepartment = customDepartment == null ? null : customDepartment.trim();
    }

    public Boolean getShowEmail() {
        return showEmail;
    }

    public void setShowEmail(Boolean showEmail) {
        this.showEmail = showEmail;
    }

    public Boolean getShowLocation() {
        return showLocation;
    }

    public void setShowLocation(Boolean showLocation) {
        this.showLocation = showLocation;
    }

    public Boolean getShowDepartment() {
        return showDepartment;
    }

    public void setShowDepartment(Boolean showDepartment) {
        this.showDepartment = showDepartment;
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor == null ? null : honor.trim();
    }
}