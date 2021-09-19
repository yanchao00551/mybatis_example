package net.educoder.core.persistence.beans;

import java.util.Date;

public class EduUsers {
    private Long id;

    private String login;

    private String hashedPassword;

    private String firstname;

    private String lastname;

    private String mail;

    private Boolean admin;

    private Integer status;

    private Date lastLoginOn;

    private String language;

    private Integer authSourceId;

    private String type;

    private String identityUrl;

    private String mailNotification;

    private String salt;

    private Integer gid;

    private Integer visits;

    private Integer excellentTeacher;

    private Integer excellentStudent;

    private String phone;

    private Boolean authentication;

    private Integer grade;

    private Integer experience;

    private String nickname;

    private Boolean showRealname;

    private Boolean professionalCertification;

    private String idNumber;

    private Integer certification;

    private Boolean homepageTeacher;

    private Boolean homepageEngineer;

    private Byte isTest;

    private Integer ecoderUserId;

    private Boolean business;

    private Boolean profileCompleted;

    private Long laboratoryId;

    private Boolean isShixunMarker;

    private Boolean adminVisitable;

    private Boolean collaborator;

    private Boolean isMirrorMarker;

    private String platform;

    private String giteaToken;

    private Integer giteaUid;

    private Boolean isSyncPwd;

    private Integer watchersCount;

    private Integer devopsStep;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login == null ? null : login.trim();
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword == null ? null : hashedPassword.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLastLoginOn() {
        return lastLoginOn;
    }

    public void setLastLoginOn(Date lastLoginOn) {
        this.lastLoginOn = lastLoginOn;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Integer getAuthSourceId() {
        return authSourceId;
    }

    public void setAuthSourceId(Integer authSourceId) {
        this.authSourceId = authSourceId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIdentityUrl() {
        return identityUrl;
    }

    public void setIdentityUrl(String identityUrl) {
        this.identityUrl = identityUrl == null ? null : identityUrl.trim();
    }

    public String getMailNotification() {
        return mailNotification;
    }

    public void setMailNotification(String mailNotification) {
        this.mailNotification = mailNotification == null ? null : mailNotification.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getVisits() {
        return visits;
    }

    public void setVisits(Integer visits) {
        this.visits = visits;
    }

    public Integer getExcellentTeacher() {
        return excellentTeacher;
    }

    public void setExcellentTeacher(Integer excellentTeacher) {
        this.excellentTeacher = excellentTeacher;
    }

    public Integer getExcellentStudent() {
        return excellentStudent;
    }

    public void setExcellentStudent(Integer excellentStudent) {
        this.excellentStudent = excellentStudent;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Boolean getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Boolean authentication) {
        this.authentication = authentication;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Boolean getShowRealname() {
        return showRealname;
    }

    public void setShowRealname(Boolean showRealname) {
        this.showRealname = showRealname;
    }

    public Boolean getProfessionalCertification() {
        return professionalCertification;
    }

    public void setProfessionalCertification(Boolean professionalCertification) {
        this.professionalCertification = professionalCertification;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public Integer getCertification() {
        return certification;
    }

    public void setCertification(Integer certification) {
        this.certification = certification;
    }

    public Boolean getHomepageTeacher() {
        return homepageTeacher;
    }

    public void setHomepageTeacher(Boolean homepageTeacher) {
        this.homepageTeacher = homepageTeacher;
    }

    public Boolean getHomepageEngineer() {
        return homepageEngineer;
    }

    public void setHomepageEngineer(Boolean homepageEngineer) {
        this.homepageEngineer = homepageEngineer;
    }

    public Byte getIsTest() {
        return isTest;
    }

    public void setIsTest(Byte isTest) {
        this.isTest = isTest;
    }

    public Integer getEcoderUserId() {
        return ecoderUserId;
    }

    public void setEcoderUserId(Integer ecoderUserId) {
        this.ecoderUserId = ecoderUserId;
    }

    public Boolean getBusiness() {
        return business;
    }

    public void setBusiness(Boolean business) {
        this.business = business;
    }

    public Boolean getProfileCompleted() {
        return profileCompleted;
    }

    public void setProfileCompleted(Boolean profileCompleted) {
        this.profileCompleted = profileCompleted;
    }

    public Long getLaboratoryId() {
        return laboratoryId;
    }

    public void setLaboratoryId(Long laboratoryId) {
        this.laboratoryId = laboratoryId;
    }

    public Boolean getIsShixunMarker() {
        return isShixunMarker;
    }

    public void setIsShixunMarker(Boolean isShixunMarker) {
        this.isShixunMarker = isShixunMarker;
    }

    public Boolean getAdminVisitable() {
        return adminVisitable;
    }

    public void setAdminVisitable(Boolean adminVisitable) {
        this.adminVisitable = adminVisitable;
    }

    public Boolean getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(Boolean collaborator) {
        this.collaborator = collaborator;
    }

    public Boolean getIsMirrorMarker() {
        return isMirrorMarker;
    }

    public void setIsMirrorMarker(Boolean isMirrorMarker) {
        this.isMirrorMarker = isMirrorMarker;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getGiteaToken() {
        return giteaToken;
    }

    public void setGiteaToken(String giteaToken) {
        this.giteaToken = giteaToken == null ? null : giteaToken.trim();
    }

    public Integer getGiteaUid() {
        return giteaUid;
    }

    public void setGiteaUid(Integer giteaUid) {
        this.giteaUid = giteaUid;
    }

    public Boolean getIsSyncPwd() {
        return isSyncPwd;
    }

    public void setIsSyncPwd(Boolean isSyncPwd) {
        this.isSyncPwd = isSyncPwd;
    }

    public Integer getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    public Integer getDevopsStep() {
        return devopsStep;
    }

    public void setDevopsStep(Integer devopsStep) {
        this.devopsStep = devopsStep;
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
}