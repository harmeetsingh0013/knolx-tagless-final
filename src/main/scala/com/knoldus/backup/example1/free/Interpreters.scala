package com.knoldus.backup.example1.free

import cats.~>
import scala.concurrent.Future

object Interpreters {

    val futureInterpreter = new (UserRepositoryAlg ~> Future) {
        override def apply[A](fa : UserRepositoryAlg[A]): Future[A] = fa match {
            case FindUser(id) =>
                // Go to the database and find the user
                Future.successful(None).asInstanceOf[Future[A]]
            case UpdatedUser(user) =>
                // Go to the database and update user
                Future.successful(()).asInstanceOf[Future[A]]
        }
    }

}
