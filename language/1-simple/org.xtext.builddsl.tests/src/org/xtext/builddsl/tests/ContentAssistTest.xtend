package org.xtext.builddsl.tests

import org.eclipse.swt.widgets.Display
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.junit.ui.AbstractContentAssistTest
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.builddsl.BuildDSLUiInjectorProvider

@RunWith(XtextRunner)
@InjectWith(BuildDSLUiInjectorProvider)
class ContentAssistTest extends AbstractContentAssistTest {

	@Test def void testHelloCompletion() {
		Display.getDefault.syncExec(
			new Runnable {
				override run() {
					newBuilder.append('pack').assertText('package')
				}
			})
	}

	@Test def void testExclMarkCompletion() {
		Display.getDefault.syncExec(
			new Runnable {
				override run() {
					newBuilder.append('par').assertText('param')
				}
			})
	}

}
