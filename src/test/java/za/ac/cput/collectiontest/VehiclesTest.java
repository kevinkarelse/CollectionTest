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

            Vehicles v1 = new Vehicles(1,"BMW");
            Vehicles v2 = new Vehicles(2,"Toyota");
            Vehicles v3 = new Vehicles(3,"Nissan");
            Vehicles v4 = new Vehicles(4,"Kia");
            Vehicles v5 = new Vehicles(5,"Porsche");

            vehiclesList.add(v1);
            vehiclesList.add(v2);
            vehiclesList.add(v3);
            vehiclesList.add(v4);
            vehiclesList.add(v5);

            vehiclesSet.add(v1);
            vehiclesSet.add(v2);
            vehiclesSet.add(v3);
            vehiclesSet.add(v4);
            vehiclesSet.add(v5);

            vehiclesMap.put(1,v1);
            vehiclesMap.put(2,v2);
            vehiclesMap.put(3,v3);
            vehiclesMap.put(4,v4);
            vehiclesMap.put(5,v5);




        //This tests if there is in fact 10 objects that matches each particular collection interfaces size.
        assertEquals(5, vehiclesList.size());
        assertEquals(5, vehiclesSet.size());
        assertEquals(5, vehiclesMap.size());
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
            String brand = "BMW" + i;
            Vehicles vehicles = new Vehicles(id, brand);
            vehiclesList.add(vehicles);
            vehiclesSet.add(vehicles);
            vehiclesMap.put(id, vehicles);

        }
        //Now that the collections have been filled, we now remove one from the list
        vehiclesList.remove(2);

        vehiclesMap.remove(2);
        System.out.println(vehiclesSet);

        //As there were 10 boxes created originally, we check to see if one has in fact been removed by expecting only 9 boxes compared to size.
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