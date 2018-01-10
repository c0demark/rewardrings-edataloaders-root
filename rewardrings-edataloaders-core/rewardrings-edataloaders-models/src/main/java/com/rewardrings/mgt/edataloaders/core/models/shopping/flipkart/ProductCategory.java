/**
 * 
 */
package com.rewardrings.mgt.edataloaders.core.models.shopping.flipkart;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

/**
 * @author Vijay Kumar
 *
 */
@Entity
@Table(name = "product_categories")
public class ProductCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8846718000100524840L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "surrogate_id", nullable = false, unique = true)
	private Long surrogateId;

	@Column(name = "product_category_id", nullable = false, unique = true)
	private Long id;

	@Column(name = "commission", nullable = false)
	@ColumnDefault(value = "0.0")
	private Double commission;

	@Column(name = "display_name")
	@NotEmpty
	@NotBlank
	private String displayName;

	@Column(name = "name_from_vendor")
	@NotEmpty
	@NotBlank
	private String nameFromVendor;

	@Column(name = "url")
	@NotEmpty
	@NotBlank
	@URL
	private String url;

	@ManyToOne(targetEntity = ProductCategory.class, cascade = {CascadeType.ALL})
	@JoinTable(joinColumns = { @JoinColumn(name = "product_category_id") }, inverseJoinColumns = {
			@JoinColumn(name = "parent_product_category_id") })
	private ProductCategory parentCategory;
	
	@OneToMany(targetEntity = ProductCategory.class, mappedBy = "parentCategory")
	private Collection<ProductCategory> childCategories;
}
