package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author kolobj
 */
@Entity
public class gameStation {

    private static final long serialVersionUID = 1L;

    public enum StationType {
        Unknown,
        Wii,
        PS4,
        XBOX,
        NS
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected StationType stationType;
    protected Long year;

    public gameStation() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.stationType = StationType.Unknown;
        this.year = null;
    }

    public gameStation(Long id, String name, StationType stationType,Long year) {
        this.id = id;
        this.title = name;
        this.stationType = stationType;
        this.year = year;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", stationType=" + this.stationType + ", year="+this.year+" ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the workoutType
     */
    public StationType getStationType() {
        return stationType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setStationType(StationType stationType) {
        this.stationType = stationType;
    }

    /**
     * @return the id
     */
    public Long getYear() {
        return year;
    }

    public void setYear(Long year){
        this.year = year;
    }
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}