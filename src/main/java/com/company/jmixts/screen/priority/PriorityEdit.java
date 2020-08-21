package com.company.jmixts.screen.priority;

import com.company.jmixts.entity.Priority;
import io.jmix.ui.screen.EditedEntityContainer;
import io.jmix.ui.screen.StandardEditor;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("jmixts_Priority.edit")
@UiDescriptor("priority-edit.xml")
@EditedEntityContainer("priorityDc")
public class PriorityEdit extends StandardEditor<Priority> {
}