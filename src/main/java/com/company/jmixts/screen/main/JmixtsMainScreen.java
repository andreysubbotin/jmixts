package com.company.jmixts.screen.main;

import io.jmix.ui.component.AppWorkArea;
import io.jmix.ui.component.Window;
import io.jmix.ui.screen.Screen;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("jmixts_MainScreen")
@UiDescriptor("jmixts-main-screen.xml")
public class JmixtsMainScreen extends Screen implements Window.HasWorkArea {
    @Override
    public AppWorkArea getWorkArea() {
        return (AppWorkArea) getWindow().getComponent("workArea");
    }
}
