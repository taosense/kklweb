package com.kkl.service.system;

import java.util.List;

import com.kkl.entity.system.Role;
import com.kkl.util.PageData;

public interface RoleService {

	public abstract PageData edit(PageData pd) throws Exception;

	public abstract PageData findObjectById(PageData pd) throws Exception;

	public abstract void saveGYSQX(PageData pd) throws Exception;

	public abstract void saveKeFu(PageData pd) throws Exception;

	public abstract void add(PageData pd) throws Exception;

	public abstract void setAllRights(PageData pd) throws Exception;

	public abstract void gysqxc(String msg, PageData pd) throws Exception;

	public abstract void updateKFQx(String msg, PageData pd)
			throws Exception;

	public abstract void updateQx(String msg, PageData pd) throws Exception;

	public abstract void updateRoleRights(Role role) throws Exception;

	public abstract Role getRoleById(String roleId) throws Exception;

	public abstract void deleteRoleById(String ROLE_ID) throws Exception;

	public abstract void deleteGById(String ROLE_ID) throws Exception;

	public abstract void deleteKeFuById(String ROLE_ID) throws Exception;

	public abstract List<PageData> listAllGysQX(PageData pd) throws Exception;

	public abstract List<PageData> listAllkefu(PageData pd) throws Exception;

	public abstract List<Role> listAllRolesByPId(PageData pd) throws Exception;

	public abstract List<PageData> listAllAppUByRid(PageData pd) throws Exception;

	public abstract List<PageData> listAllUByRid(PageData pd) throws Exception;

	public abstract PageData findYHbyrid(PageData pd) throws Exception;

	public abstract PageData findGLbyrid(PageData pd) throws Exception;

	public abstract List<Role> listAllRoles() throws Exception;

	public abstract List<Role> listAllappERRoles() throws Exception;

	public abstract List<Role> listAllERRoles() throws Exception;

}
