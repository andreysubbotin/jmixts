package com.company.jmixts.security;

import com.company.jmixts.entity.Task;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.Role;

@Role(name = TaskRestrictedAccessRole.ROLE_NAME, code = TaskRestrictedAccessRole.ROLE_NAME)
public interface TaskRestrictedAccessRole {
    String ROLE_NAME = "task-restricted-access";

    @JpqlRowLevelPolicy(entityClass = Task.class,
            join = "left join {E}.roles r left join r.user cu left join {E}.creator c",
            where = "c.username = :session$username or cu.username = :session$username")
    void task();
}
