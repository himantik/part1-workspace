package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class HourlyEmployee extends Employee implements TaxPayer {

  private double rate;
  private double hours;

  public HourlyEmployee() {
  }

  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }
  public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours){
    this(name, hireDate);
    setRate(rate);
    setHours(hours);

  }
  public void pay(){
    System.out.printf("%s is paid hourly, for a total of % .2f %n"
    , getName(), getHours() * getRate());

  }
  public void payTaxes(){



  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  @Override
  public String toString() {
    return super.toString() +", rate =" + rate + ", hours=" + hours;
   // return String.format("%," rate=%.2f, hours=%.1f, super.toString(), getRate(), getHours());
  }
}

