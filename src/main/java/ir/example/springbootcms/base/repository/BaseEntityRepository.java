package ir.example.springbootcms.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface BaseEntityRepository<E,ID> extends JpaRepository<E,ID>, JpaSpecificationExecutor {
}
