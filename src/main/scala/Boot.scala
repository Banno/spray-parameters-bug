package com.banno.spray
import spray.http._
import spray.routing._
import shapeless.{HNil, ::, HList}

object Boot extends Compiling with CompileFailures

trait Compiling extends Directives {
  def singleParam =
    parameters('thing.as[Boolean])

  def multiParamsFix =
    parameters('thing.as[Boolean]) & parameters('thing2.as[Boolean])
}

trait CompileFailures extends Directives {
  def multiParams =
    parameters('thing.as[Boolean], 'thing2.as[Boolean])
}
