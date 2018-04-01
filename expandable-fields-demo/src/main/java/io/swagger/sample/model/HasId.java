package io.swagger.sample.model;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public interface HasId {
    String getId();
}