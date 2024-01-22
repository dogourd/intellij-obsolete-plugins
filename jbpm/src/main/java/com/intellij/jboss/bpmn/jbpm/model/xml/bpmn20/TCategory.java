package com.intellij.jboss.bpmn.jbpm.model.xml.bpmn20;

import com.intellij.util.xml.SubTagList;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.omg.org/spec/BPMN/20100524/MODEL:tCategory interface.
 */
public interface TCategory extends Bpmn20DomElement, TRootElement {

  @NotNull
  @SubTagList("categoryValue")
  List<TCategoryValue> getCategoryValues();

  @SubTagList("categoryValue")
  TCategoryValue addCategoryValue();
}
