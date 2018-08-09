package com.knoldus.knolx.sideeffects

object SideEffectsApp extends App {

  println("Hello... User")

  println("Please enter your first name")
  val firstName = scala.io.StdIn.readLine()

  println("Please enter your last name")
  val lastName = scala.io.StdIn.readLine()

  println("User details as below: ")
  println(s"First Name: $firstName, Last Name: $lastName")
}
