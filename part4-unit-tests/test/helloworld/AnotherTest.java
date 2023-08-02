package helloworld;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AnotherTest
{
    @Test
    public void shouldRunAnother()
    {
        assertTrue(new Main().start());
    }
}