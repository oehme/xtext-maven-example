import org.junit.Test

class FooTest {
	@Test(expected=IllegalStateException)
	def void testFoo() {
		// It expects parameters that are not provided and
		// the instantiation then throws an IllegalStateException
	    new BuildExample
	}
}