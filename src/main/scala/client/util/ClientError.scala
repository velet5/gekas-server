package com.github.velet5.gekas
package client.util

import scala.util.control.NoStackTrace

abstract sealed class ClientError(message: String, causeOpt: Option[Throwable] = None)
  extends RuntimeException(message, causeOpt.orNull)
  with NoStackTrace

object ClientError {

  case class Unknown(message: String, causeOpt: Option[Throwable] = None)
    extends ClientError(message, causeOpt)

}
