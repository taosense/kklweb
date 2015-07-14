package com.kkl.service.information.pictures;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kkl.dao.DaoSupport;
import com.kkl.entity.Page;
import com.kkl.service.information.PicturesService;
import com.kkl.util.PageData;


@Service("picturesService")
public class PicturesServiceImpl implements PicturesService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/*
	* 新增
	*/
	@Override
	public void save(PageData pd)throws Exception{
		dao.save("PicturesMapper.save", pd);
	}
	
	/*
	* 删除
	*/
	@Override
	public void delete(PageData pd)throws Exception{
		dao.delete("PicturesMapper.delete", pd);
	}
	
	/*
	* 修改
	*/
	@Override
	public void edit(PageData pd)throws Exception{
		dao.update("PicturesMapper.edit", pd);
	}
	
	/*
	*列表
	*/
	@Override
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("PicturesMapper.datalistPage", page);
	}
	
	/*
	*列表(全部)
	*/
	@Override
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("PicturesMapper.listAll", pd);
	}
	
	/*
	* 通过id获取数据
	*/
	@Override
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("PicturesMapper.findById", pd);
	}
	
	/*
	* 批量删除
	*/
	@Override
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("PicturesMapper.deleteAll", ArrayDATA_IDS);
	}
	
	/*
	* 批量获取
	*/
	@Override
	public List<PageData> getAllById(String[] ArrayDATA_IDS)throws Exception{
		return (List<PageData>)dao.findForList("PicturesMapper.getAllById", ArrayDATA_IDS);
	}
	
	/*
	* 删除图片
	*/
	@Override
	public void delTp(PageData pd)throws Exception{
		dao.update("PicturesMapper.delTp", pd);
	}
	
}

