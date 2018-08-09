package com.knoldus.knolx.example1.tagless

import java.util.UUID

import cats.Id

import scala.concurrent.Future

/*trait FutureInterpreter extends UserRepositoryAlg[Future] {

    override def findUser(userId : UUID) : Future[Option[User]] = {
      // perform some database operation and return user
      println(s"Future User successfully found $userId")
      Future.successful(Some(User(userId, "harmeet@knoldus.com", 13)))
    }

    override def updateUser(user : User) : Future[Unit] = {
      // perform whatever db operations and update user
      println(s"Future User updated successfully $user")
      Future.successful(())
    }
}

trait IdInterpreter extends UserRepositoryAlg[Id] {
  override def findUser(userId: UUID): Id[Option[User]] = {
    // perform some database operation and return user
    println(s"Id User successfully found $userId")
    Some(User(userId, "harmeet@knoldus.com", 13))
  }

  override def updateUser(user: User): Id[Unit] = {
    // perform whatever db operations and update user
    println(s"Id User updated successfully $user")
    ()
  }
}*/
