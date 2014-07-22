package net.adamsmolnik.util;

import java.util.Map;

/**
 * @author ASmolnik
 *
 */
public interface Configuration {

    String getGlobalValue(String key);

    String getServiceValue(String serviceName, String key);

    Map<String, String> getServiceMap(String serviceName);

}
