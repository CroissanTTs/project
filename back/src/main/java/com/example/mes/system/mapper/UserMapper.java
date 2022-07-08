package com.example.mes.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mes.system.entity.Apply;
import com.example.mes.system.entity.User;
import com.example.mes.system.entity.Vo.UserUpdateVo;
import com.example.mes.system.entity.Vo.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper  //注解表示了这是一个mybatis的mapper类
@Repository
public interface UserMapper extends BaseMapper<User> {
    //这个方法是查询所有的User，测试用的，没啥卵用
    List<User> findUserAll();

    //下面这4个方法是查询所需的User
    List<User> queryUserList(@Param("userVo") UserVo userVo, @Param("numStart") int numStart, @Param("numEnd") int numEnd);

    List<String> queryAllDepartmentName();

    Integer getLastCount();

    List<String> queryAllRoleName(UserVo userVo);

    //下面这个方法是删除的
    void deleteUsers(@Param("user") User user);

    //下面3个方法是更新的
    User findUserById(Integer id);

    void userUpdate(@Param("n") UserUpdateVo userUpdateVo);

    void userAdd(@Param("n") UserUpdateVo userUpdateVo);

    String findUserDepartment(Integer id);

    void createApply(@Param("apply") Apply apply);

    Apply findApply(UserUpdateVo userUpdateVo);

    Integer getApply(int id);
}
