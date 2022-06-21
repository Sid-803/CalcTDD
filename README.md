# CalcTDD

Project Details:

Total Packages =4
Total Classes =4 (One in each package)

package1 :
Name = Calculator
Class = Calculator

Description: POJO class which contains attributes (private), public getter and setter and public paramterized Constructor to define the Calculator

package2:
Name = Services
Class = ServiceLogic
Imports = Calculator.Calculator.java

Description: It instantiate Calculator.java to use the attributes defined in POJO
It contains add method which is the main method for this whole project.
*Algorithm for ServiceLogic.add method*
  1. Check if string is empty, if not check for delimiter.
  2. Delimiter method removes delimiting componenets(if exist). Output is Integer figures and       commas 
  3. Assign attribute i value where string has comma.
  4. Splits the single string(string) into two sub-string(a1,a2) separated by comma(pre comma=a2 and post comma =a2)  based on i value
  5. Converts both sub strings(a1,a2) into integers(k1,k2)
  6. Returns sum of both Integers
  Exceptions: Throws NumberFormatException if k1 or k2 is anything other than Integer.
  
  It also contains method called delimiter which is used inside method add if string consist of delimiters(//;\n1,2). It also takes care of line breaks in string. It returns string in format (A,B)
  
  It also contains method called searchCommas which returns index for comma which exist in the string. This method is also called in add method which is used to split string into two sub string saperated at comma.
  
  package3:
  Name= Test
  Class= Test
  Imports= Services.ServiceLogic
  
  Description: 
  OBJECTS
  It contains the input String.
  It instantiates ServiceLogic class.
  
  EXCEPTION HANDLING
  *Try catch for exception handling*
  add method is called.
    if memebers to be added are not in accepted format then Exception is thrown
    if members to be added are negative then exception is thrown
   
   OUTPUT
   Sum of added memeber
   or
   Error (results of Exception handling)
   
   Testing:
   Tested for:-
   ""  ------------------------ Invalid String
   "1"  ------------------------ Invalid String
   "1,2"
   "1,2,3"  ------------------------ Invalid String
   "\n2,3"
   "2,\n4"
   "\n4,\n4"
   "//;\n1,2"
   "-1,1"  ------------------------ Negative number exist (no addition)
   "-1,-1" ------------------------ Negative number exist (no addition)
   
   
