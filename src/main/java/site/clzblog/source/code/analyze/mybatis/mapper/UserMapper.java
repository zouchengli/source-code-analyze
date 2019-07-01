package site.clzblog.source.code.analyze.mybatis.mapper;

import site.clzblog.source.code.analyze.mybatis.entity.UserEntity;

public interface UserMapper {
    UserEntity selectById(Long id);
}
