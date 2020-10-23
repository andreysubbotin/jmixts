package com.company.jmixts.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "JMIXTS_ORGANIZATION")
@Entity(name = "jmixts_Organization")
public class Organization {
    private static final long serialVersionUID = 8073483246261811914L;

    @JmixGeneratedValue
    @Id
    @Column(name = "ID", nullable = false)
    private UUID id;

    @Column(name = "NAME")
    @InstanceName
    private String name;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Version
    @Column(name = "VERSION")
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}