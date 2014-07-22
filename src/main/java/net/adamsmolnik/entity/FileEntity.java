package net.adamsmolnik.entity;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/**
 * @author ASmolnik
 *
 */
public class FileEntity {

    private final InputStream is;

    private final Map<String, String> metadata;

    public FileEntity(InputStream is, Map<String, String> metadata) {
        this.is = is;
        this.metadata = Collections.unmodifiableMap(metadata);
    }

    public InputStream getInputStream() {
        return is;
    }

    public String getMetadataValue(String key) {
        return this.metadata.get(key);
    }

}
