package com.horcrux.hufflepuff;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Alert {

    private AlertDAO alertDAO;

    public Alert(AlertDAO alertDAO) {
        this.alertDAO = alertDAO;
    }

    private final MapAlertDAO storage = new MapAlertDAO();

        public UUID raiseAlert() {
            //TODO - include alertDAO
            return this.storage.addAlert(new Date());
        }

        public Date getAlertTime(UUID id) {
            //TODO - include alertDAO
            return this.storage.getAlert(id);
        }
    }

