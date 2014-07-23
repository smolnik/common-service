package net.adamsmolnik.entity;

/**
 * @author ASmolnik
 *
 */
public class EntityDetails {

    private final EntityReference entityReference;

    private final String version;

    private final String internalFootprint;

    public EntityDetails(EntityReference entityReference, String version, String internalFootprint) {
        this.entityReference = entityReference;
        this.version = version;
        this.internalFootprint = internalFootprint;
    }

    public EntityReference getEntityReference() {
        return entityReference;
    }

    public String getVersion() {
        return version;
    }

    public String getInternalFootprint() {
        return internalFootprint;
    }

}
