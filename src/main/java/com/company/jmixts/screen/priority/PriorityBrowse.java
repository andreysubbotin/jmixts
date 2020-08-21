package com.company.jmixts.screen.priority;

import io.jmix.ui.screen.*;
import com.company.jmixts.entity.Priority;

@UiController("jmixts_Priority.browse")
@UiDescriptor("priority-browse.xml")
@LookupComponent("prioritiesTable")
public class PriorityBrowse extends StandardLookup<Priority> {
}