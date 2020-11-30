package primitives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void testToString() {
        Point3D pt = new Point3D(3,0.0054,5.8887);

        String result = pt.toString();
        System.out.println(result);
        assertEquals("(3,0.0054,5.8887)",result);
    }
}