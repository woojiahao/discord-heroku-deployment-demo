package com.github.woojiahao

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class PingListener : ListenerAdapter() {
  override fun onMessageReceived(event: MessageReceivedEvent) {
    val msg = event.message
    if (msg.contentRaw == "!ping") {
      val channel = event.channel
      channel.sendMessage("Pong!").queue()
    }
  }
}