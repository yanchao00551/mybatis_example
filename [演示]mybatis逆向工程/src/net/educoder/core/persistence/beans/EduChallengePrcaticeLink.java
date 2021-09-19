package net.educoder.core.persistence.beans;

import java.util.Date;

public class EduChallengePrcaticeLink {
    private Long id;

    private Long challengeId;

    private Long imageId;

    private Integer languageId;

    private String runScript;

    private Integer exposePort;

    private Date createTime;

    private Date updateTime;

    private String practiceDescription;

    private String practiceCodePath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChallengeId() {
        return challengeId;
    }

    public void setChallengeId(Long challengeId) {
        this.challengeId = challengeId;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getRunScript() {
        return runScript;
    }

    public void setRunScript(String runScript) {
        this.runScript = runScript == null ? null : runScript.trim();
    }

    public Integer getExposePort() {
        return exposePort;
    }

    public void setExposePort(Integer exposePort) {
        this.exposePort = exposePort;
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

    public String getPracticeDescription() {
        return practiceDescription;
    }

    public void setPracticeDescription(String practiceDescription) {
        this.practiceDescription = practiceDescription == null ? null : practiceDescription.trim();
    }

    public String getPracticeCodePath() {
        return practiceCodePath;
    }

    public void setPracticeCodePath(String practiceCodePath) {
        this.practiceCodePath = practiceCodePath == null ? null : practiceCodePath.trim();
    }
}