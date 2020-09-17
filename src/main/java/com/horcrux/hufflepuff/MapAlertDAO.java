package com.horcrux.hufflepuff;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
//import java.util.logging.Logger;
import org.apache.log4j.Logger;

class MapAlertDAO implements AlertDAO {
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    final Logger log = Logger.getLogger(MapAlertDAO.class.getName());

    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        log.debug("id: , time:" + id + time);
        this.alerts.put(id, time);
        return id;
    }

    public Date getAlert(UUID id) {
        log.debug("id:" + id);
        return this.alerts.get(id);
    }

}
