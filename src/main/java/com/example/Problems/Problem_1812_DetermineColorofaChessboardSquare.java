package com.example.Problems;

public class Problem_1812_DetermineColorofaChessboardSquare {
    public static void main(String[] args) {
        boolean b=false;
        String coordinates="d3";
//        String desk="abcdefgh";
//        boolean letter=false;
//        boolean number=false;
//        for (int i = 0; i < desk.length(); i++) {
//            if (coordinates.charAt(0) == desk.charAt(i)) {
//                int n = i+1;
//                if (n%2!=0){
//                    letter=true;
//                }
//                if (coordinates.charAt(1)%2!=0){
//                    number=true;
//                }
//            }
//        }

//        if (letter && number || !letter && !number){
//            System.out.println("FALSE");
//        }else if (letter && !number || !letter && number){
//            System.out.println("TRUE");
//        }




        System.out.println(new Solution().squareIsWhite(coordinates));
    }

    static class Solution {
        public boolean squareIsWhite(String coordinates) {
            String desk="abcdefgh";
            boolean letter=false;
            boolean number=false;
            for (int i = 0; i < desk.length(); i++) {
                if (coordinates.charAt(0) == desk.charAt(i)) {
                    if ((i+1)%2!=0)
                        letter=true;

                    if (coordinates.charAt(1)%2!=0)
                        number=true;
                }
            }
            return letter && !number || !letter && number;
        }
    }
}
