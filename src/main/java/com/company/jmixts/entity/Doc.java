package com.company.jmixts.entity;

import io.jmix.core.metamodel.annotation.PropertyDatatype;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "JMIXTS_DOC")
@Entity(name = "jmixts_Doc")
@PrimaryKeyJoinColumn(name = "CARD_ID", referencedColumnName = "ID")
public class Doc extends Card {
    private static final long serialVersionUID = -7375982138217145030L;

    @Column(name = "NUMBER_")
    private String number;

    @PropertyDatatype("date")
    @Column(name = "DATE_")
    private Date date;

    @PropertyDatatype("date")
    @Column(name = "CREATE_DATE")
    private Date createDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OWNER_ID")
    private User owner;

    @JoinColumn(name = "DEPARTMENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    @Lob
    @Column(name = "COMMENT_")
    private String comment;

    @Column(name = "DOC_TYPE")
    private String docType;

    @PropertyDatatype("date")
    @Column(name = "INCOME_DATE")
    private Date incomeDate;

    @Column(name = "INCOME_NO")
    private String incomeNo;

    @Column(name = "OUTCOME_DATE")
    private String outcomeDate;

    @Column(name = "OUTCOME_NO")
    private String outcomeNo;

    @Column(name = "REGISTERED")
    private Boolean registered;

    @PropertyDatatype("date")
    @Column(name = "REG_DATE")
    private Date regDate;

    @JoinTable(name = "JMIXTS_DOC_PROJECT_LINK",
            joinColumns = @JoinColumn(name = "CARD_ID"),
            inverseJoinColumns = @JoinColumn(name = "PROJECT_ID"))
    @ManyToMany
    private List<Project> projects;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Boolean getRegistered() {
        return registered;
    }

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }

    public String getOutcomeNo() {
        return outcomeNo;
    }

    public void setOutcomeNo(String outcomeNo) {
        this.outcomeNo = outcomeNo;
    }

    public String getOutcomeDate() {
        return outcomeDate;
    }

    public void setOutcomeDate(String outcomeDate) {
        this.outcomeDate = outcomeDate;
    }

    public String getIncomeNo() {
        return incomeNo;
    }

    public void setIncomeNo(String incomeNo) {
        this.incomeNo = incomeNo;
    }

    public Date getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(Date incomeDate) {
        this.incomeDate = incomeDate;
    }

    public DocType getDocType() {
        return DocType.fromId(docType);
    }

    public void setDocType(DocType docType) {
        this.docType = docType.getId();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}