package com.kkl.service.system;

import java.util.List;

import com.kkl.entity.system.Menu;
import com.kkl.util.PageData;

public interface MenuService {

	public abstract PageData editType(PageData pd) throws Exception;

	public abstract PageData editicon(PageData pd) throws Exception;

	public abstract PageData edit(PageData pd) throws Exception;

	public abstract List<Menu> listAllSubMenu() throws Exception;

	public abstract List<Menu> listAllMenu() throws Exception;

	public abstract List<Menu> listSubMenuByParentId(String parentId) throws Exception;

	public abstract void saveMenu(Menu menu) throws Exception;

	public abstract List<Menu> listAllParentMenu() throws Exception;

	public abstract PageData findMaxId(PageData pd) throws Exception;

	public abstract PageData getMenuById(PageData pd) throws Exception;

	public abstract void deleteMenuById(String MENU_ID) throws Exception;

}
