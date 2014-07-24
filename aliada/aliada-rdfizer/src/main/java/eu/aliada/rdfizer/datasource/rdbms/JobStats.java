// ALIADA - Automatic publication under Linked Data paradigm
//          of library and museum data
//
// Component: aliada-rdfizer
// Responsible: ALIADA Consortiums
package eu.aliada.rdfizer.datasource.rdbms;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * RDF-izer Job stats.
 * 
 * @author Andrea Gazzarini
 * @since 1.0
 */
@Entity
@Table(name = "rdfizer_job_stats")
@XmlRootElement(name = "job")
public class JobStats {	
    @Id
	@XmlElement(name = "id")
    @Column(name = "job_id", nullable = false)
    private Integer id;
    
    @Column(name = "total_records_count", nullable = false)
    private int totalRecordsCount;
    
	@XmlElement(name = "output-statements-count")
    @Column(name = "total_triples_produced", nullable = false)
    private int totalTriplesProduced;

	@XmlElement(name = "records-throughput")
    @Column(name = "records_throughput", nullable = false)
    private BigDecimal recordsThroughput;
        
	@XmlElement(name = "triples-throughput")
    @Column(name = "triples_throughput", nullable = false)
    private BigDecimal triplesThroughput;
    
	@Transient
    private JobInstance instance;
    
	public JobStats() {
		// NTD
	}
	
    /**
     * Sets the job instance on this stats.
     * 
     * @param instance the job instance on this stats.
     */
    public void setInstance(final JobInstance instance) {
    	this.instance = instance;
    }
    
	/**
	 * Returns the total number of processed records for this job.
	 * A "processed" record is a record that has been translated.
	 * 
	 * @return the total number of processed records for this job.
	 */
	@XmlElement(name = "processed-records-count")
	public int getProcessedRecordsCount() {
		return totalRecordsCount;
	}
	
    /**
     * Returns the identifier of this job configuration.
     * 
     * @return the identifier of this job configuration.
     */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the identifier of this job configuration.
	 * 
	 * @param id the identifier of this job configuration.
	 */
	public void setId(final Integer id) {
		this.id = id;
	}

	/**
	 * Returns the total records count of the owning job.
	 * 
	 * @return the total records count of the owning job.
	 */
	public int getTotalRecordsCount() {
		return totalRecordsCount;
	}

	/**
	 * Sets the total records count of the owning job.
	 * 
	 * @param value the total records count of the owning job.
	 */
	public void setTotalRecordsCount(final int value) {
		this.totalRecordsCount = value;
	}

	/**
	 * Returns the total number of triples produced by the owning job.
	 * 
	 * @return the total number of triples produced by the owning job.
	 */
	public int getTotalTriplesProduced() {
		return totalTriplesProduced;
	}

	/**
	 * Sets the total number of triples produced by the owning job.
	 * 
	 * @param value the total number of triples produced by the owning job.
	 */
	public void setTotalTriplesProduced(final int value) {
		this.totalTriplesProduced = value;
	}

	/**
	 * Returns the record processing throughput in terms of rec / sec.
	 * 
	 * @return the record processing throughput in terms of rec / sec.
	 */
	public BigDecimal getRecordsThroughput() {
		return recordsThroughput;
	}

	/**
	 * Sets the average triples production throughput in terms of triples / sec.
	 * 
	 * @param throughput the average triples production throughput in terms of triples / sec.
	 */
	public void setRecordsThroughput(final BigDecimal throughput) {
		this.recordsThroughput = throughput;
	}

	/**
	 * Returns the average triples production throughput in terms of triples / sec.
	 * 
	 * @return the average triples production throughput in terms of triples / sec.
	 */
	public BigDecimal getTriplesThroughput() {
		return triplesThroughput;
	}

	/**
	 * Sets the triples production throughput in terms of triples / sec.
	 * 
	 * @param throughput the triples production throughput in terms of triples / sec.
	 */
	public void setTriplesThroughput(final BigDecimal throughput) {
		this.triplesThroughput = throughput;
	}
	
	@XmlElement(name = "completed")
	public boolean isCompleted() {
		return true;
	}
	
	@XmlElement(name = "running")
	public boolean isRunning() {
		return true;
	}	
	
	@XmlElement(name = "format")
	public String getFormat() {
		return instance != null ? instance.getFormat() : "Unknown";
	}
}