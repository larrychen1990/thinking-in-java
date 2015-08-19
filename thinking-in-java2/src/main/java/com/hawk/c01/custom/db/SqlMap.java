package com.hawk.c01.custom.db;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class SqlMap {
    Map<String, String> sqls = new HashMap<>();
    public Map<String, String> getSqls() {
        return sqls;
    }
    public void setSqls(Map<String, String> sqls) {
        this.sqls = sqls;
    }
    public String getSql(String name) {
        return sqls.get(name);
    }
    public static SqlMap load(String name) throws Exception {
        String xml = Utils.loadString(name);
        SqlMap sqlMap = unmarshallXML(xml );
        return sqlMap;
    }
	private static SqlMap unmarshallXML(String xml) {
		// TODO Auto-generated method stub
		return null;
	}
}
