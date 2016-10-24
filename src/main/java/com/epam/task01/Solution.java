package com.epam.task01;


import java.util.ArrayList;

public class Solution {

    /**
     *
     * @param line
     * @param symbol
     * @return
     */
    public int getAmountSymbol(String line, String symbol) {
        return line.length() - line.replace(symbol, "").length();
    }

    /**
     *
     * @param lines
     * @return
     */
    public boolean isRepeatLineInArray(String[] lines) {

        boolean isRepeat = false;

        for (int i = 0; i < lines.length; i++) {
            String str = lines[i];
            for (int j = i + 1; j < lines.length; j++) {
                if (str.equals(lines[j])) {
                    isRepeat = true;
                    break;
                }
            }
        }
        return isRepeat;
    }

    /**
     *
     * @param firstMatrix
     * @param secondMatrix
     * @return
     */
    public int[][] getMatrixMultiplication(int[][] firstMatrix, int[][] secondMatrix) {

        int[][] resultMatrix = null;

        if (!isMatrixValid(firstMatrix) || !isMatrixValid(secondMatrix)) {
            System.out.println("Перемножение невозможно");
        } else {

            int firstRowCount = firstMatrix.length;
            int secondRowCount = secondMatrix.length;
            int firstColumnCount = firstMatrix[0].length;
            int secondColumnCount = secondMatrix[0].length;

            if (firstColumnCount == secondRowCount) {
                resultMatrix = new int[firstRowCount][secondColumnCount];
                for (int i = 0; i < firstRowCount; i++) {
                    for (int j = 0; j < secondColumnCount; j++) {
                        int cell = 0;
                        for (int k = 0; k < firstColumnCount; k++) {
                            cell += firstMatrix[i][k] * secondMatrix[k][j];
                        }
                        resultMatrix[i][j] = cell;
                    }
                }
            }
        }
        return resultMatrix;
    }


    /*public ArrayList<Double> getArraysIntersection(double[] first, double[] second) {
        ArrayList<Double> result


    }*/


    /**
     *
     * @param matrix
     * @return
     */
    private boolean isMatrixValid(int[][] matrix) {

        boolean isValid = true;
        int columnCount = 0;


        if (matrix == null || matrix.length == 0 || matrix[0] == null) {
            isValid = false;
        } else {
            columnCount = matrix[0].length;
        }

        for (int i = 1; isValid && i < matrix.length; i++) {
            if (matrix[i] == null || matrix[i].length != columnCount) {
                isValid = false;
                break;
            }
        }

        return isValid;
    }


}
