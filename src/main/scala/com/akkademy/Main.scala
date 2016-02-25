package com.akkademy

import akka.actor.{Props, ActorSystem}

object Main extends App {

  val system = ActorSystem("akkademy")
  system.actorOf(Props[AkkademyDb], name = "akkademy-db")

}
