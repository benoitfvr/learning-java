# Projet Simple Calculateur Java - HETIC

MT4 - Module Java - Travaux pratiques

## Table of Contents

- [Set up](#setup)
- [Usage](#usage)
- [Author](#author)

## Exercice 1

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

## Exercice 2

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
   java -jar Exercice2.jar ../input.op ../output.res
   ```

   Open output.res and see the result

## Author

- Benoît FAVRIE ([@benoitfvr](https://github.com/benoitfvr))<br />
