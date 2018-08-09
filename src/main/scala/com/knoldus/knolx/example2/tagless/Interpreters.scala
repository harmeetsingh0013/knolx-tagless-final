package com.knoldus.knolx.example2.tagless

import java.util.UUID
import scala.concurrent.Future

object Interpreters {

  /*trait FutureUserInterpreter extends UserRepositoryAlg[Future] {
    override def findUser(userId: UUID): Future[Option[User]] = {
      // perform some db operations
      println(s"Future User successfully found $userId")
      Future.successful(Some(User(userId, "harmeet@knoldus.com", 13)))
    }

    override def updateUser(user: User): Future[Unit] = {
      // perform whatever database operations
      println(s"Future User updated successfully $user")
      Future.successful(())
    }
  }

  trait FutureEmailInterpreter extends EmailAlg[Future] {
    override def sendEmail(email: String, subject: String, body: String): Future[Unit] = {
      // perform send email operation
      println(s"Email successfully send to $email")
      Future.successful(())
    }
  }*/

}
