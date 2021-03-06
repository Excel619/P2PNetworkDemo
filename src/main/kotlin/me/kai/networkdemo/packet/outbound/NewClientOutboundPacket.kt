package me.kai.networkdemo.packet.outbound

import me.kai.networkdemo.packet.PacketType
import me.kai.networkdemo.recipient.RecipientAddress

// I am broadcasting to the entire network the existence of $newClient (but they are not yet aware of the entire network)
class NewClientOutboundPacket(val newClient: RecipientAddress): BroadcastOutboundPacket {

    override val type = PacketType.NEW_CLIENT

    override val body = newClient.encoded

    override fun print() = println("[Outbound] Introduced new client $newClient to network")

}