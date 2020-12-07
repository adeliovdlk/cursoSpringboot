package com.cursoSpringUdemy.domain;

import java.io.Serializable;

public class Categoria implements Serializable {
    public static final long serialVersionUID = 1L;
    private int id;
    private String name;//parei aki

    public Categoria() {
    }

    public Categoria(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categoria categoria = (Categoria) o;

        return id == categoria.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
