package opo.vistec.report.model;
/*
select I.*, V.ITEMNAME, V.ITEMGROUPID as ITEMGROUP, S.SALESID, S.CUSTACCOUNT, C.NAME, C.MANAGER, C.NOTRESIDENT_UA" +
	" from SALESLINE I" +
" left join SALESTABLE S on I.SALESID=S.SALESID"+				
" left join INVENTTABLE V on I.ITEMID=V.ITEMID "+
" left join CUSTTABLE C on S.CUSTACCOUNT=C.ACCOUNTNUN"+
	" where S.DELIVERYDATE between ? and ?"+
	" order by C.NOTRESIDENT_UA, S.CUSTACCOUNT, S.SALESID");
	*/
public class RealizBean {

	
}
