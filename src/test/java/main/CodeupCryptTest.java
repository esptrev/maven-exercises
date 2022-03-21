package main;

import maventest.CodeupCrypt;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    private double requiredVersion = 1.1;

    @Test
    public void testVersion (){
        assertNotNull(CodeupCrypt.version);
//        assertEquals(requiredVersion,CodeupCrypt.version.doubleValue(), 0);

    }

    @Test
    public void testHashPassword (){
        assertEquals("x4Z", CodeupCrypt.hashPassword("xaZA"));
    }








}/// END OF CLASS
