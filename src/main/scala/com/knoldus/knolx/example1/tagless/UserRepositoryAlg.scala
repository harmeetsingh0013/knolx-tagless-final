package com.knoldus.knolx.example1.tagless

import java.util.UUID

case class User(id: UUID, email: String, loyaltyPoints: Int)

trait UserRepositoryAlg { }
