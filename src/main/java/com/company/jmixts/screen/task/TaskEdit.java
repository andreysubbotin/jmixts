package com.company.jmixts.screen.task;

import com.company.jmixts.entity.Task;
import com.company.jmixts.entity.User;
import io.jmix.core.TimeSource;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.data.Sequence;
import io.jmix.data.Sequences;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("jmixts_Task.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
public class TaskEdit extends StandardEditor<Task> {
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private Sequences sequences;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Task> event) {
        Task task = event.getEntity();
        task.setNum(String.valueOf(sequences.createNextValue(Sequence.withName("tasks"))));
        task.setCreator((User) currentAuthentication.getUser());
        task.setCreateDate(timeSource.currentTimestamp());
    }
}