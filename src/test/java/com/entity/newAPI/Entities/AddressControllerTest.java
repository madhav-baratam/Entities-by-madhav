package com.entity.newAPI.Entities;

import com.entity.newAPI.Entities.controller.AddressController;
import com.entity.newAPI.Entities.repository.AddressRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class AddressControllerTest {
    @Mock
    AddressController add;
    public MockitoRule rule = MockitoJUnit.rule();


    @Test
    public void testAddress()
    {
       when(add.getEmployees()).thenReturn(null);

    }

    @Test
    public void getaddresstest() throws Exception{

    }
}
