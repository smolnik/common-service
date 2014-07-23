package net.adamsmolnik.entity;

/**
 * @author ASmolnik
 *
 */
public class EntityReference {

    private String entityReferenceKey;

    public EntityReference(String entityReferenceKey) {
        this.entityReferenceKey = entityReferenceKey;
    }

    public String getEntityReferenceKey() {
        return entityReferenceKey;
    }

}
