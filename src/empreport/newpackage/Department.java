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
@Table(name = "DEPARTMENT", catalog = "", schema = "SOORAJ")
@NamedQueries({
    @NamedQuery(name = "Department.findAll", query = "SELECT d FROM Department d")
    , @NamedQuery(name = "Department.findByDeptid", query = "SELECT d FROM Department d WHERE d.deptid = :deptid")
    , @NamedQuery(name = "Department.findByDeptname", query = "SELECT d FROM Department d WHERE d.deptname = :deptname")})
public class Department implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DEPTID")
    private Integer deptid;
    @Column(name = "DEPTNAME")
    private String deptname;

    public Department() {
    }

    public Department(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        Integer oldDeptid = this.deptid;
        this.deptid = deptid;
        changeSupport.firePropertyChange("deptid", oldDeptid, deptid);
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
        hash += (deptid != null ? deptid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.deptid == null && other.deptid != null) || (this.deptid != null && !this.deptid.equals(other.deptid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "empreport.newpackage.Department[ deptid=" + deptid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
