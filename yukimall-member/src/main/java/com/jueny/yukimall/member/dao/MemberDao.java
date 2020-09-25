package com.jueny.yukimall.member.dao;

import com.jueny.yukimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Jueny
 * @email yjueny@163.com
 * @date 2020-09-25 16:36:44
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
