package com.sx.createxml.dao.repository;

import com.sx.createxml.pojo.mysql.DwgFrameInformation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DwgFrameInformationRepository extends JpaRepository<DwgFrameInformation, Long> {

    DwgFrameInformation findByNameAndGroupName(String name, String groupName);

    List<DwgFrameInformation> findAll();
// 上海院的所有图幅

    List<DwgFrameInformation> findAllByGroupName(String group_name);
// 非上海院的所有图幅

    List<DwgFrameInformation> findAllByGroupNameIsNot(String group_name);

}
