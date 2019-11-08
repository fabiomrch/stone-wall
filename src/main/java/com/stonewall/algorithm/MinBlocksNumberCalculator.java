package com.stonewall.algorithm;

import java.util.Stack;

public class MinBlocksNumberCalculator {
	
	/**
	 * Find the minimum number of blocks need to build the wall performing an algorithm that uses stack data structure
	 * @param H array of N positive integers specifying the height of the wall
	 * @return Minimum number of blocks needed to build it
	 */
    public static int solution(int[] H) {
        int count = 1;
    	
    	Stack<Integer> s = new Stack<Integer>();
        s.push(H[0]);
        
        for(int i = 1; i < H.length; i++)
        {
        	if(H[i] > H[i - 1])
        	{
        		s.push(H[i]);
        		count++;
        	}
        	else 
        	{
        		while(!s.isEmpty() && s.peek() > H[i])
        			s.pop();
        		if(s.isEmpty() || s.peek() != H[i])
        		{
        			count++;
        			s.push(H[i]);
        		}
        	}
        	
        }
        	
        return count;
    }
}
