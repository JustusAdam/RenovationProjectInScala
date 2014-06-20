Renovation Project
=====

This will be the solution to a university training exercise originally designed to be implemented in Java, however I liked the 
idea of attempting an implementation in Scala. 

The assignment originally includes jUnit tests which the implementation has
to pass. Since I am not entirely sure I'd be allowed to upload those tests I'll eventually write a few tests of my own.

Since the original tests are designed to work with a pure Java implementation some methods have to be translated to
work. Right now the compatibility is ensured by using java.lang.Double instead of scala.lang.Double but that obviously
is messy and wrong, but it works, and I currently can't get a clean implementation to work (the hard part is converting
the Map from addMaterialReq from Map[String,scala.lang.Double] to Map[String,java.lang.Double])

Description
---
soon

Status
---

- It compiles!
- The majority of tests pass, but some don't and the reason does not appear to be all that obvious, so I suspect a 
major bug in my implementation.