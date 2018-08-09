package com.knoldus.knolx.example1.tagless

import java.util.UUID

import cats.implicits._
import cats.{Id, Monad}

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._


class UserService{ }

/*object UserService extends App {
    val userService = new UserService(new FutureInterpreter {})

    val result = userService.addPoints(UUID.randomUUID(), 10)

    val output : Either[String, Unit] = Await.result(result, 1 seconds)
    println(s"Output: $result")
}*/
