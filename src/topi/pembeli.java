/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topi;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ACER
 */
@Entity
public class pembeli implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Nama_Pelanggan;
    private String Alamat_Pelanggan;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof pembeli)) {
            return false;
        }
        pembeli other = (pembeli) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "topi.pembeli[ id=" + id + " ]";
    }
    public String getNama_Pelanggan() {
        return Nama_Pelanggan;
    }

    /**
     * @param Nama_Pelanggan the Nama_Pelanggan to set
     */
    public void setNama_Pelanggan(String Nama_Pelanggan) {
        this.Nama_Pelanggan = Nama_Pelanggan;
    }

    /**
     * @return the Alamat_Pelanggan
     */
    public String getAlamat_Pelanggan() {
        return Alamat_Pelanggan;
    }

    /**
     * @param Alamat_Pelanggan the Alamat_Pelanggan to set
     */
    public void setAlamat_Pelanggan(String Alamat_Pelanggan) {
        this.Alamat_Pelanggan = Alamat_Pelanggan;

}
}
