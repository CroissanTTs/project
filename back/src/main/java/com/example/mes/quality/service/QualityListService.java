package com.example.mes.quality.service;

import com.example.mes.quality.bean.QualityListBean;
import com.example.mes.quality.bean.Vo.QualityListVo;

import java.util.List;

public interface QualityListService {

    //查询所有质检任务
    List<QualityListBean> queryAll();

    //根据状态查质检任务
    List<QualityListBean> querylistByStatus();

    //根据产线查询质检任务
    List<QualityListBean> querylistByLine();

    //根据车间查询质检任务
    List<QualityListBean> querylistByWorkShop();

    //某质检任务生产的产品数量
    Integer queryListNum();

    //分页查询质检任务
    List<QualityListBean> queryQualityList(QualityListVo qualityListVo);

    Integer getLastCount();

    //根据list_id查询质检任务
    QualityListBean queryQualityByList(String list_id);

    //修改状态
    void updateQualityListStatus(String list_id);

    //查询所有质检任务中的车间
    List<String> getAllWorkshop();

    //查询所有质检任务中的产线
    List<String> getAllLine();

    //查询对应车间中的产线
    List<String> getAllLinesByWorkshop(String workshop_id);
}
