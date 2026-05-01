package simple_services;

import config.AppEntityManager;
import simple_entities.Department;

public class DepartmentCompositeService {

    public static void main(String[] args) {

        var entityManager = AppEntityManager.getEntityManager("mysql-jpa-all");

        Department dept = new Department();
        entityManager.getTransaction().begin();

        dept.getDepartmentPkId().setCode("new_dept_Code");
        dept.getDepartmentPkId().setNum(50000);
        dept.setName("dept name");

        entityManager.persist(dept);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
