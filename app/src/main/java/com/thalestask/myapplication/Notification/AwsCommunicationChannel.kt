package com.thalestask.myapplication.Notification

import com.thalestask.myapplication.CommunicationChannel
import software.amazon.awssdk.services.sns.SnsClient
import software.amazon.awssdk.services.sns.model.PublishRequest
import software.amazon.awssdk.services.sns.model.PublishResponse

class AwsCommunicationChannel : CommunicationChannel {
    private val snsClient: SnsClient = SnsClient.create()

    override fun sendNotification(message: String) {
        val topicArn = "arn:aws:sns:region:account-id:topic-name" // Replace with your SNS topic ARN

        val publishRequest = PublishRequest.builder()
            .message(message)
            .topicArn(topicArn)
            .build()

        val publishResponse: PublishResponse = snsClient.publish(publishRequest)
        println("Notification sent via AWS SNS: $message")
    }
}
