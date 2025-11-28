package org.junit.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBussinessImplMockTest {

    @Mock
    private SomeBussinessImpl.DataService dataService;

    @InjectMocks
    private SomeBussinessImpl someBussinessImpl;

    @Test
    void findTheGreatestFromAllData_scenario() {
        when(dataService.retrieveAllData()).thenReturn(new int[]{25, 15, 5});
        assertEquals(25, someBussinessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_OneValue() {
        when(dataService.retrieveAllData()).thenReturn(new int[]{25});
        assertEquals(25, someBussinessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_Novalue() {
        when(dataService.retrieveAllData()).thenReturn(new int[]{0});
        assertEquals(0, someBussinessImpl.findTheGreatestFromAllData());
    }

}
