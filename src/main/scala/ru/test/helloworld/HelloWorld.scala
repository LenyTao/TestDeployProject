package ru.test.helloworld

import ru.test.helloworld.classes.Person

object HelloWorld extends App {
  val person = Person("Elisei",55)
  val person2 = Person("Zhen",55)

  println(s"Hello World ${person.getPerson()}!")
  println(s"Hello World ${person2.getPerson()}!")
}
