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
public class gameRequest {

    private static final long serialVersionUID = 1L;

    public enum GameType {
        Unknown,
        RPG,
        ACT,
        SPT,
        FPS
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected GameType gameType;

    public gameRequest() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.gameType = GameType.Unknown;
    }

    public gameRequest(Long id, String name, GameType gameType) {
        this.id = id;
        this.title = name;
        this.gameType = gameType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", gameType=" + this.gameType + " ]";
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
    public GameType getGameType() {
        return gameType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    /**
     * @return the id
     */
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