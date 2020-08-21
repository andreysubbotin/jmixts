package com.company.jmixts.screen.project;

import io.jmix.ui.screen.*;
import com.company.jmixts.entity.Project;

@UiController("jmixts_Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
public class ProjectBrowse extends StandardLookup<Project> {
}