
package com.bigdata.web.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.3
 * Tue Dec 30 17:36:56 CST 2014
 * Generated source version: 3.0.3
 */

@XmlRootElement(name = "getVersionResponse", namespace = "http://web.bigdata.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVersionResponse", namespace = "http://web.bigdata.com/")

public class GetVersionResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}

