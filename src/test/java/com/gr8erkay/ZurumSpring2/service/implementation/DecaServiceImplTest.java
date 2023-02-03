package com.gr8erkay.ZurumSpring2.service.implementation;

import com.gr8erkay.ZurumSpring2.model.Decagon;
import com.gr8erkay.ZurumSpring2.service.DecaService;
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DecaServiceImplTest {


    private DecaService decaService;

    @Test
    public void testDecaSave() {

        Decagon decagon = new Decagon(1L, "gr8@gmail.com", "Greater");

        String expected = decaService.saveDecagonPerson(decagon);
        assertTrue(expected.equals("It is saved"));

    }
}