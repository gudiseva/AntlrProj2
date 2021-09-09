# Antlr Beginner Tutorial 2: Integrating Antlr in Java Project

## Reference
https://www.youtube.com/watch?v=itajbtWKPGQ

## Run the Project
C:\WORKSPACE\IdeaProjects\AntlrProj2> java -jar antlr-4.8-complete.jar -no-visitor -no-listener CPP14.g4

## Steps
1) Create grammar and lib folders
2) Move CPP14.g4 to grammar folder
3) Move antlr-4.8-complete.jar to lib folder
4) Move the generated code inside src folder
5) Add example.cc
6) Add new class AntlrParser.java
7) Debug AntlrParser.java at System.out.println

## Git Commands
$ git init -b main
$ git add .
$ git commit -m "First Commit"
$ git remote add origin https://github.com/gudiseva/AntlrProj2.git
$ git remote -v
$ git pull origin main
$ git push origin main

## To get the history of commands
C:\WORKSPACE\IdeaProjects\AntlrProj2> doskey /history