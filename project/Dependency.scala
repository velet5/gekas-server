import sbt.*

object Dependency {

  object Version {
    val catsEffect = "3.5.2"
    val circe = "0.14.6"
    val commonsCodec = "1.16.1"
    val commonsLang3 = "3.14.0"
    val commonsText = "1.11.0"
    val http4s = "0.23.16"
    val liquibase = "4.26.0"
    val log4Cats = "2.6.0"
    val logback = "1.4.14"
    val magnolia = "1.3.4"
    val mouse = "1.2.2"
    val postgres = "42.7.1"
    val quill = "4.8.1"
    val scalaScrapper = "3.1.1"
    val sentry = "7.0.0-beta.1"
    val sttp = "3.9.3"
    val tapir = "1.9.9"
    val zio = "2.0.21"
    val zioConfig = "4.0.1"
    val zioInteropCats = "23.1.0.0"
  }

  object Compile {
    private val V = Version

    val catsEffect = "org.typelevel"              %% "cats-effect"         % V.catsEffect
    val circeGeneric = "io.circe"                 %% "circe-generic"       % V.circe
    val circeParser = "io.circe"                  %% "circe-parser"        % V.circe
    val commonsCodec = "commons-codec"             % "commons-codec"       % V.commonsCodec
    val commonsLang3 = "org.apache.commons"        % "commons-lang3"       % V.commonsLang3
    val commonsText = "org.apache.commons"         % "commons-text"        % V.commonsText
    val http4sBlazeServer = "org.http4s"          %% "http4s-blaze-server" % V.http4s
    val liquibaseCore = "org.liquibase"            % "liquibase-core"      % Version.liquibase
    val log4CatsSl4J = "org.typelevel"            %% "log4cats-slf4j"      % V.log4Cats
    val logbackClassic = "ch.qos.logback"          % "logback-classic"     % V.logback
    val magnolia = "com.softwaremill.magnolia1_3" %% "magnolia"            % V.magnolia
    val mouse = "org.typelevel"                   %% "mouse"               % V.mouse
    val postgres = "org.postgresql"                % "postgresql"          % V.postgres
    val quillJdbcZio = "io.getquill"              %% "quill-jdbc-zio"      % V.quill
    val scalaScrapper = "net.ruippeixotog"        %% "scala-scraper"       % V.scalaScrapper
    val sentry = "io.sentry"                       % "sentry"              % V.sentry
    val sentryLogback = "io.sentry"                % "sentry-logback"      % V.sentry
    val sttpBackendZio = "com.softwaremill.sttp.client3" %% "zio"                           % V.sttp
    val sttpCore = "com.softwaremill.sttp.client3"       %% "core"                          % V.sttp
    val sttpCirce = "com.softwaremill.sttp.client3"      %% "circe"                         % V.sttp
    val sttpFs2 = "com.softwaremill.sttp.client3"        %% "async-http-client-backend-fs2" % V.sttp
    val tapirEnumeratum = "com.softwaremill.sttp.tapir"   %% "tapir-enumeratum"    % V.tapir
    val tapirHttp4sServer = "com.softwaremill.sttp.tapir" %% "tapir-http4s-server" % V.tapir
    val tapirJsonCirce = "com.softwaremill.sttp.tapir"    %% "tapir-json-circe"    % V.tapir
    val tapirSttpClient = "com.softwaremill.sttp.tapir"   %% "tapir-sttp-client"   % V.tapir
    val zio = "dev.zio"                                   %% "zio"                 % V.zio
    val zioConfig = "dev.zio"                             %% "zio-config"          % V.zioConfig
    val zioConfigMagnolia = "dev.zio"                     %% "zio-config-magnolia" % V.zioConfig
    val zioConfigTypesafe = "dev.zio"                     %% "zio-config-typesafe" % V.zioConfig
    val zioConfigRefined = "dev.zio"                      %% "zio-config-refined"  % V.zioConfig
    val zioInteropCats = "dev.zio" %% "zio-interop-cats" % V.zioInteropCats
  }

  import Compile.*

  val compile: Seq[ModuleID] = Vector(
    catsEffect,
    circeGeneric,
    circeParser,
    commonsCodec,
    commonsLang3,
    commonsText,
    http4sBlazeServer,
    liquibaseCore,
    log4CatsSl4J,
    logbackClassic,
    magnolia,
    mouse,
    postgres,
    quillJdbcZio,
    scalaScrapper,
    sentry,
    sentryLogback,
    sttpBackendZio,
    sttpCore,
    sttpCirce,
    sttpFs2,
    tapirEnumeratum,
    tapirHttp4sServer,
    tapirJsonCirce,
    tapirSttpClient,
    zio,
    zioConfig,
    zioConfigMagnolia,
    zioConfigTypesafe,
    zioConfigRefined,
    zioInteropCats
  )

}
