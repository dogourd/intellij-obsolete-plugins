package com.intellij.jboss.bpmn.jbpm.model.xml.bpmn20;

import com.intellij.jboss.bpmn.jbpm.model.render.annotation.DefaultNamePrefix;
import com.intellij.jboss.bpmn.jbpm.render.pictures.RenderImage;
import com.intellij.util.xml.GenericAttributeValue;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/BPMN/20100524/MODEL:tInclusiveGateway interface.
 */
@RenderImage(icon = "com.intellij.jboss.bpmn.JbossJbpmIcons$Bpmn$Gateways.Inclusive_48")
@DefaultNamePrefix("Inclusive Gateway")
public interface TInclusiveGateway extends Bpmn20DomElement, TGateway {
  @NotNull
  GenericAttributeValue<String> getDefault();
}
