# MegaportAssesment120322
This is a simple Maven/Java application for sorting names read from a .txt file and out putting a file with sorted names by alphabetical order.

=======

--quick run on cmd--
1. Open up MegaportSort project.(eg. cd MegaportSort)
2. Run on command line: mvn clean install
3. Run mvn test for unit tests and mvn verify for both unit tests and integration tests.
4. Open up target folder and run : java -jar target/MegaportSort-0.0.1-SNAPSHOT.jar

	-To run a custom file, you can add the file path as the first argument. (eg. java -jar target/MegaportSort-0.0.1-SNAPSHOT.jar D:/Desktop/test1.txt)
	
	-To run using a different sorting algorithm, please use the first argument as the sort type. The second argument onwards will once again be file paths.
	(eg. java -jar target/MegaportSort-0.0.1-SNAPSHOT.jar quicksort D:/Desktop/test1.txt D:/Desktop/test2.txt)
	
	-Currently the default uses collections sort and there is **quicksort** and **heapsort** as well.
	

---Maven set-up---

Due to issues with building using a base maven project. The compiler was set to 1.5 which is no longer supported. 

Changes that were made to run the Maven build are setting the project -> JDK compliance parameter from 1.5 to 9.

Steps include:
- Changing project -> JDK parameter to 1.5 to 9.

- Changing the execution environment ot JavaSE-9.

- Adding maven compiler source and target 9 in the properties.


The maven-surefire-plugin was added to ensure that Integration Tests were run during the verify life-cycle of the maven build.

The maven-jar-plugin was added to add a manifest with a pointer to the main App.class in the jar snapshot file to ensure that the jar application would run.

---Class structures---
Currently, all items in the text files are stored as ListObjects in the program.

All sorting algorithms implement the SortingAlgorithm interface and are used via SortingFactory class. This follows a factory design pattern.

