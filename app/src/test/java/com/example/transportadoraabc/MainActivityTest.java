package com.example.transportadoraabc;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void calculaSeEstaRetornandoOsCreditosCorretamenteTeste() {
        assertEquals(781.00, MainActivity.creditos(100, 3.55), 0.01);
    }

    @Test
    public void calculaSeEstaRetornandoOsCreditosErradosTeste() {
        assertNotEquals(2.00, MainActivity.creditos(100, 3.55), 0.01);
    }
}