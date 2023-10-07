/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Sep 24, 2023
 */

package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity(name = "fifthwheel")
@Table(name = "fifthwheel")
public class FifthWheel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fifthWheelId;

	private String manufacturer;
	private String brand;
	private String model;
	private double rating;
	
	@ManyToOne
	@JoinColumn(name = "RVID", nullable=false)
	private RV rv = new RV();

	public int getFifthWheelId() {
		return fifthWheelId;
	}

	public void setFifthWheelId(int fifthWheelId) {
		this.fifthWheelId = fifthWheelId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public RV getRV() {
		return rv;
	}

	public void setRV(RV rv) {
		this.rv = rv;
	}

}