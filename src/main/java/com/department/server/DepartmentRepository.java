package com.department.server;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
//Department Repository
@Repository
public interface DepartmentRepository extends  MongoRepository<Department,Long>{

}
