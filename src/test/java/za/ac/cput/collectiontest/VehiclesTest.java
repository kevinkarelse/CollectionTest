package za.ac.cput.collectiontest;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class VehiclesTest {
    @Test
    //This tests the using add for collection
    void addTest(){
        List<Vehicles> vehiclesList = new ArrayList<>();
        Set<Vehicles> vehiclesSet = new HashSet<>();
        Map<Integer, Vehicles> vehiclesMap = new HashMap<>();
        for (int i = 0; i < 10; i++){
            int id = i;
            Vehicles vehicles = new Vehicles(id);
            vehiclesList.add(vehicles);
            vehiclesSet.add(vehicles);
            vehiclesMap.put(id, vehicles);
            System.out.println(vehiclesList);


        }
        assertEquals(10, vehiclesList.size());
        //assertEquals(10, vehiclesSet.size());
        assertEquals(10, vehiclesMap.size());
    }


    @Test
    //This tests using remove for collection
    void removeTest(){
        List<Vehicles> vehiclesList = new ArrayList<>();
        Set<Vehicles> vehiclesSet = new HashSet<>();
        Map<Integer, Vehicles> vehiclesMap = new HashMap<>();
        for (int i = 0; i < 10; i++){
            int id = i;
            Vehicles vehicles = new Vehicles(id);
            vehiclesList.add(vehicles);
            vehiclesSet.add(vehicles);
            vehiclesMap.put(id, vehicles);

            vehiclesMap.remove(2);


        }

        //assertEquals(10, vehiclesList.size());
        //assertEquals(10, vehiclesSet.size());
        assertEquals(9, vehiclesMap.size());
    }

}