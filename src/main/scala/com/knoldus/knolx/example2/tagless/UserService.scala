package com.knoldus.knolx.example2.tagless

import java.util.UUID
import cats.Monad
import cats.implicits._
//import com.knoldus.knolx.example2.tagless.Interpreters.{FutureEmailInterpreter, FutureUserInterpreter}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

class UserService { }

/*object UserService extends App {

    val userService = new UserService(new FutureUserInterpreter {}, new FutureEmailInterpreter {})

    val result : Future[Either[String, Unit]] =
        userService.addPoints(UUID.randomUUID(), 13)

    val output : Either[String, Unit] = Await.result(result, 1 seconds)
    println(s"Output: $output")
}*/
