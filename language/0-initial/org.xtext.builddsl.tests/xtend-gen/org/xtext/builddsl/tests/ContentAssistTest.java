package org.xtext.builddsl.tests;

import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder;
import org.eclipse.xtext.xbase.junit.ui.AbstractContentAssistTest;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.builddsl.BuildDSLUiInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(BuildDSLUiInjectorProvider.class)
@SuppressWarnings("all")
public class ContentAssistTest extends AbstractContentAssistTest {
  @Test
  public void testHelloCompletion() {
    Display _default = Display.getDefault();
    _default.syncExec(
      new Runnable() {
        public void run() {
          try {
            ContentAssistProcessorTestBuilder _newBuilder = ContentAssistTest.this.newBuilder();
            ContentAssistProcessorTestBuilder _append = _newBuilder.append("pack");
            _append.assertText("package");
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      });
  }
  
  @Test
  public void testExclMarkCompletion() {
    Display _default = Display.getDefault();
    _default.syncExec(
      new Runnable() {
        public void run() {
          try {
            ContentAssistProcessorTestBuilder _newBuilder = ContentAssistTest.this.newBuilder();
            ContentAssistProcessorTestBuilder _append = _newBuilder.append("par");
            _append.assertText("param");
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      });
  }
}
