package com.sandy.doc.service;

import java.util.Map;

import com.sandy.record.model.RecordQuery;

/**
 *  文档业务接口
 * 
 * @author sandy
 * @version $Id: DocService.java, v 0.1 2019年7月23日 下午7:20:00 sandy Exp $
 */
public interface DocService {

    /**
     *  保存文档
     * 
     * @param title
     * @param content
     */
    void doSave(String title, String content, String parent, String docId);

    void doQuery(RecordQuery query);

    Map<String, Object> doInfo(String docId);

}
