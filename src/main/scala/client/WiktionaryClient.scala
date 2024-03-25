package com.github.velet5.gekas
package client

import cats.Monad
import cats.syntax.option.*
import sttp.client3.{Request, Response, SttpBackend, UriContext}
import sttp.tapir.client.sttp.SttpClientInterpreter
import sttp.tapir.{DecodeResult, Endpoint, Tapir}

trait WiktionaryClient[F[_]] {

  def pageHtmlByTitle(title: String): F[String]

}

object WiktionaryClient {

  private class Impl[F[_] : Monad](backend: SttpBackend[F, Any])
    extends WiktionaryClient[F]
    with SttpClientInterpreter {

    override def pageHtmlByTitle(title: String): F[String] = {
      val responseF: F[Response[DecodeResult[Either[String, String]]]] =
        pageByHtmlTitleRequest(title)
          .send(backend)

      ???
    }

    private val pageByHtmlTitleRequest: String => Request[DecodeResult[
      Either[String, String]
    ], Any] =
      toRequest(Api.pageHtmlByTitle, Api.apiRoot.some)

  }

  object Api extends Tapir {

    val apiRoot = uri"http://en.wiktionary.org"

    val pageHtmlByTitle: Endpoint[Unit, String, String, String, Any] =
      endpoint
        .get
        .in("page" / "html" / path[String]("title"))
        .out(stringBody)
        .errorOut(stringBody)

  }

}
