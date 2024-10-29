package org.q19;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CourseTest {

    @Test
    public void testCoursesAreEqual() {
        Course course1 = new Course("Introduction to Java", "CSD211", "01/09/2013", 30);
        Course course2 = new Course("Introduction to Java", "CSD211", "01/09/2013", 30);

        assertEquals(course1, course2);
    }

    @Test
    public void testCoursesAreNotEqual() {
        Course course1 = new Course("Introduction to Java", "CSD211", "01/09/2013", 30);
        Course course2 = new Course("Advanced Java", "CSD212", "01/09/2014", 25);

        assertNotEquals(course1, course2);
    }
}