package application;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlotTestStudent {
    private Plot plot1;
    private Plot plot2;
    private Plot plot3;

    @BeforeEach
    public void setUp() {
        plot1 = new Plot(0, 0, 5, 5); // A plot at (0,0) with width 5 and depth 5
        plot2 = new Plot(3, 3, 4, 4); // A plot that overlaps with plot1
        plot3 = new Plot(6, 6, 2, 2); // A plot that does not overlap with plot1
    }

    @Test
    public void testOverlaps() {
        assertTrue(plot1.overlaps(plot2), "plot1 should overlap with plot2");
        assertFalse(plot1.overlaps(plot3), "plot1 should not overlap with plot3");
    }

    @Test
    public void testEncompasses() {
        Plot smallerPlot = new Plot(1, 1, 2, 2); // This plot is fully within plot1
        assertTrue(plot1.encompasses(smallerPlot), "plot1 should encompass smallerPlot");
        assertFalse(plot1.encompasses(plot2), "plot1 should not encompass plot2");
        assertFalse(plot1.encompasses(plot3), "plot1 should not encompass plot3");
    }

    @Test
    public void testConstructor() {
        Plot defaultPlot = new Plot();
        assertEquals(0, defaultPlot.getX(), "Default plot's x should be 0");
        assertEquals(0, defaultPlot.getY(), "Default plot's y should be 0");
        assertEquals(1, defaultPlot.getWidth(), "Default plot's width should be 1");
        assertEquals(1, defaultPlot.getDepth(), "Default plot's depth should be 1");
    }

    @Test
    public void testToString() {
        assertEquals("0,0,5,5", plot1.toString(), "plot1 string representation is incorrect");
        assertEquals("3,3,4,4", plot2.toString(), "plot2 string representation is incorrect");
    }
}
