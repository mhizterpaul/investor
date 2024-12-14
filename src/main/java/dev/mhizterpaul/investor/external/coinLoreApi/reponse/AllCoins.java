package dev.mhizterpaul.investor.external.coinLoreApi.reponse;
import lombok.Data;
import java.util.List;

@Data
public class AllCoins {
    private List<CoinData> data;
    private Info info;

    @Data
    public static class CoinData {
        private String id;
        private String symbol;
        private String name;
        private String nameid;
        private int rank;
        private String price_usd;
        private String percent_change_24h;
        private String percent_change_1h;
        private String percent_change_7d;
        private String price_btc;
        private String market_cap_usd;
        private double volume24;
        private double volume24a;
        private String csupply;
        private String tsupply;
        private String msupply;
    }

    @Data
    public static class Info {
        private int coins_num;
        private long time;
    }
}
