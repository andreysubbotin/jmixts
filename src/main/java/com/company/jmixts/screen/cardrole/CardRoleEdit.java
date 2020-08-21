package com.company.jmixts.screen.cardrole;

import io.jmix.ui.screen.*;
import com.company.jmixts.entity.CardRole;

@UiController("jmixts_CardRole.edit")
@UiDescriptor("card-role-edit.xml")
@EditedEntityContainer("cardRoleDc")
public class CardRoleEdit extends StandardEditor<CardRole> {
}