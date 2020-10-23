package com.company.jmixts.security;

import com.company.jmixts.entity.Department;
import com.company.jmixts.entity.Organization;
import com.company.jmixts.entity.Priority;
import com.company.jmixts.entity.Project;
import com.company.jmixts.screen.department.DepartmentBrowse;
import com.company.jmixts.screen.department.DepartmentEdit;
import com.company.jmixts.screen.organization.OrganizationBrowse;
import com.company.jmixts.screen.organization.OrganizationEdit;
import com.company.jmixts.screen.priority.PriorityBrowse;
import com.company.jmixts.screen.priority.PriorityEdit;
import com.company.jmixts.screen.project.ProjectBrowse;
import com.company.jmixts.screen.project.ProjectEdit;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.Role;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

import static io.jmix.security.model.EntityAttributePolicyAction.MODIFY;
import static io.jmix.security.model.EntityPolicyAction.ALL;

//TODO: all for actions on entity attributes
//TODO: menuId as screenClass

@Role(name = ReferenceEditorRole.ROLE_NAME, code = ReferenceEditorRole.ROLE_NAME)
public interface ReferenceEditorRole {
    String ROLE_NAME = "reference-editor";

    @MenuPolicy(menuIds = "references")
    void mainMenu();

    @MenuPolicy(menuIds = "jmixts_Project.browse")
    @ScreenPolicy(screenClasses = {ProjectBrowse.class, ProjectEdit.class})
    @EntityPolicy(entityClass = Project.class, actions = ALL)
    @EntityAttributePolicy(entityClass = Project.class, attributes = "*", action = MODIFY)
    void project();

    @MenuPolicy(menuIds = "jmixts_Organization.browse")
    @ScreenPolicy(screenClasses = {OrganizationBrowse.class, OrganizationEdit.class})
    @EntityPolicy(entityClass = Organization.class, actions = ALL)
    @EntityAttributePolicy(entityClass = Organization.class, attributes = "*", action = MODIFY)
    void organization();

    @MenuPolicy
    @ScreenPolicy
    @EntityPolicy(actions = ALL)
    @EntityAttributePolicy(attributes = "*", action = MODIFY)
    void organization(Organization organization);

    @MenuPolicy(menuIds = "jmixts_Priority.browse")
    @ScreenPolicy(screenClasses = {PriorityBrowse.class, PriorityEdit.class})
    @EntityPolicy(entityClass = Priority.class, actions = ALL)
    @EntityAttributePolicy(entityClass = Priority.class, attributes = "*", action = MODIFY)
    void priority();

    @MenuPolicy(menuIds = "jmixts_Department.browse")
    @ScreenPolicy(screenClasses = {DepartmentBrowse.class, DepartmentEdit.class})
    @EntityPolicy(entityClass = Department.class, actions = ALL)
    @EntityAttributePolicy(entityClass = Department.class, attributes = "*", action = MODIFY)
    void department();
}
