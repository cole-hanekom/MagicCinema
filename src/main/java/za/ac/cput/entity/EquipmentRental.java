package za.ac.cput.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "equipment_rental")
public class EquipmentRental implements Serializable {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String rentalID;
    @NotNull
    private String clientID;
    @NotNull
    private String equipmentID;
    @NotNull
    private String employeeNumber;
    @NotNull
    private String rentalStartDate;
    @NotNull
    private String rentalReturnEstimatedDate;
    private String  rentalEndDate;
    @NotNull
    private int daysOverdue;
    @NotNull
    private double penalty;
    @NotNull
    private double costOverTime;

    private EquipmentRental(Builder builder){
        this.rentalID = builder.rentalID;
        this.clientID = builder.clientID;
        this.equipmentID = builder.equipmentID;
        this.employeeNumber = builder.employeeNumber;
        this.rentalStartDate = builder.rentalStartDate;
        this.rentalReturnEstimatedDate = builder.rentalReturnEstimatedDate;
        this.rentalEndDate = builder.rentalEndDate;
        this.daysOverdue = builder.daysOverdue;
        this.penalty = builder.penalty;
        this.costOverTime = builder.costOverTime;
    }

    public static class Builder{

        private String rentalID, clientID, equipmentID, employeeNumber, rentalStartDate,
                rentalEndDate, rentalReturnEstimatedDate;
        private double costOverTime, penalty;
        private int daysOverdue;

        public Builder setRentalID(String rentalID){
            this.rentalID = rentalID;
            return this;
        }

        public Builder setClientID(String clientID){
            this.clientID = clientID;
            return this;
        }

        public Builder setEquipmentID(String equipmentID){
            this.equipmentID = equipmentID;
            return this;
        }

        public Builder setEmployeeNumber(String employeeNumber){
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setCostOverTime(double costOverTime){
            this.costOverTime = costOverTime;
            return this;
        }

        public Builder setDaysOverdue(int daysOverdue) {
            this.daysOverdue = daysOverdue;
            return this;
        }

        public Builder setPenalty(double penalty){
            this.penalty = penalty;
            return this;
        }

        public Builder setRentalStartDate(String rentalStartDate){
            this.rentalStartDate = rentalStartDate;
            return this;
        }

        public Builder setRentalReturnEstimatedDate(String rentalReturnEstimatedDate) {
            this.rentalReturnEstimatedDate = rentalReturnEstimatedDate;
            return this;
        }

        public Builder setRentalEndDate(String rentalEndDate){
            this.rentalEndDate = rentalEndDate;
            return this;
        }

        public EquipmentRental build(){return new EquipmentRental(this);}

        public Builder copy(EquipmentRental EquipmentRental){
            this.rentalID = EquipmentRental.rentalID;
            this.clientID = EquipmentRental.clientID;
            this.equipmentID = EquipmentRental.equipmentID;
            this.employeeNumber = EquipmentRental.employeeNumber;
            this.costOverTime = EquipmentRental.costOverTime;
            this.daysOverdue = EquipmentRental.daysOverdue;
            this.penalty = EquipmentRental.penalty;
            this.rentalStartDate = EquipmentRental.rentalStartDate;
            this.rentalReturnEstimatedDate = EquipmentRental.rentalReturnEstimatedDate;
            this.rentalEndDate = EquipmentRental.rentalEndDate;
            return this;
        }

    }    //Builder class ends

    @Override
    public String toString() {
        return "EquipmentRental{" +
                "rentalID='" + rentalID + '\'' +
                ", clientID='" + clientID + '\'' +
                ", equipmentID='" + equipmentID + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", rentalStartDate='" + rentalStartDate + '\'' +
                ", rentalEndDate='" + rentalEndDate + '\'' +
                '}';
    }

    public String getRentalID() {
        return rentalID;
    }
    public String getClientID() {
        return clientID;
    }
    public String getEquipmentID() {
        return equipmentID;
    }
    public String getEmployeeNumber() {
        return employeeNumber;
    }
    public String getRentalStartDate() {
        return rentalStartDate;
    }
    public String getRentalReturnEstimatedDate() {
        return rentalReturnEstimatedDate;
    }
    public String getRentalEndDate() {
        return rentalEndDate;
    }
    public double getCostOverTime() {
        return costOverTime;
    }
    public int getDaysOverdue() {
        return daysOverdue;
    }
    public double getPenalty() {
        return penalty;
    }
}
