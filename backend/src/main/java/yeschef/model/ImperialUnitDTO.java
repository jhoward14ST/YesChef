package yeschef.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import yeschef.entity.ImperialUnit;

import java.util.Set;

@JsonSerialize
@JsonDeserialize
public class ImperialUnitDTO {
    private Long id;
    private String unitName;

    public ImperialUnitDTO(ImperialUnit imperialUnit) {
        this.id = imperialUnit.getID();
        this.unitName = imperialUnit.getUnitName();
    }

    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}
