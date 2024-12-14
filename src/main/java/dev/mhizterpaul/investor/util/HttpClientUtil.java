package dev.mhizterpaul.investor.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayInputStream;
import java.net.http.HttpResponse;


class HttpClientUtil<T> implements HttpResponse.BodyHandler<T> {
    private final Class<T> type;

    public HttpClientUtil(Class<T> type) {
        this.type = type;
    }

    @Override
    public HttpResponse.BodySubscriber<T> apply(HttpResponse.ResponseInfo responseInfo) {
        return HttpResponse.BodySubscribers.mapping(
                HttpResponse.BodySubscribers.ofByteArray(),
                byteArray -> {
                    ObjectMapper objectMapper = new ObjectMapper();
                    try {
                        return objectMapper.readValue(new ByteArrayInputStream(byteArray), type);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
        );
    }
}