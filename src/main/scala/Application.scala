package com.github.velet5.gekas

import zio.*
import zio.interop.catz.*

object Application extends CatsApp {

  override def run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] = ???

}
