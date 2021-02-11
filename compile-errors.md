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
