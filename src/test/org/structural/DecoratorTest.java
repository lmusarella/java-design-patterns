package org.structural;

import org.junit.Test;
import org.structural.decorator.HorizontalScrollBarDecorator;
import org.structural.decorator.SimpleWindow;
import org.structural.decorator.VerticalScrollBarDecorator;
import org.structural.decorator.Window;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {
    @Test
    public void testAllDecoractors() {
        Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        // assert that the description indeed includes horizontal + vertical scrollbars
        assertEquals("simple window, including vertical scrollbars, including horizontal scrollbars", decoratedWindow.getDescription());
    }

    @Test
    public void testOnlyHorizScrollbarDecoractors() {
        Window decoratedWindow = new HorizontalScrollBarDecorator(new SimpleWindow());
        // assert that the description indeed includes horizontal + vertical scrollbars
        assertEquals("simple window, including horizontal scrollbars", decoratedWindow.getDescription());
    }

    @Test
    public void testOnlyVertScrollbarDecoractors() {
        Window decoratedWindow = new VerticalScrollBarDecorator(new SimpleWindow());
        // assert that the description indeed includes horizontal + vertical scrollbars
        assertEquals("simple window, including vertical scrollbars", decoratedWindow.getDescription());
    }
}
