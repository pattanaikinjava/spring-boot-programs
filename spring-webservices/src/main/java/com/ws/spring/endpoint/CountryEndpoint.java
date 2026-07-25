package com.ws.spring.endpoint;

import com.ws.spring.soap.GetCountryRequest;
import com.ws.spring.soap.GetCountryResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/soap-service";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();

        // SOAP requests are case-sensitive by default, so we use ignoreCase
        if ("India".equalsIgnoreCase(request.getName())) {
            response.setName("India");
            response.setCapital("New Delhi");
            response.setCurrency("INR");
            response.setPopulation(1400000000);
        } else if ("Spain".equalsIgnoreCase(request.getName())) {
            response.setName("Spain");
            response.setCapital("Madrid");
            response.setCurrency("EUR");
            response.setPopulation(47000000);
        }

        return response;
    }
}