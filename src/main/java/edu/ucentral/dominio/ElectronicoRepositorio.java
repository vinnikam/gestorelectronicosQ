package edu.ucentral.dominio;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ElectronicoRepositorio implements PanacheRepository<Electronico> {
}
