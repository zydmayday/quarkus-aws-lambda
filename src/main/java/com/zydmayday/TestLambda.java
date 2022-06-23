package com.zydmayday;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.inject.Named;

@Named("test")
public class TestLambda implements RequestHandler<InputObject, OutputObject> {
     @ConfigProperty(name = "AUTHOR", defaultValue = "zydmayday")
     String author;

    @Inject
    ProcessingService service;

    @Override
    public OutputObject handleRequest(InputObject input, Context context) {
        return service.process(input, author).setRequestId(context.getAwsRequestId());
    }
}
