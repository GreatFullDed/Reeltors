package models;
// Generated 15.10.2020 14:03:26 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Property generated by hbm2java
 */
@Entity
@Table(name="property"
    ,catalog="reeltordb"
)
@Inheritance (strategy = InheritanceType.JOINED)
abstract public class Property  implements java.io.Serializable {


     private Integer idProperty;
     private Cleint cleint;
     private String city;
     private String street;
     private String numHouse;
     private Double width;
     private Double long_;
     private Double area;
    
    public Property() {
    }

	
    public Property(Cleint cleint) {
        this.cleint = cleint;
    }
    public Property(Cleint cleint, String city, String street, 
            String numHouse, Double width, Double long_, Double area) {
       this.cleint = cleint;
       this.city = city;
       this.street = street;
       this.numHouse = numHouse;
       this.width = width;
       this.long_ = long_;
       this.area = area;
    }
   
     @Id 
     @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idProperty", unique=true, nullable=false)
    public Integer getIdProperty() {
        return this.idProperty;
    }
    
    public void setIdProperty(Integer idProperty) {
        this.idProperty = idProperty;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idClient", nullable=false)
    public Cleint getCleint() {
        return this.cleint;
    }
    
    public void setCleint(Cleint cleint) {
        this.cleint = cleint;
    }

    
    @Column(name="city", length=45)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="street", length=45)
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    
    @Column(name="numHouse", length=45)
    public String getNumHouse() {
        return this.numHouse;
    }
    
    public void setNumHouse(String numHouse) {
        this.numHouse = numHouse;
    }

    
    @Column(name="width", precision=22, scale=0)
    public Double getWidth() {
        return this.width;
    }
    
    public void setWidth(Double width) {
        this.width = width;
    }

    
    @Column(name="long", precision=22, scale=0)
    public Double getLong_() {
        return this.long_;
    }
    
    public void setLong_(Double long_) {
        this.long_ = long_;
    }

    
    @Column(name="area", precision=22, scale=0)
    public Double getArea() {
        return this.area;
    }
    
    public void setArea(Double area) {
        this.area = area;
    }
}


