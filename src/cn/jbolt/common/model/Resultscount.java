package cn.jbolt.common.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;

import cn.jbolt.common.model.base.BaseResultscount;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Resultscount extends BaseResultscount<Resultscount> {
	public static final Resultscount dao = new Resultscount().dao();
	
	/* 实现保存数据到数据库的功能 */
	public void saveResults(int badPeopleNum, int allPeopleNum, double percent) {
		// TODO Auto-generated method stub
		new Resultscount().set("badPeopleNum", badPeopleNum).set("allPeopleNum", allPeopleNum).set("percent", percent).save();
	}
	
	/* 清空数据库数据*/
	public void deleteResultsList() {
		Db.update("truncate table resultscount");
		
	}

	/* 获取数据库数据*/
	public List<Resultscount> getResultsList() {
		return find("select * from resultscount");
	}
	
	
}
