package org.junit.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeBussinessImplTest {
    @Test
    void findTheGreatestFromAllData_scenario() {
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBussinessImpl BussinessImpl = new SomeBussinessImpl(dataServiceStub);
      int result =  BussinessImpl.findTheGreatestFromAllData();
      assertEquals(25, result);
    }
}
class DataServiceStub implements SomeBussinessImpl.DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] {25,15,5};
    }
}



