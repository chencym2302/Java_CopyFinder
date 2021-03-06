package cn.jbolt.common.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;

import cn.jbolt.common.model.base.BaseResults;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Results extends BaseResults<Results> {
	public static final Results dao = new Results().dao();
	

	/* 实现保存数据到数据库的功能 */
	public void saveResults(String id, String fileA, String fileB, double score) {
		// TODO Auto-generated method stub
		new Results().set("id", id).set("fileA", fileA).set("fileB", fileB).set("score", score).save();
	}
	
	/* 清空数据库数据*/
	public void deleteResultsList() {
		Db.update("truncate table results");
		
	}
	

	/* 获取数据库数据*/
	public List<Results> getResultsList() {
		return find("select * from results order by score DESC");
	}
	
	public List<Results> getResultsList(double lowScore ) {
		return find("select * from results where score >= " + lowScore +" order by score DESC"); 
	}
	

}
