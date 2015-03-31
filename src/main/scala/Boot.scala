package com.banno.spray
import spray.routing.{Directive, Directives}
import shapeless.{::, HNil}

object Boot extends Directives {

  // compiles
  def singleParam =
    parameters('thing.as[Boolean])

  // compiles
  def multiParamsFix =
    parameters('thing.as[Boolean]) & parameters('thing2.as[Boolean])

  // fails compile
  def multiParams =
    parameters('thing.as[Boolean], 'thing2.as[Boolean])

  // fails compile
  def multiParams: Directive[Boolean :: Boolean :: HNil] =
    parameters('thing.as[Boolean] ? true, 'thing2.as[Boolean] ? false)
}
