package de.fraunhofer.iosb.ilt.sensorthingsmanager.auth;

import de.fraunhofer.iosb.ilt.configurable.Configurable;
import de.fraunhofer.iosb.ilt.sta.service.SensorThingsService;

/**
 *
 * @author scf
 */
public interface AuthMethod extends Configurable<Void, Void> {

    public void setAuth(SensorThingsService service);
}
