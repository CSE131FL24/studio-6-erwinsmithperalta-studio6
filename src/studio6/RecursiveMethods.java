package studio6;

import java.util.Arrays;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			if (n == 0) {
				return 0;
			}
			else if (n == 1) {
				return 0.5; //base case}
			}
			else {
				return Math.pow(0.5, n) + geometricSum(n-1);
			}
		
	}
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		if(radius <= radiusMinimumDrawingThreshold) {
			return;
		}
		StdDraw.circle(xCenter, yCenter, radius);
		StdDraw.pause(10);
		
		circlesUponCircles(xCenter - radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
		
		circlesUponCircles(xCenter + radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
		
		circlesUponCircles(xCenter, yCenter + radius, radius/3, radiusMinimumDrawingThreshold);
		
		circlesUponCircles(xCenter, yCenter - radius, radius/3, radiusMinimumDrawingThreshold);
		
	}

	
	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
			// [1 2 3 4 5 ] [ 1 ]
			//  0 1 2 3 4
			// FIXME create a helper method that can recursively reverse the given array
			int index = 0;
			int[] arrayFlip = new int[array.length];
			if (array.length <= 1) {
				return Arrays.copyOf(array, array.length);
			}
			return toReversedHelper(array, index, arrayFlip);	
	}
	public static int[] toReversedHelper(int[] array, int index, int[] arrayFlip) {
		int lastIndex = array.length - 1; 
		if (index > array.length / 2) { //  base case index 1
			return arrayFlip;
		}
		arrayFlip[index] = array[lastIndex - index]; 
		arrayFlip[lastIndex - index] = array[index];
		return toReversedHelper(array, index + 1, arrayFlip);
	}
	
	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

}
