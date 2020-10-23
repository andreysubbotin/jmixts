package com.company.jmixts.security;

import com.company.jmixts.entity.*;
import com.company.jmixts.screen.cardrole.CardRoleEdit;
import com.company.jmixts.screen.project.ProjectBrowse;
import com.company.jmixts.screen.task.TaskBrowse;
import com.company.jmixts.screen.task.TaskEdit;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.Role;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

import static io.jmix.security.model.EntityAttributePolicyAction.MODIFY;
import static io.jmix.security.model.EntityAttributePolicyAction.VIEW;
import static io.jmix.security.model.EntityPolicyAction.READ;

@Role(name = TaskExecutorRole.ROLE_NAME, code = TaskExecutorRole.ROLE_NAME)
public interface TaskExecutorRole {
    String ROLE_NAME = "task-executor";

    @MenuPolicy(menuIds = "tasks")
    void tasksMenu();

    @MenuPolicy(menuIds = "jmixts_Task.browse")
    @ScreenPolicy(screenClasses = {TaskBrowse.class, TaskEdit.class})
    @EntityPolicy(entityClass = Task.class, actions = {READ, EntityPolicyAction.UPDATE})
    @EntityAttributePolicy(entityClass = Task.class, attributes = "*", action = VIEW)
    @EntityAttributePolicy(entityClass = Task.class, attributes = "executed", action = MODIFY)
    void task();

    @EntityPolicy(entityClass = Priority.class, actions = READ)
    @EntityAttributePolicy(entityClass = Priority.class, attributes = "*", action = VIEW)
    void priority();

    @ScreenPolicy(screenClasses = ProjectBrowse.class)
    @EntityPolicy(entityClass = Project.class, actions = READ)
    @EntityAttributePolicy(entityClass = Project.class, attributes = "*", action = VIEW)
    void project();

    @ScreenPolicy(screenClasses = CardRoleEdit.class)
    @EntityPolicy(entityClass = CardRole.class, actions = READ)
    @EntityAttributePolicy(entityClass = CardRole.class, attributes = "*", action = VIEW)
    void role();

    @EntityPolicy(entityClass = User.class, actions = READ)
    @EntityAttributePolicy(entityClass = User.class, attributes = "username", action = VIEW)
    void user();
}
