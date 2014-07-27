package net.adamsmolnik.provider;

import java.io.InputStream;
import net.adamsmolnik.entity.Entity;
import net.adamsmolnik.entity.EntityDetails;
import net.adamsmolnik.entity.EntityReference;
import net.adamsmolnik.entity.EntityReferenceDest;
import net.adamsmolnik.entity.EntityReferenceSource;

/**
 * @author ASmolnik
 *
 */
public interface EntityProvider {

    Entity getEntity(EntityReference entityReference);

    EntityDetails copy(EntityReferenceSource ers, EntityReferenceDest erd);

    EntityDetails move(EntityReferenceSource ers, EntityReferenceDest erd);

    void save(EntityReference entityReference, long size, InputStream is);

}
