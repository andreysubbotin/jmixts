package com.company.jmixts.screen.department;

import io.jmix.ui.screen.*;
import com.company.jmixts.entity.Department;

@UiController("jmixts_Department.edit")
@UiDescriptor("department-edit.xml")
@EditedEntityContainer("departmentDc")
public class DepartmentEdit extends StandardEditor<Department> {
}