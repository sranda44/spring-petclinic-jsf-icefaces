# Spring Pet Clinic - JSF ICEfaces Edition

A modern Java 8 implementation of the classic Spring Pet Clinic application using JSF 1.2, ICEfaces, Hibernate ORM, and H2 embedded database. Fully deployable to WebLogic 12c Server.

## Technology Stack

- **Java 8** - Modern Java with lambda expressions and date/time API support
- **Spring Framework 2.5.6** - Core framework for dependency injection and transaction management
- **JSF 1.2** - JavaServer Faces for server-side UI rendering
- **ICEfaces 1.8.2** - Rich AJAX components for interactive web interfaces
- **Hibernate 3.3.2** - Object-relational mapping (ORM) framework
- **H2 Database 1.4.200** - Embedded SQL database (no external DB required)
- **WebLogic 12c** - Enterprise application server deployment target

## Features

- **Owner Management** - Create, read, update, and delete pet owners
- **Pet Management** - Manage pets with breed, birth date, and owner associations
- **Veterinarian Management** - Manage veterinarians and their specialties
- **Visit Tracking** - Record and track pet visits with descriptions
- **Real-time Updates** - ICEfaces provides push technology for live UI updates
- **Transaction Management** - Spring-managed transactions for data consistency
- **Input Validation** - JSF validators for form inputs
- **Localization** - Multi-language support (English, Spanish, German)

## Project Structure
spring-petclinic-jsf-icefaces/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/petclinic/
│   │   │       ├── domain/
│   │   │       │   ├── Owner.java
│   │   │       │   ├── Pet.java
│   │   │       │   ├── PetType.java
│   │   │       │   ├── Specialty.java
│   │   │       │   ├── Vet.java
│   │   │       │   ├── Visit.java
│   │   │       │   ├── Owner.hbm.xml
│   │   │       │   ├── Pet.hbm.xml
│   │   │       │   ├── PetType.hbm.xml
│   │   │       │   ├── Specialty.hbm.xml
│   │   │       │   ├── Vet.hbm.xml
│   │   │       │   └── Visit.hbm.xml
│   │   │       ├── dao/
│   │   │       │   ├── OwnerDao.java
│   │   │       │   ├── PetDao.java
│   │   │       │   ├── PetTypeDao.java
│   │   │       │   ├── SpecialtyDao.java
│   │   │       │   ├── VetDao.java
│   │   │       │   ├── VisitDao.java
│   │   │       │   └── hibernate/
│   │   │       │       ├── HibernateOwnerDao.java
│   │   │       │       ├── HibernatePetDao.java
│   │   │       │       ├── HibernatePetTypeDao.java
│   │   │       │       ├── HibernateSpecialtyDao.java
│   │   │       │       ├── HibernateVetDao.java
│   │   │       │       └── HibernateVisitDao.java
│   │   │       ├── service/
│   │   │       │   └── ClinicService.java
│   │   │       └── jsf/
│   │   │           ├── bean/
│   │   │           │   ├── OwnerListBean.java
│   │   │           │   ├── OwnerDetailBean.java
│   │   │           │   ├── PetListBean.java
│   │   │           │   ├── PetDetailBean.java
│   │   │           │   └── VisitBean.java
│   │   │           ├── converter/
│   │   │           │   ├── OwnerConverter.java
│   │   │           │   └── PetConverter.java
│   │   │           └── validator/
│   │   │               └── EmailValidator.java
│   │   ├── resources/
│   │   │   ├── applicationContext.xml
│   │   │   ├── jdbc.properties
│   │   │   ├── log4j.xml
│   │   │   ├── messages.properties
│   │   │   ├── messages_es.properties
│   │   │   ├── messages_de.properties
│   │   │   └── db/
│   │   │       └── h2/
│   │   │           ├── schema.sql
│   │   │           └── data.sql
│   │   └── webapp/
│   │       ├── index.jsp
│   │       ├── WEB-INF/
│   │       │   ├── web.xml
│   │       │   ├── faces-config.xml
│   │       │   ├── weblogic.xml
│   │       │   └── templates/
│   │       │       ├── header.xhtml
│   │       │       ├── footer.xhtml
│   │       │       └── layout.xhtml
│   │       └── petclinic/
│   │           ├── index.xhtml
│   │           ├── ownerList.xhtml
│   │           ├── ownerDetail.xhtml
│   │           ├── ownerNew.xhtml
│   │           ├── petList.xhtml
│   │           ├── petDetail.xhtml
│   │           ├── petNew.xhtml
│   │           ├── visitList.xhtml
│   │           ├── visitNew.xhtml
│   │           ├── vetList.xhtml
│   │           └── css/
│   │               └── styles.css
│   └── test/
│       ├── java/
│       │   └── com/example/petclinic/
│       │       ├── service/
│       │       │   └── ClinicServiceTest.java
│       │       ├── dao/
│       │       │   └── OwnerDaoTest.java
│       │       └── jsf/
│       │           └── bean/
│       │               └── OwnerListBeanTest.java
│       └── resources/
│           ├── applicationContext-test.xml
│           └── db/
│               └── h2/
│                   └── schema-test.sql
└── .gitignore