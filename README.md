# MegaportAssesment120322
This is a simple Maven/Java application for sorting names read from a .txt file and out putting a file with sorted names by alphabetical order.


---Maven set-up---

Due to issues with building using a base maven project. The compiler was set to 1.5 which is no longer supported. 

Changes that were made to run the Maven build are setting the project -> JDK compliance parameter from 1.5 to 1.7.

Steps include:
- Changing project -> JDK parameter to 1.5 to 15.
- Changing the execution environment ot JavaSE-12.
- Adding maven compiler source and target 15 in the properties.
