package opo.vistec.entity.model;

import java.io.Serializable;

public class InvoiceLineId implements Serializable {

/**
*    composite id primary key
*/
private static final long serialVersionUID = 1L;
private String salesid;
private String invoiceid;
private Integer recid;

public InvoiceLineId(){}

public InvoiceLineId(String salesid, String invoiceid, Invent invent){
this.salesid = salesid;
this.invoiceid = invoiceid;
}

public String getSalesid() {
return salesid;
}

public void setSalesid(String salesid) {
this.salesid = salesid;
}

public String getInvoiceid() {
return invoiceid;
}

public void setInvoiceid(String invoiceid) {
this.invoiceid = invoiceid;
}


public Integer getRecid() {
return recid;
}

public void setRecid(Integer recid) {
this.recid = recid;
}

@Override
public int hashCode() {
final int prime = 31;
int result = 1;
result = prime * result + ((salesid == null) ? 0 : salesid.hashCode());
result = prime * result + ((invoiceid == null) ? 0 : invoiceid.hashCode());
result = prime * result + ((recid == null) ? 0 :recid.hashCode());
return result;
}
@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
InvoiceLineId other = (InvoiceLineId) obj;
if (salesid == null) {
if (other.salesid != null)
return false;
} else if (!salesid.equals(other.salesid))
return false;
if (invoiceid == null) {
if (other.invoiceid != null)
return false;
} else if (!invoiceid.equals(other.invoiceid))
return false;
if (recid == null) {
if (other.recid != null)
return false;
} else if (!recid.equals(other.recid))
return false;
return true;
}
}
