# Pallida Orientation Retake Exam

Build a webshop that people can use to order some merchandise from the Greenfox store.

### Highlights
 - It has a simple frontend which can:
     - list all the items
     - user can set the quantity of any item they want to order
     - it can display a new list with the selected items

Detailed info is in the language specific description.

## Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

## What can I use?
- You can use any resource online, but **work individually**
- Instead of copy-pasting your answers and solutions, write them in your own words.

# Tasks for everybody

## 1) Import the database

All classes should import the following database:

| c# | java | javascript |
|-----|-----|-----|
|[clothing.sql](data/clothing_cs.sql)|[clothing.sql](data/clothing.sql)|[clothing_js.sql](data/clothing.sql)|

CREATE A SCREENSHOT OF THE DATABASE YOU IMPORTED AND COMMIT IT TO THE REPO

## 2) Continue with your class' language:

 - [C#](cs.md)
 - [Java](java.md)
 - [JavaScript](javascript.md)


Question time

Why would you declare your class as an abstract class?

Abstract classes are similar to interfaces, with them it is possible to declare fields that are not static and final and define public, protected, and private concrete methods.

Consider using abstract classes if any of these statements apply to your situation:

a,You want to share code among several closely related classes.

b,You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).

c,You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.
