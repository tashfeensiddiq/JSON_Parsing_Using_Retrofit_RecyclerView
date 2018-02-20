package com.example.dd.retrofit2;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dd on 08.05.2017.
 */

public class AndroidVersion {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("symbol")
    private String symbol;
    @SerializedName("rank")
    private String rank;
    @SerializedName("price_usd")
    private String price_usd;
    @SerializedName("price_btc")
    private String price_btc;
    @SerializedName("24h_volume_usd")
    private String h_volume_usd;
    @SerializedName("market_cap_usd")
    private String market_cap_usd;
    @SerializedName("available_supply")
    private String available_supply;
    @SerializedName("total_supply")
    private String total_supply;
    @SerializedName("max_supply")
    private String max_supply;
    @SerializedName("percent_change_1h")
    private String percent_change_1h;
    @SerializedName("percent_change_24h")
    private String percent_change_24h;
    @SerializedName("percent_change_7d")
    private String percent_change_7d;
    @SerializedName("last_updated")
    private String last_updated;

    public AndroidVersion(String id, String name, String symbol, String rank, String price_usd, String price_btc,
                          String h_volume_usd, String market_cap_usd, String available_supply, String total_supply, String max_supply,
                          String percent_change_1h, String percent_change_24h, String percent_change_7d, String last_updated)
    {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.rank = rank;
        this.price_usd = price_usd;
        this.price_btc = price_btc;
        this.h_volume_usd = h_volume_usd;
        this.market_cap_usd = market_cap_usd;
        this.available_supply = available_supply;
        this.total_supply = total_supply;
        this.max_supply = max_supply;
        this.percent_change_1h = percent_change_1h;
        this.percent_change_24h = percent_change_24h;
        this.percent_change_7d = percent_change_7d;
        this.last_updated = last_updated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String isname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getsymbol() {
        return symbol;
    }

    public void setsymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getrank() {
        return rank;
    }

    public void setrank(String rank) {
        this.rank = rank;
    }

    public String getprice_usd() {
        return price_usd;
    }

    public void setprice_usd(String price_usd) {
        this.price_usd = price_usd;
    }

    public String getprice_btc() {
        return price_btc;
    }

    public void setprice_btc(String price_btc) {
        this.price_btc = price_btc;
    }

    public String geth_volume_usd() {
        return h_volume_usd;
    }

    public void seth_volume_usd(String h_volume_usd) {
        this.h_volume_usd = h_volume_usd;
    }

    public String getmarket_cap_usd() {
        return market_cap_usd;
    }

    public void setmarket_cap_usd(String market_cap_usd) {
        this.market_cap_usd = market_cap_usd;
    }

    public String getavailable_supply() {
        return available_supply;
    }

    public void setavailable_supply(String available_supply) {
        this.available_supply = available_supply;
    }

    public String gettotal_supply() {
        return total_supply;
    }

    public void settotal_supply(String total_supply) {
        this.total_supply = total_supply;
    }

    public String getmax_supply() {
        return max_supply;
    }

    public void setmax_supply(String max_supply) {
        this.max_supply = max_supply;
    }

    public String getpercent_change_1h() {
        return percent_change_1h;
    }

    public void setpercent_change_1h(String percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public String getpercent_change_24h() {
        return percent_change_24h;
    }

    public void setpercent_change_24h(String percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public String getpercent_change_7d() {
        return percent_change_7d;
    }

    public void setpercent_change_7d(String percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }
    public String getlast_updated() {
        return last_updated;
    }

    public void setlast_updated(String last_updated) {
        this.last_updated = last_updated;
    }
}
