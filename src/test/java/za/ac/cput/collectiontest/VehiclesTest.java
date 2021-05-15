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
            String brand = "BMW";  //just a default name for testing purposes
            Vehicles vehicles = new Vehicles(id,brand);
            vehiclesList.add(vehicles);
            vehiclesSet.add(vehicles);
            vehiclesMap.put(id, vehicles);


        }
        //This tests if there is infact 10 objects that matches each particular collection interfaces size.
        assertEquals(10, vehiclesList.size());
        assertEquals(10, vehiclesSet.size());
        assertEquals(10, vehiclesMap.size());
        //If test passes it means add function was properly implemented
    }


    @Test
    //This tests using remove for collection
    void removeTest(){
        List<Vehicles> vehiclesList = new ArrayList<>();
        Set<Vehicles> vehiclesSet = new HashSet<>();
        Map<Integer, Vehicles> vehiclesMap = new HashMap<>();
        for (int i = 0; i < 10; i++){
            int id = i;
            int index = 2;
            String brand = "BMW" + i;
            Vehicles vehicles = new Vehicles(id, brand);
            vehiclesList.add(vehicles);
            vehiclesSet.add(vehicles);
            vehiclesMap.put(id, vehicles);



            vehiclesMap.remove(index);



        }
        vehiclesList.remove(2);

        assertEquals(9, vehiclesList.size());
        assertEquals(10, vehiclesSet.size());
        assertEquals(9, vehiclesMap.size());
    }
    @Test
        //This tests using remove for collection
    void findTest(){
        List<Vehicles> vehiclesList = new ArrayList<>();
        Set<Vehicles> vehiclesSet = new HashSet<>();
        Map<Integer, Vehicles> vehiclesMap = new HashMap<>();
        for (int i = 0; i < 10; i++){
            int id = i;
            int index = 2;
            String brand = "BMW" + i;
            Vehicles vehicles = new Vehicles(id, brand);
            vehiclesList.add(vehicles);
            vehiclesSet.add(vehicles);
            vehiclesMap.put(id, vehicles);




        }

        assertEquals(10, vehiclesList.size());
        assertEquals(10, vehiclesSet.size());
        assertEquals(9, vehiclesMap.size());
    }


}