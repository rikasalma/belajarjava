package org.example;

import org.junit.Assert;
import org.junit.Test;

//Menghitung Luas Segitiga
public class SegitigaTest {
    @Test
    public void testLuasSegitiga (){
        Segitiga segitiga = new Segitiga(10,8);

        double luas = segitiga.getLuas();
        double expected = 40;
        Assert.assertEquals(expected, luas, 0);

    }
}
