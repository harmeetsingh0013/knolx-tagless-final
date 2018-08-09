package com.knoldus.knolx.sideeffects

class IO[A] private(block: => A) {

  def run = block

  def flatMap[B] (f: A => IO[B]): IO[B] = IO(f(run).run)

  def map[B] (f: A => B): IO[B] = flatMap(a => IO(f(a)))
}

object IO {
  def apply[A](block: => A): IO[A] = new IO(block)
}