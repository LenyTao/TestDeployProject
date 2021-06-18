package ru.test.helloworld.classes

case class Person(val name: String, val id: Int) {

  def getPerson() = {
    s"I'm $name and my ID: $id"
  }
}
