package models;
// Generated 15.10.2020 14:03:26 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Apartment generated by hbm2java
 */
@Entity
@Table(name="apartment"
    ,catalog="reeltordb"
)
public class Apartment extends Property implements java.io.Serializable {

     private String floor;
     private String amountRoom;
     private String numApartment;

    public Apartment() {
    }

    public Apartment(Cleint cleint, String city, String street, 
            String numHouse, Double width, Double long_, Double area,
            String floor, String amountRoom, String numApartment) {
       this.setCleint(cleint);
       this.setCity(city);
       this.setStreet(street);
       this.setNumHouse(numHouse);
       this.setWidth(width);
       this.setLong_(long_);
       this.setArea(area);   
       this.floor = floor;
       this.amountRoom = amountRoom;
       this.numApartment = numApartment;
    }
    
    public Apartment(String floor, String amountRoom, String numApartment) {
       this.floor = floor;
       this.amountRoom = amountRoom;
       this.numApartment = numApartment;
    }

    @Column(name="floor", length=45)
    public String getFloor() {
        return this.floor;
    }
    
    public void setFloor(String floor) {
        this.floor = floor;
    }

    
    @Column(name="amountRoom", length=45)
    public String getAmountRoom() {
        return this.amountRoom;
    }
    
    public void setAmountRoom(String amountRoom) {
        this.amountRoom = amountRoom;
    }

    
    @Column(name="numApartment", length=45)
    public String getNumApartment() {
        return this.numApartment;
    }
    
    public void setNumApartment(String numApartment) {
        this.numApartment = numApartment;
    }




}


