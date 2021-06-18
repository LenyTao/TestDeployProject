package ru.test.helloworld

import ru.test.helloworld.classes.Person

object HelloWorld extends App {
  val person = Person("Boris",55)

  println(s"Hello World ${person.getPerson()}!")
}
