package com.kkl.service.system.appuser;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kkl.dao.DaoSupport;
import com.kkl.entity.Page;
import com.kkl.entity.system.User;
import com.kkl.service.system.AppuserService;
import com.kkl.util.PageData;


@Service("appuserService")
public class AppuserServiceImpl implements AppuserService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	//======================================================================================
	
	/*
	* 通过id获取数据
	*/
	@Override
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("AppuserMapper.findByUiId", pd);
	}
	/*
	* 通过loginname获取数据
	*/
	@Override
	public PageData findByUId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("AppuserMapper.findByUId", pd);
	}
	
	/*
	* 通过邮箱获取数据
	*/
	@Override
	public PageData findByUE(PageData pd)throws Exception{
		return (PageData)dao.findForObject("AppuserMapper.findByUE", pd);
	}
	
	/*
	* 通过编号获取数据
	*/
	@Override
	public PageData findByUN(PageData pd)throws Exception{
		return (PageData)dao.findForObject("AppuserMapper.findByUN", pd);
	}
	
	/*
	* 保存用户
	*/
	@Override
	public void saveU(PageData pd)throws Exception{
		dao.save("AppuserMapper.saveU", pd);
	}
	/*
	* 修改用户
	*/
	@Override
	public void editU(PageData pd)throws Exception{
		dao.update("AppuserMapper.editU", pd);
	}
	/*
	* 删除用户
	*/
	@Override
	public void deleteU(PageData pd)throws Exception{
		dao.delete("AppuserMapper.deleteU", pd);
	}
	/*
	* 批量删除用户
	*/
	@Override
	public void deleteAllU(String[] USER_IDS)throws Exception{
		dao.delete("AppuserMapper.deleteAllU", USER_IDS);
	}
	/*
	*用户列表(全部)
	*/
	@Override
	public List<PageData> listAllUser(PageData pd)throws Exception{
		return (List<PageData>) dao.findForList("AppuserMapper.listAllUser", pd);
	}
	
	/*
	*用户列表(用户组)
	*/
	@Override
	public List<PageData> listPdPageUser(Page page)throws Exception{
		return (List<PageData>) dao.findForList("AppuserMapper.userlistPage", page);
	}
	
	/*
	* 保存用户IP
	*/
	@Override
	public void saveIP(PageData pd)throws Exception{
		dao.update("AppuserMapper.saveIP", pd);
	}
	
	/*
	* 登录判断
	*/
	@Override
	public PageData getUserByNameAndPwd(PageData pd)throws Exception{
		return (PageData)dao.findForObject("AppuserMapper.getUserInfo", pd);
	}
	/*
	* 跟新登录时间
	*/
	@Override
	public void updateLastLogin(PageData pd)throws Exception{
		dao.update("AppuserMapper.updateLastLogin", pd);
	}
	//======================================================================================
	
	
}

