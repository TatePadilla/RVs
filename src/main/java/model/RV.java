/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Oct 5, 2023
 */
package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * @author Tate
 *
 */
@Entity(name = "rv")
@Table(name = "rv")
public class RV {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rvId;
	private String type;
	private double avgCost;
	private double avgSize;
	@OneToMany(mappedBy = "rv", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<FifthWheel> fifthwheel;
	
	public int getRvId() {
		return rvId;
	}
	public void setRvId(int rvId) {
		this.rvId = rvId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAvgCost() {
		return avgCost;
	}
	public void setAvgCost(double avgCost) {
		this.avgCost = avgCost;
	}
	public double getAvgSize() {
		return avgSize;
	}
	public void setAvgSize(double avgSize) {
		this.avgSize = avgSize;
	}
	public List<FifthWheel> getFifthwheel() {
		return fifthwheel;
	}
	public void setFifthwheel(List<FifthWheel> fifthwheel) {
		this.fifthwheel = fifthwheel;
	}
	
	
}
