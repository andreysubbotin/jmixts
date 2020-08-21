package com.company.jmixts.screen.organization;

import io.jmix.ui.screen.*;
import com.company.jmixts.entity.Organization;

@UiController("jmixts_Organization.edit")
@UiDescriptor("organization-edit.xml")
@EditedEntityContainer("organizationDc")
public class OrganizationEdit extends StandardEditor<Organization> {
}