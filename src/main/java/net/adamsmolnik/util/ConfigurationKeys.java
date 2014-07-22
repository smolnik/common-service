package net.adamsmolnik.util;

/**
 * @author ASmolnik
 *
 */
public enum ConfigurationKeys {

    BUCKET_NAME("bucketName"), SECRET_KEY("secretKey"), ACCESS_KEY_ID("accessKeyId");

    private String key;

    private ConfigurationKeys(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
