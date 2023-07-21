package helloworld;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainTest
{
    @Test
    public void shouldRun()
    {
        assertTrue(new Main().start());
    }
}