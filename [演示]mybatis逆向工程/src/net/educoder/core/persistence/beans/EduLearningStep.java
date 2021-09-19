package net.educoder.core.persistence.beans;

import java.util.Date;

public class EduLearningStep {
    private Long id;

    private Boolean type;

    private Long detailStepId;

    private Long explainId;

    private Long userId;

    private Integer explainPosition;

    private Date createTime;

    private Date updateTime;

    private Boolean isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Long getDetailStepId() {
        return detailStepId;
    }

    public void setDetailStepId(Long detailStepId) {
        this.detailStepId = detailStepId;
    }

    public Long getExplainId() {
        return explainId;
    }

    public void setExplainId(Long explainId) {
        this.explainId = explainId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getExplainPosition() {
        return explainPosition;
    }

    public void setExplainPosition(Integer explainPosition) {
        this.explainPosition = explainPosition;
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

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}