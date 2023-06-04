1. Create a maven project in eclipse ide
2.Go to google, search for maven repository and search for mysql connector java
3. In that mysql  connector java,  select for 8.0.28 version and in that version, copy the dependency under maven section
4. paste that dependency in pom.xml file inside this <dependencies></dependencies> tag
5. in maven repository, search for hibernate core relocation and choose 5.6.14 version and copy the dependency under maven section and paste it in pom.xml
6. After adding dependencies, right click on src/main/resources , create a new folder called META-INF
7. inside that folder, paste the persistence.xml file (provided by jspiders instructor) which is in download folder
8. open that persistence.xml file

<property name="javax.persistence.jdbc.url"
value="jdbc:mysql://localhost:3306/****" />

in this tag add database name
         
<property name="javax.persistence.jdbc.url"
value="jdbc:mysql://localhost:3306/admin" />



<property name="javax.persistence.jdbc.user"
				value="*****" />
			<property name="javax.persistence.jdbc.password"
				value="*****" />

add username and password

				<property name="javax.persistence.jdbc.user"
				value="root" />
			<property name="javax.persistence.jdbc.password"
				value="root" />
				
9. change the persitentence unit name and remember it for further process

10. In eclipse ide, right click on src/main/java and create a new package
11. inside that package, create a class such that it is going to  be a table for your database
12. above that class mention @Entity, it informs to database that it should create a table in the name of that class
13. mention primary key by writing @Id above the variable, you want to mention it as a primary key in the database
 