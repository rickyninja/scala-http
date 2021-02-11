# issues compiling with scalaj-http

```
jeremys@skynet> scalac src/main/scala/HTTP.scala
src/main/scala/HTTP.scala:1: error: not found: object scalaj
import scalaj.http._
       ^
src/main/scala/HTTP.scala:4: error: not found: type HttpResponse
  val resp: HttpResponse[String] = Http("http://rickyninja.net:81/").param("q", "monkey").asString
            ^
src/main/scala/HTTP.scala:4: error: not found: value Http
  val resp: HttpResponse[String] = Http("http://rickyninja.net:81/").param("q", "monkey").asString
                                   ^
three errors found
```

```
jeremys@skynet> scala -version
Scala code runner version 2.11.8 -- Copyright 2002-2016, LAMP/EPFL

jeremys@skynet> sbt -version
sbt version in this project: 1.4.7
sbt script version: 1.4.7
```
