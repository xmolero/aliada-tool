// ALIADA - Automatic publication under Linked Data paradigm
//          of library and museum data
//
// Component: aliada-links-discovery
// Responsible: ALIADA Consortium
package eu.aliada.linksdiscovery.model;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Links discovery job entity.
 * 
 * @author Idoia Murua
 * @since 1.0
 */
@XmlRootElement
public class Subjob {
	/** Subjob identification number. */
	private int id;
	/** Subjob name. */
	private String name;
	/** Subjob starting date. */
	private Date startDate;
	/** Subjob end date. */
	private Date endDate;
	/** Job status. Possible values: idle, running, finished. */
	private String status; /* Possible values: idle, running, finished. */
	/** Number of links generated by the subjob. */
	private int numLinks;
	/** Linking process duration. */
	private long durationSeconds;

	/**
	 * Default constructor.

	 * @since 1.0
	 */
	public Subjob(){} // JAXB needs this

	/**
	 * Returns the identifier of this subjob.
	 * 
	 * @return The identifier of this subjob.
	 * @since 1.0
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * Sets the identifier of this subjob.
	 * 
	 * @param id The identifier of this subjob.
	 * @since 1.0
	 */
	public void setId(final Integer id) {
		this.id = id;
	}

	/**
	 * Returns the name of the subjob.
	 * 
	 * @return The name of the subjob.
	 * @since 1.0
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets the name of the subjob.
	 * 
	 * @param name The name of the subjob.
	 * @since 1.0
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Returns the start date of the subjob.
	 * 
	 * @return The start date of the subjob.
	 * @since 1.0
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * Sets the start date of the subjob.
	 * 
	 * @param startDate The start date of the subjob.
	 * @since 1.0
	 */
	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Returns the end date of the subjob.
	 * 
	 * @return The end date of the subjob.
	 * @since 1.0
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * Sets the end date of the subjob.
	 * 
	 * @param endDate The end date of the subjob.
	 * @since 1.0
	 */
	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Returns the number of links generated.
	 * 
	 * @return The number of links generated.
	 * @since 1.0
	 */
	public Integer getNumLinks() {
		return numLinks;
	}
	/**
	 * Sets the number of links generated.
	 * 
	 * @param numLinks The number of links generated.
	 * @since 1.0
	 */
	public void setNumLinks(final Integer numLinks) {
		this.numLinks = numLinks;
	}


	/**
	 * Returns the status of the subjob.
	 * Possible values: idle, running, finished.
	 * 
	 * @return The status of the subjob.
	 * @since 1.0
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * Sets the status of the subjob.
	 * Possible values: idle, running, finished.
	 * 
	 * @param status The status of the subjob.
	 * @since 1.0
	 */
	public void setStatus(final String status) {
		this.status = status;
	}

	/**
	 * Returns the linking process duration in seconds.
	 * 
	 * @return The linking process duration in seconds.
	 * @since 2.0
	 */
	public long getDurationSeconds() {
		this.durationSeconds = -1;
		if(startDate != null & endDate != null) {
			final long diffInMillies = endDate.getTime() - startDate.getTime();
			final TimeUnit timeUnit = TimeUnit.SECONDS;
			this.durationSeconds = timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
		}
		return durationSeconds;
	}
	/**
	 * Sets the linking process duration in seconds.
	 * 
	 * @param numLinks The linking process duration in seconds.
	 * @since 2.0
	 */
	public void setDurationSeconds(final long durationSeconds) {
		this.durationSeconds = durationSeconds;
	}

}
