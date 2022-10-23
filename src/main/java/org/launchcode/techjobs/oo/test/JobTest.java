package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import java.lang.String;
import javax.naming.Name;
import javax.xml.namespace.QName;

import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job jobObject1 = new Job();
        Job jobObject2 = new Job();
        assertNotEquals(jobObject1.getId(), jobObject2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.getName() instanceof String);
        assertEquals(job.getName(), "Product tester");
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals(job.getEmployer().getValue(), "ACME");
        assertTrue(job.getLocation() instanceof Location);
        assertEquals(job.getLocation().getValue(), "Desert");
        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals(job.getPositionType().getValue(), "Quality control");
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job jobObjectEqual1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobObjectEqual2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(jobObjectEqual1.equals(jobObjectEqual2));
    }

    //Test for Empty Lines When passed a Job object, it should return a string that contains a blank line before and after the job information.
    @Test
    public void testToStringStartsAndEndsWithNewLine() {


        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.toString() instanceof String);
        String stringInspect = job.toString();


        assertEquals(stringInspect.charAt(0), '\n');
        assertEquals(stringInspect.charAt(stringInspect.length()-1), '\n');
 //       System.out.println(arrayInspect.length);
 //       for (String element : arrayInspect) {
 //           System.out.println("|" + element + "|");

 //       }

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      //  String stringInspect = job.toString(job);
        String stringInspect = job.toString();
        String[] arrayInspect = stringInspect.split("\n", -2);
        int i = 0;
        assertEquals(arrayInspect[0], "");

        for (String element : arrayInspect) {
            if (i == 1) {
                assertTrue(arrayInspect[i].contains("ID: "));
            }
            if (i == 2) {
                assertTrue(arrayInspect[i].contains("Name: "));
                assertTrue(arrayInspect[i].contains("Product tester"));
            }
            if (i == 3) {
                assertTrue(arrayInspect[i].contains("Employer: "));
                assertTrue(arrayInspect[i].contains("ACME"));
            }
            if (i == 4) {
                assertTrue(arrayInspect[i].contains("Location: "));
                assertTrue(arrayInspect[i].contains("Desert"));
            }
            if (i == 5) {
                assertTrue(arrayInspect[i].contains("Position Type: "));
                assertTrue(arrayInspect[i].contains("Quality control"));
            }
            if (i == 6) {
                assertTrue(arrayInspect[i].contains("Core Competency: "));
                assertTrue(arrayInspect[i].contains("Persistence"));
            }
            System.out.println("|" + element + "|");
        }


    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job= new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String stringInspect = job.toString();
        String[] arrayInspect = stringInspect.split("\n", -2);
        int i = 0;
        assertEquals(arrayInspect[0], "");
        //      System.out.println(arrayInspect.length);
        for (String element : arrayInspect) {
            if (i == 1) {
                assertTrue(arrayInspect[i].contains("ID: "));
            }
            if (i == 2) {
                assertTrue(arrayInspect[i].contains("Name: "));
                assertTrue(arrayInspect[i].contains("Data not available"));
            }
            if (i == 3) {
                assertTrue(arrayInspect[i].contains("Employer: "));
                assertTrue(arrayInspect[i].contains("Data not available"));
            }
            if (i == 4) {
                assertTrue(arrayInspect[i].contains("Location: "));
                assertTrue(arrayInspect[i].contains("Data not available"));
            }
            if (i == 5) {
                assertTrue(arrayInspect[i].contains("Position Type: "));
                assertTrue(arrayInspect[i].contains("Data not available"));
            }
            if (i == 6) {
                assertTrue(arrayInspect[i].contains("Core Competency: "));
                assertTrue(arrayInspect[i].contains("Data not available"));
            }
            System.out.println("|" + element + "|");
        }




    }
}



