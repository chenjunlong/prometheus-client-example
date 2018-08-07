package com.chenjunlong.springboot.example.ratelimit;

import com.github.jratelimit.filter.RateLimitCallable;
import io.prometheus.client.Counter;

/**
 * Created by chenjunlong on 2018/7/30.
 */
public class CustomRateLimitCallable implements RateLimitCallable {

    static final Counter requestCounter = Counter.build()
            .name("rate_limit_http_requests_total").labelNames("class", "method")
            .help("Total requests.").register();

    @Override
    public void call(String interfaceName, String methodName) {
        requestCounter.labels(interfaceName, methodName).inc();
    }
}
