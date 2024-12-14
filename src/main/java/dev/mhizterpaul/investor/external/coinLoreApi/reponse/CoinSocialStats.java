package dev.mhizterpaul.investor.external.coinLoreApi.reponse;

import lombok.Data;

@Data
public class CoinSocialStats {
    private Reddit reddit;
    private Twitter twitter;

    @Data
    public static class Reddit {
        private double avg_active_users;
        private int subscribers;
    }

    @Data
    public static class Twitter {
        private int followers_count;
        private int status_count;
    }
}
