package com.company.jmixts.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import java.util.Objects;

public enum DocType implements EnumClass<String> {
    INCOME("INCOME"),
    OUTCOME("OUTCOME"),
    INTERNAL("INTERNAL");

    final String id;

    DocType(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    public static final DocType fromId(String id) {
        for (DocType docType : DocType.values()) {
            if (Objects.equals(docType.getId(), id)) {
                return docType;
            }
        }
        return null;
    }
}
