import java.util.*;

class Result {

    public static int minimumTrucks(List<Integer> boulders, int truckCapacity) {
        // Sort boulders in descending order to try and fit larger ones first
        Collections.sort(boulders, Collections.reverseOrder());
        
        // List of trucks, each truck represented by its remaining capacity and current boulder count
        List<int[]> trucks = new ArrayList<>();
        
        for (int boulder : boulders) {
            boolean placed = false;
            for (int[] truck : trucks) {
                // Check if the boulder can fit in this truck
                if (truck[0] >= boulder && truck[1] < 4) {
                    truck[0] -= boulder; // Reduce the available capacity
                    truck[1] += 1; // Increase the boulder count
                    placed = true;
                    break;
                }
            }
            // If no existing truck could accommodate the boulder, add a new truck
            if (!placed) {
                trucks.add(new int[]{truckCapacity - boulder, 1});
            }
        }
        
        return trucks.size();
    }

    public static void main(String[] args) {
        List<Integer> boulders = Arrays.asList(3, 4, 2, 1, 6, 5, 8); // Test with an odd number of boulders
        int truckCapacity = 10;
        System.out.println("Minimum number of trucks required: " + minimumTrucks(boulders, truckCapacity));
    }
}
