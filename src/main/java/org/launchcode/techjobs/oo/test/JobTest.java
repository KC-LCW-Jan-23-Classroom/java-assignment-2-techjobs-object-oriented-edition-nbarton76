package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
@Test
    public void testSettingJobId() {
    Job job1 = new Job();
    Job job2 = new Job();
    assertNotEquals(job1.getId(), job2.getId());
}
@Test
    public void testJobConstructorSetsAllFields() {
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(job1 instanceof Job);
    assertEquals("Product tester", job1.getName());
    assertEquals("ACME", job1.getEmployer().getValue());
    assertEquals("Desert", job1.getLocation().getValue());
    assertEquals("Quality control", job1.getPositionType().getValue());
    assertEquals("Persistence", job1.getCoreCompetency().getValue());
}
@Test
    public void testJobsForEquality() {
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertNotEquals(job1, job2);
}
@Test
    public void testToStringStartsAndEndsWithNewLine() {
    Job job1 = new Job();
    assertTrue(job1.toString().startsWith("\n"));
    assertTrue(job1.toString().endsWith("\n"));
}
@Test
    public void testToStringContainsCorrectLabelsAndData() {
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String expected = "\nID: " + job1.getId() + "\nName: " + job1.getName() + "\nEmployer: " + job1.getEmployer() + "\nLocation: " + job1.getLocation() + "\nPosition Type: " + job1.getPositionType() + "\nCore Competency: " + job1.getCoreCompetency() + "\n";
    assertEquals(expected, job1.toString());
}
@Test
    public void testToStringHandlesEmptyField() {
    Job job1 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String expected = "\nID: " + job1.getId() + "\nName: " + job1.getName() + "\nEmployer: " + job1.getEmployer() + "\nLocation: " + job1.getLocation() + "\nPosition Type: " + job1.getPositionType() + "\nCore Competency: " + job1.getCoreCompetency() + "\n";
    assertEquals(expected, job1.toString());
}
@Test
    public void testToStringHandlesOnlyIdField() {
    Job job1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    String expected = "OOPS! This job does not seem to exist.";
    assertEquals(expected, job1.toString());
    }
}

