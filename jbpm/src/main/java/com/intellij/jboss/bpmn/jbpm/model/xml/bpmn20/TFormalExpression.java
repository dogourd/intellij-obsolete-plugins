package com.intellij.jboss.bpmn.jbpm.model.xml.bpmn20;

import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/BPMN/20100524/MODEL:tFormalExpression interface.
 */
public interface TFormalExpression extends Bpmn20DomElement {

  @NotNull
  @Required
  String getValue();

  @NotNull
  GenericAttributeValue<String> getLanguage();

  @NotNull
  GenericAttributeValue<String> getEvaluatesToTypeRef();

  @NotNull
  TExtensionElements getExtensionElements();
}
