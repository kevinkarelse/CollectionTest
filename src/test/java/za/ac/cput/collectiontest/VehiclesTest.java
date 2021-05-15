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


        //This tests if there is in fact 5 objects that matches each particular collection interfaces size.
        assertEquals(5, vehiclesList.size());
        assertEquals(5, vehiclesSet.size());
        assertEquals(5, vehiclesMap.size());

    }


    @Test
    //This tests using remove for collection
    void removeTest(){

        List<Vehicles> vehiclesList = new ArrayList<>();
        Set<Vehicles> vehiclesSet = new HashSet<>();
        Map<Integer, Vehicles> vehiclesMap = new HashMap<>();

        Vehicles v1 = new Vehicles(1,"BMW");
        Vehicles v2 = new Vehicles(2,"Toyota");
        Vehicles v3 = new Vehicles(3,"Nissan");
        Vehicles v4 = new Vehicles(4,"Kia");
        Vehicles v5 = new Vehicles(5,"Porsche");

        //Populating each box with an object in List
        vehiclesList.add(v1);
        vehiclesList.add(v2);
        vehiclesList.add(v3);
        vehiclesList.add(v4);
        vehiclesList.add(v5);

        //Populating each box with an object in Set
        vehiclesSet.add(v1);
        vehiclesSet.add(v2);
        vehiclesSet.add(v3);
        vehiclesSet.add(v4);
        vehiclesSet.add(v5);

        //Populating each box with an object in Map
        vehiclesMap.put(1,v1);
        vehiclesMap.put(2,v2);
        vehiclesMap.put(3,v3);
        vehiclesMap.put(4,v4);
        vehiclesMap.put(5,v5);

        //Now that they are filled again for this test, we will be removing one object from each collection interface.
        vehiclesList.remove(v2);
        vehiclesSet.remove(v3);
        vehiclesMap.remove(4);


        //As we have removed one object from each collection interface from the original 5, there should only be 4 filled.
        assertEquals(4, vehiclesList.size());
        assertEquals(4, vehiclesSet.size());
        assertEquals(4, vehiclesMap.size());

    }


    @Test
        //This tests if we are able to find the brand name using ID
    void findTest(){
        int vehicleListFinder = 1;
        int vehicleSetFinder = 3;
        int vehicleMapFinder = 5;
        int vehicleCollectionFinder = 7;

        String listFinder = "";
        String setFinder = "";
        String mapFinder = "";
        String collectionFinder = "";

        List<Vehicles> vehiclesList = new ArrayList<>();
        Set<Vehicles> vehiclesSet = new HashSet<>();
        Map<Integer, Vehicles> vehiclesMap = new HashMap<>();

        Vehicles v1 = new Vehicles(1,"BMW");
        Vehicles v2 = new Vehicles(2,"Toyota");
        Vehicles v3 = new Vehicles(3,"Nissan");
        Vehicles v4 = new Vehicles(4,"Kia");
        Vehicles v5 = new Vehicles(5,"Porsche");
        Vehicles v6 = new Vehicles(6,"Mercedes");
        Vehicles v7 = new Vehicles(7,"Tesla");
        Vehicles v8 = new Vehicles(8,"Honda");

        vehiclesList.add(v1);
        vehiclesList.add(v2);

        vehiclesSet.add(v3);
        vehiclesSet.add(v4);

        vehiclesMap.put(5,v5);
        vehiclesMap.put(6,v6);


        if (vehicleListFinder == v1.getId())

            listFinder = v1.getBrand();
        else{
            System.out.println("Id does not match anything");
        }

        if (vehicleSetFinder == v3.getId())

            setFinder = v3.getBrand();
        else{
            System.out.println("Id does not match anything");
        }

        if (vehicleMapFinder == v5.getId())

            mapFinder = v5.getBrand();
        else{
            System.out.println("Id does not match anything");
        }
        //This tests if it does find BMW from List where id = 1
        assertEquals("BMW", listFinder);

        //This tests if it does in fact find Nissan in the Set where id = 3
        assertEquals("Nissan", setFinder);

        //This tests if it does in fact find Porsche in the Map where id = 5
        assertEquals("Porsche", mapFinder);


    }


}