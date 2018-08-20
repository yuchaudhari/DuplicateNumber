package com.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

import com.java.CountDuplicate;;

public class TestApp {
	@Test  
    public void testFindMax(){  
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
        assertEquals(hs,CountDuplicate.findMax(new Integer[] { 1, 2, 1, 3, 4 }));
        hs = new HashSet<>();
        hs.add(-1);
        assertEquals(hs,CountDuplicate.findMax(new Integer[] { -1, 2, -1, 3, 4 }));
        //assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}
