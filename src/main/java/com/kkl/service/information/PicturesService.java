package com.kkl.service.information;

import java.util.List;

import com.kkl.entity.Page;
import com.kkl.util.PageData;

public interface PicturesService {

	public abstract void delTp(PageData pd) throws Exception;

	public abstract List<PageData> getAllById(String[] ArrayDATA_IDS) throws Exception;

	public abstract void deleteAll(String[] ArrayDATA_IDS) throws Exception;

	public abstract PageData findById(PageData pd) throws Exception;

	public abstract List<PageData> listAll(PageData pd) throws Exception;

	public abstract List<PageData> list(Page page) throws Exception;

	public abstract void edit(PageData pd) throws Exception;

	public abstract void delete(PageData pd) throws Exception;

	public abstract void save(PageData pd) throws Exception;

}
