package com.kkl.service.system.dictionaries;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kkl.dao.DaoSupport;
import com.kkl.entity.Page;
import com.kkl.service.system.DictionariesService;
import com.kkl.util.PageData;

@Service("dictionariesService")
public class DictionariesServiceImpl implements DictionariesService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	
	//新增
	@Override
	public void save(PageData pd)throws Exception{
		dao.save("DictionariesMapper.save", pd);
	}
	
	//修改
	@Override
	public void edit(PageData pd)throws Exception{
		dao.update("DictionariesMapper.edit", pd);
	}
	
	//通过id获取数据
	@Override
	public PageData findById(PageData pd) throws Exception {
		return (PageData) dao.findForObject("DictionariesMapper.findById", pd);
	}
	
	//查询总数
	@Override
	public PageData findCount(PageData pd) throws Exception {
		return (PageData) dao.findForObject("DictionariesMapper.findCount", pd);
	}
	
	//查询某编码
	@Override
	public PageData findBmCount(PageData pd) throws Exception {
		return (PageData) dao.findForObject("DictionariesMapper.findBmCount", pd);
	}
	
	//列出同一父类id下的数据
	@Override
	public List<PageData> dictlistPage(Page page) throws Exception {
		return (List<PageData>) dao.findForList("DictionariesMapper.dictlistPage", page);
		
	}
	
	//删除
	@Override
	public void delete(PageData pd) throws Exception {
		dao.delete("DictionariesMapper.delete", pd);
		
	}

	
	
}
