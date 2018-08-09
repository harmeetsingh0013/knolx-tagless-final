package com.knoldus.backup.example2.free

import cats.~>
import com.knoldus.backup.example1.free.{FindUser, UpdatedUser}
import scala.concurrent.Future

object Interpreters {

    val futureUserInterpreter = new (UserRepositoryAlg ~> Future) {
        override def apply[A](fa : UserRepositoryAlg[A]) : Future[A] = fa match {
            case FindUser(userId) =>
                // Go to the database and find the user
                Future.successful(Some(User(userId, "harmeet@in", 13))).asInstanceOf[Future[A]]
            case UpdatedUser(user) =>
                // Go to the database and update user
                Future.successful(()).asInstanceOf[Future[A]]
        }
    }

    val futureEmailInterpreter = new (EmailAlg ~> Future) {
        override def apply[A](fa : EmailAlg[A]) : Future[A] = fa match {
            case SendEmail(email, _, _) =>
                // send an email use thrid party service
                println(s"Email successfully send to $email")
                Future.successful(()).asInstanceOf[Future[A]]
        }
    }
}
