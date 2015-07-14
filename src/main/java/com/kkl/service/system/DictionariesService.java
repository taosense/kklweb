package com.kkl.service.system;

import java.util.List;

import com.kkl.entity.Page;
import com.kkl.util.PageData;

public interface DictionariesService {

	public abstract void delete(PageData pd) throws Exception;

	public abstract List<PageData> dictlistPage(Page page) throws Exception;

	public abstract PageData findBmCount(PageData pd) throws Exception;

	public abstract PageData findCount(PageData pd) throws Exception;

	public abstract PageData findById(PageData pd) throws Exception;

	public abstract void edit(PageData pd) throws Exception;

	public abstract void save(PageData pd) throws Exception;

}
