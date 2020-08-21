package com.company.jmixts.entity;

import io.jmix.core.JmixEntity;
import io.jmix.core.metamodel.annotation.ModelProperty;
import io.jmix.core.metamodel.annotation.PropertyDatatype;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@DiscriminatorValue("T")
@Table(name = "JMIXTS_TASK")
@Entity(name = "jmixts_Task")
@PrimaryKeyJoinColumn(name = "CARD_ID", referencedColumnName = "ID")
public class Task extends Card implements JmixEntity {
    private static final long serialVersionUID = -5738459041323287321L;

    @Column(name = "NUM")
    private String num;

    @Column(name = "EXECUTED")
    private Boolean executed;

    @PropertyDatatype("date")
    @Column(name = "CREATE_DATE")
    private java.util.Date createDate;

    @Column(name = "TASK_NAME")
    private String taskName;

    @Column(name = "FULL_DESCRIPTION")
    private String fullDescription;

    @Column(name = "DURATION")
    private Integer duration;

    @PropertyDatatype("date")
    @Column(name = "FINISH_DATE_TIME_FACT")
    private Date finishDateTimeFact;

    @PropertyDatatype("date")
    @Column(name = "FINISH_DATE_TIME_PLAN")
    private Date finishDateTimePlan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRIORITY_ID")
    private Priority priority;

    @JoinTable(name = "JMIXTS_TASK_PROJECT_LINK",
            joinColumns = @JoinColumn(name = "CARD_ID"),
            inverseJoinColumns = @JoinColumn(name = "PROJECT_ID"))
    @ManyToMany
    private Set<Project> projects;

    public Boolean getExecuted() {
        return executed;
    }

    public void setExecuted(Boolean executed) {
        this.executed = executed;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getDuration() {
        return duration;
    }

    public Date getFinishDateTimeFact() {
        return finishDateTimeFact;
    }

    public void setFinishDateTimeFact(Date finishDateTimeFact) {
        this.finishDateTimeFact = finishDateTimeFact;
    }

    public Date getFinishDateTimePlan() {
        return finishDateTimePlan;
    }

    public void setFinishDateTimePlan(Date finishDateTimePlan) {
        this.finishDateTimePlan = finishDateTimePlan;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public java.util.Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
}