package demo.entity;

/**
 * @PackageName:demo.entity
 * @ClassName:SkeyeduUser
 * @Description:  //TODO: skeydu_user实体
 * @author: 悟空
 * @date: 2021/3/25 10:21
 * @email: 10947@163.com
 */
public class SkeyeduUser {
    private Integer id;
    private String userCode;
    private String loginName;
    private String userName;
    private String password;
    private Integer sex;
    private String identityCode;
    private String email;
    private String mobile;
    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public SkeyeduUser() {
    }

    public SkeyeduUser(Integer id, String userCode, String loginName, String userName, String password, Integer sex, String identityCode, String email, String mobile, Integer type) {
        this.id = id;
        this.userCode = userCode;
        this.loginName = loginName;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.identityCode = identityCode;
        this.email = email;
        this.mobile = mobile;
        this.type = type;
    }

    @Override
    public String toString() {
        return "SkeyeduUser{" +
                "id=" + id +
                ", userCode='" + userCode + '\'' +
                ", loginName='" + loginName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", identityCode='" + identityCode + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", type=" + type +
                '}';
    }




}
