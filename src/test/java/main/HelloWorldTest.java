package main;

import maventest.HelloWorld;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class HelloWorldTest {
    ArrayList<String> wordArray;

    @Before
    public void initTestData (){
        String [] words = {"the", "quick", "brown","fox","dog"};
        wordArray = new ArrayList<>(Arrays.asList(words));
    }

    @Test
    public void testAddInt(){
//        fail("forced fail message");
        /// test function can have as many asserts as necessary, must pass all
        assertEquals("testing", 4, HelloWorld.add(2,2));
        assertEquals("2mill5mill", 7_000_000, HelloWorld.add(2_000_000,5_000_000));
    }


    @Test
    public void testAddDouble(){
//        fail("forced fail message");
        /// test function can have as many asserts as necessary, must pass all
        assertEquals("testing .2 ", .3, HelloWorld.add(.2,.1), 5);

    }

    @Test
    public void testJoinWords (){
        assertEquals("the quick brown fox dog", HelloWorld.joinWords(wordArray, " "));
    }





}//// END OF CLASS
