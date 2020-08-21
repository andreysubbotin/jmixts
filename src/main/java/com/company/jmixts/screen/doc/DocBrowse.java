package com.company.jmixts.screen.doc;

import com.company.jmixts.entity.Doc;
import io.jmix.ui.screen.LookupComponent;
import io.jmix.ui.screen.StandardLookup;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("jmixts_Doc.browse")
@UiDescriptor("doc-browse.xml")
@LookupComponent("docsTable")
public class DocBrowse extends StandardLookup<Doc> {
}