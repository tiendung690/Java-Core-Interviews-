package com.java.library.core.graph;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.java.library.core.datastructures.GraphVertex;

public class DeadlockDetectionTest {

    private boolean expected;
    private List<GraphVertex> G;

    @Test
    public void isDeadlocked1() throws Exception {
        GraphVertex a = new GraphVertex(0);
        GraphVertex b = new GraphVertex(1);
        GraphVertex c = new GraphVertex(2);
        GraphVertex d = new GraphVertex(3);
        a.edges.add(b);
        a.edges.add(c);
        b.edges.add(c);
        b.edges.add(d);
        d.edges.add(a);

        expected = true;
        G = Arrays.asList(
                a,b,c,d
        );

        test(expected, G);
    }

    @Test
    public void isDeadlocked2() throws Exception {
        GraphVertex a = new GraphVertex(0);
        GraphVertex b = new GraphVertex(1);
        GraphVertex c = new GraphVertex(2);
        GraphVertex d = new GraphVertex(3);
        a.edges.add(b);
        a.edges.add(c);
        b.edges.add(c);
        b.edges.add(d);

        expected = false;
        G = Arrays.asList(
                a,b,c,d
        );

        test(expected, G);
    }

    private void test(boolean expected, List<GraphVertex> G) {
        assertEquals(expected,DeadlockDetection.isDeadlocked(G));
    }

}