package com.nageoffer.shortlink.project.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nageoffer.shortlink.project.dao.entity.LinkAccessLogsDO;
import org.springframework.stereotype.Repository;

/**
 * 访问日志监控持久层
 */
@Repository
public interface LinkAccessLogsMapper extends BaseMapper<LinkAccessLogsDO> {
}