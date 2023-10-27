Inorder to make a JAR i had to make this a maven module. 

To make a maven module. go to project settings or framework support in intelij.
it basically adds the pom.xml file and thats what makes it a maven project / module. 


I had to add in resources META-INF folder and in that MANIFEST.MF . its empty as 
This is not an executable jar, but a SDK for other projects to use it. 


I build the project that creates a JAR in the target folder and also saves it in
the .m2 locally. 


So thats how i made this library a bankSDK . 

I used singleton pattern and Interitance and here are some more QAs

What is a JAR file.
Java Archive .

How to create a JAR file ?
complie your code.

javac MYSUPERCODE/.*.class [only the class files

jar cf mysupercode.jar input-file(s)

Once you have the jar .. u can access the Classes in the har


The subclasses cannot access the package-private member variables as they are in different packages. [If they are in different packages]else its allowed.

learnt that default and package-private mean the same. 