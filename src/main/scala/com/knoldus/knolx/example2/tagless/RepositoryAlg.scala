package com.knoldus.knolx.example2.tagless

import java.util.UUID

case class User(id: UUID, email: String, loyaltyPoints: Int)

trait UserRepositoryAlg {}

trait EmailAlg {}
