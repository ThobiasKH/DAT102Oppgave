package tests.java.tittebygda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import main.java.tittebygda.*;

public class SveleOgKaffiQueueTest {
    @Test
    public void testLagKø() {
        int mengdenTittere = Tittebygda.tellTittere();
        SveleOgKaffiQueue queue = new SveleOgKaffiQueue(mengdenTittere);

        Tittebygda.lagKø(queue);

        for (int i = 0; i < queue.folkIKøen - 1; i++) {
            Innbygger current = queue.queue[i];
            Innbygger next = queue.queue[i + 1];

            assertTrue(current != next,
                "Folk burde ikke stå med stalkerene sine eller de de stalker");
        }
    }
}
