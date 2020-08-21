package com.company.jmixts.screen.process;

import io.jmix.ui.screen.*;
import com.company.jmixts.entity.Process;

@UiController("jmixts_Process.browse")
@UiDescriptor("process-browse.xml")
@LookupComponent("processesTable")
public class ProcessBrowse extends StandardLookup<Process> {
}