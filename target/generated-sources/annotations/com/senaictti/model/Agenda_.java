package com.senaictti.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-02-01T22:25:48")
@StaticMetamodel(Agenda.class)
public class Agenda_ { 

    public static volatile SingularAttribute<Agenda, Double> preco;
    public static volatile SingularAttribute<Agenda, Integer> idfun;
    public static volatile SingularAttribute<Agenda, String> formf;
    public static volatile SingularAttribute<Agenda, String> hora;
    public static volatile SingularAttribute<Agenda, Integer> idagenda;
    public static volatile SingularAttribute<Agenda, Integer> idcliente;
    public static volatile SingularAttribute<Agenda, LocalDate> dia;
    public static volatile SingularAttribute<Agenda, String> descricao;
    public static volatile SingularAttribute<Agenda, String> status;

}