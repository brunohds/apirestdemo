package br.com.spring.apirestdemo.repository;

import br.com.spring.apirestdemo.models.ObjColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IObjColorRepository extends JpaRepository<ObjColor,Long> {
}
