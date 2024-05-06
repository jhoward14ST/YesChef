package yeschef.entity;

import jakarta.persistence.*;

import java.util.Set;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "imperial_unit")
public class ImperialUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "unit_name", nullable = false)
    private String unitName;

    // Getters and setters
    public Long getID() {
        return id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}
