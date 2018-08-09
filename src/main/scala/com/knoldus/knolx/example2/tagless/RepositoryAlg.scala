package com.knoldus.knolx.example2.tagless

import java.util.UUID

case class User(id: UUID, email: String, loyaltyPoints: Int)

trait UserRepositoryAlg[F[_]] {
  def findUser(id: UUID): F[Option[User]]
  def updateUser(user: User): F[Unit]
}

trait EmailAlg[F[_]] {
  def sendEmail(email: String, subject: String, body: String): F[Unit]
}
