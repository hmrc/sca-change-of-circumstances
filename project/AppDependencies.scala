import play.sbt.PlayImport._
import sbt._

object AppDependencies {

  val compile = Seq(
    "uk.gov.hmrc"             %% "bootstrap-backend-play-28"  % "5.24.0",
    "uk.gov.hmrc.mongo"       %% "hmrc-mongo-play-28"         % "0.68.0"
  )

  val test = Seq(
    "uk.gov.hmrc"             %% "bootstrap-test-play-28"     % "5.24.0"              % "test, it",
    "uk.gov.hmrc.mongo"       %% "hmrc-mongo-test-play-28"    % "0.68.0"              % Test,
    "org.scalatestplus"       %% "mockito-3-4"                % "3.2.10.0"            % Test,
    "com.vladsch.flexmark"      %  "flexmark-all"               % "0.36.8"              % "test, it"
  )
}
