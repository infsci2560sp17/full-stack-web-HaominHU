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
public class personalInfo {

    private static final long serialVersionUID = 1L;

    public enum LevelType {
        guest,
        silver,
        gold,
        platinum
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected LevelType levelType;
    protected Long phone;
    protected String address;

    public personalInfo() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.levelType = LevelType.guest;
        this.phone = null;
        this.address = null;
    }

    public personalInfo(Long id, String name, LevelType levelType,Long phone, String address) {
        this.id = id;
        this.title = name;
        this.levelType = levelType;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", levelType=" + this.levelType + ", phone="+this.phone+", address"+this.address+" ]";
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
    public LevelType getLevelType() {
        return levelType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setLevelType(LevelType levelType) {
        this.levelType = levelType;
    }

    /**
     * @return the id
     */
    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone){
        this.phone = phone;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
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