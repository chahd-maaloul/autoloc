package tn.esprit.autolocapi.repository;
import tn.esprit.autolocapi.domain.Agence;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Long> {
}
