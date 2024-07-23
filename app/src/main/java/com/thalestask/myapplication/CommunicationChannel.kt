package com.thalestask.myapplication

interface CommunicationChannel {
    fun sendNotification(message: String)
}

class FirebaseCommunicationChannel : CommunicationChannel {
    override fun sendNotification(message: String) {
        println("Sending notification via Firebase: $message")
    }
}

class AwsCommunicationChannel : CommunicationChannel {
    override fun sendNotification(message: String) {
        println("Sending notification via AWS: $message")
    }
}
