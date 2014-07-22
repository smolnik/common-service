package net.adamsmolnik.provider;

import net.adamsmolnik.entity.FileEntity;

/**
 * @author ASmolnik
 *
 */
public interface EntityProvider {

    FileEntity getFileEntity(String objectKey);

}
