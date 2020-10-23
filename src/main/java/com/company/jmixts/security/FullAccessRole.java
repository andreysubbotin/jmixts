package com.company.jmixts.security;


import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.Role;
import io.jmix.security.role.annotation.SpecificPolicy;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

import static io.jmix.security.model.EntityAttributePolicyAction.MODIFY;
import static io.jmix.security.model.EntityPolicyAction.ALL;

@Role(name = FullAccessRole.ROLE_NAME, code = FullAccessRole.ROLE_NAME)
public interface FullAccessRole {
    String ROLE_NAME = "system-full-access";

    @EntityPolicy(entityName = "*", actions = ALL)
    @EntityAttributePolicy(entityName = "*", attributes = "*", action = MODIFY)
    @ScreenPolicy(screenIds = "*")
    @MenuPolicy(menuIds = "*")
    @SpecificPolicy(resources = "*")
    void fullAccess();
}