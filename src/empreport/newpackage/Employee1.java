/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empreport.newpackage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Sowmi
 */
@Entity
@Table(name = "EMPLOYEE1", catalog = "", schema = "SOORAJ")
@NamedQueries({
    @NamedQuery(name = "Employee1.findAll", query = "SELECT e FROM Employee1 e")
    , @NamedQuery(name = "Employee1.findByEmpid", query = "SELECT e FROM Employee1 e WHERE e.empid = :empid")
    , @NamedQuery(name = "Employee1.findByEmpname", query = "SELECT e FROM Employee1 e WHERE e.empname = :empname")
    , @NamedQuery(name = "Employee1.findByDeptname", query = "SELECT e FROM Employee1 e WHERE e.deptname = :deptname")})
public class Employee1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMPID")
    private Integer empid;
    @Column(name = "EMPNAME")
    private String empname;
    @Column(name = "DEPTNAME")
    private String deptname;

    public Employee1() {
    }

    public Employee1(Integer empid) {
        this.empid = empid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        Integer oldEmpid = this.empid;
        this.empid = empid;
        changeSupport.firePropertyChange("empid", oldEmpid, empid);
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        String oldEmpname = this.empname;
        this.empname = empname;
        changeSupport.firePropertyChange("empname", oldEmpname, empname);
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        String oldDeptname = this.deptname;
        this.deptname = deptname;
        changeSupport.firePropertyChange("deptname", oldDeptname, deptname);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empid != null ? empid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee1)) {
            return false;
        }
        Employee1 other = (Employee1) object;
        if ((this.empid == null && other.empid != null) || (this.empid != null && !this.empid.equals(other.empid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "empreport.newpackage.Employee1[ empid=" + empid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
