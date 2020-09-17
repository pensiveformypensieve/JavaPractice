package com.horcrux.hufflepuff;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.apache.log4j.Logger;

public class Alert {

//    private final MapAlertDAO storage = new MapAlertDAO();
    private AlertDAO storage;

    final Logger log = Logger.getLogger(Alert.class.getName());

    public Alert(AlertDAO storage) {
        this.storage = storage;
    }

    public UUID raiseAlert() {
            return this.storage.addAlert(new Date());
        }

        public Date getAlertTime(UUID id) {
            return this.storage.getAlert(id);
        }
    }

