# IglooScore
An Olympic igloo scoring system.

From an old assignment.

## CS 581 Assignment 3

This assignment involves using JUnit to perform automated
unit testing on some classes.

JUnit is available at www.junit.org.

The latest stable version is 4.8.2. It looks like beta versions of
4.9 are available but I do not recommend using them. For this
assignment you should download the 4.8.2 version and place it in
your own directory space. The jar file is only about 300KB. Do NOT
put it in your CS581 workspace and definitely do NOT commit it
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
their header comment. They may have errors, but do not fix or
change their source code in any way. Your unit tests using JUnit
will exercise an object (or more) of the class directly, and will
not use the "main" method. You do not have to test "main", and
should ignore it entirely. It is there just so that you can "run"
the classes in a standalone matter to see what they do.

In each section below, when creating test cases you should not
have "redundant" test cases which do not exercise anything new.
Having more tests than you need will REDUCE your grade, not
enhance it! Consider each section below as "starting new", and
do not assume the previous sections' tests already cover some
of the cases. You certainly can REUSE invidual test cases in 
between sections. 

You must write a comment header for each test case that 
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
"WBCFIS1" and "WBCFIS2" for the respective tests for the two
classes under test. Your test classes must have tests ordered
in the code from the top to bottom of the file according to
the following criteria:

1. The first set of tests must accomplish full statement coverage;
2. Then added to those (going down in the file), any extra tests
   (if any) to acheive full branch/decision coverage;
3. Then added to those, any extra tests (if any) that are needed to
   acheive full condition coverage.

Each step should be marked clearly using comments in your test
class. Since the two classes under test are implemented quite
differently, it is doubtful that your two test classes will
contain the same exact set of tests.

## Section 3: White box data flow testing

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

## Submitting the assignment

To submit this assignment, check in under a directory named 
"assignment3" all java source files for the original classes 
under test, and the six JUnit test classes you created, plus a 
short text file that lists the def-use chains from the third
part and describes any errors your tests found in 
either of the classes, and which type of testing methodology 
found the errors.

