package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class MinCoin {
//    I have 5 coins: 1,2,5,10,20
//    I have to find minimum numbers of coins needed to make a sum of 150

public static int getMinCoins(int targetMax, int[] collOfCoins) {
    int[] answer;

    if (targetMax <= 0)
        return 0;

    if (Arrays.stream(collOfCoins).anyMatch(n -> n == n))
        return collOfCoins[targetMax];

//    else {
//        answer = null;
//        for(int coin: collOfCoins){
//            int subProblem = targetMax-coin;
//            if(subProblem < 0)
//                continue;
//            answer = getMinCoins(answer, getMinCoins(subProblem, collOfCoins)+1);
//
//        }
//    }
//    collOfCoins.set(targetMax, answer);
    return 1;

}

    public static void main(String[] args){
        int []collOfCoins = new int[]{1,2,5,10,20};
        int targetMax = 150;

        int minCoinNeeded = getMinCoins(targetMax, collOfCoins);
        System.out.println(STR."Minimum numbers of coins to make sum of \{targetMax} : \{minCoinNeeded}");
    }


}
