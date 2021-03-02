
/***
* Example JUnit testing class for IglooClass1
*
* - must have your classpath set to include the junit-4.8.1.jar file
* - to run the test do:
*     java org.junit.runner.JUnitCore IS1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening
***/

import org.junit.*;

public class IS1Test
{
   // Data you need for each test case
   private IglooScore1 score;

// 
// Stuff you want to do before each test case
//
@Before public void setup()
{
   System.out.println("\nTest starting...");
   score = new IglooScore1();
}

//
// Stuff you want to do after each test case
//
@After public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// A test case
//
@Test public void firstIsMin()
{
   int s;
   System.out.println("Running test firstIsMin.");
   score.recordScores(1,2,3);
   s = score.overallScore();
   Assert.assertTrue(s == 5);
}

// 
// Another test case
//
@Test public void secondIsMin()
{
   int s;
   System.out.println("Running test secondIsMin.");
   score.recordScores(2,1,3);
   s = score.overallScore();
   Assert.assertTrue(s == 5);
}

/***
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("IS1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/
}

