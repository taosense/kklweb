package com.kkl.service.system;

import java.util.List;

import com.kkl.entity.Page;
import com.kkl.util.PageData;

public interface AppuserService {

	public abstract void updateLastLogin(PageData pd) throws Exception;

	public abstract PageData getUserByNameAndPwd(PageData pd) throws Exception;

	public abstract void saveIP(PageData pd) throws Exception;

	public abstract List<PageData> listPdPageUser(Page page) throws Exception;

	public abstract List<PageData> listAllUser(PageData pd) throws Exception;

	public abstract void deleteAllU(String[] USER_IDS) throws Exception;

	public abstract void deleteU(PageData pd) throws Exception;

	public abstract void editU(PageData pd) throws Exception;

	public abstract void saveU(PageData pd) throws Exception;

	public abstract PageData findByUN(PageData pd) throws Exception;

	public abstract PageData findByUE(PageData pd) throws Exception;

	public abstract PageData findByUId(PageData pd) throws Exception;

	public abstract PageData findByUiId(PageData pd) throws Exception;

}
