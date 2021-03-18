# IglooScore
An Olympic igloo scoring system.

## CS 581 Assignment 3 Testing Portion

This assignment involves using JUnit 4 to perform automated
unit testing on some classes.

JUnit 4 is available at https://junit.org/junit4/ 
Note that JUnit 5 is NOT compatible with JUnit 4.

In Java 4 you typically need both the "junit" jarfile and the
"hamcrest" jarfile (which has some helper classes). Do NOT put 
them in your CS581 workspace and definitely do NOT commit them
into the course repository!

From the JUnit home page, click on "Getting Started" in the 
upper right, and read the short "JUnit Cookbook" to see a short
introduction. The Javadoc-generated API documentation is also
useful. You can find many other resources and tutorials on the
web that describe JUnit.

Your task for this assignment is to create unit tests which
accomplish certain goals, mainly ensuring good testing coverage
of the classes under test. 

You have two classes to test: IglooScore1 and IglooScore2. They 
both implement the same requirements, which are described in 
their header comment. They may have errors, but do NOT fix or
change their source code in any way during this testing. 
Your unit tests using JUnit will exercise an object (or more) of 
the class directly, and will not use the "main" method. You do not 
have to test "main", and should ignore it entirely. It is there 
just so that you can "run" the classes in a standalone matter to 
see what they do.

In each section below, when creating test cases you should not
have "redundant" test cases which do not exercise anything new.
Having more tests than you need will REDUCE your grade, not
enhance it! 

Every test function __MUST__ have a descriptive name. Do not be
afraid of long, even very long test function names!
You must also write a comment header for each test case that 
succinctly describes that test case. Just write a short 
description -- a long verbose description is no good!

## Section 1: Black box testing

Black box testing aims to test the code according to its
requirements, without being able to look into the code and
see how things are implemented. The code is treated as a
"black box" -- in the case of testing an individual class, 
only its public API is considered.

Suggested reading:

http://en.wikipedia.org/wiki/Black_box_testing
http://en.wikipedia.org/wiki/Equivalence_Partitioning
http://en.wikipedia.org/wiki/Boundary-value_analysis

Use the ideas from equivalence partitioning and boundary
value analysis to create JUnit test cases which fully test
the two classes under black box testing. The JUnit test
classes must be named "BBIS1" and "BBIS2" for this part.
Note that since this is black box testing and both classes 
under test should implement the same requirements, your two
test classes should be exactly the same except for which
class they reference (IglooScore1 and IglooScore2).

## Section 2: White box control flow testing

White box testing looks INTO the code as actually implemented
and tries to construct tests to ensure that the code is
exercised. This is essentially "coverage" testing in that it
ensures the code is covered in some way, while black box 
testing does not know whether code is covered or not. Definitions
of coverage come in many forms, and split between control flow
and data flow. Here we consider control flow.

Suggested reading:

http://en.wikipedia.org/wiki/White_box_testing
http://en.wikipedia.org/wiki/Coverage_testing

In this section you must create tests that satisfy various
levels of control flow coverage. Your test classes must be named
"WBIS1" and "WBIS2" for the respective tests for the two
classes under test. 

Your starting point for coverage is the coverage you are already
achieving on your black box tests. Now, into your test classes 
add ONLY those test cases that are needed to achieve 100% condition
coverage (again, ignoring main()).

Each test must be clearly commented with the reason it is being
added (i.e., what coverage point it is addressing). Since the 
two classes under test are implemented quite differently, it is 
doubtful that your two test classes will contain the same exact set 
of tests.

## (OLD -- DO NOT DO!) Section 3: White box data flow testing 

White box data flow testing is geared towards testing the 
possible data flows in the program rather than looking at
how the code branches (control flow).

Suggested reading:

http://en.wikipedia.org/wiki/Def-use_chain

The heart of dataflow testing/analysis is the def-use chain.
A definition of a variable is an assignment to the variable
(which "defines" a new value for it), and a use is any use
of the variable which accesses its current value. A def-use
chain is a def/use pair for a particular variable.

We will write them as "(variable,use-line-num,def-line-num)".
An example def-use-chain from IglooScore1.java is (s,40,45),
since local variable s is defined (assigned to) on line 40
and used (in the right hand expression) on line 45.

For this section you will create two test classes named 
"WBDFIS1" and "WBDFIS2". 

First, you must document some def-use chains in the two programs.
This should be done in a separate text file. You only need to 
document the def-use chains for the local variables in the 
"overallScore()" methods, and for the "score2" object data field
variable. Also, you should ignore the "main" method entirely. If you 
believe that any of your documented def-use chains are completely 
infeasible to execute, mark them as such.

Next create test cases which exercise all possible def-use chains,
of the chains you wrote down. As before, you should not create unnecessary 
tests which do not accomplish anything new. In each test header comment, 
list the def-use chains that it exercises.


