package pt.um.tf.lab1.lab1mes

import io.atomix.catalyst.buffer.BufferInput
import io.atomix.catalyst.buffer.BufferOutput
import io.atomix.catalyst.serializer.CatalystSerializable
import io.atomix.catalyst.serializer.Serializer
import io.atomix.catalyst.transport.Address

/**
 * NewMessage comes from source wishing to join the Clique.
 */
data class NewMessage(var origin : Address = Address()) : CatalystSerializable {
    override fun writeObject(buffer: BufferOutput<*>?,
                             serializer: Serializer?) {
        serializer?.writeObject(origin)
    }

    override fun readObject(buffer: BufferInput<*>?, serializer: Serializer?) {
        origin = serializer!!.readObject<Address>(buffer)
    }
}