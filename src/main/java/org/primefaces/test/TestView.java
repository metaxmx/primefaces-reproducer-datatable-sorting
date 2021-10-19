package org.primefaces.test;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {
    
    private BigDecimal decimal = new BigDecimal("3.4");

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("New value: " + getDecimal()));
    }

}
