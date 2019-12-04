package org.example.serverlessdemo;

import software.amazon.awssdk.services.cloudwatchevents.CloudWatchEventsClient;
import software.amazon.awssdk.services.cloudwatchevents.model.PutEventsRequest;
import software.amazon.awssdk.services.cloudwatchevents.model.PutEventsRequestEntry;
import software.amazon.awssdk.services.cloudwatchevents.model.PutEventsResponse;

/**
 * Puts a sample CloudWatch event
 */
public class App {
    public static void main(String[] args)
    {
        System.out.println("Sending the eventbridge test.");
    }
}
