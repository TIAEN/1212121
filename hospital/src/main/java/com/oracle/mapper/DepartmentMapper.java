package com.oracle.mapper;

import com.oracle.pojo.Department;

import java.util.List;

public interface DepartmentMapper {

    List<Department> selectRootDepartment();        //查询所有一级科室

    void insertDepartment(Department department);   //插入科室

    Integer selectCountSidById(Integer id);         //返回这个一级科室下的耳机科室数量

    void deleteByDepartmentId(Integer id);          //通过ID删除科室

    Department selectRootDepartmentById(Integer id);    //通过ID获取对应的科室并返回（虽然名称是一级科室，但其实二级科室也行）

    List<Department> selectDepartmentAll();         //返回所有科室

    List<Department> selectDepartmentByPid(Integer pid);    //通过ID其下属的所有科室

    List<Department> selectDepartment();

    void deleteDepartmentFirst(int id);

    Department selectDepartmentById(int id);
}
