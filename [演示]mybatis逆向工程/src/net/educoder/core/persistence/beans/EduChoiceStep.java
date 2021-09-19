package net.educoder.core.persistence.beans;

import java.util.Date;

public class EduChoiceStep {
    private Long id;

    private String answer;

    private Byte category;

    private Byte type;

    private Byte difficulty;

    private Date createTime;

    private Date updateTime;

    private String question;

    private String choices;

    private String explain;

    private String choicesExplain;

    private String videoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Byte getCategory() {
        return category;
    }

    public void setCategory(Byte category) {
        this.category = category;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Byte difficulty) {
        this.difficulty = difficulty;
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getChoices() {
        return choices;
    }

    public void setChoices(String choices) {
        this.choices = choices == null ? null : choices.trim();
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public String getChoicesExplain() {
        return choicesExplain;
    }

    public void setChoicesExplain(String choicesExplain) {
        this.choicesExplain = choicesExplain == null ? null : choicesExplain.trim();
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }
}