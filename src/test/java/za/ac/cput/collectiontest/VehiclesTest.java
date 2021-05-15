package za.ac.cput.collectiontest;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class VehiclesTest {
    @Test
    //This tests the using add for each collection interface individually
    void addTest(){

            List<Vehicles> vehiclesList = new ArrayList<>();
            Set<Vehicles> vehiclesSet = new HashSet<>();
            Map<Integer, Vehicles> vehiclesMap = new HashMap<>();
            Collection<Vehicles> vehiclesCollection = new ArrayList<>();

            //Creates objects
            Vehicles v1 = new Vehicles(1,"BMW");
            Vehicles v2 = new Vehicles(2,"Toyota");
            Vehicles v3 = new Vehicles(3,"Nissan");
            Vehicles v4 = new Vehicles(4,"Kia");
            Vehicles v5 = new Vehicles(5,"Porsche");

            //Populates the list with objects
            vehiclesList.add(v1);
            vehiclesList.add(v2);
            vehiclesList.add(v3);
            vehiclesList.add(v4);
            vehiclesList.add(v5);

            //Populates the Set with objects
            vehiclesSet.add(v1);
            vehiclesSet.add(v2);
            vehiclesSet.add(v3);
            vehiclesSet.add(v4);
            vehiclesSet.add(v5);

            //Populates the Map with objects
            vehiclesMap.put(1,v1);
            vehiclesMap.put(2,v2);
            vehiclesMap.put(3,v3);
            vehiclesMap.put(4,v4);
            vehiclesMap.put(5,v5);

            //Populates the Collection with objects
            vehiclesCollection.add(v1);
            vehiclesCollection.add(v2);
            vehiclesCollection.add(v3);
            vehiclesCollection.add(v4);
            vehiclesCollection.add(v5);


            //This tests if there is in fact 5 objects that matches each particular collection interfaces size.
            assertEquals(5, vehiclesList.size());
            assertEquals(5, vehiclesSet.size());
            assertEquals(5, vehiclesMap.size());
            assertEquals(5, vehiclesCollection.size());

    }


    @Test
    //This tests using remove for collection
    void removeTest(){

        List<Vehicles> vehiclesList = new ArrayList<>();
        Set<Vehicles> vehiclesSet = new HashSet<>();
        Map<Integer, Vehicles> vehiclesMap = new HashMap<>();
        Collection<Vehicles> vehiclesCollection = new ArrayList<>();

        Vehicles v1 = new Vehicles(1,"BMW");
        Vehicles v2 = new Vehicles(2,"Toyota");
        Vehicles v3 = new Vehicles(3,"Nissan");
        Vehicles v4 = new Vehicles(4,"Kia");
        Vehicles v5 = new Vehicles(5,"Porsche");

        //Populating the List with objects
        vehiclesList.add(v1);
        vehiclesList.add(v2);
        vehiclesList.add(v3);
        vehiclesList.add(v4);
        vehiclesList.add(v5);

        //Populating the Set with objects
        vehiclesSet.add(v1);
        vehiclesSet.add(v2);
        vehiclesSet.add(v3);
        vehiclesSet.add(v4);
        vehiclesSet.add(v5);

        //Populating the Map with objects
        vehiclesMap.put(1,v1);
        vehiclesMap.put(2,v2);
        vehiclesMap.put(3,v3);
        vehiclesMap.put(4,v4);
        vehiclesMap.put(5,v5);


        //Populates the Collection with objects
        vehiclesCollection.add(v1);
        vehiclesCollection.add(v2);
        vehiclesCollection.add(v3);
        vehiclesCollection.add(v4);
        vehiclesCollection.add(v5);

        //Now that they are filled again for this test, we will be removing one object from each collection interface.
        vehiclesList.remove(v2);
        vehiclesSet.remove(v3);
        vehiclesMap.remove(4);
        vehiclesCollection.remove(v5);


        //As we have removed one object from each collection interface from the original 5, there should only be 4 filled.
        assertEquals(4, vehiclesList.size());
        assertEquals(4, vehiclesSet.size());
        assertEquals(4, vehiclesMap.size());
        assertEquals(4, vehiclesCollection.size());

    }


    @Test
        //This tests if we are able to find the brand name using ID
    void findTest(){

        //These finder int values will be used when searching for the ID later
        int vehicleListFinder = 1;
        int vehicleSetFinder = 3;
        int vehicleMapFinder = 5;
        int vehicleCollectionFinder = 7;

        //These finder String values will be used to retrieve Brand name if ID matches an object
        String listFinder = "";
        String setFinder = "";
        String mapFinder = "";
        String collectionFinder = "";

        List<Vehicles> vehiclesList = new ArrayList<>();
        Set<Vehicles> vehiclesSet = new HashSet<>();
        Map<Integer, Vehicles> vehiclesMap = new HashMap<>();
        Collection<Vehicles> vehiclesCollection = new ArrayList<>();

        Vehicles v1 = new Vehicles(1,"BMW");
        Vehicles v2 = new Vehicles(2,"Toyota");
        Vehicles v3 = new Vehicles(3,"Nissan");
        Vehicles v4 = new Vehicles(4,"Kia");
        Vehicles v5 = new Vehicles(5,"Porsche");
        Vehicles v6 = new Vehicles(6,"Mercedes");
        Vehicles v7 = new Vehicles(7,"Tesla");
        Vehicles v8 = new Vehicles(8,"Honda");

        //This adds only objects v1 and v2 to List only
        vehiclesList.add(v1);
        vehiclesList.add(v2);

        //This adds only objects v3 and v4 to Set only
        vehiclesSet.add(v3);
        vehiclesSet.add(v4);

        //This adds only objects v5 and v6 to Map only
        vehiclesMap.put(5,v5);
        vehiclesMap.put(6,v6);

        //This adds only objects v7 and v8 to Collection Only
        vehiclesCollection.add(v7);
        vehiclesCollection.add(v8);

        //Scanning the list when id being searched will result in brand being found
        if (vehicleListFinder == v1.getId()) //If given id matches v1 ID, listFinder will retrieve the brand name

            listFinder = v1.getBrand();
        else{
            System.out.println("ID does not match anything");
        }

        //Scanning the Set when id being searched will result in brand being found
        if (vehicleSetFinder == v3.getId()) //If given id matches v3 ID, setFinder will retrieve the brand name

            setFinder = v3.getBrand();
        else{
            System.out.println("ID does not match anything");
        }

        //Scanning the Map when id being searched will result in brand being found
        if (vehicleMapFinder == v5.getId()) //If given id matches v5 ID, mapFinder will retrieve the brand name

            mapFinder = v5.getBrand();
        else{
            System.out.println("ID does not match anything");
        }

        //Scanning the Collection when id being searched will result in brand being found
        if (vehicleCollectionFinder == v7.getId()) //If given id matches v7 ID, collectionFinder will retrieve the brand name

            collectionFinder = v7.getBrand();
        else{
            System.out.println("ID does not match anything");
        }

        //This tests if it does find BMW from List where id = 1 by matching it against listFinder
        assertEquals("BMW", listFinder);

        //This tests if it does in fact find Nissan in the Set where id = 3 by matching it against setFinder
        assertEquals("Nissan", setFinder);

        //This tests if it does in fact find Porsche in the Map where id = 5 by matching it against mapFinder
        assertEquals("Porsche", mapFinder);

        //This tests if it does in fact find Tesla in the Map where id = 7 by matching it against collectionFinder
        assertEquals("Tesla", collectionFinder);

    }


}