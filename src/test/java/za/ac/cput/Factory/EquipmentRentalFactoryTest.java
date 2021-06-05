package za.ac.cput.Factory;

/*
    @Description: EquipmentRentalFactoryTest.java
    @Author: Grant Hendricks
    @Student Number: 215138848
    @Date: 5 June 2021
  */

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.EquipmentRental;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentRentalFactoryTest {

    @Test void test(){
        EquipmentRental equipmentRental = EquipmentRentalFactory.createEquipmentRental("client","","","","");
        System.out.println(equipmentRental);
        assertNotNull(equipmentRental);

    }

}