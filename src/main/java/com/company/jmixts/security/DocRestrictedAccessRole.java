package com.company.jmixts.security;

import com.company.jmixts.entity.Doc;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.Role;

@Role(name = DocRestrictedAccessRole.ROLE_NAME, code = DocRestrictedAccessRole.ROLE_NAME)
public interface DocRestrictedAccessRole {
    String ROLE_NAME = "doc-restricted-access";

    @JpqlRowLevelPolicy(entityClass = Doc.class,
            join = "left join {E}.roles r left join r.user cu left join {E}.creator c",
            where = "c.username = :session$username or cu.username = :session$username")
    void task();
}
