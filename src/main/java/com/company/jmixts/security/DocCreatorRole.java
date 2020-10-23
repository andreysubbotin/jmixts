package com.company.jmixts.security;

import com.company.jmixts.entity.*;
import com.company.jmixts.screen.cardrole.CardRoleEdit;
import com.company.jmixts.screen.department.DepartmentBrowse;
import com.company.jmixts.screen.doc.DocBrowse;
import com.company.jmixts.screen.doc.DocEdit;
import com.company.jmixts.screen.project.ProjectBrowse;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.Role;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

import static io.jmix.security.model.EntityAttributePolicyAction.MODIFY;
import static io.jmix.security.model.EntityAttributePolicyAction.VIEW;
import static io.jmix.security.model.EntityPolicyAction.ALL;
import static io.jmix.security.model.EntityPolicyAction.READ;

@Role(name = DocCreatorRole.ROLE_NAME, code = DocCreatorRole.ROLE_NAME)
public interface DocCreatorRole {
    String ROLE_NAME = "doc-creator";

    @MenuPolicy(menuIds = "docs")
    void docsMenu();

    @MenuPolicy(menuIds = "jmixts_Doc.browse")
    @ScreenPolicy(screenClasses = {DocBrowse.class, DocEdit.class})
    @EntityPolicy(entityClass = Doc.class, actions = ALL)
    @EntityAttributePolicy(entityClass = Doc.class, attributes = {
            "id", "version", "process", "roles", "creator",
            "number", "date", "createDate", "owner", "department",
            "comment", "docType"}, action = MODIFY)
    @EntityAttributePolicy(entityClass = Doc.class, attributes = {
            "incomeDate", "incomeNo", "outcomeDate", "outcomeNo",
            "registered", "regDate"}, action = VIEW)
    void doc();

    @ScreenPolicy(screenClasses = DepartmentBrowse.class)
    @EntityPolicy(entityClass = Department.class, actions = READ)
    @EntityAttributePolicy(entityClass = Department.class, attributes = "*", action = VIEW)
    void department();

    @ScreenPolicy(screenClasses = ProjectBrowse.class)
    @EntityPolicy(entityClass = Project.class, actions = READ)
    @EntityAttributePolicy(entityClass = Project.class, attributes = "*", action = VIEW)
    void project();

    @ScreenPolicy(screenClasses = CardRoleEdit.class)
    @EntityPolicy(entityClass = CardRole.class, actions = ALL)
    @EntityAttributePolicy(entityClass = CardRole.class, attributes = "*", action = MODIFY)
    void role();

    @EntityPolicy(entityClass = User.class, actions = READ)
    @EntityAttributePolicy(entityClass = User.class, attributes = "username", action = VIEW)
    void user();

    @EntityPolicy(entityClass = Organization.class, actions = READ)
    @EntityAttributePolicy(entityClass = Organization.class, attributes = "*", action = VIEW)
    void organization();
}
