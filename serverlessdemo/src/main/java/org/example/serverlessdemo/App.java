package org.example.serverlessdemo;

import software.amazon.awssdk.services.cloudwatchevents.CloudWatchEventsClient;
import software.amazon.awssdk.services.cloudwatchevents.model.PutEventsRequest;
import software.amazon.awssdk.services.cloudwatchevents.model.PutEventsRequestEntry;
import software.amazon.awssdk.services.cloudwatchevents.model.PutEventsResponse;

import java.util.Date;

/**
 * Puts a sample CloudWatch event
 */
public class App {
    public static void main(String[] args)
    {
        final String USAGE =
                "To run this example, supply a resource arn\n" +
                        "Ex: PutEvents <resource-arn>\n";

        if (args.length != 1) {
            System.out.println(USAGE);
            System.exit(1);
        }

        String resource_arn = args[0];

        // snippet-start:[cloudwatch.java2.put_events.main]
        CloudWatchEventsClient cwe =
                CloudWatchEventsClient.builder().build();

        final String EVENT_DETAILS =
                "{ \"key1\": \"value1\", \"key2\": \"value2\" }";

        PutEventsRequestEntry request_entry = PutEventsRequestEntry.builder()
                .detail(EVENT_DETAILS)
                .detailType("sampleSubmitted")
                .resources(resource_arn)
                .source("aws-sdk-java-cloudwatch-example").build();

        PutEventsRequest request = PutEventsRequest.builder()
                .entries(request_entry).build();

        PutEventsResponse response = cwe.putEvents(request);
        // snippet-end:[cloudwatch.java2.put_events.main]

        System.out.println("Successfully put CloudWatch event");
    }
}
