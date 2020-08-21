package com.company.jmixts.screen.task;

import io.jmix.ui.screen.*;
import com.company.jmixts.entity.Task;

@UiController("jmixts_Task.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
public class TaskBrowse extends StandardLookup<Task> {
}