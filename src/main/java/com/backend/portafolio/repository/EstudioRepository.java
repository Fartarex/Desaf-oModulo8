
package com.backend.portafolio.repository;

import com.backend.portafolio.entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository <Estudio, Integer>  {
    
}
