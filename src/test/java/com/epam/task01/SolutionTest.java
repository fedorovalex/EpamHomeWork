package com.epam.task01;

import org.junit.Test;

import java.util.ArrayList;

import static java.lang.Math.abs;
import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SolutionTest {

    @Test
    public void testGetAmountSymbol() {
        Solution solution = new Solution();
        String line = "12012501540";
        String symbol = "0";
        int amount = 3;
        int testAmount = solution.getAmountSymbol(line, symbol);
        assertEquals(amount, testAmount);
    }

    @Test
    public void testIsRepeatLineInArray() {
        Solution solution = new Solution();
        String[] linesOne = {"123", "456", "789", "101112"};
        String[] linesTwo = {"123", "456", "789", "123"};
        boolean isRepeatLineOne = solution.isRepeatLineInArray(linesOne);
        boolean isRepeatLineTwo = solution.isRepeatLineInArray(linesTwo);
        assertEquals(isRepeatLineOne, false);
        assertEquals(isRepeatLineTwo, true);
    }

    @Test
    public void testGetMatrixMultiplication() {
        Solution solution = new Solution();
        int[][] firstMatrix = {{1, 2, 0}, {2, 1, -1}};
        int[][] secondMatrix = {{1, 2, 3}, {3, 0, 2}, {4, 0, 1}};
        int[][] expectedResult = {{7, 2, 7}, {1, 4, 7}};
        int[][] resultMatrix = solution.getMatrixMultiplication(firstMatrix, secondMatrix);
        assertNotNull(resultMatrix);
        assertEquals(expectedResult.length, resultMatrix.length);
        for (int i = 0; i < resultMatrix.length; i++) {
            assertNotNull(resultMatrix[i]);
            assertEquals(expectedResult[i].length, resultMatrix[i].length);
            for (int j = 0; j < expectedResult[i].length; j++) {
                assertEquals(expectedResult[i][j], resultMatrix[i][j]);
            }
        }

        resultMatrix = solution.getMatrixMultiplication(null, secondMatrix);
        assertNull(resultMatrix);
    }

    @Test
    public void testGetArraysIntersection() {
        Solution solution = new Solution();
        double epsilon = 0.000000001;
        double[] first = {1, 10/2, 6, 7.01};
        double[] second = {0, 5, 7.01, 17.5};
        double[] expectedIntersection = {5, 7.01};
        ArrayList<Double> intersection = solution.getArraysIntersection(first, second, epsilon);

        assertNotNull(intersection);
        assertEquals(expectedIntersection.length, intersection.size());
        for (int i = 0; i < intersection.size(); i++) {
            assertTrue(abs(expectedIntersection[i] - intersection.get(i)) < epsilon);
        }
    }
}

