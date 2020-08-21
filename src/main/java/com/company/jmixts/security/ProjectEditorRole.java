package com.company.jmixts.security;

import com.company.jmixts.entity.Organization;
import com.company.jmixts.entity.Project;
import com.company.jmixts.screen.organization.OrganizationBrowse;
import com.company.jmixts.screen.project.ProjectBrowse;
import com.company.jmixts.screen.project.ProjectEdit;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.Role;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

import static io.jmix.security.model.EntityAttributePolicyAction.READ;
import static io.jmix.security.model.EntityAttributePolicyAction.UPDATE;
import static io.jmix.security.model.EntityPolicyAction.ALL;

@Role(name = ProjectEditorRole.ROLE_NAME, code = ProjectEditorRole.ROLE_NAME)
public interface ProjectEditorRole {
    String ROLE_NAME = "project-editor";

    @MenuPolicy(menuIds = "references")
    void mainMenu();

    @MenuPolicy(menuIds = "jmixts_Project.browse")
    @ScreenPolicy(screenClasses = {ProjectBrowse.class, ProjectEdit.class})
    @EntityPolicy(entityClass = Project.class, actions = ALL)
    @EntityAttributePolicy(entityClass = Project.class, attributes = "*", actions = {READ, UPDATE})
    void project();

    @ScreenPolicy(screenClasses = OrganizationBrowse.class)
    @EntityPolicy(entityClass = Organization.class, actions = EntityPolicyAction.READ)
    @EntityAttributePolicy(entityClass = Organization.class, attributes = "*", actions = READ)
    void organization();
}
