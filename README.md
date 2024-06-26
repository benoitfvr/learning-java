# Projet Simple Calculateur Java - HETIC

MT4 - Module Java - Travaux pratiques

## Table of Contents

- [Set up](#setup)
- [Usage](#usage)
- [Author](#author)

## Exercice 1

In the branch `exercice-1` :

1. Run the following command to compile code:

   ```bash
   cd src
   javac -d ../bin fr/hetic/Exercice1.java
   ```

2. Run the following command to package class

   ```bash
   cd bin
   jar cfe Exercice1.jar fr.hetic.Exercice1 fr/hetic/*.class
   ```

3. Run the following command to test the calculator :

   ```bash
   cd bin
   java -jar Exercice1.jar 1 2 +
   ```

## Exercice 2, 3 & 4

In the branch `exercice-2`, `exercice-3` or `exercice-4` :

1. Run the following command to compile code:

   ```bash
   cd src
   javac -d ../bin fr/hetic/Exercice2.java
   ```

2. Run the following command to package class

   ```bash
   cd bin
   jar cfe Exercice2.jar fr.hetic.Exercice2 fr/hetic/*.class
   ```

3. Run the following command to test the calculator :

   ```bash
   cd bin
   java -jar Exercice2.jar ../inputs
   ```

   After that, you can open `/inputs` folder and see all generated `.res` files

## Exercice 5

In the branch `exercice-5` :

Run the following command to test the calculator :

```bash
cd learning-java
java -jar target/exercice2-1.0-SNAPSHOT.jar ./inputs
```

After that, you can open `/inputs` folder and see all generated `.res` files

## Exercice 6

In the branch `exercice-6` :

Run the following command to launch tests :

```bash
cd learning-java
mvn clean test
```

## Exercice 7

In the branch `exercice-7` :

1. Run the following command to compile code :

   ```bash
   cd learning-java
   mvn compile
   ```

2. Run the following command to package :

   ```bash
   mvn package
   ```

3. Run the following command to execute :
   ```bash
   java -jar target/exercice7-1.0-SNAPSHOT-jar-with-dependencies.jar
   ```

## Exercice 8

In the branch `exercice-8` :

In `src/main/resources/application.properties`, choose between `JDBC` or `FILE`.

1. Run the following command to compile code :

   ```bash
   cd learning-java
   mvn compile
   ```

2. Run the following command to package :

   ```bash
   mvn package
   ```

3. Run the following command to execute :
   ```bash
   java -jar target/exercice7-1.0-SNAPSHOT-jar-with-dependencies.jar
   ```

## Exercice 9 & 10

In the branch `exercice-9` :

In `src/main/resources/beans.xml`, choose between `class="fr.hetic.JdbcDataReader"` or `class="fr.hetic.FileDataReader"`.

1. Run the following command to compile code :

   ```bash
   cd learning-java
   mvn compile
   ```

2. Run the following command to package :

   ```bash
   mvn package
   ```

3. Run the following command to execute :
   ```bash
   java -jar target/exercice9-1.0-SNAPSHOT-jar-with-dependencies.jar
   ```

After that, you can see either the .res files generated by the database, or those generated by the folder passed as a parameter.

## Author

- Benoît FAVRIE ([@benoitfvr](https://github.com/benoitfvr))<br />
