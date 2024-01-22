package com.intellij.jboss.bpmn.jbpm.providers;

import com.intellij.diagram.DiagramNode;
import com.intellij.jboss.bpmn.jbpm.render.pictures.RenderImage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public interface ImageProvider<T, Node extends DiagramNode<T>> {
  @NotNull
  Icon getImage(Node node, RenderImage renderImage);
}
