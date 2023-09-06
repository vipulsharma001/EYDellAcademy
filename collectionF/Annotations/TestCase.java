package com.collectionF.Annotations;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {

    @Test
    public void givenObjectSerializedThenTrueReturned() throws IllegalArgumentException, IllegalAccessException {
        person p = new person("core" , "java","28");
        ObjectToJSONConverter serializer = new ObjectToJSONConverter();
        String jsonString = serializer.convertToJSON(p);
        assertEquals("(\"personAge\":\"28\",\"firstName\":\"Core\"," + "\"lastName\":\"Java\")", jsonString);

        }

}
