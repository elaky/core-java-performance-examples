package vanilla.java.io;

import org.junit.Test;

import java.io.IOException;

/**
 * @author peter.lawrey
 */
public class NioPipeTest {
    @Test
    public void testPerf() throws IOException {
        for (int i = 0; i < 5; i++) {
            IOPerfTests.testThroughput(new NioPipe());
            IOPerfTests.testLatency(new NioPipe(), 100, 1000);
        }
    }
}
