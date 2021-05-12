package za.ac.cput.collectiontest;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class VehiclesTest {
    @Test
    void test(){
        List<Vehicles> vehiclesList = new ArrayList<>();
        Set<Vehicles> vehiclesSet = new HashSet<>();
        Map<Integer, Vehicles> vehiclesMap = new HashMap<>();
        for (int i = 0; i < 10; i++){
            int id = 0001;
            Vehicles vehicles = new Vehicles(id);
            vehiclesList.add(vehicles);
            vehiclesSet.add(vehicles);
            vehiclesMap.put(id, vehicles);

        }
        assertEquals(10, vehiclesList.size());
        assertEquals(10, vehiclesSet.size());
        assertEquals(10, vehiclesMap.size());
    }

}