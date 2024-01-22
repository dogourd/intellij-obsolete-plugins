package com.intellij.jboss.bpmn.jbpm.render.label;

import com.intellij.jboss.bpmn.jbpm.providers.ColorProvider;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface RenderLabelColor {
  Class<? extends ColorProvider> color();
}
