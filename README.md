# Demo Library
This project is a library for padding Strings in Java.

---
**WARNING**

Don't use this in production. It was created for demo purposes only.

---

## How to use it:

Add the following dependency:
````XML
<dependency>
    <groupId>com.thegreatapi.demolibrary</groupId>
    <artifactId>demolibrary</artifactId>
    <version>${VERSION}</version>
</dependency>
````
The folling code
````java
String paddedString = this.stringPadder.padLeft("My String", 30, '-');
System.out.println(paddedString);
````
Will print:

````
---------------------My String
````