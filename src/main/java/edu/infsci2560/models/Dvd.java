/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Dvd {

    private static final long serialVersionUID = 1L;

    public enum WorkoutType {
        Unknown,
        RPG,
        ACT,
        SPT,
        FPS
    }
    
    public enum Platform{
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
    protected WorkoutType workoutType;
    protected Platform platform;

    public Dvd() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.workoutType = WorkoutType.Unknown;
        this.platform = Platform.Unknown;
    }

    public Dvd(Long id, String title, WorkoutType workoutType, Platform platform) {
        this.id = id;
        this.title = title;
        this.workoutType = workoutType;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", workoutType=" + this.workoutType + ", platform"+this.platform+" ]";
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
    public WorkoutType getWorkoutType() {
        return workoutType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setWorkoutType(WorkoutType workoutType) {
        this.workoutType = workoutType;
    }

    /**
     * @return the id
     */

    public Platform getPlatform(){
        return platform;
    }

    public void setPlatform(Platform platform){
        this.platform = platform;
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
