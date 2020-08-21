package com.company.jmixts.screen.doc;

import com.company.jmixts.entity.Doc;
import com.company.jmixts.entity.User;
import io.jmix.core.TimeSource;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.data.Sequence;
import io.jmix.data.Sequences;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("jmixts_Doc.edit")
@UiDescriptor("doc-edit.xml")
@EditedEntityContainer("docDc")
public class DocEdit extends StandardEditor<Doc> {
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private Sequences sequences;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Doc> event) {
        Doc doc = event.getEntity();
        doc.setCreateDate(timeSource.currentTimestamp());
        doc.setDate(timeSource.currentTimestamp());
        doc.setNumber(String.valueOf(sequences.createNextValue(Sequence.withName("documents"))));
        doc.setCreator((User) currentAuthentication.getUser());
    }
}