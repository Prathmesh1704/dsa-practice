/*134 There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique.

  */



public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;

        // Calculate total gas and total cost
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        // If total gas is less than total cost, circuit cannot be completed
        if (totalGas < totalCost) {
            return -1;
        }

        int pos = 0;
        int sum = 0;

        // Find the starting gas station
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];

            if (sum < 0) {
                sum = 0;
                pos = i + 1;
            }
        }

        return pos;
    }

    public static void main(String[] args) {

        GasStation obj = new GasStation();

        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int result = obj.canCompleteCircuit(gas, cost);

        if (result == -1) {
            System.out.println("Circuit cannot be completed");
        } else {
            System.out.println("Start at gas station index: " + result);
        }
    }
}
