package com.github.woojiahao

import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.requests.GatewayIntent

fun main() {
  val token = System.getenv("BOT_TOKEN")
    ?: throw Exception("Must include bot token in environment variable for bot to run")
  val jda = JDABuilder
    .create(token, GatewayIntent.GUILD_MESSAGES)
    .addEventListeners(PingListener())
    .build()
}

