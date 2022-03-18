package org.faber.swanknft.filecoin.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author rda
 */
@ConfigurationProperties(prefix = "filecoin")
public class FilecoinProperties {

    /**
     * Filecoin client http api base url
     */
    private String apiBaseUrl = "http://127.0.0.1:3453";
    
    private boolean logDebug = false;

    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    public void setApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    public boolean isLogDebug() {
        return logDebug;
    }

    public void setLogDebug(boolean logDebug) {
        this.logDebug = logDebug;
    }
}
