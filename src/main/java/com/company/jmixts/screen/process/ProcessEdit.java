package com.company.jmixts.screen.process;

import com.company.jmixts.entity.Process;
import io.jmix.ui.screen.EditedEntityContainer;
import io.jmix.ui.screen.StandardEditor;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("jmixts_Process.edit")
@UiDescriptor("process-edit.xml")
@EditedEntityContainer("processDc")
public class ProcessEdit extends StandardEditor<Process> {
}