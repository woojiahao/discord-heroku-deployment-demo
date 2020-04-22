package com.github.woojiahao

import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.requests.GatewayIntent

fun main() {
  val token = System.getenv("BOT_TOKEN")
    ?: throw Exception("Must include bot token in environment variable for bot to run")
  val jda = JDABuilder
    .createDefault(token)
    .addEventListeners(PingListener())
    .build()
}

