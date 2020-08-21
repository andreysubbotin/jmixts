package com.company.jmixts.screen.department;

import io.jmix.ui.screen.*;
import com.company.jmixts.entity.Department;

@UiController("jmixts_Department.browse")
@UiDescriptor("department-browse.xml")
@LookupComponent("departmentsTable")
public class DepartmentBrowse extends StandardLookup<Department> {
}