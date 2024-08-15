# Library Catalog System

## Overview
The Library Catalog System is a simple web application built with Spring Boot. It allows users to add, search, and list books in a library. The data is stored in a MySQL database.

## Features
- **Add Book**: Enter a book's title and author to add it to the catalog.
- **Search**: Find books by title or author.
- **List Books**: View all books in the catalog.

## Setup

### Prerequisites
- Java 17 or later
- MySQL Server
- Maven

### Database
1. Create a MySQL database named `lcs`:
   ```sql
   CREATE DATABASE lcs;


###Running the Application

1. Clone the repository:

	git clone https://github.com/ManjulaDoddavula/CBT-CIP/LibraryCatalogSystem.git

2. Navigate to the project directory:

	cd LibraryCatalogSystem

3. Build and run the application using Maven:

	mvn spring-boot:run

###Endpoints

POST /api/books: Add a book.
GET /api/books/search/title: Search by title.
GET /api/books/search/author: Search by author.
GET /api/books: List all books.

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

[32m :: Spring Boot :: [39m              [2m (v3.3.2)[0;39m

[2m2024-08-14T13:21:41.129+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mL.L.LibraryCatalogSystemApplication     [0;39m [2m:[0;39m Starting LibraryCatalogSystemApplication using Java 21.0.3 with PID 304 (C:\Users\Hp\OneDrive\Desktop\LibraryCatalogSystem\LibraryCatalogSystem\target\classes started by Hp in C:\Users\Hp\OneDrive\Desktop\LibraryCatalogSystem\LibraryCatalogSystem)
[2m2024-08-14T13:21:41.131+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mL.L.LibraryCatalogSystemApplication     [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2024-08-14T13:21:41.169+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36m.e.DevToolsPropertyDefaultsPostProcessor[0;39m [2m:[0;39m Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
[2m2024-08-14T13:21:41.169+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36m.e.DevToolsPropertyDefaultsPostProcessor[0;39m [2m:[0;39m For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
[2m2024-08-14T13:21:41.531+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36m.s.d.r.c.RepositoryConfigurationDelegate[0;39m [2m:[0;39m Bootstrapping Spring Data JPA repositories in DEFAULT mode.
[2m2024-08-14T13:21:41.563+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36m.s.d.r.c.RepositoryConfigurationDelegate[0;39m [2m:[0;39m Finished Spring Data repository scanning in 25 ms. Found 1 JPA repository interface.
[2m2024-08-14T13:21:41.907+05:30[0;39m [31mERROR[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mo.a.catalina.core.AprLifecycleListener  [0;39m [2m:[0;39m An incompatible version [1.2.33] of the Apache Tomcat Native library is installed, while Tomcat requires version [1.2.34]
[2m2024-08-14T13:21:42.067+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat initialized with port 8087 (http)
[2m2024-08-14T13:21:42.076+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Starting service [Tomcat]
[2m2024-08-14T13:21:42.076+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mo.apache.catalina.core.StandardEngine   [0;39m [2m:[0;39m Starting Servlet engine: [Apache Tomcat/10.1.26]
[2m2024-08-14T13:21:42.114+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring embedded WebApplicationContext
[2m2024-08-14T13:21:42.114+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mw.s.c.ServletWebServerApplicationContext[0;39m [2m:[0;39m Root WebApplicationContext: initialization completed in 945 ms
[2m2024-08-14T13:21:42.227+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mo.hibernate.jpa.internal.util.LogHelper [0;39m [2m:[0;39m HHH000204: Processing PersistenceUnitInfo [name: default]
[2m2024-08-14T13:21:42.271+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36morg.hibernate.Version                   [0;39m [2m:[0;39m HHH000412: Hibernate ORM core version 6.5.2.Final
[2m2024-08-14T13:21:42.292+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mo.h.c.internal.RegionFactoryInitiator   [0;39m [2m:[0;39m HHH000026: Second-level cache disabled
[2m2024-08-14T13:21:42.496+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mo.s.o.j.p.SpringPersistenceUnitInfo     [0;39m [2m:[0;39m No LoadTimeWeaver setup: ignoring JPA class transformer
[2m2024-08-14T13:21:42.513+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mcom.zaxxer.hikari.HikariDataSource      [0;39m [2m:[0;39m HikariPool-1 - Starting...
[2m2024-08-14T13:21:42.780+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mcom.zaxxer.hikari.pool.HikariPool       [0;39m [2m:[0;39m HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@18828b8e
[2m2024-08-14T13:21:42.782+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mcom.zaxxer.hikari.HikariDataSource      [0;39m [2m:[0;39m HikariPool-1 - Start completed.
[2m2024-08-14T13:21:42.821+05:30[0;39m [33m WARN[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36morg.hibernate.orm.deprecation           [0;39m [2m:[0;39m HHH90000025: MySQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
[2m2024-08-14T13:21:43.393+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mo.h.e.t.j.p.i.JtaPlatformInitiator      [0;39m [2m:[0;39m HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
[2m2024-08-14T13:21:43.430+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mj.LocalContainerEntityManagerFactoryBean[0;39m [2m:[0;39m Initialized JPA EntityManagerFactory for persistence unit 'default'
[2m2024-08-14T13:21:43.671+05:30[0;39m [33m WARN[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mJpaBaseConfiguration$JpaWebConfiguration[0;39m [2m:[0;39m spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
[2m2024-08-14T13:21:43.918+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mo.s.b.d.a.OptionalLiveReloadServer      [0;39m [2m:[0;39m LiveReload server is running on port 35729
[2m2024-08-14T13:21:43.948+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat started on port 8087 (http) with context path '/'
[2m2024-08-14T13:21:43.954+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [  restartedMain][0;39m [2m[0;39m[36mL.L.LibraryCatalogSystemApplication     [0;39m [2m:[0;39m Started LibraryCatalogSystemApplication in 3.085 seconds (process running for 3.642)
Library Catalog System
1. Add Book
2. Search by Title
3. Search by Author
4. List All Books
5. Exit
Enter choice: 1
Enter title: buddhacharita
Enter author: asvaghosa
Hibernate: insert into book (author,title) values (?,?)
Book added successfully.
Library Catalog System
1. Add Book
2. Search by Title
3. Search by Author
4. List All Books
5. Exit
Enter choice: 2
Enter title: mudrarakshasa
Hibernate: select b1_0.id,b1_0.author,b1_0.title from book b1_0 where upper(b1_0.title) like upper(?) escape '\\'
mudrarakshasa by visakdatta
Library Catalog System
1. Add Book
2. Search by Title
3. Search by Author
4. List All Books
5. Exit
Enter choice: 3
Enter author: vatsayana
Hibernate: select b1_0.id,b1_0.author,b1_0.title from book b1_0 where upper(b1_0.author) like upper(?) escape '\\'
kamasutra by vatsayana
Library Catalog System
1. Add Book
2. Search by Title
3. Search by Author
4. List All Books
5. Exit
Enter choice: 4
Hibernate: select b1_0.id,b1_0.author,b1_0.title from book b1_0
Ek Samandar, Mere Andar by 	Sanjeev Joshi
Political History of Assam (1947-1971) – Volume 1 by Dr. Rajen Saikia
Four Stars of Destiny by 	General Manoj Mukund Naravane
Maha Kavithai by 	Vairamuthu
Spare by 	J. R. Moehringer
tomb of sand by geetanjali
mudrarakshasa by visakdatta
rajtarangini by kalhana
kamasutra by vatsayana
natyashastra by bharata
buddhacharita by asvaghosa
Library Catalog System
1. Add Book
2. Search by Title
3. Search by Author
4. List All Books
5. Exit
Enter choice: 5
[2m2024-08-14T13:23:55.770+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [ionShutdownHook][0;39m [2m[0;39m[36mj.LocalContainerEntityManagerFactoryBean[0;39m [2m:[0;39m Closing JPA EntityManagerFactory for persistence unit 'default'
[2m2024-08-14T13:23:55.772+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [ionShutdownHook][0;39m [2m[0;39m[36mcom.zaxxer.hikari.HikariDataSource      [0;39m [2m:[0;39m HikariPool-1 - Shutdown initiated...
[2m2024-08-14T13:23:55.779+05:30[0;39m [32m INFO[0;39m [35m304[0;39m [2m---[0;39m [2m[LibraryCatalogSystem] [ionShutdownHook][0;39m [2m[0;39m[36mcom.zaxxer.hikari.HikariDataSource      [0;39m [2m:[0;39m HikariPool-1 - Shutdown completed.

