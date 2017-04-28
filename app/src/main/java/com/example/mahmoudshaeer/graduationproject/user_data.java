package com.example.mahmoudshaeer.graduationproject;

/**
 * Created by mahmoud Shaeer on 4/12/2017.
 */

public class user_data {
    String id;
    String mac_address;

    public user_data(String id, String macAddress) {
        this.id=id;
        mac_address=macAddress;
    }

    public String getId() {
        return id;
    }

    public String getMac_address() {
        return mac_address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMac_address(String mac_address) {
        this.mac_address = mac_address;
    }
}
