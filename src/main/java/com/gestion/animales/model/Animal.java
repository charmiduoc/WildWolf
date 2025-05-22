package com.gestion.animales.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="animal")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    @Id
    @Column(name = "id_animal")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre_animal",length = 15)
    private String nombre;

    @Column(name = "especie",length = 15)
    private String especie;

    @Column(name = "genero",length = 1)
    private String genero;

    @Column(name = "estado_animal",length = 200)
    private String estado;

    @Column(name = "estado_animal2",length = 200)
    private String estado2;
}
