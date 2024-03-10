package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.GroupDO;
import com.nageoffer.shortlink.admin.dto.req.ShortLinkGroupSortReqDTO;
import com.nageoffer.shortlink.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

/**
 * 分组接口层
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * 新增短链接分组
     * @param groupName 短链接分组名
     */
    void saveGroup(String groupName);

    void saveGroup(String username, String groupName);



    /**
     * 查询用户短链接分组集合
     * @return 用户短链接分组集合
     */
    List<ShortLinkGroupRespDTO> listGroup();


    /**
     * 修改分组
     * @param requestParam
     */
    void updateGroup(ShortLinkGroupUpdateReqDTO requestParam);

    /**
     * 删除分组
     * @param requestParam
     */
    void deleteGroup(String requestParam);

    /**
     * 分组排序
     * @param requestParam
     */
    public void sortGroup(List<ShortLinkGroupSortReqDTO> requestParam);
}
