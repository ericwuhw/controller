package org.opendaylight.controller.md.sal.binding.test;

import java.util.Collection;
import java.util.Map;

import org.junit.Assert;

public class AssertCollections {

    public static void assertEmpty(final Collection<?> set) {
        Assert.assertTrue(set.isEmpty());
    }

    public static void assertEmpty(final Map<?,?> set) {
        Assert.assertTrue(set.isEmpty());
    }

    public static void assertContains(final Collection<?> set, final Object... values) {
        for (Object key : values) {
            Assert.assertTrue(set.contains(key));
        }

    }

    public static void assertNotContains(final Collection<?> set, final Object... values) {
        for (Object key : values) {
            Assert.assertFalse(set.contains(key));
        }
    }

    public static void assertContains(final Map<?,?> map, final Object... values) {
        for (Object key : values) {
            Assert.assertTrue(map.containsKey(key));
        }
    }

    public static void assertNotContains(final Map<?,?> map, final Object... values) {
        for (Object key : values) {
            Assert.assertFalse(map.containsKey(key));
        }
    }
}
