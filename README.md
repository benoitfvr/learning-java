# Projet Simple Calculateur Java - HETIC

MT4 - Module Java - Travaux pratiques

Check each branch to see each exercice

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

3. Test the calculator :

   ```bash
   cd bin
   java -jar Exercice1.jar 1 2 +
   ```

## Exercice 2, 3, 4

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

3. Test the calculator :

   ```bash
   cd bin
   java -jar Exercice2.jar ../inputs
   ```

   After that, you can open `/inputs` folder and see all generated `.res` files

## Exercice 5

In the branch `exercice-5` :

Run the following command to execute :
```bash
cd learning-java
java -jar target/exercice2-1.0-SNAPSHOT.jar ./inputs
```

## Exercice 5

In the branch `exercice-6` :

Run the following command to execute tests :
```bash
cd learning-java
nvm clean test
```

## Author

- Benoît FAVRIE ([@benoitfvr](https://github.com/benoitfvr))<br />
