package pl.dawid.problem292;

public class Algorithm292 {

    private Algorithm292(){};

    private static boolean arePositive(int[] weights){
        for(int weight : weights){
            if(weight <= 0){
                return false;
            }
        }
        return true;
    }

    public static int calculateNumberOfBoats(int[] weights, int weightLimit, int peopleLimit) throws IllegalArgumentException{

        int boats = 1;
        int occupied = 0;
        int people = 0;

        if (!arePositive(weights) || weightLimit <= 0 || peopleLimit <= 0 || weights.length == 0){
            throw new IllegalArgumentException("Invalid input arguments (should be grater than zero).");
        }

        for(int weight : weights){
            if(weight <= weightLimit){
                if(weight + occupied > weightLimit || people == peopleLimit){
                    boats++;
                    occupied = weight;
                    people = 1;
                }
                else{
                    occupied += weight;
                    people++;
                }
            }
        }
        return boats;
    }

}
