package com.github.velet5.gekas
package client.util

import sttp.client3.Response
import sttp.tapir.DecodeResult

object syntax {

  extension [A, E](self: Response[DecodeResult[Either[E, A]]]) {
    def toEither: Either[E, A] = ???
  }

}
