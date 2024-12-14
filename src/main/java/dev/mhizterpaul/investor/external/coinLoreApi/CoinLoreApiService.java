package dev.mhizterpaul.investor.external.coinLoreApi;

import dev.mhizterpaul.investor.external.coinLoreApi.reponse.AllCoins;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CoinLoreApiService {

    private final WebClient webClient;

    @Autowired
    public CoinLoreApiService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.coinlore.net/api/").build();
    }

    public Mono<AllCoins> getAllCoins(String apiKey) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("limit", 100)
                        .queryParam("start", 1)
                        .build())
                .retrieve()
                .bodyToMono(AllCoins.class);
    }
}
