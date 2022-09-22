package d.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import d.model.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
