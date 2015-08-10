package lt.neworld.retrolamba_gradle_130;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Andrius Semionovas
 * @since 2015-08-10
 */
@RunWith(JUnit4.class)
public class SimpleTest {
    @Test
    public void testTrue() throws Exception {
        assertTrue(true);
    }

    @Test
    public void testLambda() throws Exception {
        new TestLambda().run(() -> assertFalse(false));
    }

    private static class TestLambda {
        private void run(Runnable runnable) {
            runnable.run();
        }
    }
}
