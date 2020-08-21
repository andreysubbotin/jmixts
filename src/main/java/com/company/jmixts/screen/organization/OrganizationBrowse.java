package com.company.jmixts.screen.organization;

import io.jmix.ui.screen.*;
import com.company.jmixts.entity.Organization;

@UiController("jmixts_Organization.browse")
@UiDescriptor("organization-browse.xml")
@LookupComponent("organizationsTable")
public class OrganizationBrowse extends StandardLookup<Organization> {
}