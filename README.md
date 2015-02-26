MyFirstMavenProject

To execute the program, go to the folder where pom.xml file is available ( Here the root dir- helloworld-app) and run the following commands:

mvn compile         				( To compile)
mvn exec:java       				( To run the program)
mvn exec:java -q    				( To see only Error Logs)
mvn exec:java -Dexec.args="arg0 arg1 arg2"   	( With arguments)
