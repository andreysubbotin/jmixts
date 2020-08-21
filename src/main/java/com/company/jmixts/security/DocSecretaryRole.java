package com.company.jmixts.security;

import com.company.jmixts.entity.*;
import com.company.jmixts.screen.cardrole.CardRoleEdit;
import com.company.jmixts.screen.department.DepartmentBrowse;
import com.company.jmixts.screen.doc.DocBrowse;
import com.company.jmixts.screen.doc.DocEdit;
import com.company.jmixts.screen.project.ProjectBrowse;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.Role;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

import static io.jmix.security.model.EntityAttributePolicyAction.READ;
import static io.jmix.security.model.EntityAttributePolicyAction.UPDATE;
import static io.jmix.security.model.EntityPolicyAction.ALL;

@Role(name = DocSecretaryRole.ROLE_NAME, code = DocSecretaryRole.ROLE_NAME)
public interface DocSecretaryRole {
    String ROLE_NAME = "doc-secretary";

    @MenuPolicy(menuIds = "docs")
    void docsMenu();

    @MenuPolicy(menuIds = "jmixts_Doc.browse")
    @ScreenPolicy(screenClasses = {DocBrowse.class, DocEdit.class})
    @EntityPolicy(entityClass = Doc.class, actions = ALL)
    @EntityAttributePolicy(entityClass = Doc.class, attributes = "*", actions = {READ, UPDATE})
    void doc();

    @ScreenPolicy(screenClasses = DepartmentBrowse.class)
    @EntityPolicy(entityClass = Department.class, actions = EntityPolicyAction.READ)
    @EntityAttributePolicy(entityClass = Department.class, attributes = "*", actions = READ)
    void department();

    @ScreenPolicy(screenClasses = ProjectBrowse.class)
    @EntityPolicy(entityClass = Project.class, actions = EntityPolicyAction.READ)
    @EntityAttributePolicy(entityClass = Project.class, attributes = "*", actions = READ)
    void project();

    @ScreenPolicy(screenClasses = CardRoleEdit.class)
    @EntityPolicy(entityClass = CardRole.class, actions = ALL)
    @EntityAttributePolicy(entityClass = CardRole.class, attributes = "*", actions = {READ, UPDATE})
    void role();

    @EntityPolicy(entityClass = User.class, actions = EntityPolicyAction.READ)
    @EntityAttributePolicy(entityClass = User.class, attributes = "username", actions = READ)
    void user();

    @EntityPolicy(entityClass = Organization.class, actions = EntityPolicyAction.READ)
    @EntityAttributePolicy(entityClass = Organization.class, attributes = "*", actions = READ)
    void organization();
}
