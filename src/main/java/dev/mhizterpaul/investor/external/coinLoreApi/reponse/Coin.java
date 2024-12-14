package dev.mhizterpaul.investor.external.coinLoreApi.reponse;
import lombok.Data;

@Data
public class Coin {
    private String id;
    private String symbol;
    private String name;
    private String nameid;
    private int rank;
    private String price_usd;
    private String percent_change_24h;
    private String percent_change_1h;
    private String percent_change_7d;
    private String market_cap_usd;
    private String volume24;
    private String volume24_native;
    private String csupply;
    private String price_btc;
    private String tsupply;
    private String msupply;
}
