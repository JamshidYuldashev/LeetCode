package com.example.Problems;

public class Problem_832{
    public static void main(String[] args) {

    }
    static class Solution{
        // invertImage inverts the matrix - 0 to 1 and 1 to 0
        public int[][] invertImage(int[][] image){
            for (int i = 0; i < image.length; i++) {
                for (int j = 0; j < image[i].length; j++) {
                    image[i][j] = image[i][j]==1? 0:1;
                }
            }
            return image;
        }

        // [0,0,1] when flipped horizontally produces [1,0,0]
        public int[][]flipImage(int[][] image){
            for (int i = 0; i < image.length; i++) {
                for (int j = 0; j < image[i].length/2; j++) {
                    int temp=image[i][j];
                    image[i][j]=image[i][image.length-j-1];
                    image[i][image.length-j-1]=temp;
                }
            }
            return image;
        }

        public int[][] flipAndInvertImage(int[][] image) {
            return invertImage(flipImage(image));
        }
    }
}
