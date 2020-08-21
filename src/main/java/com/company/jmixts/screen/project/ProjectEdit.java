package com.company.jmixts.screen.project;

import io.jmix.ui.screen.*;
import com.company.jmixts.entity.Project;

@UiController("jmixts_Project.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
public class ProjectEdit extends StandardEditor<Project> {
}