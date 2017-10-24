/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerexamplepatient.BE;

/**
 *
 * @author jeppjleemoritzled
 */
public class Patient
{
    // id, navn, email, diagnose
    
    private int id;
    private String name;
    private String email;
    private String diagnosis;
    
     private String address;

    /**
     * Get the value of address
     *
     * @return the value of address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * Set the value of address
     *
     * @param address new value of address
     */
    public void setAddress(String address)
    {
        this.address = address;
    }


    
    public Patient(int id, String name, String email, String diagnosis)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.diagnosis = diagnosis;
    }

    public int getId()
    {
        return id;
    }

    public String getDiagnosis()
    {
        return diagnosis;
    }

    public String getEmail()
    {
        return email;
    }

    public String getName()
    {
        return name;
    }
    
    
    
    
}
