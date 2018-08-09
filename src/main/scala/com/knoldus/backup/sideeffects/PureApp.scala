package com.knoldus.backup.sideeffects

object PureApp extends App {

  def printString(string: String): IO[Unit] = IO(println(string))
  def readString = IO(scala.io.StdIn.readLine())

  val app: IO[Unit] = for {
    _ <- printString("Hello... User")
    _ <- printString("Please enter your first name")
    firstName <- readString
    _ <- printString("Please enter your last name")
    lastName <- readString
    _ <- printString("User details as below: ")
    _ <- printString(s"First Name: $firstName, Last Name: $lastName")
  } yield ()

  app.run
}
